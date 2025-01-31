package stepdefinition.VGP;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import object_repository.Locators.LoginObjects;
import repository.Actions.LoginActions;
import stepdefinition.BasicCommon;
import utils.DriverFactory;
public class Login {
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	
	@Given("^As a user i should able to view the home page$") 
	public static void as_a_user_i_should_able_to_view_the_home_page() throws Throwable {
		LoginActions.homepage();	    
	} 

	@Given("^As user i should able to click otheruser login button$")
	public static void as_user_i_should_able_to_click_otheruser_login_button() throws Throwable {
		LoginActions.otheruserLogin();
	}  
  
	@Given("^As a user i should able to login$")
	public static void as_a_user_i_should_able_to_login() throws Throwable {
	      
	} 
	@Given("^enter username and password$")
	public static void enter_username_and_password() throws Throwable {
		LoginActions.username_password();
	}   

	@Given("^click Log in button$")
	public static void click_Log_in_button() throws Throwable {
		LoginActions.submit();
		BasicCommon.PageLoader_Validation();
	}
	public static void Logout() throws InterruptedException {
		DriverFactory.driver.navigate().refresh();
Thread.sleep(4000);
try {
	wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.Profile_Dropdown));
	LoginObjects.Profile_Dropdown.click();
	Thread.sleep(1500);
	wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.Profile_Signout));
	LoginObjects.Profile_Signout.click();
	Thread.sleep(1500);
	System.out.println("Logged out Successfully");
	System.out.println("****************************");
} catch (ElementClickInterceptedException e) {
	System.out.println("****************************");
}
	}
	
	@Then("As a user i should able to Signout the EIP4 application")
	public void as_a_user_i_should_able_to_Signout_the_EIP4_application() throws InterruptedException, IOException {
		Logout();
	}
	
	

	       
}