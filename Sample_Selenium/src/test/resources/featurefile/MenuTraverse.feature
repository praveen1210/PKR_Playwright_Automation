@SmokeMenu @VGPMenus @VGP_Regression
Feature: Menu traverse
  
  As a user after login i should able to traverse to VGP menu's.

  @VGP
  Scenario: Masters menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    #And user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then As a user i should able to Signout the EIP4 application
 
  @Visitor_Intro_Page_Menu @Visitor_Intro
  Scenario: Visitor Intro Page menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Visitor Intro Page
  	Then As a user i should able to Signout the EIP4 application
  
  @Visitor_Entry_Page_Menu @Visitor_Entry @VI_VE_Document
  Scenario: Visitor Intro Page menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Visitor Entry Page
  Then As a user i should able to Signout the EIP4 application
  
   
  @Visitor_Black_List_Menu @VGP_VBL
  Scenario: Visitor Black List menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Visitor Black List Page
    Then As a user i should able to Signout the EIP4 application
    
    @Visitor_Card_Return_Menu
  Scenario: Visitor Card Return menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Visitor Card Return Page
    Then As a user i should able to Signout the EIP4 application
    
    @Previous_Visitor_Details_Menu
  Scenario: Previous Visitor Details menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Previous Visitor Details Page
    Then As a user i should able to Signout the EIP4 application
    
    @Visitors_Tag_Status_Menu
  Scenario: Visitors Tag Status menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Visitors Tag Status Page
    Then As a user i should able to Signout the EIP4 application
    
     @Security_Terminal_Page_Menu
  Scenario: Visitors Tag Status menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Security Terminal Page
    Then As a user i should able to Signout the EIP4 application
    
    @Day_Closing_Menu
  Scenario: Visitors Tag Status menu traverse
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to EmployeeApps Menu
    Then user should able to navigate to Travels Admin SubMenu
    Then user should able to navigate to Visitor Gate Pass Menu
    Then user should able to enter the Day Closing Page
    Then As a user i should able to Signout the EIP4 application
