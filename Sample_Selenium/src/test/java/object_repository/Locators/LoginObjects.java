package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects {

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Employee')]")
	public  static WebElement employee;
	
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Other User')]")
	public static WebElement other;
	
	@FindBy(how=How.ID,id="username")
	public static WebElement username;
	
	@FindBy(how=How.XPATH,xpath="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(how=How.ID,id="login-submit")
	public static WebElement loginbutton;	
	
	@FindBy(how=How.XPATH,xpath="//eipmessagebox//p")
	public  static WebElement invaliduser;
	
	@FindBy(how=How.XPATH,xpath="//eipmessagebox//span[@title='Close']")
	public  static WebElement close;
	
	@FindBy(how = How.XPATH, xpath="//span[@class='user_name']")
	public static WebElement getUserName;
	
	@FindBy(how = How.XPATH, using = "(//header//i)[1]")
	public static WebElement Profile_Dropdown;

	@FindBy(how = How.XPATH, using = "(//header//a)[7]")
	public static WebElement Profile_Signout;

	@FindBy(how = How.XPATH, using = "//a[text()='Other User']")
	public static WebElement Login_otherUser;
}