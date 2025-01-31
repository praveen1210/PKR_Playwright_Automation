@PPSmoke_Bkup
Feature: Partner Portal

  #Background: 
    #Given Go to Test Environment
#
  #@Grievance_Request_Creation_TC001
  #Scenario: Grievance Request Creation
    #Then Enter Username
    #Then Enter Password
    #Then Enter Grievance Req Creation CAPTCHA
    #Then Verify the user able to Login
    #Then Select Grievance Request
    #Then Select Category dropdown
    #Then Click Category dropdown
    #Then Select JobDetails dropdown
    #Then Select PONumber dropdown
    #Then Enter PO in GR
    #Then Select Create GR
    #Then Click Reason For Grievance dropdown
    #Then Select Reason For Grievance dropdown
    #Then Enter Description
    #Then Enter NameOfTheAttachment
    #Then Click AddAttachment dropdown
    #Then Enter ReferenceDocumentnumber
    #Then Enter LnTEmployee
    #Then Click Checkbox dropdown
    #Then Click Submit Request
    #Then Accept Alert
#
  #@Grievance_Request_Draft_creation_TC002
  #Scenario: Grievance Request Draft creation
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Select Grievance Request
    #Then Select Category dropdown
    #Then Click Category dropdown
    #Then Select JobDetails dropdown
    #Then Select PONumber dropdown
    #Then Enter PO in GR
    #Then Select Create GR
    #Then Click Reason For Grievance dropdown
    #Then Select Reason For Grievance dropdown
    #Then Enter Description
    #Then Enter NameOfTheAttachment
    #Then Click AddAttachment dropdown
    #Then Enter ReferenceDocumentnumber
    #Then Enter LnTEmployee
    #Then select Checkbox dropdown in Grievance Draft Creation
    #Then Click Save as Draft
    #Then Accept Draft Successful Alert
#
  #@Grievance_Request_Draft_Submission_TC003
  #Scenario: Grievance request draft submission
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Select Grievance Request
    #Then Click Draft menu
    #Then Click View Details
    #Then Edit Reason For Grievance dropdown
    #Then Edit Description of Grievance
    #Then Edit Attachment name
    #Then Upload attachment
    #Then Update Reference Document number
    #Then Update L&T Employee or Site Person Contacted for this issue
    #Then Accept declaration checkbox
    #Then Click Submit Grievance Request
    #
  #@Grievance_Request_History_TC004
  #Scenario: Grievance Request History
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Select Grievance Request
    #Then Click History Menu
    #Then Click View Details
    #Then Download Attachment
    #Then Click Back Button -- decrease count in PP
#
  #@Testimonial_creation_TC005
  #Scenario: Grievance Testimonial Creation
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click Testimonial Menu
    #Then Click Add Testimonials Button
    #Then Enter Employee Name
    #Then Enter Designation
    #Then Enter Mobile Number
    #Then Enter E-mail
    #Then Upload Company Logo
    #Then Upload Profile picture
    #Then Enter Comments
    #Then Click Submit Testimonial
    #Then Confirm the Testimonial submission
#
  #@Testimonial_Creation_Again_TC006
  #Scenario: Create onemore testimonial within a month
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click Testimonial Menu
    #Then Click Add Testimonials Button
    #Then Check tooltip
#
  #@Add_new_business_category_TC007
  #Scenario: Add business category
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click My Profile
    #Then Add New Business Category
    #Then Select Partner Type in Dropdown
    #Then Select Category in Add Business Category Popup
    #Then Select Sub-Category
    #Then Click Submit
#
  #@Update_business_category_TC008
  #Scenario: Update business category
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click My Profile
    #Then Click edit icon in Business Categories List
    #Then Select Partner Type in Dropdown
    #Then Select Category in Add Business Category Popup
    #Then Select Sub-Category
    #Then Click Update button
    #Then Click Ok
#
  #@Add_new_address_inmyprofile_TC009
  #Scenario: Add Address in Myprofile
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click My Profile
    #Then Click Address Details tab
    #Then Click Edit approved address details button
    #Then Enter Address Line in Communication Address
    #Then Select Country in Communication Address
    #Then Select State in Communication Address
    #Then Select City in Communication Address
    #Then Give Zip Code in Communication Address
    #Then Select SEZ in Communication Address
    #Then Attach document in Communication Address
    #Then Click Update in Communication Address
    #Then Click Ok
#
  #@Update_new_address_formyprofile_TC010
  #Scenario: Update Address in Myprofile
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click My Profile
    #Then Click Address Details tab
    #Then Click Edit approved address details button
    #Then Enter Address Line in Communication Address
    #Then Select Country in Communication Address
    #Then Select State in Communication Address
    #Then Select City in Communication Address
    #Then Give Zip Code in Communication Address
    #Then Select SEZ in Communication Address
    #Then Attach document in Communication Address
    #Then Click Update in Communication Address
    #Then Click Ok
 #
 #	@Update_bank_details
 #	Scenario: Update Bank Details
 #	  Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click User My profile menu
    #Then Select Financial tab in my profile
    #Then Click Bank details tab in Financial section
    #Then Click Edit icon to update the user bank details
    #Then Update the Payment in favour of in Edit bank details Popup
    #Then Update the Bank details in Edit bank details Popup
    #Then Update the IFSC Code in Edit bank details Popup
    #Then Update the Account Number in Edit bank details Popup
    #Then Update the Payment Confirmation Mail Id in Edit bank details Popup
    #Then Update the Attachment in Edit bank details Popup
    #Then Submit to update the Bank details in User my profile
    #
 #
    #
  #@Add_new_company_TC007
  #Scenario: Add New Company
    #Then Enter Username
    #Then Enter Password
    #Then Enter CAPTCHA
    #Then Verify the user able to Login
    #Then Click Add New Company
    #Then Select Add New Company DD
    #Then Select Business Category
    #Then Ensure same partner type Alert
    #Then Select Primary Business Type
    #Then Select Business Vertical DD
    #Then Select Region
    #Then Select Primary Business
    #Then Click Submit to add new Wcompany
  ## MyProfile END
  #
  #
  
  @Captcha_Check_GST @Captcha
  Scenario: Update Bank Details
 	  Then Enter GSTUpdate Username
    Then Enter Password
    Then Enter CAPTCHA GST
  
  
   @Captcha_Check_US_UserName @Captcha
  Scenario: Update Bank Details
 	  Then Enter Username PP2
    Then Enter Password
    Then Enter CAPTCHA US UserName
    
    
     @Captcha_Check_Standard @Captcha
  Scenario: Update Bank Details
 	  Then Enter Username PP2
    Then Enter Password
    Then Enter CAPTCHA Standard
    
    @Captcha_Check_DB_Login @Captcha
  Scenario: Partner Onboarding Login
    Then Enter partner onboarding username
    Then Enter partner onboarding password
    Then Enter CAPTCHA for DB User
    Then Verify the user able to Login
