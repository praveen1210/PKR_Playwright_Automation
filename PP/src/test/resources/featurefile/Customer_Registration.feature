@Customer_Registration @E2E
Feature: Customer Registration

  @AddCustomer
  Scenario: Create a New Customer
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to navigate to Customer Registration
    Then Verify whether user able to click add customer
    Then Verify whether user able to select country
    Then Verify whether user able to add PAN number
    Then Verify whether user able to select company
    Then Verify whether user able to add customer name
    Then Verify whether user able to select sector
    Then Verify whether user able to select nature
    Then Verify whether user able to select customer group
    Then Verify whether user able to add contact name
    Then Verify whether user able to add email in customer registration
    Then Verify whether user able to add mobile number in customer registration
    Then Verify whether user able to click customer register
    Then Verify whether user able to get last registered customer
    Then Verify whether user able to enter customer address
    Then Verify whether user able to select customer state
    Then Verify whether user able to select customer city
    Then Verify whether user able to enter customer zipcode
    #Then Verify whether user able to enter VAN Registration Number
    Then Verify whether user able to attach file for VAN Registration Number
    Then Verify whether user able to enter TAN Number for customer Registration
    Then Verify whether user able to attach file for TAN Number
    Then Verify whether user able to enter last financial year turn over
    Then Verify whether user able to attach file for balance sheet documents
    Then Verify whether user able to enter last financial year ITR filing ack number
    Then Verify whether user able to attach file for last financial year ITR filing ack number
    Then Verify whether user able to enter CRISIL rating
    Then Verify whether user able to attach file for relevant documents
    Then Verify whether user able to click add bank
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank details in Edit bank details Popup
    #Then Update the Swift Code in Edit bank details Popup
    #Then Update the IBAN Code in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Customer Attachment in Edit bank details Popup
    Then Submit to add the Bank details in User my profile
    Then Verify whether user able to handle the success alert
    Then Verify whether user able to click add branch
    Then Enter Branch Name
    Then Enter Branch Street
    Then Select State
    Then Enter City
    Then Enter Zipcode
    Then Enter Coordination Name
    Then Enter Branch Designation
    Then Enter Branch Mobile Number
    Then Enter Branch Email
    Then Click Branch Submit Button
    Then Click Confirmation Button
    Then Accept the Branch Saved Successful popup
    Then Verify whether user able to save customer registration as Draft
    
    @SubmitForApproval
  	Scenario: Submit Draft Customer for approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to navigate to Customer Registration
    Then Verify whether user able to get last registered customer
    Then Verify whether user able to submit draft customer for approval
    
    @ApproveCustomer
  	Scenario: Submit Draft Customer for approval
    Then Verify whether user able to enter customer login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu

