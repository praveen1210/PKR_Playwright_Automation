@PPSmoke @E2E
Feature: Partner Portal (PartnerOnboarding)

  Background: 
    Given Go to Test Environment

  @PartnerEmpanelement
  Scenario: Partner Empanelment classification (Confirm the partner classification completed or not)
    Then Enter Empanelment Username
    Then Enter Empanelment Password
    Then Verify the user able to Login in EIPQA
    Then Verify the page title    
    Then Search Empanelment
    Then Click Empanelment from search menu
    Then Check the Empanelment page title
    Then Verify the New Empanelment request Search box is available or not
    Then Verify the user name is listed in New Empanelment request Search box or not
    Then Verify after submission, its redirect to empanelment list page or not
    Then Verify the title of empanelment page
    Then Verify the header of empanelment page
    Then Verify the breadcrumb available and enable
    Then Verify the eip and constzon link available and enable
    Then Verify Empaneled and Selected list available
    Then Verify Partner Classification available
    Then Verify PAN and Contingent option available and enable
    Then Verify the Save classification available and enable
    
    
    
    # Then Verify the Submission popup open or not
 
     
  @Captcha_Solve
  Scenario: Partner Onboarding
    Then Enter GSTUpdate Username
    Then Enter Password PP2
    Then Enter CAPTCHA US UserName
    
    
    
    
    
    
    
    
		    
