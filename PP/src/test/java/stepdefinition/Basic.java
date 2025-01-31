package stepdefinition;

import java.io.File;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dataProviders.BaseClass;
import dataProviders.ConfigFileReader;
import dataProviders.DataBaseConnection;
import io.cucumber.java.en.Then;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import object_repository.PartnerPortal_Menu;
import utils.DriverFactory;

public class Basic {
	// Read Configuration
	public static ConfigFileReader configFileReader;
	public static int length_of_spinner;
	static String boldText = "\u001B[1m";
	static String userName;
	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	static public <ITesseract> void ocRCaptcha(String userName) throws Throwable {

		WebElement imageElement = DriverFactory.driver.findElement(By.xpath("//canvas[@class='vue-captcha-img']"));

		// Take a screenshot of the image stored in a web element
		File screenshot = imageElement.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);

		// Write the screenshot to a PNG or JPEG file
		ImageIO.write(ImageIO.read(screenshot), "png", new File("src/uploadFile/image.png"));
		Thread.sleep(1500);

		// Create an instance of the Tesseract OCR engine
		Tesseract tesseract = new Tesseract();

		// Set the path of the Tesseract executable and the location of the trained data
		// tesseract.setDatapath("D:\\Automation\\Software\\Project\\FAS_ACR\\tessdata\\");
		// tesseract.setLanguage("eng");
		// Retrieve the text from the image using OCR with Tesseract
		try {
			String str = tesseract.doOCR(new File(System.getProperty("user.dir") + "\\src\\uploadFile\\image.png"));
			String modifiedText = str.replaceAll("—", "");
			String modifiedText1 = modifiedText.replaceAll(" ", "");
			// Print the modified text
			System.out.println("Original Text: " + str);
			System.out.println("* " + boldText + "Modified Text: " + modifiedText1);
			Thread.sleep(2000);
			WebElement captcha = DriverFactory.driver.findElement(By.xpath("//div[3]/div/div[2]/input"));
			captcha.sendKeys(modifiedText1);
			Thread.sleep(2000);
			captchaVerification(userName);
			List<WebElement> loginCheck = DriverFactory.driver.findElements(By.xpath("//button[text()='LOGIN']"));
			if (loginCheck.size() > 0) {
				try {
					WebElement login = DriverFactory.driver.findElement(By.xpath("//button[text()='LOGIN']"));
					login.click();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (TesseractException e) {

		}
		Thread.sleep(3000);
	}
	
	// ****************************************************************
	
	static public <ITesseract> void ocRCaptcha_DB() throws Throwable {

		WebElement imageElement = DriverFactory.driver.findElement(By.xpath("//canvas[@class='vue-captcha-img']"));

		// Take a screenshot of the image stored in a web element
		File screenshot = imageElement.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);

		// Write the screenshot to a PNG or JPEG file
		ImageIO.write(ImageIO.read(screenshot), "png", new File("src/uploadFile/image.png"));
		Thread.sleep(1500);

		// Create an instance of the Tesseract OCR engine
		Tesseract tesseract = new Tesseract();

		// Set the path of the Tesseract executable and the location of the trained data
		// tesseract.setDatapath("D:\\Automation\\Software\\Project\\FAS_ACR\\tessdata\\");
		// tesseract.setLanguage("eng");
		// Retrieve the text from the image using OCR with Tesseract
		try {
			String str = tesseract.doOCR(new File(System.getProperty("user.dir") + "\\src\\uploadFile\\image.png"));
			String modifiedText = str.replaceAll("—", "");
			String modifiedText1 = modifiedText.replaceAll(" ", "");
			// Print the modified text
			System.out.println("Original Text: " + str);
			System.out.println("* " + boldText + "Modified Text: " + modifiedText1);
			Thread.sleep(2000);
			WebElement captcha = DriverFactory.driver.findElement(By.xpath("//div[3]/div/div[2]/input"));
			captcha.sendKeys(modifiedText1);
			Thread.sleep(2000);
			captchaVerification_DB();
			List<WebElement> loginCheck = DriverFactory.driver.findElements(By.xpath("//button[text()='LOGIN']"));
			if (loginCheck.size() > 0) {
				try {
					WebElement login = DriverFactory.driver.findElement(By.xpath("//button[text()='LOGIN']"));
					login.click();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (TesseractException e) {

		}
		Thread.sleep(3000);
	}
	
	
	
	
	// *****************************************************************
	// DATE : 07-10-2023
	
	
	public static void userNamePP(String userName) throws InterruptedException, SQLException {
		
		Thread.sleep(1500);
			if (ConfigFileReader.getGSTUpdateUsername().equals(userName)) {	
				System.out.println("GST User Name : "+ConfigFileReader.getGSTUpdateUsername());
				wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Username));
				BaseClass.ClearElement(PartnerPortal_Menu.Username);
				PartnerPortal_Menu.Username.sendKeys(ConfigFileReader.getGSTUpdateUsername());				
			}else if (ConfigFileReader.getPP_UserName().equals(userName)) {		
				System.out.println("PP User Name : "+ConfigFileReader.getPP_UserName());
				wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Username));
				BaseClass.ClearElement(PartnerPortal_Menu.Username);
				PartnerPortal_Menu.Username.sendKeys(ConfigFileReader.getPP_UserName());
			}else if (ConfigFileReader.getUS_UserName().equals(userName)) {				
				System.out.println("US User Name : "+ConfigFileReader.getUS_UserName());
				wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Username));
				BaseClass.ClearElement(PartnerPortal_Menu.Username);
				PartnerPortal_Menu.Username.sendKeys(ConfigFileReader.getUS_UserName());
			}else if (ConfigFileReader.getGrievanceUsername().equals(userName)) {				
				System.out.println("Grievance User Name : "+ConfigFileReader.getGrievanceUsername());
				wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Username));
				BaseClass.ClearElement(PartnerPortal_Menu.Username);
				PartnerPortal_Menu.Username.sendKeys(ConfigFileReader.getGrievanceUsername());
			}else {
					DataBaseConnection.dataBaseConnectionPP();
					String onboardingUserName = DataBaseConnection.getOnboardingUserName();
					DataBaseConnection.databaseConnectionClose();
					System.out.println("Onboarding Username: " + onboardingUserName);
					PartnerPortal_Menu.Username.sendKeys("kavishgupta012");
					//PartnerPortal_Menu.Username.sendKeys(onboardingUserName);
				}
		//return userName;		
			}
	

	public static void dataBaseUserName(String onboardingUserName) throws SQLException {
		DataBaseConnection.dataBaseConnectionPP();
		onboardingUserName = DataBaseConnection.getOnboardingUserName();
		DataBaseConnection.databaseConnectionClose();
		System.out.println("Onboarding Username: " + onboardingUserName);
		PartnerPortal_Menu.Username.sendKeys(onboardingUserName);
		//PartnerPortal_Menu.Username.sendKeys("testing2024");
	}
	
	public static void captchaUserFinal(String user) throws Throwable {
		System.out.println("Username : "+user);
		Thread.sleep(3000);
		Basic.ocRCaptcha(user);
		Thread.sleep(9000);
//		return user;
	}
	
	public static void captchaUser_DB() throws Throwable {
		Thread.sleep(3000);
		Basic.ocRCaptcha_DB();
		Thread.sleep(9000);
//		return user;
	}
	

	@Then("^Enter Username PP2$")
	public static void Enter_UserName_PP2() throws Throwable {
		System.out.println("* " + "User Name : Partner Portal");
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		DriverFactory.driver.get("https://pmqa.lntecc.com/PartnerMgmtApp/login");
		userNamePP(ConfigFileReader.getUS_UserName());
	
	}

	@Then("^Enter GSTUpdate Username$")
	public static void Enter_GSTUpdate_UserName() throws Throwable {
		System.out.println("* " + "User Name : Partner Portal");
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		DriverFactory.driver.get("https://pmqa.lntecc.com/PartnerMgmtApp/login");
		userNamePP(ConfigFileReader.getGSTUpdateUsername());
	}

	@Then("^Enter Standard Username$")
	public static void Enter_Standard_UserName() throws Throwable {
		System.out.println("* " + "User Name : Partner Portal");
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		DriverFactory.driver.get("https://pmqa.lntecc.com/PartnerMgmtApp/login");
		userNamePP(ConfigFileReader.getPP_UserName());
	}
	
	@Then("^Enter Password PP2$")
	public static void Enter_Password_pp2() throws Throwable {
		PartnerPortal_Menu.Password.sendKeys("Test@123");
	}
	
	@Then("^Enter CAPTCHA GST$")
	public void enter_CAPTCHA_GST() throws Throwable {
		captchaUserFinal(ConfigFileReader.getGSTUpdateUsername());
		// wait.until(ExpectedConditions.visibilityOfElementLocated())
	}
	
	@Then("^Enter CAPTCHA Standard$")
	public void enter_CAPTCHA_Standard() throws Throwable {
		captchaUserFinal(ConfigFileReader.getPP_UserName());
		// wait.until(ExpectedConditions.visibilityOfElementLocated())
	}
	
	@Then("^Enter CAPTCHA US UserName$")
	public void enter_CAPTCHA_US_UserName() throws Throwable {
		captchaUserFinal(ConfigFileReader.getUS_UserName());
		// wait.until(ExpectedConditions.visibilityOfElementLocated())
	}
	
	@Then("^Enter CAPTCHA for DB User$")
	public void enter_CAPTCHA_for_DB_User() throws Throwable {
		captchaUser_DB();
	}
	public static void PageLoader_Validation() throws InterruptedException {

		length_of_spinner = PartnerPortal_Menu.Spinner_img.size();
		if (length_of_spinner > 0) {
			System.out.println("Page is Loading - Kindly Wait .........");
			Thread.sleep(2000);
			Basic.PageLoader_Validation();
		} else {
			System.out.println("Page Load is Completed - Element is clickable now");
			System.out.println("--------------------------------------------------");
		}
		Thread.sleep(3000);

	}
	

//	@Then("^Enter CAPTCHA PP2$")
//	public static void enter_CAPTCHA_PP2() throws Throwable {
//		ocRCaptcha();
//		Thread.sleep(2000);
//		List<WebElement> verifyCaptcha = DriverFactory.driver.findElements(
//				By.xpath("//button[@class='btn openSans-regular home-button btn-size mt-4 slidee btn-secondary']"));
//		if (verifyCaptcha.size() > 0) {
//			captchaVerification
//		}
//
//	}

	public static void captchaVerification(String userName) throws Throwable {

		Thread.sleep(1500);
		List<WebElement> verifyCaptcha = DriverFactory.driver.findElements(
				By.xpath("//button[@class='btn openSans-regular home-button btn-size mt-4 slidee btn-secondary']"));
		if (verifyCaptcha.size() > 0) {
			try {
				WebElement textVerify = DriverFactory.driver.findElement(By.xpath("//div[text()='✓ captcha verified!']"));
				System.out.println(boldText + "* " + textVerify.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("--- Captcha verified ---");
			System.out.println("-------------------------");
		} else {
			System.out.println(boldText + "Captcha ReEntered");
			Thread.sleep(1500);
			DriverFactory.driver.navigate().refresh();
			
			userNamePP(userName);
			
			Enter_Password_pp2();
			ocRCaptcha(userName);
			
		}}
	
	public static void captchaVerification_DB() throws Throwable {

		Thread.sleep(1500);
		List<WebElement> verifyCaptcha = DriverFactory.driver.findElements(
				By.xpath("//button[@class='btn openSans-regular home-button btn-size mt-4 slidee btn-secondary']"));
		if (verifyCaptcha.size() > 0) {
			try {
				WebElement textVerify = DriverFactory.driver.findElement(By.xpath("//div[text()='✓ captcha verified!']"));
				System.out.println(boldText + "* " + textVerify.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("--- Captcha verified ---");
			System.out.println("-------------------------");
		} else {
			System.out.println(boldText + "Captcha ReEntered");
			Thread.sleep(1500);
			DriverFactory.driver.navigate().refresh();
			
			dataBaseUserName(userName);
			//dataBaseUserName("testing2024");
			
			Enter_Password_pp2();
			ocRCaptcha_DB();
			
		}}

	public static void captchaVerificationforGSTDetail() throws Throwable {

//		Thread.sleep(1500);
//		List<WebElement> loginCheck=DriverFactory.driver.findElements(By.xpath("//button[text()='LOGIN']"));
//		if (loginCheck.size()>0) {
//		
//			try {
//				ocRCaptcha();
//				WebElement login=DriverFactory.driver.findElement(By.xpath("//button[text()='LOGIN']"));
//        		login.click();
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
		Thread.sleep(1500);
		List<WebElement> verifyCaptcha = DriverFactory.driver.findElements(
				By.xpath("//button[@class='btn openSans-regular home-button btn-size mt-4 slidee btn-secondary']"));
		if (verifyCaptcha.size() > 0) {
			try {
				WebElement textVerify = DriverFactory.driver
						.findElement(By.xpath("//div[text()='✓ captcha verified!']"));
				System.out.println(boldText + "* " + textVerify.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("--- Captcha verified ---");
			System.out.println("-------------------------");
		} else {
			System.out.println(boldText + "Captcha ReEntered");
			Thread.sleep(1500);
			DriverFactory.driver.navigate().refresh();
			Enter_UserName_PP2();
			Enter_Password_pp2();
		//	ocRCaptcha();//
		}
//		} else {
//System.out.println("-------------------------------");
//		}

	}
	

}
