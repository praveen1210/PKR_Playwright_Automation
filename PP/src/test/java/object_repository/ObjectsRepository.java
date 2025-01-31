package object_repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectsRepository {

	// **Login Elements**

	@FindBy(how = How.LINK_TEXT, using = "Employee")
	public static WebElement Login_employee;

	@FindBy(how = How.LINK_TEXT, using = "Other User")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.CLASS_NAME, using = "unlk-acnt")
	public static WebElement Login_unlockAccount;

	@FindBy(how = How.CLASS_NAME, using = "frgt-pwd")
	public static WebElement Login_forgotPassword;

	@FindBy(how = How.TAG_NAME, using = "h1")
	public static WebElement Login_OldSessionerror;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement Login_OldSessionok;

	@FindBy(how = How.XPATH, using = "//span[@title='close']")
	public static WebElement Login_OldSessionclose;

	

}
