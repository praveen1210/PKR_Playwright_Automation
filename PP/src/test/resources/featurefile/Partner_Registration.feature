@PPSmoke @PPRegistration @E2E
Feature: Partner Portal(Registration)

Background: 
    Given Goto PMQA Home Environment

  @PartnerRegistration_TC001
  Scenario: Partner Registration
		Then Verify the pmqa page title
		Then click Register Button
		Then Verify the Partnet registration page title and header
		Then Enter the Country
		Then Enter the Nationality
		Then Enter the Organization Name
		Then Enter the PAN
		Then Verify the valid PAN only allowed or not
		Then Enter the Contact Details Menu
		Then Enter the Coordination person name
		Then Enter the Designation
		Then Enter the website(optional)
		Then Enter the Mobile number
		Then Enter the Email
		Then Verify the Send OTP to email button enabled after enter the email 
		Then Verify the OTP send to email or not
		Then Click Business Profile
		Then Select PartnerFor
		Then Select Registration Primary Business
		Then Select Registration Business Type
		Then Click Registration Primary Business Category
		Then Select Primary Business Category list
		Then Click Registration Primary Business Sub Category
		Then Select Primary Business sub Category list
		Then Click Key Category
		Then Select Key Category List
		Then Select Secondary Business
		Then Select Secondary Business Type
		Then Select Secondary Business Type List
		Then Click  Registration Secondary Category
		Then Select Registration Secondary Category List
		Then Select Registration Secondary Sub Category
		Then Select Registration Secondary Sub Category List
		Then Click Credentials
		Then Enter Register Username
		Then Enter Register Password
		Then Register Reenter Password
		Then Select Terms and Conditions
		Then Click Register
		Then Enter the Mobile OTP
		Then Cick Verify
		
		@PartnerRegistration_TC002
  Scenario: Partner Registration Reset
		Then Verify the pmqa page title
		Then click Register Button
		Then Verify the Partnet registration page title and header
		Then Enter the Country
		Then Enter the Nationality
		Then Enter the Organization Name
		Then Enter the PAN
		Then Verify the valid PAN only allowed or not
		Then Enter the Contact Details Menu
		Then Enter the Coordination person name
		Then Enter the Designation
		Then Enter the website(optional)
		Then Enter the Mobile number
		Then Enter the Email
		Then Verify the Send OTP to email button enabled after enter the email 
		Then Verify the OTP send to email or not
		Then Click Business Profile
		Then Select PartnerFor
		Then Select Registration Primary Business
		Then Select Registration Business Type
		Then Click Registration Primary Business Category
		Then Select Primary Business Category list
		Then Click Registration Primary Business Sub Category
		Then Select Primary Business sub Category list
		Then Click Key Category
		Then Select Key Category List
		Then Select Secondary Business
		Then Select Secondary Business Type
		Then Select Secondary Business Type List
		Then Click  Registration Secondary Category
		Then Select Registration Secondary Category List
		Then Select Registration Secondary Sub Category
		Then Select Registration Secondary Sub Category List
		Then Click Credentials
		Then Enter Register Username
		Then Enter Register Password
		Then Register Reenter Password
		Then Select Terms and Conditions
		Then Click Reset Button
		
		@PartnerRegistration_TC003
  Scenario: Partner Registration Validation
		Then Verify the pmqa page title
		Then click Register Button
		Then Verify the Partnet registration page title and header
		Then Enter the Country
		Then Enter the Nationality
		Then Enter the Organization Name
		Then Enter the invalid PAN
		Then Verify the invalid PAN allowed or not
		Then Verify the valid PAN only allowed or not
		Then Enter the Contact Details Menu
		Then Enter the Coordination person name
		Then Enter the Designation
		Then Enter the invalid website
		Then Verify whether invalid website allowed or not
		Then Enter the invalid mobile number
		Then Verify whether invalid mobile number allowed or not
		Then Enter the special character in mobile number
		Then Enter the Mobile number
		Then Enter the invalid email id
		Then Verify whether invalid email id allowed or not
		Then Click Send OTP to email by entering the invalid email id
		Then Enter the invalid email OTP
		Then Verify the invalid OTP allowed or not
		Then Click Business Profile
		Then Select PartnerFor
		Then Select Registration Primary Business
		Then Select Registration Business Type
		Then Click Registration Primary Business Category
		Then Select Primary Business Category list
		Then Click Registration Primary Business Sub Category
		Then Select Primary Business sub Category list
		Then Click Key Category
		Then Select Key Category List
		Then Select Secondary Business
		Then Select Secondary Business Type
		Then Select Secondary Business Type List
		Then Click  Registration Secondary Category
		Then Select Registration Secondary Category List
		Then Select Registration Secondary Sub Category
		Then Select Registration Secondary Sub Category List
		Then Click Credentials
		Then Enter the invalid user name
		Then Verify whether invalid user name allowed or not
		Then Enter week register password
		Then Verify whether week password allowed or not
		Then Register Reenter Password
		Then Select Terms and Conditions
		Then Click Reset Button