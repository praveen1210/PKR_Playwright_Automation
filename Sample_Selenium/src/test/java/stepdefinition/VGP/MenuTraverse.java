package stepdefinition.VGP;

import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import repository.Actions.MenuTraverseActions;
 
  
public class MenuTraverse {
	
//	MenuTraverseActions menuAction=new MenuTraverseActions(); 
	
	@Then("^user should able to click main menu$")  
	public static void user_should_able_to_click_main_menu() throws Throwable {
		MenuTraverseActions.mainMenu();	  
	}  
	@Then("^user should able to enter main menu$")
	public static void user_should_able_to_enter_main_menu() throws Throwable {
		MenuTraverseActions.clickMainMenu();	       
	}
	@Then("^user should able to navigate to EmployeeApps Menu$")
	public static void user_should_able_to_navigate_to_EmployeeApps_Menu() throws Throwable {
		MenuTraverseActions.EmployeeApps_Menu();	       
	}   
	@Then("^user should able to navigate to Travels Admin SubMenu$")
	public static void user_should_able_to_navigate_to_Travels_Admin_SubMenu() throws Throwable {
		MenuTraverseActions.TravelsAdmin_SubMenu();	      
	} 
	@Then("^user should able to navigate to Visitor Gate Pass Menu$")
	public void user_should_able_to_navigate_to_Visitor_Gate_Pass_Menu() throws Throwable {
		MenuTraverseActions.VGP_SubMenu();	   
		
	}  

	// ***************
	
	@Then("^user should able to navigate to EIPConnect SubMenu$")
	public void user_should_able_to_navigate_to_EIPConnect_SubMenu() throws Throwable {
		MenuTraverseActions.EIPConnect_SubMenu();	      
	}
	
	@Then("^user should able to navigate to Visitor Entry Request Submenu$")
	public void user_should_able_to_navigate_to_Visitor_Entry_Request_Submenu() throws Throwable {
		MenuTraverseActions.VER_SubMenu();	      
	}
	
	@Then("^user should able to enter the Visitor Intro Page$")
	public static void user_should_able_to_enter_the_Visitor_Intro_Page() throws Throwable {
		MenuTraverseActions.Visitor_Intro_Page();	      
	}
	
	@Then("^user should able to enter the Visitor Entry Page$")
	public void user_should_able_to_enter_the_Visitor_Entry_Page() throws Throwable {
		MenuTraverseActions.Visitor_Entry_Page();	      
	}
	
	@Then("^user should able to enter the Visitor Black List Page$")
	public void user_should_able_to_enter_the_Visitor_Black_List_Page() throws Throwable {
		MenuTraverseActions.VisitorBlackList_Page();	      
	}
	
	//**************
	
	@Then("^user should able to enter the Visitor Card Return Page$")
	public void user_should_able_to_enter_the_Visitor_Card_Return_Page() throws Throwable {
		MenuTraverseActions.VisitorCardReturn_page();	      
	}
	
	@Then("^user should able to enter the Previous Visitor Details Page$")
	public void user_should_able_to_enter_the_Previous_Visitor_Details_Page() throws Throwable {
		Thread.sleep(1500);
		MenuTraverseActions.PreviousVisitorDetails_page();	      
		Thread.sleep(4500);
	}
	
	@Then("^user should able to enter the Visitors Tag Status Page$")
	public void user_should_able_to_enter_the_Visitors_Tag_Status_Page() throws Throwable {
		MenuTraverseActions.VisitorsTagStatus_page();	      
	}
	
	@Then("^user should able to enter the Security Terminal Page$")
	public void user_should_able_to_enter_the_Security_Terminal_Page() throws Throwable {
		MenuTraverseActions.SecurityTerminal_page();	      
	}
	
	@Then("^user should able to enter the Day Closing Page$")
	public void user_should_able_to_enter_the_Day_Closing_Page() throws Throwable {
		MenuTraverseActions.DayClosing_page();	      
	}
	
}