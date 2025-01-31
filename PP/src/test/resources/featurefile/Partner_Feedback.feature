@PPFeedback @E2E
Feature: Partner Portal(Partner Feedback)

Background: 
    Given Go to Test Environment

  @PPFeedback_Draft_001
  Scenario: Partner Feedback Draft
    Then Enter partner Feedback username
    Then Enter partner onboarding password
    Then Enter partner feedback CAPTACHA
    Then Verify the user able to Login
    Then Accept partner Portal terms and condition
    Then Verify the page title
    Then Accept the Vendor Declaration form
    Then Verify the Feedback Partner number is avalable or not
    Then Verify user able to click partner feedback link
    Then Verify user able to select Job details in PF
    Then Verify user able to click Give Feedback BTN
    Then Verify the Jobcode is available or not
    Then Verify the Jobname is available or not
    Then Enter the name in PF
    Then Enter the Designation in PF
    Then Enter the Email in PF
    Then Enter the Mobile number in PF
    Then Select first question in UE
    Then Select second question in UE
    Then Select third A question in UE
    Then Select third B question in UE
    Then Select third C question in UE
    Then Select third D question in UE
    Then Select third E question in UE
    Then Select fourth A question in UE
    Then Select fourth B question in UE
    Then Select fourth C question in UE
    Then Click Issue Resolution Experience icon
    Then Select first question in IRE
    Then Enter first question concern in IRE
    Then Select second question in IRE
    Then Enter second question concern in IRE
    Then Select third question in IRE
    Then Enter third question concern in IRE
    Then Click Communication icon
    Then Select first question in Communication
    Then Enter first question concern in communication
    Then Select second question in communication
    Then Enter second question concern in communication
    Then Select third question in communication
    Then Enter third question concern in communication
    Then Select fourth question in commmunication
    Then Enter fourth question concern in communication
    Then Click General icon
    Then Select first question in general
    Then Enter name in general first question
    Then Enter designation in general first question
    Then Enter email id in general first question
    Then Enter mobile no in general first question
    Then Select second question in general
    Then Enter name in general second question
    Then Enter designation in general second question
    Then Enter email id in genereal second question
    Then Enter mobile no in general second question
   	Then Click Save as Draft Button
   	Then Print the feedback Document number
   	Then Accept the feedback saved in draft successfully popup
    
    @PPFeedback_Creation_002
  Scenario: Partner Feedback Creation
    Then Enter partner Feedback username
    Then Enter partner onboarding password
    Then Enter partner feedback CAPTACHA
    Then Verify the user able to Login
    Then Accept partner Portal terms and condition
    Then Verify the page title
    Then Accept the Vendor Declaration form
    Then Verify the Feedback Partner number is avalable or not
    Then Verify user able to click partner feedback link
    Then Verify user able to select Job details in PF
    Then Verify user able to click Give Feedback BTN
    Then Verify the Jobcode is available or not
    Then Verify the Jobname is available or not
    Then Enter the name in PF
    Then Enter the Designation in PF
    Then Enter the Email in PF
    Then Enter the Mobile number in PF
    Then Select first question in UE
    Then Select second question in UE
    Then Select third A question in UE
    Then Select third B question in UE
    Then Select third C question in UE
    Then Select third D question in UE
    Then Select third E question in UE
    Then Select fourth A question in UE
    Then Select fourth B question in UE
    Then Select fourth C question in UE
    Then Click Issue Resolution Experience icon
    Then Select first question in IRE
    Then Enter first question concern in IRE
    Then Select second question in IRE
    Then Enter second question concern in IRE
    Then Select third question in IRE
    Then Enter third question concern in IRE
    Then Click Communication icon
    Then Select first question in Communication
    Then Enter first question concern in communication
    Then Select second question in communication
    Then Enter second question concern in communication
    Then Select third question in communication
    Then Enter third question concern in communication
    Then Select fourth question in commmunication
    Then Enter fourth question concern in communication
    Then Click General icon
    Then Select first question in general
    Then Enter name in general first question
    Then Enter designation in general first question
    Then Enter email id in general first question
    Then Enter mobile no in general first question
    Then Select second question in general
    Then Enter name in general second question
    Then Enter designation in general second question
    Then Enter email id in genereal second question
    Then Enter mobile no in general second question
    Then Click Submit Feedback Button
    Then Check for error popup
    
    #@PPFeedback_Draft_Edit_003
  #Scenario: Partner Feedback Draft Edit Details
    #Then Enter partner Feedback username
    #Then Enter partner onboarding password
    #Then Enter partner feedback CAPTACHA
    #Then Verify the user able to Login
    #Then Accept partner Portal terms and condition
    #Then Verify the page title
    #Then Accept the Vendor Declaration form
    #Then Verify the Feedback Partner number is avalable or not
    #Then Verify user able to click partner feedback link
    #Then Verify user able to click Draft button
    #Then Verify user able to click Edit Details button
    #Then Enter the name in PF
    #Then Enter the Designation in PF
    #Then Enter the Email in PF
    #Then Enter the Mobile number in PF
    #Then Select first question in UE
    #Then Select second question in UE
    #Then Select third A question in UE
    #Then Select third B question in UE
    #Then Select third C question in UE
    #Then Select third D question in UE
    #Then Select third E question in UE
    #Then Select fourth A question in UE
    #Then Select fourth B question in UE
    #Then Select fourth C question in UE
    #Then Click Issue Resolution Experience icon
    #Then Select first question in IRE
    #Then Enter first question concern in IRE
    #Then Select second question in IRE
    #Then Enter second question concern in IRE
    #Then Select third question in IRE
    #Then Enter third question concern in IRE
    #Then Click Communication icon
    #Then Select first question in Communication
    #Then Enter first question concern in communication
    #Then Select second question in communication
    #Then Enter second question concern in communication
    #Then Select third question in communication
    #Then Enter third question concern in communication
    #Then Select fourth question in commmunication
    #Then Enter fourth question concern in communication
    #Then Click General icon
    #Then Select first question in general
    #Then Enter name in general first question
    #Then Enter designation in general first question
    #Then Enter email id in general first question
    #Then Enter mobile no in general first question
    #Then Select second question in general
    #Then Enter name in general second question
    #Then Enter designation in general second question
    #Then Enter email id in genereal second question
    #Then Enter mobile no in general second question
    #Then Click Submit Feedback Button
    #Then Check for error popup
    #
    #
    #@PPFeedback_History_View_004
  #Scenario: Partner Feedback Draft Edit Details
    #Then Enter partner Feedback username
    #Then Enter partner onboarding password
    #Then Enter partner feedback CAPTACHA
    #Then Verify the user able to Login
    #Then Accept partner Portal terms and condition
    #Then Verify the page title
    #Then Accept the Vendor Declaration form
    #Then Verify the Feedback Partner number is avalable or not
    #Then Verify user able to click partner feedback link
    #Then Verify user able to click History button
    #Then Verify user able to click View Details button
    #Then Verify user able to view Jobcode
    #Then Verify user able to view Job Name
    #Then Verify user able to view Name
    #Then Verify user able to view Designation
    #Then Verify user able to view Email
    #Then Verify user able to view Mobile Numnber
    #Then Verify user able to view Ease of doing business RFQ to Contract
    #Then Verify user able to view Ease of doing business Contract to Pay
    #Then Verify user able to view E bid rating
    #Then Verify user able to view Contract and PO
    #Then Verify user able to view order execution
    #Then Verify user able to view Invoice Submission
    #Then Verify user able to view Invoice and Payment processing
    #Then Verify user able to view communication and Documentation of finalized design
    #Then Verify user able to view frequent monitoring by the client team
    #Then Verify user able to view communication of any changes in design
    #Then Verify user able to click Issue Resolution Experience
    #Then Verify user able to view have you contacted us for assistance
    #Then Verify user able to view experience with issue assistance
    #Then Verify user able to view experience with issue resolution executive
    #Then Verify user able to click communication
    #Then Verify user able to view rate the communication from L and T
    #Then Verify user able to view senior team accessibility
    #Then Verify user able to view performance feedback
    #Then Verify user able to view L and T values
    #Then Verify user able to click General
    #Then Verify user able to view call to discuss any issues
    #Then Verify user able to view Changes in our organisation
    
    
    
    
    