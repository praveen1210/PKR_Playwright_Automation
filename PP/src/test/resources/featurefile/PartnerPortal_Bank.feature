@PPBank @E2E
Feature: Partner Portal Bank Details(Add,Edit,Delete,Approval)

Background: 
    Given Go to Test Environment

  @PPBank_TC001 
  Scenario: Update Bank Details Approve
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Edit icon to update the user bank details
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to update the details in User my profile
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    
    @PPBank_TC002 
  Scenario: Update Bank Details Reject
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Edit icon to update the user bank details
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to update the details in User my profile
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @PPBank_TC003 
  Scenario: Update Bank Details Sendback
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Edit icon to update the user bank details
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to update the details in User my profile
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click sendback button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @PPBank_TC004 
  	Scenario: Close Bank Details Popup
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Add icon to add the user bank details
    Then Close the add the details popup in User my profile
    
     @PPBank_TC005
  Scenario: Update Bank Details
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Edit icon to update the user bank details
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to update the details in User my profile

    @PPBank_TC006 
  	Scenario: View Bank Details
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Check whether bank details is added in draft or not.
        
    @PPBank_TC006 
  	Scenario: Delete Bank Details Dismiss
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Delete Details from the list
    Then Click the delete confirmation dismiss popup
    
    @PPBank_TC007
    Scenario: Delete Bank Details Accept
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Click Bank details tab in Financial section
    Then Click Delete Details from the list
    Then Click the delete confirmation accept popup
    Then Click the delete success popup