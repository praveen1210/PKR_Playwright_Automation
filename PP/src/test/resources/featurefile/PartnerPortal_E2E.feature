@PPSmoke @pmqa @E2E
Feature: Partner Portal

  Background: 
    Given Go to Test Environment
#No data found so failed
  @Grievance_Request_Draft_creation_TC001
  Scenario: Grievance Request Draft creation
    Then Enter Grievance Req Draft Creation Username
    Then Enter Password
    Then Enter Grievance Req Creation CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Select Grievance Request
    Then Select Category dropdown
    Then Click Category dropdown
    Then Select JobDetails dropdown
    Then Select PONumber dropdown
    Then Enter PO in GR
    Then Select Create GR
    Then Click Reason For Grievance dropdown
    Then Select Reason For Grievance dropdown
    Then Enter Description
    Then Enter NameOfTheAttachment
    Then Click AddAttachment dropdown
    Then Enter ReferenceDocumentnumber
    Then Enter LnTEmployee
    Then select Checkbox dropdown in Grievance Draft Creation
    Then Click Save as Draft
    Then Accept Draft Successful Alert
    
#No data found so failed   
@Grievance_Request_Draft_Submission_TC002
  Scenario: Grievance request draft submission
    Then Enter Grievance Req Draft Creation Username
    Then Enter Password
    Then Enter Grievance Req Creation CAPTCHA
    Then Verify the user able to Login
    Then Select Grievance Request
    Then Click Draft menu
    Then Click View Details
    Then Edit Reason For Grievance dropdown
    Then Edit Description of Grievance
    Then Edit Attachment name
    Then Upload attachment
    Then Update Reference Document number
    Then Update L&T Employee or Site Person Contacted for this issue
    Then Accept declaration checkbox
    Then Click Submit Grievance Request
#No data found so failed
  @Grievance_Request_Creation_TC003
  Scenario: Grievance Request Creation
    Then Enter Grievance Req Creation Username
    Then Enter Password
    Then Enter Grievance Req Creation CAPTCHA
    Then Verify the user able to Login
    Then Select Grievance Request
    Then Select Category dropdown
    Then Click Category dropdown
    Then Select JobDetails dropdown
    Then Select PONumber dropdown
    Then Enter PO in GR
    Then Select Create GR
    Then Click Reason For Grievance dropdown
    Then Select Reason For Grievance dropdown
    Then Enter Description
    Then Enter NameOfTheAttachment
    Then Click AddAttachment dropdown
    Then Enter ReferenceDocumentnumber
    Then Enter LnTEmployee
    Then Click Checkbox dropdown
    Then Click Submit Request
    Then Accept Alert

  @workbench_document_Trace_TC004
  Scenario: Grievance Request approve
    Then Approver Login Page
    Then Enter SearchMenu as Partner Workbench
    Then Verify the Partner Workbench menu available or not
    #Then Verify the document number listed or not
    Then Verify user able to trace the document

  @Grievance_Request_History_TC005
  Scenario: Grievance Request History
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Select Grievance Request
    Then Click History Menu
    Then Click View Details
    Then Download Attachment

  @Testimonial_creation_TC016 
  Scenario: Grievance Testimonial Creation
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click Testimonial Menu
    Then Check tooltip
    Then Select Add Testimonials
    Then Enter Employee Name
    Then Enter Designation
    Then Enter Mobile Number
    Then Enter E-mail
    Then Upload Company Logo
    Then Upload Profile picture
    Then Enter Comments
    Then Click Submit Testimonial
    Then Confirm the Testimonial submission
    
  # @Testimonial_creation_TC007 @test1
     #Scenario: Grievance Testimonial Creation Submit
   
    #Then Enter Employee Name
    #Then Enter Designation
    #Then Enter Mobile Number
    #Then Enter E-mail
    #Then Upload Company Logo
   # Then Upload Profile picture
    #Then Enter Comments
    #Then Click Submit Testimonial
    #Then Confirm the Testimonial submission

  @Testimonial_Creation_Again_TC017  
  Scenario: Create onemore testimonial within a month
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click Testimonial Menu
    Then Check tooltip
    
   @Testimonial_View_TC018
   Scenario: Grievance Testimonial View
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click Testimonial Menu
    Then Verify Whether Testimonial is available or not
    Then View the Testimonial Partner Name
    Then View the Testimonial Partner Designation
    Then View the Testmonail Partner Description
    
   @Add_new_company_TC022
  Scenario: Add New Company
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click Add New Company
    Then Select Add New Company DD
    Then Select Business Category
    #Then Ensure same partner type Alert
    Then Select Primary Business Type
    Then Select Business Vertical DD
    Then Select Region
    Then Select Primary Business
    Then Click Submit to add new company
    
  ## MyProfile END 

  