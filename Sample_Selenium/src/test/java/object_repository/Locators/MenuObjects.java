package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuObjects {

//	@FindBy(how = How.XPATH, using="//a[@class='modulemenu']")
//	public static WebElement moduleMenu;
	
	@FindBy(how = How.XPATH, using="//a[@title='Access Based Menu']")
	public static WebElement moduleMenu;
	
	// Date : 06.01.2024
	
	@FindBy(how = How.XPATH, using="//span[@title='Employee Apps']")
	public static WebElement EmployeeApps_Menu;
	
	@FindBy(how = How.XPATH, using="//span[@title='Travels & Admin']")
	public static WebElement TravelsAdmin_SubMenu;
	
	@FindBy(how = How.XPATH, using="//span[@title='Visitor Gate Pass']")
	public static WebElement VGP_SubMenu;
	
	@FindBy(how = How.XPATH, using="//span[@title='EIP Connect']")
	public static WebElement EIPConnect_SubMenu;
	
	@FindBy(how = How.XPATH, using="//span[@title='Visitor Entry Request']")
	public static WebElement VER_SubMenu;
	
	
	@FindBy(how = How.XPATH, using="//button[text()='Visitor Intro']")
	public static WebElement Visitor_Intro_Page;
	
	@FindBy(how = How.XPATH, using="//button[text()='Visitor Entry ']")
	public static WebElement Visitor_Entry_Page;
	
	
	@FindBy(how = How.XPATH, using="//button[text()='Visitor BlackList']")
	public static WebElement VisitorBlackList_Page;
	
	@FindBy(how = How.XPATH, using="//button[text()='Visitor Card Return']")
	public static WebElement VisitorCardReturn_page;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Previous Visitor Details']")
	public static WebElement PreviousVisitorDetails_page; // pk
	
	@FindBy(how = How.XPATH, using = "//button[text()='Visitors Tag Status']")
	public static WebElement VisitorsTagStatus_page; // pk
	
	@FindBy(how = How.XPATH, using = "//button[text()='Security Terminal']")
	public static WebElement SecurityTerminal_page; // pk
	
	@FindBy(how = How.XPATH, using = "//button[text()='Day Closing']")
	public static WebElement DayClosing_page; // pk
}
