@PPGST @E2E
Feature: Partner Portal GST Details(Add,Edit,View,Approval)

Background: 
    Given Goto PMQA Home Environment
    
    @PPGST_001
    Scenario: Partner GST Creation Approve
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify the add more GST button is available or not
   	Then Verify whether user able to delete GST details from database
    Then Click Add more GST button
    Then Verify Partner Registration number in Edit GST details
    Then Verify Vendor Name in Edit GST details
    Then Verify GST Country in Edit GST details
    Then Select GST State in Edit GST details
    Then Select Registration type in Edit GST details
    Then Enter GST Identification No in Edit GST details
    Then Click GST Registration Date in Edit GST details
    Then Select GST Registration date in Edit GST details
    Then Click GST Effective From in Edit GST details
    Then Select GST Effective From in Edit GST details
    Then Enter Threshold turnover limit in Edit GST details
    Then Select Type of Dealers in Edit GST details
    Then Attach Cancelled Cheque in Edit GST details
    Then Verify the file attached or not
    Then Click Save GST Details
    Then Accept GST details added successfully popup
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter GST admin login
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch GST document reference no
    Then Verify whether user able to click view button
   	Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click approve button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
     @PPGST_002
    Scenario: Partner GST Creation Reject
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify the add more GST button is available or not
   	Then Verify whether user able to delete GST details from database
    Then Click Add more GST button
    Then Verify Partner Registration number in Edit GST details
    Then Verify Vendor Name in Edit GST details
    Then Verify GST Country in Edit GST details
    Then Select GST State in Edit GST details
    Then Select Registration type in Edit GST details
    Then Enter GST Identification No in Edit GST details
    Then Click GST Registration Date in Edit GST details
    Then Select GST Registration date in Edit GST details
    Then Click GST Effective From in Edit GST details
    Then Select GST Effective From in Edit GST details
    Then Enter Threshold turnover limit in Edit GST details
    Then Select Type of Dealers in Edit GST details
    Then Attach Cancelled Cheque in Edit GST details
    Then Verify the file attached or not
    Then Click Save GST Details
    Then Accept GST details added successfully popup
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter GST admin login
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch GST document reference no
    Then Verify whether user able to click view button
   	Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click reject button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
    
    @PPGST_003
    Scenario: Partner GST Creation Sendback
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify the add more GST button is available or not
   	Then Verify whether user able to delete GST details from database
    Then Click Add more GST button
    Then Verify Partner Registration number in Edit GST details
    Then Verify Vendor Name in Edit GST details
    Then Verify GST Country in Edit GST details
    Then Select GST State in Edit GST details
    Then Select Registration type in Edit GST details
    Then Enter GST Identification No in Edit GST details
    Then Click GST Registration Date in Edit GST details
    Then Select GST Registration date in Edit GST details
    Then Click GST Effective From in Edit GST details
    Then Select GST Effective From in Edit GST details
    Then Enter Threshold turnover limit in Edit GST details
    Then Select Type of Dealers in Edit GST details
    Then Attach Cancelled Cheque in Edit GST details
    Then Verify the file attached or not
    Then Click Save GST Details
    Then Accept GST details added successfully popup
    Then Click Submit for Financial Approval Button
    Then Enter Remarks for Financial Approval
    Then Accept Submit for Financial Approval Alert
    Then Click Ok
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter GST admin login
    Then Verify whether user able to enter admin login password
    Then Verify whether user able to click Access based menu
    Then Verify whether user able to click Business Apps
    Then Verify whether user able to click Partner portal
    Then Verify whether user able to click partner Workbench
    Then Verify whether user able to fetch GST document reference no
    Then Verify whether user able to click view button
   	Then Verify whether user able to accept Tracking Status Popup
    Then Verify whether user able to click sendback button
    Then Verify whether user able to enter Approve remarks
    Then Verify whether user able to click Status Approve Submit button
    Then Verify whether user able to click success popup
        
    @PPGST_004 
 		Scenario: Partner GST Create Close
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify the add more GST button is available or not
    Then Click Add more GST button
    Then Click Close button
    Then Verify whether close button is working or not
    
    @PPGST_005
    Scenario: Partner GST Add and Update
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify the add more GST button is available or not
   	Then Verify whether user able to delete GST details from database
    Then Click Add more GST button
    Then Verify Partner Registration number in Edit GST details
    Then Verify Vendor Name in Edit GST details
    Then Verify GST Country in Edit GST details
    Then Select GST State in Edit GST details
    Then Select Registration type in Edit GST details
    Then Enter GST Identification No in Edit GST details
    Then Click GST Registration Date in Edit GST details
    Then Select GST Registration date in Edit GST details
    Then Click GST Effective From in Edit GST details
    Then Select GST Effective From in Edit GST details
    Then Enter Threshold turnover limit in Edit GST details
    Then Select Type of Dealers in Edit GST details
    Then Attach Cancelled Cheque in Edit GST details
    Then Verify the file attached or not
    Then Click Save GST Details
    Then Accept GST details added successfully popup
    Then Verify Remaining GST List section available or not
    Then Verify the GST details available for updation or not
    Then Verify Partner Registration number in Edit GST details
    Then Verify Vendor Name in Edit GST details
    Then Verify GST Country in Edit GST details
    Then Select GST State in Edit GST details
    Then Select Registration type in Edit GST details
    Then Enter GST Identification No in Edit GST details
    Then Select GST Registration date in Edit GST details
    Then Select GST Effective From in Edit GST details
    Then Enter Threshold turnover limit in Edit GST details
    Then Select Type of Dealers in Edit GST details
    Then Attach Cancelled Cheque in Edit GST details
    Then Verify the file attached or not
    Then Click Update GST Details Button
    Then Accept GST details added successfully popup
    Then Verify whether user able to delete GST details from database
    
    @PPGST_006
    Scenario: Partner GST Search
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Enter the GST Number to Search
    Then Verify Whether the search result is correct or not
    
    @PPGST_007
    Scenario: View GST Details
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA PP2
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Financial tab in my profile
    Then Select GST details Tab
    Then Verify whether user able to view approved GST details
    Then Verify whether user able to view unapproved GST details
