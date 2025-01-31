package dataProviders;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.PartnerPortal_Menu;
import utils.DriverFactory;

public class BaseClass extends ConfigFileReader {

	public static Statement stmt, stmt1;
	public static Connection con;
	public static String DB_Url, DB_User, DB_Pwd, DERNumber, OCV;
	public static WebDriver driver;
	// public static Actions a;
	public static Robot r;
	// public static Alert t;
	public static TakesScreenshot s;
	// public static JavascriptExecutor j;
	// public static Select se;
	public static WebDriverWait wWait;
	public static FluentWait fWait;
	public static String randomSelect, formattedDate;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	public static void Get_Environment(String url) {
		DriverFactory.driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		DriverFactory.driver.get(url);
	}

	public static void Print(String ToPrint) {
		System.out.println(ToPrint);
	}

	public static void Input(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void InputTab(WebElement ele, String value) {

		ele.sendKeys(value, Keys.TAB);
	}
	public static void InputBACKSPACE(WebElement ele) {

		ele.sendKeys(Keys.BACK_SPACE);
	}
	public static void InputCTRLPLUSA(WebElement ele) {

		ele.sendKeys(Keys.CONTROL+"a");
	}
	public static void InputEND(WebElement ele) {

		ele.sendKeys(Keys.END);
	}
	public static void InputDELETE(WebElement ele) {

		ele.sendKeys(Keys.DELETE);
	}

	public static void Click(WebElement ele) {
		ele.click();
	}

	public static void Clear(WebElement ele) {
		ele.click();
		ele.clear();
	}

	public static void ClearElement(WebElement ele) {
		ele.clear();
	}

	public static void Close() {
		driver.close();
	}

	public static void Quit() {
		driver.quit();
	}

	public static String GetText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public static void PrintTitle() {
		System.out.println(driver.getTitle());
	}

	public static String GetAttribute(WebElement ele, String value) {
		String attribute = ele.getAttribute(value);
		return attribute;
	}

	public static void PrintAttribute(WebElement ele, String value) {

		Print(GetAttribute(ele, value));
	}

	public static void MoveTo(WebElement ele) {
		Actions a = new Actions(DriverFactory.driver);
		a.moveToElement(ele);
		a.perform();
	}

	public static void Drag(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void Doule_Click(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	public static void Right_Click(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public static void build() {
		Actions a = new Actions(driver);
		a.build().perform();
	}

	public static void sKeys(WebElement target, String keys) {
		Actions a = new Actions(driver);
		a.sendKeys(target, keys);
	}

	public static void clk() {
		Actions a = new Actions(driver);
		a.click().perform();
	}

	public static void SelectAll() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void Cut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void Copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void Paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void Tab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void Shift() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void Enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void Delete() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}

	public static void Home() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_HOME);
		r.keyRelease(KeyEvent.VK_HOME);
	}

	public static void Alert() {
		Alert t = DriverFactory.driver.switchTo().alert();
	}

	public static void Accept_Alert1() {
		Alert t = DriverFactory.driver.switchTo().alert();
		t.accept();
		System.out.println("Alert Accepted.");
	}

	public static void Dismiss_Alert() {
		Alert t = DriverFactory.driver.switchTo().alert();
		t.dismiss();
	}

	public static void SendText_Alert(String value) {
		Alert t = DriverFactory.driver.switchTo().alert();
		t.sendKeys(value);
	}

	public static String GetText_Alert() {
		Alert t = DriverFactory.driver.switchTo().alert();
		System.out.println("Alert Text : "+t.getText());
		String text = t.getText();
		return text;
	}

	public static void idFrame(String id) {
		driver.switchTo().frame(id);
	}

	public static void nameFrame(String name) {
		driver.switchTo().frame(name);
	}

	public static void intFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void webEleFrame(WebElement ref) {
		driver.switchTo().frame(ref);
	}

	public static void parFrame() {
		driver.switchTo().parentFrame();
	}

	public static void mainFrame() {
		driver.switchTo().defaultContent();
	}

	public static void screenshot(String path, String filename) throws IOException {
		s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename + ".jpg");
		FileUtils.copyFile(src, des);
	}

	public static void fill(String attribute, String value, WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.driver;
		j.executeScript("arguments[0].setAttribute('" + attribute + "','" + value + "')", ele);
	}

	public static void jsGetAtt(String attributeName, WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.driver;
		Object executeScript = j.executeScript("return arguments[0].getAttribute('" + attributeName + "')", ele);
		String text = executeScript.toString();
		System.out.println(attributeName + " :" + text);
	}

	public static void jsClk(WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.driver;
		j.executeScript("arguments[0].click();", ele);
	}

	public static void jsTop(WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.driver;
		j.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	public static void jsBottom(WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.driver;
		j.executeScript("arguments[0].scrollIntoView(false);", ele);
	}

	public static void jsHighlight(String backgoungColour, int pixel, String broderColour, WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('style','background:" + backgoungColour + "; border:" + pixel + "px "
				+ broderColour + ";');", ele);
	}

	public static void value(WebElement ele, String value) {
		Select se = new Select(ele);
		se.selectByValue(value);
	}

	public static void SelectText(WebElement ele, String text) {
		Select se = new Select(ele);
		se.selectByVisibleText(text);
	}

	public static void index(WebElement ele, int index) {
		Select se = new Select(ele);
		se.selectByIndex(index);
	}

	public static void isMulti(WebElement ele) {
		Select se = new Select(ele);
		se.isMultiple();
	}

	public static void getOption(WebElement ele) {
		Select se = new Select(ele);
		List<WebElement> options = se.getOptions();
		System.out.println("Number of Options :" + options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).toString();
			System.out.println(text);
		}
	}

	public static void getrandomOption(WebElement ele) throws Throwable {
		Select se = new Select(ele);
		List<WebElement> options = se.getOptions();
		System.out.println("Number of Options :" + options.size());
		Random r = new Random();
		int ro = r.nextInt(options.size());
		if(options.get(ro).isEnabled()) {
			randomSelect = options.get(ro).getText();
		}else {
			ro = r.nextInt(options.size());
			randomSelect = options.get(ro).getText();
		}
		for (WebElement option : options) {
			String text = BaseClass.GetText(option);
			if (text.equals(randomSelect)) {
				BaseClass.jsTop(option);
				BaseClass.SelectText(ele, text);
				Thread.sleep(3000);
				System.out.println("Selected Random : " + text);
				break;
			}
		}
	}

	public static void getAllSelectedOptions(WebElement ele) {
		Select se = new Select(ele);
		List<WebElement> options = se.getAllSelectedOptions();
		System.out.println("Number of Options :" + options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).toString();
			System.out.println(text);
		}
	}

	public static String getFirstSelectedOption(WebElement ele) {
		Select se = new Select(ele);
		WebElement firstSelectedOption = se.getFirstSelectedOption();
		String selectedText = firstSelectedOption.getText();
		System.out.println(selectedText);
		return selectedText;
	}

	public static void deSelecteAll(WebElement ele) {
		Select se = new Select(ele);
		se.deselectAll();
	}

	public static void deSelectValue(WebElement ele, String value) {
		Select se = new Select(ele);
		se.deselectByValue(value);
	}

	public static void deSelectindex(WebElement ele, int index) {
		Select se = new Select(ele);
		se.deselectByIndex(index);
	}

	public static void deSelecttext(WebElement ele, String text) {
		Select se = new Select(ele);
		se.deselectByVisibleText(text);
	}

	public static void sinWinHandle() {
		String windowHandle = DriverFactory.driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void multiWindowHandles() {
		Set<String> windowHandles = DriverFactory.driver.getWindowHandles();
		for (String eachId : windowHandles) {
			System.out.println(eachId);
		}
	}

	public static void switchWindows() {
		String parentId = DriverFactory.driver.getWindowHandle();
		Set<String> allWindowsId = DriverFactory.driver.getWindowHandles();
		for (String eachId : allWindowsId) {
			if (!eachId.equals(parentId)) {
				DriverFactory.driver.switchTo().window(eachId);
			}
		}
	}

	public static void Implicit_Wait(int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.MINUTES);
	}

	public static void Explicit_Wait(int secs) {
		wWait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(30));
		;
	}

	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static String AddNumber(WebElement Ele, int Int) {
		String getText = GetText(Ele);
		Integer integer = Integer.valueOf(getText);
		int integer1 = integer + Int;
		String string2 = String.valueOf(integer1);
		return string2;
	}

	/*
	 * public static void kendo_calender(WebElement ele, String date) throws
	 * InterruptedException, AWTException {
	 * 
	 * Click(ele); String[] Date = date.split("-"); SelectAll(); Delete(); Home();
	 * Input(ele, Date[0]); InputTab(ele, Date[1]); InputTab(ele, Date[2]); }
	 */

	public void setAttributeValue(WebElement elem, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", elem, "ng-reflect-value", value);
	}

//============================================================================================================================	

	public static void onButtonClick(WebElement ele) throws InterruptedException {
		boolean enabled = ele.isEnabled();
		if (enabled == true) {
			System.out.println("Is Button Enabled: " + enabled);

			try {
				Thread.sleep(3000);
				ele.click();
			} catch (Exception e) {
				Thread.sleep(3000);
				System.out.println("Normal click not working for Save button \n so we use JavascriptExecutor to click");
				jse.executeScript("arguments[0].click();", ele);
			}
		} else {
			System.out.println("Button is Disabled. Please enter correct details ");
		}

	}

	public static void onMouseHover(WebElement ele) throws InterruptedException {
		Actions ac = new Actions(DriverFactory.driver);
		ac.moveToElement(ele).click().perform();
	}
	public static void onMouseHoverEle(WebElement ele) throws InterruptedException {
		Actions ac = new Actions(DriverFactory.driver);
		ac.moveToElement(ele).perform();
	}

	public static void FileWrite(String Fcontent, String fileName)
			throws SQLException, InterruptedException, IOException {
		System.out.println(fileName);
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(Fcontent);
		fw.close();
	}

	public static void popupValidation() throws Throwable {
		List<WebElement> thanksPopup_okBtn = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (thanksPopup_okBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thanks for logging-in popup is not shown");

		}
	}

	public static void ArraySelect(WebElement Key, WebElement clear, String[] value)
			throws SQLException, InterruptedException, IOException {
		for (int i = 0; i < value.length; i++) {
			Thread.sleep(1000);			
			BaseClass.ClearElement(clear);
			BaseClass.Input(clear, value[i]);
			BaseClass.onButtonClick(Key);
		}
	}

	public static void sendKeysEND() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.END);
	}

	public static void sendKeysTAB() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.TAB);
	}

	public static void sendKeysDOWN() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.DOWN);
	}

	public static void sendKeysBACKSPACE() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.BACK_SPACE);
	}

	public static void sendKeysESCAPE() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.ESCAPE);
		a.perform();
	}

	public static void sendKeysHOME() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.HOME);
		a.perform();
	}

	public static void sendKeysLEFT() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.LEFT);
		a.perform();
	}

	public static void sendKeysRIGHT() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.RIGHT);
		a.perform();
	}

	public static void sendKeysDELETE() {
		Actions a = new Actions(DriverFactory.driver);
		a.sendKeys(Keys.DELETE);
		a.perform();
	}
	public static void sendKeysDocumentNo(WebElement ele,String docNo) throws Throwable {
		ele.clear();
	    for (int i = 0; i < docNo.length(); i++){
	        char c = docNo.charAt(i);
	        String s = new StringBuilder().append(c).toString();
	        ele.sendKeys(s);
	        Thread.sleep(1000);
	    } 
	}
	public static void kendo_calender(WebElement ele, String date) throws InterruptedException, AWTException {
		WebElement calendar = DriverFactory.driver
				.findElement(By.xpath("//*[@class='calendar-icon']//following::input[@type='text']"));
		String[] Date = date.split("-");
		ele.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		BaseClass.sendKeysDELETE();
		BaseClass.sendKeysHOME();
		Input(ele, Date[0]);
		Thread.sleep(2000);
		Input(ele, Date[1]);
		Thread.sleep(2000);
		BaseClass.sendKeysRIGHT();
		Input(ele, Date[2]);
		BaseClass.sendKeysHOME();
	}

	public static String getStatusEffectiveDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Today's date is " + dateFormat.format(cal.getTime()));
		cal.add(Calendar.DATE, 7);
		formattedDate = dateFormat.format(cal.getTime());
		System.out.println("DOB date was " + dateFormat.format(cal.getTime()));
		return formattedDate;

	}

	public static void ErrorPopup() {
		try {
			if (PartnerPortal_Menu.ErrorAlert.getText().contains("Error")) {
				Thread.sleep(1000);
				System.err.println("Alert Type = " + PartnerPortal_Menu.ErrorAlert.getText());
				Thread.sleep(1000);
				System.err.println("Alert Text = " + PartnerPortal_Menu.ErrorAlertText.getText());
				Thread.sleep(2000);
				BaseClass.onButtonClick(PartnerPortal_Menu.AcceptAlertR);
			}

		} catch (Exception e) {
			System.out.println("Error Alert Not Appearing");
		}
	}
	public static void getTableView(List<WebElement> elementTH,List<WebElement> elementTR) throws Throwable {
		Thread.sleep(3000);
		int countTH=elementTH.size();
		int countTR=elementTR.size();
		for(int i=0;i<countTR;i++) {
			for(int j=0;j<countTH;j++) {
				String tdText = elementTR.get(i).findElement(By.xpath("//td["+(j+1)+"]")).getText();
				System.out.println(elementTH.get(j).getText()+" : "+tdText);
			}
		}

	}

}
