@PPBranch @E2E
Feature: Partner Portal Branch(Add,Edit,Delete
Background: 
    Given Go to Test Environment
    
    @AddBranch_Draft_004 
    Scenario: Partner Branch Save as Draft
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click Branch Details
    Then Select Branch Type
    Then Click Add Branch
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
    Then Click Branch Save as Draft Button
    
    @UpdateBranch_003
    Scenario: Partner Branch Updation
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click Branch Details
    Then Select Branch Type
    Then Verify whether user able to click created link in branch section
    Then Verify whether edit icon is available or not
    Then Click Edit Branch
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
    Then Click Branch Update Button
    
    @SubmitBranch_003
    Scenario: Partner Branch Submit in Draft
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click Branch Details
    Then Select Branch Type
    Then Verify whether user able to click created link in branch section
    Then Click Branch Submit Button
    Then Verify whether user able to click confirmation popup
    Then Verify whether user able to accept the sent to evaluator success popup
    
    @AddBranch_002
    Scenario: Close Partner Branch Creation popup
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click Branch Details
    Then Select Branch Type
    Then Click Add Branch
    Then Close the add the details popup in User my profile
    
    @AddBranch_Clear_002
    Scenario: Partner Branch Creation
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click Branch Details
    Then Select Branch Type
    Then Click Add Branch
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
    Then Click Clear Button in Branch Details
    Then Click close icon in popup
    
    #@SubmitBranch_Approved_005
  #	Scenario: Branch Details Approved
    #Then Verify whether user able to enter Branch login username
    #Then Enter Password
    #Then Enter Pmqa CAPTCHA
    #Then Verify whether user able to click login button
    #Then Verify the user able to Login 
    #Then Verify whether user able to click Access based menu
    #Then Verify whether user able to click Business Apps
    #Then Verify whether user able to click Partner portal
    #Then Verify whether user able to click partner Workbench
    #Then Verify whether user able to fetch Branch document reference no
    #Then Verify whether user able to click view button
    #Then Verify whether user able to click approve button
    #Then Verify whether user able to enter Approve remarks
    #Then Verify whether user able to click Status Approve Submit button
    #Then Verify whether user able to click success popup 
    #
    #@SubmitBranch_Reject_006
  #	Scenario: Branch Details Reject
    #Then Verify whether user able to enter Branch login username
    #Then Verify whether user able to enter admin login password
    #Then Verify whether user able to click login button
    #Then Verify the user able to Login 
    #Then Verify whether user able to click Access based menu
    #Then Verify whether user able to click Business Apps
    #Then Verify whether user able to click Partner portal
    #Then Verify whether user able to click partner Workbench
    #Then Verify whether user able to fetch Branch document reference no
    #Then Verify whether user able to click view button
    #Then Verify whether user able to click reject button
    #Then Verify whether user able to enter Approve remarks
    #Then Verify whether user able to click Status Approve Submit button
    #Then Verify whether user able to click success popup 
    

