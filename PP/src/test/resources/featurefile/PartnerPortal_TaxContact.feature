@PPTaxContact @E2E
Feature: Partnner Portal Tax Contact Details (Edit,View)

Background: 
    Given Go to Test Environment

  @Edit_taxcontact_details_TC001 
    Scenario: Partner Tax Contact Update
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Verify whether vendor declaration Form Popup
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Tax Contact Details tab in my profile
    Then Click edit icon in tax contact details tab
    Then Enter contact name in tax contact update popup 
    Then Enter contact designation in tax contact update popup 
    Then Enter contact mobile no in tax contact update popup
    Then Enter contact email id in tax contact update popup
    Then Submit to update the details in User my profile
    
    @View_New_taxcontact_details_TC002 
  	Scenario: View New Tax Contact Details
    Then Enter Pmqa Username
    Then Enter Password
    Then Enter Pmqa CAPTCHA
    Then Verify the user able to Login
    Then Click User My profile menu
    Then Select Technical tab in my profile
    Then Select Tax Contact Details tab in my profile
    Then Verify whether user able to view tax contact details
    