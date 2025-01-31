package repository.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import object_repository.Locators.CommonControlObject;
import object_repository.Locators.MenuObjects;
import utils.DriverFactory;

public class MenuTraverseActions {
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	
	public MenuTraverseActions() {
		PageFactory.initElements(DriverFactory.driver, MenuObjects.class);
	}
	public static void mainMenu() {
//		MenuObjects.moduleMenu.isEnabled();
	}
	public static  void clickMainMenu() {
		wait.until(ExpectedConditions.visibilityOf(MenuObjects.moduleMenu));
		MenuObjects.moduleMenu.click();
	}
	public  static void EmployeeApps_Menu() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.EmployeeApps_Menu));
		MenuObjects.EmployeeApps_Menu.click();
		}
	public static  void TravelsAdmin_SubMenu() throws InterruptedException {
		EmployeeApps_Menu();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.TravelsAdmin_SubMenu));
		MenuObjects.TravelsAdmin_SubMenu.click();	
		Thread.sleep(3000);
	}
	public static  void VGP_SubMenu() throws InterruptedException {
		TravelsAdmin_SubMenu();
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.VGP_SubMenu));
		MenuObjects.VGP_SubMenu.click();
		Thread.sleep(3500);
		List<WebElement> previousDayNotClosedHeader=DriverFactory.driver.findElements(By.xpath("//h1"));
		
		if (previousDayNotClosedHeader.size()>0) {
		
			System.err.println(CommonControlObject.popUp_Text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.OkBtn));
			CommonControlObject.OkBtn.click();
		} else {
System.err.println("Previous Day records are Closed!.");
		}
		
	}
	public static void EIPConnect_SubMenu() throws InterruptedException {
		EmployeeApps_Menu();
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.EIPConnect_SubMenu));
		MenuObjects.EIPConnect_SubMenu.click();		
		Thread.sleep(3000);
	}
	
	//pk
	
	
	public static void VER_SubMenu() throws InterruptedException {
		EIPConnect_SubMenu();
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.VER_SubMenu));
		MenuObjects.VER_SubMenu.click();		
		Thread.sleep(3000);
	}
	
	public static void Visitor_Intro_Page() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.Visitor_Intro_Page));
		MenuObjects.Visitor_Intro_Page.click();		
		Thread.sleep(3000);
	}
	
	public static void Visitor_Entry_Page() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.Visitor_Entry_Page));
		MenuObjects.Visitor_Entry_Page.click();		
		Thread.sleep(3000);
	}
	public static void VisitorBlackList_Page() throws InterruptedException { 	
	
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.VisitorBlackList_Page));
		MenuObjects.VisitorBlackList_Page.click();
		Thread.sleep(3000);
	} 				//pk

	
	public static void VisitorCardReturn_page() throws InterruptedException { 	
		
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.VisitorCardReturn_page));
		MenuObjects.VisitorCardReturn_page.click();		
		Thread.sleep(3000);
	}
	
	public static void PreviousVisitorDetails_page() throws InterruptedException { 	
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.PreviousVisitorDetails_page));
		MenuObjects.PreviousVisitorDetails_page.click();
		Thread.sleep(4000);
	}
	
	public static void VisitorsTagStatus_page() throws InterruptedException { 		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.VisitorsTagStatus_page));
		MenuObjects.VisitorsTagStatus_page.click();
	}
	
	public static void SecurityTerminal_page() throws InterruptedException { 		
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.SecurityTerminal_page));
		MenuObjects.SecurityTerminal_page.click();		
		Thread.sleep(4000);
	}
	

	public static void DayClosing_page() throws InterruptedException { 	
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.DayClosing_page));
		MenuObjects.DayClosing_page.click();		
		Thread.sleep(4000);
	}
	
	

}
