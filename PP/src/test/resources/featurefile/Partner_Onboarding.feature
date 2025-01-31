@PPSmoke @PPOnboarding @E2E
Feature: Partner Portal (PartnerOnboarding)

  Background: 
    Given Go to Test Environment
    
  #@DB_Login_PP
  #Scenario: Partner Onboarding Login
    #Then Enter partner onboarding username
    #Then Enter partner onboarding password
    #Then Enter CAPTCHA for DB User
    #Then Verify the user able to Login

  @PartnerOnboarding_TC001
  Scenario: Partner Onboarding
    Then Enter partner onboarding username
    Then Enter partner onboarding password
    Then Enter CAPTCHA for DB User
    Then Accept the partner portal popup
    Then Accept the Whistle blower policy popup
    Then Verify the user able to Login
    Then Accept partner Portal terms and condition
    Then Verify the page title
    Then Verify the Partner number is avalable or not
    Then User able to click complete profile to onboard partner
    Then Verify the user able to select Organization details
    Then Verify the user able to add Street address in Organization details
    Then Verify user able to select state in Organization details
    Then Verify user able to select City in Organization details
    Then Verify user able to enter ZipCode in Organization details
    Then Check user able to select Same as Registered Office Address in Organization details
    Then Verify user able to select Incorporated as in Statutory details
    Then Check the user able to add the Year of Incorporation date
    Then Check the user able to add Place of Incorporation
    Then Check the user able to add CIN Number
    Then Verify the user able to select GST Number
    Then Attach the file in GST Number section
    Then Verify the file is attached or not for GST number
    Then Select MSME number
    Then Verify user able to add MSME Number
    Then Verify user able to add MSME Effective from
    Then Verify user able to add MSME Type
    Then Verify user able to add MSME Classification Year
    Then Add Last Year turnover in INR
    Then Select E-invoice Applicability
    Then Select Can TCS be charged for the goods/ services supplied
    Then Select TAN Number
    Then Attach file for TAN number
    Then Verify the file is attached or not for TAN number
    Then Select Aadhaar Number
    Then Attach file for Aadhaar number
    #Then Verify the file is attached or not for Aadhaar number
    Then Select PF Registration ID
    Then Enter Employee Count for PF Registration ID
    Then Select ESI Registration ID
    Then Enter Employee Count for ESI Registration ID
    Then Click Contact details section
    Then Add Primary contact name
    Then Add Designation in Primary contact
    Then Select Department in Primary contact
    Then Add mobile number in Primary contact
    Then Add email address in Primary contact
    Then Select Contact category in Primary contact
    Then Add one more Contact in Contact details section
    Then Add Secondary contact name
    Then Add Designation in Secondary contact
    Then Select Department in Secondary contact
    Then Add mobile number in Secondary contact
    Then Add email address in Secondary contact
    Then Select Contact category in Secondary contact
    Then Click Save and continue in Organizational details
    Then Accept the General Organisation Successful popup
    Then Click Warehouse Details section
    Then Click Warehouse Details tab to entry the data
    Then Add Warehouse name in Warehouse
    Then Add Stock Value in Lakhs
    Then Add Total area in sq ft
    Then Add Street Address in Warehouse
    Then Select Country in Warehouse
    Then Select State in Warehouse
    Then Select City in Warehouse
    Then Add Zipcode
    Then Click Bank Details Section
    Then Select Account Category
    Then Select Payment Mode
    Then Add Payment in favour of
    Then Select Account Type
    Then Add Bank Name
    Then Add IFSC Code
    Then Add Account Number
    Then Add Payment Confirmation Mail Id
    Then Click Save and continue in Organizational details
    Then Accept the General Organisation Successful popup
    Then Click Credentials Section
    Then Add Customer Name
    Then Add Years in Partnership
    Then Approx Revenue INR Lakhs
    Then Reference(Remarks)
    Then Click Save and continue in Organizational details
    Then Accept the General Organisation Successful popup
    Then Click PartnerShip Avenues Section
    Then Select Business Type in BV
    Then Select Business Verticals
    Then Select Regions
    Then Select Region Section
    Then Select Primary Business in BV
    #Then Select business with
    Then Select SecondQuestion Section
   	Then Select Partner with any other division of l&T
   	Then Add PA OD Details
   	Then Add PA Partner Code
   	Then Add PA Reason for not active
    Then Select Third Question Section
    Then Select L&T Employee related with
    Then Add Third_Contact_Name
    Then Add Third_Contact_Designation
    Then Add Third_Contact_Email
    Then Add Third_Contact_MobileNo
    Then Select Fourth Question Section
    Then Select How do you know partner portal
    Then Add Reference Person Name
    Then Add Reference Person Company Name
    Then Add Reference Person Designation
    Then Add Reference Person Email
    Then Add Reference Person Mobile No
    Then Fifth Question Section
    Then Select Related Party
    Then Add Party Name
    Then Add Party Designation
    Then Add Party Email
    Then Add Party Mobile No
    Then Click Pan Applicable Radio
    Then Select Sixth Question
    Then Select Engage with L&T Construction
    Then Select Associate RelationShip
    Then Add Employee Relation
    Then Add Associate Employee Name
    Then Add Associate Employee PSNo
    Then Click Associate Acknowledgement CheckBox
    Then Click Save and continue in Organizational details
    Then Accept the General Organisation Successful popup
    Then Click Branch Section
    Then Select Branch Details Yes Icon
    Then Add Branch Name
    Then Add Branch Street Address
    Then Select Branch State
    Then Select Branch City
    Then Add Branch Zipcode
    Then Add Branch Coordination Name
    Then Add Branch Designation
    Then Add Branch Mobile No
    Then Add Branch Email
    Then Click Save and continue in Organizational details
    Then Accept the General Organisation Successful popup
    Then Click Financial link
    Then Verify whether user able to add current debt outstanding
    Then Verify whether user able to add debit to asset ratio
    Then Verify whether user able to add current asset to current liabilities
    Then Verify whether able to click working capital required
    Then Verify whether user able to add current assets
    Then Verify whether user able to click financial strength
    Then Verify whether able to click Financial banker or Guarantor button
    Then Verify whetloher able to attach document for financial banker or guarnantor
    Then Verify whether Financial banker or guarantor file is attached or not
    Then Verify whether able to click primary and secondary banker
    #Then Verify whether user able to click remove bank in financial strength tab
    #Then Verify whether user able to add banker in financial tab
    Then Verify whether able to select account category
    Then Verify whether able to add Primary Bank Name
    Then Verify whether able to add Primary IFSC code
    Then Verify whether able to add Primary Year of Association
    Then Verify whether able to add Primary Coordination Person Name
    Then Verify whether able to add Primary Contact Designation
    Then Verify whether able to add Primary Mobile Number
    Then Verify whether able to add Primary Email id
    #Then Verify whether user able to add banker in financial tab
    #Then Verify whether able to click secondary banker
    #Then Verify whether able to select Secondary Account Category
    #Then Verify whether able to add Secondary Bank Name
    #Then Verify whether able to add Secondary IFSC code
    #Then Verify whether able to add Secondary Year of Association
    #Then Verify whether able to add Secondary Coordination Person Name
    #Then Verify whether able to add Secondary Contact Designation
    #Then Verify whether able to add Secondary Mobile Number
    #Then Verify whether able to add Secondary Email id
    #Then Verify whether user able to click others in financial tab
    #Then Verify whether user able to select rating agency
    #Then Verify whether user able to add credit rating
    #Then Verify whether user able to attach file for rating
    #Then Verify whether user able to add second question in other tab
    #Then Verify whether user able to add remarks in other tab
    #Then Click Save and continue in Organizational details
    #Then Accept the General Organisation Successful popup
    Then Verify whether user able to click sustainability tab
    Then Verify whether user able to sustainability first question RB
    Then Verify whether user able to attach file for sustainability first question
    Then Verify whether user able to click sustainability question two RB
    Then Verify whether user able to enter sustainability person name
    Then Verify whether user able to enter sustainability designation
    Then Verify whether user able to enter sustainability mobile number
    Then Verify whether user able to enter sustainability email id
    Then Verify whether user able to click sustainability question three RB
    Then Verify whether user able to enter sustainability third question person name
    Then Verify whether user able to enter sustainability third question designation
    Then Verify whether user able to enter sustainability third question mobile number
    Then Verify whether user able to enter sustainability third question email id
    Then Verify whether user able to click sustainability question four RB
    Then Verify whether user able to attach file for fourth question
    Then Verify whether user able to click sustainability question five RB
    Then Verify whether user able to attach file for fifth question
    Then Verify whether user able to attach file for fifth question 
    Then Verify whether user able to click sustainability question six RB
    Then Verify whether user able to attach file for sixth question
    Then Verify whether user able to attach file for sixth question 
    Then Verify whether user able to click quality tab
    Then Verify whether user able to qualtiy question one
    Then Verify whether user able to accept quality question one
    Then Verify whether user able to add tools or technology
    Then Verify whether user able to attach file for quality 
    Then Verify whether the quality file is attached or not
    Then Click HSE link
    Then Click Policy or Statement icon
    Then Attach Policy or Statement File
    Then Verify whether the Policy or Statement file is attached or not
    Then Verify whether user able to click HSE question two
    Then Verify whether user able to accept HSE question two RB
    Then Verify whether user able to attach file for HSE question two
    Then Verify whether the HSE question two file is attached or not
    Then Click Save and continue in Organizational details
    #Then Accept the General Organisation Successful popup
    Then Click Attachments Link
    Then Attach file for PAN Number
    Then Verify Whether PAN Number file is attached or not
    Then Click GST Registration Icon
    Then Attach file for GST Registration
    Then Verify Whether GST Registration is attached or not
    Then Click MSME Certification Icon
    Then Attach file for MSME Certification
    Then Verify whether MSME Certification file is attached or not
    Then Click Shop Establishment Certificate
    Then Attach file for Shop Establishment Certificate
    Then Verify Whether Shop Establishment Certificate is attached or not
    Then Click Cancelled Cheque Icon
    Then Attach file for Cancelled Cheque
    Then Verify Whether Cancelled Cheque file is attached or not
    Then Click Certificate by Chartered Accountant
    Then Attach file for Certificate by Chartered Accountant
    Then Verify Whether Certificate by Chartered Accountant file is attached or not
    Then Click Company Registration Certificate Icon
    Then Attach file for Company Registration Certificate
    Then Verify Whether Company Registration Certificate file is attached or not
    Then Click Save and continue in Organizational details
    #Then Accept the General Organisation Successful popup
    Then Click Financial in Attachment Tab
    Then Click Financial & Guarantor radio button
    Then Attach file for Balance Sheet for three years
    Then Verify whether Balance Sheet for three years file is attached or not
    Then Click Save and continue in Organizational details
    Then Verify whether able to click Innovation tab
    Then Verify whether able to select working on any innovative products
    Then Verify whether able to enter the details of the product
    Then Verify whether able to click Distinctive features
    Then Verify whether able to add project name
    Then Verify whether able to add client
    Then Verify whether able to add features
    Then Click Save and continue in Organizational details
    #Then Accept the General Organisation Successful popup
    Then Verify whether able to click Manpower tab
    #Then Verify whether able to click Statutory payment
    Then Verify whether able to select statutory payment
    Then Verify whether able to add details for statutory details
    Then Click Save and continue in Organizational details
    #Then Accept the General Organisation Successful popup
    #Then S
    
    
    
    
    
    
    
    
		    
