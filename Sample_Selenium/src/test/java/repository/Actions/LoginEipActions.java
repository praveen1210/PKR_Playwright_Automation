package repository.Actions;

import org.openqa.selenium.support.PageFactory;

import object_repository.Locators.LoginEipObjects;
import utils.DriverFactory;

public class LoginEipActions {

	public LoginEipActions() {
		PageFactory.initElements(DriverFactory.driver, LoginEipObjects.class);
	}
	
	public void logineiphomepage() {
		DriverFactory.driver.get("https://eip4qa.lntecc.com/eiproot/login");
		
	}
	public void otheruser() {
		LoginEipObjects.otheruser.click(); 
	}
	public void userNameAndPassword() {
		LoginEipObjects.username.sendKeys("SKARTHIK");
		LoginEipObjects.password.sendKeys("LNT%QA22");
		
	}
	public void login() {
		LoginEipObjects.login.click();
	}
	public void mainMenu() {
		LoginEipObjects.accessBasedMenu.click();
		
	}
	public void supplyCainManagement() {
		LoginEipObjects.supplyChainMgmt.click();
	}
	public void warehouse() {
		LoginEipObjects.warehouse.click();
	}
	public void materailReceiptNote() {
		LoginEipObjects.materialReceiptNote.click();
	}
}
