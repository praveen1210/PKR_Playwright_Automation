@GrievanceApproveSendbackForward @PPSmoke @E2E
Feature: Approve the request
#Grievance Approval
  @Grievance_Request_Approve_006
  Scenario: Grievance Request approve
    Then Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify the document number listed or not
    Then Verify the user able to MarkItResolved 
    Then Verify the user able to give Approver Remarks
    Then Verify the user able to submit the document or not

  @Grievance_Request_Sendback_007
  Scenario: Grievance Request Sendback
    Then Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify the document number listed or not
    Then Verify the user able to Send Back
    Then Verify the user able to give Send Back Remarks
    Then Verify the user able to submit the document or not

  @Grievance_Request_forward_008
  Scenario: Grievance Request Forward
    Then Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify the document number listed or not
    Then Verify the user able to click Forward To Roles dropdown
    Then Verify the user able to Select Roles
    Then Click Forward To Users dropdown
    Then Verify user able to Select Users
    Then Verify the user able to proceed Forward
    Then Verify the user able to give Forward Remarks
    Then Verify the user able to submit the document or not
  #Partner Status Update & Approval  
    @Status_Update_Approval_009 @adminaction
    Scenario: Partner Status Update Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update Stauts from DD
    Then Verify whether user able to select partner status DD
    Then Verify whether user able to select status effective from date
    Then Verify whether user able to enter remarks 
    Then Verify whether user able to add attachment for admin action
    Then Verify whether admin action file is attached or not
    Then Verify Whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Update Status Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch status document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @Status_Update_Reject_010 @adminaction
    Scenario: Partner Status Update Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update Stauts from DD
    Then Verify whether user able to select partner status DD
    Then Verify whether user able to select status effective from date
    Then Verify whether user able to enter remarks 
    Then Verify whether user able to add attachment for admin action
    Then Verify whether admin action file is attached or not
    Then Verify Whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Update Status Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch status document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    #Partner Contact
    @Status_Update_Contact_011 @adminaction
    Scenario: Partner Status Update Contact
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update Contact from DD
    Then Verify whether user able to enter new contact name
    Then Verify whether user able to enter new mobile number 
    Then Verify whether user able to enter new email id 
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to click alert success popup
    Then Verify whether user able to view contact type
    Then Verify whether user able to view contact name
    Then Verify whether user able to view contact mobile number
    Then Verify whether user able to view contact email id
    #Partner Country Update & Approval
    @Status_Update_Country_Approval_012 @adminaction
    Scenario: Partner Status Update Country Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update Country from DD
    Then Verify whether user able to select country from DD
    Then Verify whether user able to add attachment for admin action
    Then Verify whether admin action file is attached or not
    Then Verify whether user able to enter update country remarks 
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Update Country Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @Status_Update_Country_Reject_013 @adminaction
    Scenario: Partner Status Update Country Reject
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update Country from DD
    Then Verify whether user able to select country from DD
    Then Verify whether user able to add attachment for admin action
    Then Verify whether admin action file is attached or not
    Then Verify whether user able to enter update country remarks 
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Update Country Approver Login Page
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    #PAN Update
    @Status_Update_PAN_014 @adminaction
    Scenario: Partner Status Update PAN
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select Update PAN from DD
    Then Verify whether user able to enter new PAN no
    Then Verify whether user able to enter update PAN remarks
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
		#Company Update
    @Status_Update_Companyname_015 @adminaction
    Scenario: Partner Status Update Company Name
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to select update company name from DD
    Then Verify whether user able to enter company name
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to view updated company name
    
    #MSME Approval
    @MSME_Admin_Approval_Trace_010
  	Scenario: Statutory Details Approval Trace
    Then Verify whether user able to enter MSME login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to trace document no
    Then Verify whether user able to click Trace button
    Then Verify whether user able to close document trace popup 
    
    @MSME_Admin_Approval_011
  	Scenario: Statutory Details Level 1 Approval
    Then Verify whether user able to enter MSME login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch MSTAQ document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup 
    
    @MSME_Admin_Approval_012
  	Scenario: Statutory Details Level 2 Approval
    Then Verify whether user able to enter MSME login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch MSTAQ document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    #Payment in favour of Update
    @Status_Update_Paymentinfavourof_015 @adminaction
    Scenario: Partner Status Update Payment in favour of
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Payment in favour of in DD
    Then Verify whether user able to Payment in favour of TB
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to view updated payment in favour name
    
    #Registered office Address Update
    @Status_Update_RegisteredofficeAddress_015 @adminaction
    Scenario: Partner Status Update Payment in favour of
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Registered office address in DD
    Then Verify whether user able to enter address line of TB
    Then Verify whether user able to select state from DD
    Then Verify whether user able to select city from DD
    Then Verify whether user able to enter zipcode from TB
    Then Verify whether user able to click submit button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to view updated registered office address
    
    #Insert IFSC Code
    #@Status_Insert_IFSC_code_015 @adminaction
    #Scenario: Partner Status Update Payment in favour of
    #Then Verify whether user able to enter admin login username
    #Then Verify whether user able to enter admin login password
    #Then Verify whether user able to click login button
    #Then Verify the user able to Login 
    #Then Verify whether user able to click Partner Workbench Menu
    #Then Verify whether user able to click Vendor Master & Forensics
    #Then Verify whether user able to search partner TB by keyword
    #Then Verify whether user able to click View Profile
    #Then Verify whether user able to click Admin action DD
    #Then Verify whether user able to click Insert IFSC in DD
    #Then Verify whether user able to enter IFSC code of TB
    #Then Verify whether user able to select bank from DD
    #Then Verify whether user able to click Insert IFSC button
    #Then Verify whether user able to add bank address in TB
    #Then Verify whether user able to add branch for bank in TB
    #Then Verify whether user able to add city for bank in TB
    #Then Verify whether user able to add district for bank in TB
    #Then Verify whether user able to add state for bank in TB
    #Then Verify whether user able to add swift code for bank in TB
    #Then Verify whether user able to add MICR code for bank in TB
    #Then Verify whether user able to click submit button
    #Then Verify whether user able to click confirmation popup
    #Then Verify whether user able to view approval document reference no
    #Then Verify whether user able to view updated registered office address
    
     #Add Bank
    @Status_Add_Bank_Reject_015 @adminaction
    Scenario: Add Bank Details & Reject in Admin action Reject
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Add Bank in DD
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank name details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to add the Bank details in User my profile
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
     #Add Bank
    @Status_Add_Bank_Approval_015 @adminaction
    Scenario: Add Bank Details & Approve in Admin action Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Add Bank in DD
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank name details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to add the Bank details in User my profile
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @Status_Add_Bank_Sendback_015 @adminaction
    Scenario: Add Bank Details & Sendback in Admin action Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Add Branch in DD
    Then Add the Account Category in Add bank details popup
    Then Add the Account Type in Add bank details popup
    Then Add the Payment mode in Add bank details popup
    Then Update the Payment in favour of in Edit bank details Popup
    Then Update the Bank name details in Edit bank details Popup
    Then Update the IFSC Code in Edit bank details Popup
    Then Update the Account Number in Edit bank details Popup
    Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    Then Update the Attachment in Edit bank details Popup
    Then Submit to add the Bank details in User my profile
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to view approval document reference no
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Bank login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Bank document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click sendback button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    #Add Branch
    @Status_Add_Branch_Approval_015 @adminaction
    Scenario: Add Branch Details & reject in Admin action Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to click Admin action DD
    Then Verify whether user able to click Add Branch in DD
    Then Select Partner Type
    Then Enter Branch Name
    Then Enter Branch Street
    Then Select Country
    Then Select State
    Then Enter City
    Then Enter Zipcode
    Then Enter Coordination Name
    Then Enter Branch Designation
    Then Enter Branch Mobile Number
    Then Enter Branch Email
    Then Click Branch Submit Button
    Then Click Confirmation Button
    Then Verify whether user able to accept the remarks alert popup
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter Branch login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to fetch Branch document reference no
    Then Verify whether user able to click view button
    Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    
    @Workbench_ViewProfile @adminaction
    Scenario: Partner Status Update Approval
    Then Verify whether user able to enter admin login username
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click login button
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Workbench Menu
    Then Verify whether user able to click Vendor Master & Forensics
    Then Verify whether user able to search partner TB by keyword
    Then Verify whether user able to click View Profile
    Then Verify whether user able to view vendor profile
    
   
    
   
    

    
    
    
    
    
