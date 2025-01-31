@PPBusinessCategory @E2E
Feature: Partner Portal Business Category (Add,Edit,Approval)

  Background: 
    Given Go to Test Environment

 @PPBusinessCategory_001
  Scenario: Add business category & Approve
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click My Profile
    Then Add New Business Category
    Then Select Partner Type in Dropdown
    Then Select Category in Add Business Category Popup
    Then Select Sub-Category
    Then Click Submit
    #Then Click Submit button
    #Then Click confirmation popup
    #Then Click Ok
    Then Verify whether user able to enter Add Business Category login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch Add Business Category document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup 
    
    @PPBusinessCategory_002
  Scenario: Add business category & Reject
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click My Profile
    Then Add New Business Category
    Then Select Partner Type in Dropdown
    Then Select Category in Add Business Category Popup
    Then Select Sub-Category
    Then Click Submit
    #Then Click Submit button
    #Then Click confirmation popup
    #Then Click Ok
    Then Verify whether user able to enter Add Business Category login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch Add Business Category document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup 
    
    
    @PPBusinessCategory_003
  Scenario: Add business category Save
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click My Profile
    Then Add New Business Category
    Then Select Partner Type in Dropdown
    Then Select Category in Add Business Category Popup
    Then Select Sub-Category
    Then Click Save
    
    @PPBusinessCategory_004
  Scenario: Add business category Clear and Close
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click My Profile
    Then Add New Business Category
    Then Select Partner Type in Dropdown
    Then Select Category in Add Business Category Popup
    Then Select Sub-Category
    Then Click Clear
    Then Close the Add new business category popup
    
    @PPBusinessCategory_005
  	Scenario: View Business Category
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
   	Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Verify whether user able to view business category details
