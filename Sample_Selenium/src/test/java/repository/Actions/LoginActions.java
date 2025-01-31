package repository.Actions;
import org.openqa.selenium.support.PageFactory;
import object_repository.Locators.*;
import utils.DriverFactory;
import dataProviders.ConfigFileReader;
public class LoginActions {
	
	
	public LoginActions() {	
		
		PageFactory.initElements(DriverFactory.driver, LoginObjects.class);
	}
	
	public static void homepage() {
		DriverFactory.driver.get("https://eip4qa.lntecc.com/eiproot/login");
	}
	
	public static void otheruserLogin() throws InterruptedException {
		Thread.sleep(3000);
		LoginObjects.other.click();
	}
	
	public static void username_password() {
		
		LoginObjects.username.sendKeys(ConfigFileReader.getUsername());
		LoginObjects.password.sendKeys(ConfigFileReader.getPassword());
		
	}	
	public static void submit() throws InterruptedException {
		Thread.sleep(2000);
		LoginObjects.loginbutton.click();
		Thread.sleep(4000);
		System.out.println("login successfully with valid credentials");
	}

	
	

}