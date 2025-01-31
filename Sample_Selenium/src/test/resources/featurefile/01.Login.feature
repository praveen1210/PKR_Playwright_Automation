@RegressionTesting @VGP_Regression @VGPMenus
Feature: Login
  As a user i should be able to login EIP Portal
  

  @Login
  Scenario: Login 
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button  
    And enter username and password
    And click Log in button
    #And user should be able to login successfully with valid credentials
    Then As a user i should able to Signout the EIP4 application