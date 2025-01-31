@PPAddress @E2E
Feature: Partner Portal Address Details(Add,Edit,Delete)
Background: 
    Given Go to Test Environment
    
@PPAddress_TC001
  Scenario: Add Address in Myprofile & Approve
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Click Edit approved address details button
    Then Enter Address Line in Communication Address
    Then Select Country in Communication Address
    Then Select State in Communication Address
    Then Select City in Communication Address
    Then Give Zip Code in Communication Address
    Then Select SEZ in Communication Address
    Then Attach document in Communication Address
    Then Click Update in Communication Address
    Then Verify whether user able to click Submit for Technical approval button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to enter Address login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Address document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
       
@PPAddress_TC002
  Scenario: Add Address in Myprofile & Reject
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Click Edit approved address details button
    Then Enter Address Line in Communication Address
    Then Select Country in Communication Address
    Then Select State in Communication Address
    Then Select City in Communication Address
    Then Give Zip Code in Communication Address
    Then Select SEZ in Communication Address
    Then Attach document in Communication Address
    Then Click Update in Communication Address
    Then Click Ok
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to enter Address login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Address document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    
 @PPAddress_TC003
  Scenario: Add Address in Myprofile & Sendback
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Click Edit approved address details button
    Then Enter Address Line in Communication Address
    Then Select Country in Communication Address
    Then Select State in Communication Address
    Then Select City in Communication Address
    Then Give Zip Code in Communication Address
    Then Select SEZ in Communication Address
    Then Attach document in Communication Address
    Then Click Update in Communication Address
    Then Click Ok
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to enter Address login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Address document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click sendback button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup

  @PPAddress_TC004
  Scenario: Update Address in Myprofile
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Click Edit approved address details button
    Then Enter Address Line in Communication Address
    Then Select Country in Communication Address
    Then Select State in Communication Address
    Then Select City in Communication Address
    Then Give Zip Code in Communication Address
    Then Select SEZ in Communication Address
    Then Attach document in Communication Address
    Then Click Update in Communication Address
    
    @PPAddress_TC005
  Scenario: Close Address Popup in Myprofile
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Click Edit approved address details button
    Then Close the Add new business category popup
    
    @PPAddress_TC006
  Scenario: View new Address in Myprofile
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click My Profile
    Then Click Address Details tab
    Then Verify whether user able to view new address from myprofile
    
    @PPAddress_TC007 
  	Scenario: Delete Address Details Success
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click User My profile menu
    Then Click Address Details tab
    Then Click Delete Details from the list
    Then Click the delete Address confirmation dismiss popup
   # Then Click the delete bank success popup
    
    @PPAddress_TC008
    Scenario: Delete Address Details Accept
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click User My profile menu
    Then Click Address Details tab
    Then Click Delete Details from the list
    Then Click the delete Address confirmation accept popup
    Then Click the delete Address success popup
