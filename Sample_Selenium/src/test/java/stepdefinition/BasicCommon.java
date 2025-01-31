package stepdefinition;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.Locators.*;
import utils.DriverFactory;

public class BasicCommon {
	public static int length_of_spinner;
	static int i = (int) new Date().getTime();

	static int j = (int) (new Date().getTime() / 1000);
	//    static String fileuploadpath = System.getProperty("user.dir")+"\\src\\main\\upload";
	//	static String fileName = "\\Upload.txt";
	static String createFile, formattedDate;
	static String boldText = "\u001B[1m", resetFormatting = "\u001B[0m";
	static WebElement element;
	static Select check;
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(20));
	public static JavascriptExecutor js = (JavascriptExecutor) DriverFactory.driver;
	static boolean status;
	static List<WebElement> select;
	public static Actions action = new Actions(DriverFactory.driver);
	public static int getText;

	public static void PageLoader_Validation() throws InterruptedException {
		length_of_spinner = CommonControlObject.Spinner.size();
		List<WebElement> loader = DriverFactory.driver.findElements(By.xpath("//span[@id='RegularInternedId']"));
		if (length_of_spinner > 0) {
			System.out.println("Page is Loading - Kindly Wait .........");
			Thread.sleep(2000);
			BasicCommon.PageLoader_Validation();
		} else {
			System.out.println("Page Load is Completed - Element is clickable now");
			System.out.println("--------------------------------------------------");
		}
		if (loader.size() > 0) {
			System.out.println("Page is Loading - Kindly Wait .........");
			BasicCommon.PageLoader_Validation();
		} else {
			System.out.println("Page Load is Completed - Element is clickable now");
			System.out.println("--------------------------------------------------");
		}
		Thread.sleep(3000);
	}

	public static void currentURL() throws InterruptedException {
		WebDriver driver = DriverFactory.driver;
		String currentURL = driver.getCurrentUrl();
		System.err.println(resetFormatting + boldText + "Current URL: " + currentURL);
		Thread.sleep(1000);
	}

	public static void viewTypesList() throws InterruptedException {
		Thread.sleep(1500);
		List<WebElement> listofOption = CommonControlObject.ListOption;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
		if (randnMumber > 0) {
			try {
				System.out.println("*  " + boldText + "List of Types is = " + listofOption.get(randnMumber).getText());
			} catch (StaleElementReferenceException e) {
				e.getMessage();
			}
		}
	}

	public static void listText() {
		getText = CommonControlObject.ListOption.size();
		System.out.println("CC list count : " + getText);
		for (int i = 1; getText > i; i++) {
			String text = DriverFactory.driver.findElement(By.xpath("(//mat-option/span)" + "[" + i + "]")).getText();
			System.out.println("*  " + boldText + text);
			System.out.println("**************************");
			System.out.println(" ");
		}
	}

	public static void getListTexts(WebElement ele) {
		check = new Select(ele);
		List<WebElement> options = check.getOptions();
		System.out.println("Number of Options :" + options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).toString();
			System.out.println(boldText + "*  " + text);
		}
	}

public static void chooseOptionList() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> listofOption = CommonControlObject.ListOption;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
	if (randnMumber>0) {
			try {
					System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
			    listofOption.get(randnMumber).click();
			    Thread.sleep(1000);
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			} catch (StaleElementReferenceException e) {
			    // Element reference has become stale, refresh the list and try again
			    listofOption = CommonControlObject.ListOption;
			    randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
			    System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
			    Thread.sleep(1000);
			    listofOption.get(randnMumber).click();
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			}catch (Exception e) {
				List<WebElement> list = DriverFactory.driver.findElements(By.tagName("mat-option"));
				Random Rn = new Random();
				int i = Rn.nextInt(list.size());
				String text = list.get(i).getText();
				   Thread.sleep(1000);
				System.out.println("Selected Option : " + text);
				   Thread.sleep(1000);
				list.get(i).click();
//				System.out.println(boldText+"Element not able select" + e.getMessage());
			}
			
		
	} else {
System.out.println("None of the Drop Down value is available");
	}
	
	// *******************************************
	List<WebElement> list = DriverFactory.driver.findElements(By.tagName("mat-option"));
	if (list.size()>0) {
		Random Rn = new Random();
		int i = Rn.nextInt(list.size());
		String text = list.get(i).getText();
		   Thread.sleep(1000);
		System.out.println("Selected Option : " + text);
		   Thread.sleep(1000);
		list.get(i).click();
	}
		 else {
	    System.out.println("No options available in the dropdown.");
	}	
	}

		public static void cart_ListOption() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> listofOption = CommonControlObject.cart_List;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
	if (randnMumber>0) {
		try {
			System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
		} catch (StaleElementReferenceException e) {
			e.getMessage();
		}
			try {
			    listofOption.get(randnMumber).click();
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			} catch (StaleElementReferenceException e) {
			    // Element reference has become stale, refresh the list and try again
			    listofOption = CommonControlObject.cart_List;
			    randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
			    System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
			    listofOption.get(randnMumber).click();
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			}catch (Exception e) {
				e.getMessage();
				System.out.println(boldText+"Element not able select");
			}
	} else {
System.out.println("None of the Drop Down value is available");
	}
	}

public static void ListOption() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> listofOption = CommonControlObject.optionLi;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
	if (randnMumber>0) {
		try {
			System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
		} catch (StaleElementReferenceException e) {
			e.getMessage();
		}
			try {
			    listofOption.get(randnMumber).click();
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			} catch (StaleElementReferenceException e) {
			    // Element reference has become stale, refresh the list and try again
			    listofOption = CommonControlObject.cart_List;
			    randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
			    System.out.println("*  "+boldText+"Selected Item Name is = " + listofOption.get(randnMumber).getText());
			    listofOption.get(randnMumber).click();
			    System.out.println("*  "+boldText+"Selected Item Random Number is = " + randnMumber);
			}catch (Exception e) {
				e.getMessage();
				System.out.println(boldText+"Element not able select");
			}
	} else {
System.out.println("None of the Drop Down value is available");
	}
	}
	public static void popUp_Validation() throws InterruptedException {

		List<WebElement> head1 = DriverFactory.driver.findElements(By.xpath("//p[@class='toastMessageLength']"));
		List<WebElement> head2 = DriverFactory.driver.findElements(By.xpath("//eipmessagebox/div/div[2]/p"));
		List<WebElement> head3 = DriverFactory.driver.findElements(By.xpath("//eipalertwithtrace/div/div[2]/p"));
		System.out.println("******* Colored *******");

		//		// Colored_Output.main(CommonControlObject.popup_head.getText());
		Thread.sleep(2000);
		try {
			if (CommonControlObject.popup_head.getText().contains("Success")) {
				System.err.println("Popup Response :" + CommonControlObject.popup_head.getText());
				if (head1.size() > 0) {
					//					// Colored_Output.main(CommonControlObject.popup_insideText.getText());
//					// Colored_Output.greenColor(CommonControlObject.popup_insideText.getText());
					System.err.println("Success Popup Response :" + CommonControlObject.popup_insideText.getText());
					System.out.println("*****************");
				}
				if (head2.size() > 0) {
					WebElement validation = DriverFactory.driver.findElement(By.xpath("//eipmessagebox/div/div[2]/p"));
//					// Colored_Output.greenColor(validation.getText());
					System.err.println("Success Popup Response :" + validation.getText());
					System.out.println("*****************");
				}
				if (head3.size() > 0) {
					WebElement validation1 = DriverFactory.driver.findElement(By.xpath("//eipalertwithtrace/div/div[2]/p"));
					// Colored_Output.greenColor(validation1.getText());
					System.err.println("Success Popup Response :" + validation1.getText());
					System.out.println("*****************");
				} else {

				}
				try {
					wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.OkBtn));
					js.executeScript("arguments[0].click();", CommonControlObject.OkBtn);
				} catch (Exception e) {
					e.getMessage();
					try {
						action.sendKeys(CommonControlObject.OkBtn, Keys.ENTER).perform();
					} catch (Exception ex) {
						// Handle the exception gracefully (e.g., log an error message)
						System.err.println("Exception: " + ex.getMessage());
						// You can choose to ignore the exception or take appropriate action here
					}
				}

			}
			if (CommonControlObject.popup_head.getText().contains("Confirmation")) {
				if (head1.size() > 0) {
					//					// Colored_Output.main(BOQ_Objects.popup_insideText.getText());
					// Colored_Output.greenColor(CommonControlObject.popup_insideText.getText());
					System.err.println("Success Popup Response :" + CommonControlObject.popup_insideText.getText());
					System.out.println("*****************");
				}
				if (head2.size() > 0) {
					WebElement validation = DriverFactory.driver.findElement(By.xpath("//eipmessagebox/div/div[2]/p"));
					// Colored_Output.greenColor(validation.getText());
					System.err.println("Success Popup Response :" + validation.getText());
					System.out.println("*****************");
				}
				if (head3.size() > 0) {
					WebElement validation1 = DriverFactory.driver
							.findElement(By.xpath("//eipalertwithtrace/div/div[2]/p"));
					// Colored_Output.greenColor(validation1.getText());
					System.err.println("Success Popup Response :" + validation1.getText());
					System.out.println("*****************");
				} else {

				}
				Thread.sleep(1500);
				try {
					wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.OkBtn));
					CommonControlObject.OkBtn.click();
				} catch (Exception e) {
					try {
						wait.until(ExpectedConditions
								.elementToBeClickable(CommonControlObject.yes));
						CommonControlObject.yes.click();
					} catch (Exception ex) {
						// Handle the exception gracefully (e.g., log an error message)
						System.err.println("Exception: " + ex.getMessage());
						action.sendKeys(CommonControlObject.OkBtn, Keys.ENTER).perform();
					}
				}
				Thread.sleep(1500);

			}
			if (CommonControlObject.popup_head.getText().contains("Error")) {

				if (head1.size() < 0) {
					System.err.println("*****Failed to Save Details - Error Message : "
							+ CommonControlObject.popup_insideText.getText());
				}
				if (head2.size() < 0) {
					System.err.println(
							"*****Failed to Save Details - Error Message : " + CommonControlObject.popUp_Text.getText());
				}
				try {
					wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.OkBtn));
					js.executeScript("arguments[0].click();", CommonControlObject.OkBtn);
				} catch (Exception e) {
					e.getMessage();
					action.sendKeys(Keys.ENTER).perform();
				}
			} else {
				System.err.println("*****Popup Message : Not able to Identify" + "*****");
				action.sendKeys(Keys.ESCAPE).perform();
			}
		} catch (Exception e) {
			e.getMessage();
		}

		Thread.sleep(1000);
		List<WebElement> okBtn = DriverFactory.driver.findElements(By.xpath("//button[text()='Ok']"));
		if (okBtn.size() > 0) {
			try {
				Thread.sleep(2000);
				CommonControlObject.OkBtn.click();
			} catch (ElementClickInterceptedException e) {
				System.out.println("------------------------");
			}
		} else {
			System.out.println("************");
		}
		Thread.sleep(3000);

	}

//		public static void approverLvlInitiators() throws InterruptedException {
//		select=DriverFactory.driver.findElements(By.xpath("(//span/div/span[1])[1]"));
//		
//		if (select.size()>0) {
//			Thread.sleep(1000);
//			status = CommonControlObject.Initiatorlvl.isEnabled();
//			assertTrue(status);
//			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.Initiatorlvl));	
//			try {
//				System.out.println(CommonControlObject.Initiatorlvl.getText());
//			// Colored_Output.greenColor(boldText+CommonControlObject.Initiatorlvl.getText());
//			} catch (Exception e) {
//								
//			}
//			List<WebElement> initiator1=DriverFactory.driver.findElements(By.xpath("(//span/div/span[1])[2]"));
//			if (initiator1.size()>0) {
//				Thread.sleep(1000);
////				status = BOQ_Objects.InitiatorLvl1.isEnabled();
////				assertTrue(status);
////				wait.until(ExpectedConditions.elementToBeClickable(BOQ_Objects.InitiatorLvl1));	
//				 try {
//					 WebElement initiator1Element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span/div/span[1])[2]")));
//					 org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(DriverFactory.driver);
//			            action.moveToElement(initiator1Element).perform();
//			            Thread.sleep(1000);
//						try {
//							 String text = initiator1Element.getText();
//					            System.out.println(text);
//							Thread.sleep(1500);
//						} catch (Exception e) {
//											
//						}} catch (Exception e) {
//					e.getMessage();
//				}
//		} else {
//
//		}
//	}else {
//		System.out.println("-----------------------");
//	}
//}

	public static void Input(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void InputTab(WebElement ele, String value) {

		ele.sendKeys(value, Keys.TAB);
	}

	public static void kendo_calender(WebElement ele, String date) throws InterruptedException, AWTException {
		WebElement calendar = DriverFactory.driver.findElement(By.xpath("(//span/kendo-dateinput/span/input)[3]"));

		calendar.click();
		String[] Date = date.split("-");
		ele.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		ele.sendKeys(Keys.DELETE);
		action.sendKeys(Keys.HOME);
		Input(ele, Date[0]);
		Thread.sleep(1000);
		InputTab(ele, Date[1]);
		Thread.sleep(1000);
		InputTab(ele, Date[2]);
	}

	public static String todayDate() {
		Date currentDate = new Date();

		// Define the date format you want ("dd-MM-yyyy")
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		// Format the date as a string
		formattedDate = dateFormat.format(06-01-1996);

		// Print the formatted date
		System.out.println("Today's date (dd-MM-yyyy): " + formattedDate);
		return formattedDate;
	}

	public static void main(String[] args) {
		Date currentDate = new Date();

		// Define the date format you want ("dd-MM-yyyy")
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		// Format the date as a string
		formattedDate = dateFormat.format(currentDate);

		// Print the formatted date
		System.out.println("Today's date (dd-MM-yyyy): " + formattedDate);
		
	}
	
	public static void Toggle_calendar() throws InterruptedException, AWTException {
		List<WebElement> calendar = DriverFactory.driver.findElements(By.xpath("(//span[@title='Toggle calendar'])[3]"));
		//		if (calendar.size()>0) {
		//			Thread.sleep(1000);
		//			status = COA_Masters_Objects.Toggle_calendar.isEnabled();
		//			assertTrue(status);
		//			wait.until(ExpectedConditions.elementToBeClickable(COA_Masters_Objects.Toggle_calendar));	
		//			js.executeScript("arguments[0].click();", COA_Masters_Objects.Toggle_calendar);
		//// COA_Masters_Objects.calendarToggle.clear();
		// Thread.sleep(1500);
		//// COA_Masters_Objects.calendarToggle.sendKeys(ExcelReader.excelSheet(10));
		//		} else {
		// System.out.println("Calendar Toggle not available");
		//		}
		Thread.sleep(2000);
		todayDate();
		System.out.println("Date : " + formattedDate);
		if (calendar.size() > 0) {
			try {
				WebElement calendar1 = DriverFactory.driver.findElement(By.xpath("(//span/kendo-dateinput/span/input)[3]"));
				kendo_calender(calendar1, formattedDate);
			} catch (NoSuchElementException e) {
				e.getMessage();
			}
			Thread.sleep(2000);
		} else {
			System.out.println("Calendar Toggle not available");
		}
	}

	public static String createTextFile() {
		// Generate a unique filename using timestamp
		//      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		//      String timestamp = dateFormat.format(new Date());
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		String fileName = "src/main/upload/" + randomNumber + ".txt"; // Adjust the path

		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("Testing purpose");
			writer.close();
			System.out.println("Text file created: " + fileName);
		} catch (IOException e) {
			e.getMessage();
		}

		return new File(fileName).getAbsolutePath();
	}

	public static void attachment_FileUpload() throws InterruptedException {
		//		status = CommonControlObject.Attachment.isEnabled();
		//		assertTrue(status);
		//		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.Attachment));	
		//		js.executeScript("arguments[0].click();", CommonControlObject.Attachment);
		//		Thread.sleep(2000);
		//		System.err.println("TEST FOR UPLOAD");   

		//		String originalFileName = "Upload.txt"; // Provide the original file name here
		//		        
		//		        String uniqueFileName = UniqueFileNameGenerator.generateUniqueFileName(originalFileName);
		//		        
		//		        // Locate the file upload element
		//		        WebElement fileUploadElement = DriverFactory.driver.findElement(By.xpath("(//kendo-upload/div/div[1]/input)[2]")); // Adjust the locator
		//		        
		//		        // Provide the path to your file
		//		        String filePath = System.getProperty("user.dir")+"/src/main/upload" + uniqueFileName;
		//		        
		//		        // Enter the file path into the file upload element
		//		        fileUploadElement.sendKeys(filePath);

		//		String relativeFilePath = System.getProperty("user.dir")+"/src/main/upload" ; // Path relative to your project root
		//		WebElement fileUploadElement = DriverFactory.driver.findElement(By.xpath("(//kendo-upload/div/div[1]/input)[2]")); // Adjust the locator
		//		 String originalFileName = "Upload.txt"; // Provide the original file name here
		//	        
		//	        String uniqueFileName = generateUniqueFileName(originalFileName);
		//	        System.out.println("Unique File Name: " + uniqueFileName);
		//		String absoluteFilePath = new File(relativeFilePath).getAbsolutePath();
		//		System.out.println(absoluteFilePath);
		//		fileUploadElement.sendKeys(absoluteFilePath);
		select = DriverFactory.driver.findElements(By.xpath("//i[@class='fa fa-paperclip']"));
		if (select.size() > 0) {
			try {
				status = CommonControlObject.Attachment.isEnabled();
				assertTrue(status);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.Attachment));
				js.executeScript("arguments[0].click();", CommonControlObject.Attachment);
				Thread.sleep(2000);

				String filePath = createTextFile();

				System.err.println("TEST FOR UPLOAD");

				System.out.println("File path : " + filePath);
				//				String file = fileuploadpath + fileName;
				CommonControlObject.Upload_File.sendKeys(filePath);
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.attachFileType));
				js.executeScript("arguments[0].click();", CommonControlObject.attachFileType);
				chooseOptionList();
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.attachDescription));
				js.executeScript("arguments[0].click();", CommonControlObject.attachDescription);
//				js.executeScript("arguments[0].value = arguments[1]", CommonControlObject.attachDescription,
//						ConfigFileReader.getDescription());
//				System.out.println("Description : " + ConfigFileReader.getDescription());
				js.executeScript("arguments[0].click();", CommonControlObject.attachExternal_Toggle);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.upload_DocAttach));
				js.executeScript("arguments[0].click();", CommonControlObject.upload_DocAttach);

			} catch (Exception e) {
				CommonControlObject.Attachment.click();

				String filePath = createTextFile();

				System.err.println("TEST FOR UPLOAD");

				System.out.println("File path : " + filePath);
				//				String file = fileuploadpath + fileName;
				CommonControlObject.Upload_File.sendKeys(filePath);

				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.attachFileType));
				CommonControlObject.attachFileType.click();
				chooseOptionList();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.attachDescription));
				CommonControlObject.attachDescription.click();
				Thread.sleep(1000);
//				CommonControlObject.attachDescription.sendKeys(ConfigFileReader.getDescription());
//				System.out.println("Description : " + ConfigFileReader.getDescription());
				Thread.sleep(1000);
				CommonControlObject.attachExternal_Toggle.click();
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.upload_DocAttach));
				CommonControlObject.upload_DocAttach.click();
			}
		} else {
			System.out.println("------------------");
		}

	}

	public static void doc1_Details_Print() throws InterruptedException {
		PageLoader_Validation();
		Thread.sleep(5000);
		List<WebElement> kendogrid = DriverFactory.driver.findElements(By.xpath("//div[2]/app-shared-add-details-grid/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td"));
		if (kendogrid.size() > 0) {
			int randnMumber = ThreadLocalRandom.current().nextInt(0, kendogrid.size());
			System.out.println(randnMumber);
			for (int i = 0; i < kendogrid.size(); i++) {
				Thread.sleep(1000);
				WebElement Text = kendogrid.get(i);
				System.out.println(boldText + "* " + Text.getText() + "\n");
			}
		} else {
			try {

				DriverFactory.driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).click();
				Thread.sleep(1500);

				try {
					WebElement docNum1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//kendo-grid-list/div/div[1]/table/tbody/tr[1]/td")));
					action.moveToElement(docNum1).perform();
				} catch (Exception e) {
					e.getMessage();
					DriverFactory.driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).click();
					Thread.sleep(1500);

				}
				Thread.sleep(1000);
				List<WebElement> doc1_Details = CommonControlObject.created_Doc_Details;
				int randnMumber = ThreadLocalRandom.current().nextInt(0, doc1_Details.size());
				System.out.println(randnMumber);
				for (int i = 0; i < doc1_Details.size(); i++) {
					Thread.sleep(1000);
					WebElement Text = doc1_Details.get(i);
					System.out.println(Text.getText() + "\n");
				}
				//				action.moveToElement(docNum1).perform();
				List<WebElement> loading = DriverFactory.driver.findElements(By.xpath("//span[@class='k-loading-text']"));
				if (!loading.isEmpty()) {
					Thread.sleep(3000);
					System.out.println(randnMumber);
					for (int i = 0; i < doc1_Details.size(); i++) {
						Thread.sleep(1000);
						WebElement Text = doc1_Details.get(i);
						System.out.println(Text.getText());

					}
				} else {

					System.out.println("*****************");

				}
			} catch (Exception e) {
				e.getMessage();
				Thread.sleep(2000);
				BasicCommon.PageLoader_Validation();
				try {
					Thread.sleep(1500);
					WebElement docNum1 = wait.until(ExpectedConditions
							.elementToBeClickable(By.xpath("//kendo-grid-list/div/div[1]/table/tbody/tr[1]/td")));
					action.moveToElement(docNum1).perform();
				} catch (Exception ex) {
					ex.printStackTrace();
					Thread.sleep(1000);
					DriverFactory.driver.findElement(By.xpath("(//span[@class='text-ellipsis'])[2]")).click();
					Thread.sleep(1500);

				}
				Thread.sleep(1000);
				List<WebElement> doc1_Details = CommonControlObject.created_Doc_Details;
				int randnMumber = ThreadLocalRandom.current().nextInt(0, doc1_Details.size());
				System.out.println(randnMumber);
				for (int i = 0; i < doc1_Details.size(); i++) {
					Thread.sleep(1000);
					WebElement Text = doc1_Details.get(i);
					System.out.println(Text.getText() + "\n");
				}
				//				action.moveToElement(docNum1).perform();
				List<WebElement> loading = DriverFactory.driver
						.findElements(By.xpath("//span[@class='k-loading-text']"));
				if (!loading.isEmpty()) {
					Thread.sleep(3000);
					System.out.println(randnMumber);
					for (int i = 0; i < doc1_Details.size(); i++) {
						Thread.sleep(1000);
						WebElement Text = doc1_Details.get(i);
						System.out.println(Text.getText());

					}
				} else {
					System.out.println("*****************");

				}
			}

		}
	}

	public static void Select_Option(WebElement ele) throws InterruptedException {

		ele.click();

		List<WebElement> list = DriverFactory.driver.findElements(By.tagName("mat-option"));

		Random Rn = new Random();

		int i = Rn.nextInt(list.size());

		String text = list.get(i).getText();

		System.out.println("Selected Option : " + text);

		list.get(i).click();

	}

	

	// Calendar : 

////	public static void Calendar_Valid_From_To() throws InterruptedException {
////
////		Thread.sleep(2000);
////
////		List<WebElement> listofOption = RPT_Object.calendar_ValidFrom;
////
////		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
////
////		if (randnMumber > 0) {
////
////			try {
////
////				System.out.println(
////						"*  " + boldText + "Selected Item Name is = " + listofOption.get(randnMumber).getText());
////
////			} catch (StaleElementReferenceException e) {
////
////				e.getMessage();
////
////			}
////
////			try {
////
////				listofOption.get(randnMumber).click();
////
////				System.out.println("*  " + boldText + "Selected Item Random Number is = " + randnMumber);
////
////			} catch (StaleElementReferenceException e) {
////
////				// Element reference has become stale, refresh the list and try again
////
////				listofOption = RPT_Object.calendar_ValidFrom;
////
////				randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
////
////				System.out.println(
////						"*  " + boldText + "Selected Item Name is = " + listofOption.get(randnMumber).getText());
////
////				listofOption.get(randnMumber).click();
////
////				System.out.println("*  " + boldText + "Selected Item Random Number is = " + randnMumber);
////
////			} catch (Exception e) {
////
////				e.getMessage();
////
////				System.out.println(boldText + "Element not able select");
////
////			}
////
////		} else {
////
////			System.out.println("None of the Calendar is available");
////
////		}
//
//		List<WebElement> calendar_ValidTo = RPT_Object.calendar_ValidTo;
//
//		int randnMumberCalendar = ThreadLocalRandom.current().nextInt(0, calendar_ValidTo.size());
//
//		if (randnMumberCalendar > 0) {
//
//			try {
//
//				System.out.println(
//						"*  " + boldText + "Selected Item Name is = " + calendar_ValidTo.get(randnMumberCalendar).getText());
//
//			} catch (StaleElementReferenceException e) {
//
//				e.getMessage();
//
//			}
//
//			try {
//
//				calendar_ValidTo.get(randnMumberCalendar).click();
//
//				System.out.println("*  " + boldText + "Selected Item Random Number is = " + randnMumberCalendar);
//
//			} catch (StaleElementReferenceException e) {
//
//				// Element reference has become stale, refresh the list and try again
//
//				calendar_ValidTo = RPT_Object.calendar_ValidFrom;
//
//				randnMumberCalendar = ThreadLocalRandom.current().nextInt(0, calendar_ValidTo.size());
//
//				System.out.println(
//						"*  " + boldText + "Selected Item Name is = " + calendar_ValidTo.get(randnMumberCalendar).getText());
//
//				calendar_ValidTo.get(randnMumberCalendar).click();
//
//				System.out.println("*  " + boldText + "Selected Item Random Number is = " + randnMumberCalendar);
//
//			} catch (Exception e) {
//
//				e.getMessage();
//
//				System.out.println(boldText + "Element not able select");
//
//			}
//
//		}
//
//
//	}
	
    public static void DaysOf_Record() throws InterruptedException {
    	select=DriverFactory.driver.findElements(By.xpath("//span/kendo-searchbar/input"));
  		Thread.sleep(1000);
  		if (select.size()>0) {
  			status = CommonControlObject.ListDaysRecord.isEnabled();
  			assertTrue(status);
  			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ListDaysRecord));	
  			CommonControlObject.ListDaysRecord.click();
  			Thread.sleep(1500);
				List<WebElement> listofOption = DriverFactory.driver.findElements(By.xpath("//li"));
				int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
			if (randnMumber>0) {
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.text40));	
				CommonControlObject.text40.click();				
				    }else {
				    	try {
							System.out.println("*  "+boldText+"Selected Month Name is = " + listofOption.get(randnMumber).getText());
						} catch (StaleElementReferenceException e) {
							e.getMessage();
						}
						 listofOption.get(randnMumber).click();
						    System.out.println("*  "+boldText+"Selected Random Month is = " + randnMumber); 
					}  			
  			try {
  				System.out.println(CommonControlObject.ListDaysRecord.getText());
  			} catch (Exception e) {
  				System.out.println("***********************");
  			}
  			Thread.sleep(1000);
  		} else {
  System.out.println("pageNumberOf_Items doc_ListRecord icon is not available");
  		}	
	}
	
	public static String textUpder_4_digit() {
		   Random random = new Random();
           int randomNumber = random.nextInt(100);
           
           String textDigit = "5"+randomNumber;
           System.out.println(textDigit);
		return textDigit;
	}
	


}
