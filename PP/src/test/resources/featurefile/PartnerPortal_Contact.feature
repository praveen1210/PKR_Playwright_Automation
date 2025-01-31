@PPContact @PPSmoke @E2E
Feature: Partner Portal Contact Details(Add,Edit,Delete)

Background: 
    Given Go to Test Environment

@AddContact_001
    Scenario: Partner Contact Addition
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Click Add Contact Button
    Then Enter Contact Name
    Then Enter Contact Designation
    Then Select Contact Department
    Then Enter Contact Mobile Number
    Then Enter Contact Email
    Then Select Contact Category
    Then Click Save Contact Button
    
    @CloseContactPopup_001
    Scenario: Partner Contact Close Popup
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Click Add Contact Button
    Then Verify whether user able to click close button
    
    @UpdateContact_003 
    Scenario: Partner Contact Update
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Verify Whether Contact Details added or not
    Then Click Edit Contact Button
    Then Enter Contact Name
    Then Enter Contact Designation
    Then Select Contact Department
    Then Enter Contact Mobile Number
    Then Enter Contact Email
    Then Select Contact Category
    Then Click Update Contact Button
    
    @ViewContact_004 
    Scenario: Partner Contact View
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Verify whether user able to view contact details

		@DeleteContact_005
		
		Scenario: Partner Contact Deletion
   	Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Verify Whether Contact Details is available or not
    Then Verify Whether Delete Button is available or not
    Then Click Delete Button
    Then Accept the delete confirmation popup
    Then Accept the deleted successfully popup
    
    @ApproveContact_004 
    Scenario: Partner Contact Approval Submit
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Contact Details & Certificate
    Then Verify Whether Contact Details added or not
    Then Verify whether user able to click Submit for Technical approval button
    Then Verify whether user able to enter remarks in financial approval alert
    Then Verify whether user able to accept the remarks alert popup
    Then Click Ok
    

