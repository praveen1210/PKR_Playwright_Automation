@PPEvaluation @PPSmoke  @E2E
Feature: Verify the Partner Evaluation Request

  Background: 
    Given Goto EIPQA Environment
    
    @PPE_WO_001
  	Scenario: Performance Evaluation for Work Order Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter document by WO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fifth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation approve button
    
    @PPE_WO_002
  	Scenario: Performance Evaluation for Work Order Sendback
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter document by WO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fifth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation sendback button
    
    @PPE_WO_003
  	Scenario: Performance Evaluation for Purchase Order Sendback Evaluation and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fifth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation approve button
    
    @PPE_WO_004 
  	Scenario: Performance Evaluation for Individual Heading Approve and Sendback
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter document by WO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fifth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click filtered document number for approval
    Then Verify whether user able to click approve and sendback by heading wise
    
    @PPE_WO_005 
  	Scenario: Performance Evaluation for Individual Heading Sendback and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click filtered document number for approval
    Then Verify whether user able to click approve and sendback by heading wise
    
    @PPE_WO_006 
  	Scenario: Performance Evaluation for Individual Heading Sendback and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click WO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation approve button
    
    	
  	@PPE_PO_007
  	Scenario: Performance Evaluation for Purchase Order Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
	  Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
	  Then Verify whether user able to click logout from eip login
	  Then Verify whether user able to enter evalution login username
	  Then Verify the user able to Login 
	  Then Verify whether user able to click Partner Performance Evaluation Menu
	  Then Verify whether user able to fetch evaluation document reference no
	  Then Verify whether user able to click evaluation approve button
    
    @PPE_PO_008
  	Scenario: Performance Evaluation for Purchase Order Sendback
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation sendback button
    
    
  	@PPE_PO_009
  	Scenario: Performance Evaluation for Purchase Order Sendback Evaluation and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation approve button
    
    @PPE_PO_0010
  	Scenario: Performance Evaluation for Individual Heading Approve and Sendback
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Third rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Fourth rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click filtered document number for approval
    Then Verify whether user able to click approve and sendback by heading wise
    
    @PPE_PO_011
  	Scenario: Performance Evaluation for Individual Heading Sendback and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Complete the Evaluation Workflow with Second rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click filtered document number for approval
    Then Verify whether user able to click approve and sendback by heading wise
    
    @PPE_PO_012
  	Scenario: Performance Evaluation for Individual Heading Sendback and Approve
  	Then Login with PPE Evaluator
  	Then Navigate to Partner Performance Evaluation
  	Then Filter the document for evaluation
  	Then Verify whether user able to click sendback in Partner Evaluation
  	Then Verfiy whether user able to click PO button
  	Then Verify whether user able to filter sendback document by PO order number
    Then Complete the Evaluation Workflow with One rating in Partner Evaluation
    Then Verify whether user able to click logout from eip login
    Then Verify whether user able to enter evalution login username
    Then Verify the user able to Login 
    Then Verify whether user able to click Partner Performance Evaluation Menu
    Then Verify whether user able to fetch evaluation document reference no
    Then Verify whether user able to click evaluation approve button

    
 
 
 
 
    