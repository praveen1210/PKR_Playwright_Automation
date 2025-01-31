package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PartnerPortal_Menu {

	public @FindBy(xpath = "//span[text()='Loading']") static List<WebElement> Spinner;
	public @FindBy(xpath = "//*[@class='spinner-wrapper']//img") static List<WebElement> Spinner_img;

	// EIPQA Login Page
	public @FindBy(linkText = "Other User") static WebElement EIPOtheruser_Tab;
	public @FindBy(id = "username") static WebElement EIPUsername_TB;
	public @FindBy(id = "password-field") static WebElement EIPPassword_TB;
	public @FindBy(id = "login-submit") static WebElement EIPLogin_Btn;
	public @FindBy(linkText = "Sign Out") static WebElement EIPSignout;
//	public @FindBy(xpath = "//button[text()='Ok']") static WebElement ok_Btn;

	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static WebElement headerSearchbox_TB;

	// Common
	public @FindBy(xpath = "//button[text()= 'Submit']") static WebElement submit_Btn;
	public @FindBy(xpath = "//h3[text() = 'Vendor Declaration Form']") static WebElement VendorDeclareForm_PopHeader;
	public @FindBy(xpath = "//img[contains(@class, 'modal-close-button')]") static WebElement VendorDeclareFormClose_Img;

	// Empanelment
	public @FindBy(xpath = "(//span[text() = ' Empanelment ']//parent::span)[1]") static WebElement searchEmpanelment_TB;
	public @FindBy(xpath = "//span[contains(@class, 'navebar-empanelment-sub-text')]") static WebElement Empanelment_TitleContainer_L;
	public @FindBy(xpath = "//span[contains(text(), 'Search partner min')]//parent::div") static WebElement SearchPartner_PlaceHolder_TB;
	public @FindBy(xpath = "//input[contains(@placeholder, 'Search partner min')]") static WebElement SearchPartner_TB;
	public @FindBy(xpath = "//span[@data-selected='Selected']") static WebElement EmpanelmentPartnerNo_ListValue;
	public @FindBy(xpath = "//button[text() = 'SUBMIT']") static WebElement EmpanelmentSubmitToSearchPartner_btn;
	public @FindBy(xpath = "//span[text() = ' Partner Portal - Empanelment']") static WebElement EmpanelmentPageHeader_L;
	public @FindBy(xpath = "//span[@aria-current='location']") static WebElement EmpanelmentBreadcrumb_L;
	public @FindBy(xpath = "//span[text() = 'EIP4']") static WebElement EmpanelmentEIP_Link;
	public @FindBy(xpath = "//span[text() = 'ConstZon']") static WebElement EmpanelmentConstZon_Link;
	public @FindBy(xpath = "//*[text() = 'Empaneled List']") static WebElement EmpEmpaneledList_Tab;
	public @FindBy(xpath = "//*[text() = 'Selected List']") static WebElement EmpSelectedList_Tab;
	public @FindBy(xpath = "//div[text() = 'Partner Classification']") static WebElement EmpPartnerClassification_header;
	public @FindBy(xpath = "//*[contains(@class, 'partner-classification')]/div[1]") static WebElement EmpPANandContingent_radio;

	// (//div[1]//ancestor::div[contains(@class,
	// 'partner-classification')]//parent::div)[1]

	// input[contains(@placeholder, 'Search partner min')]

	// Partner Onboarding
	public @FindBy(xpath = "//div[@class='modal-body']//button") static WebElement Partner_ThanksForLogging_OK_btn;
	public @FindBy(xpath = "//button[text() = 'Accept']") static WebElement Partner_TandC_Accept_btn;
	public @FindBy(xpath = "//div[contains(text(), 'COMPLETE PROFILE')]") static WebElement Partner_completeprofile_L;
	public @FindBy(xpath = "(//div[contains(@class, 'bussinesscard')])[1]/p[1]/span") static WebElement PartnerNumber_L;
	public @FindBy(xpath = "//h4[@class=\"sub-heading\"]") static WebElement PartnerNumber_L1;
	public @FindBy(xpath = "//p[contains(text(), 'Please fill all the details in PF registration')]") static List<WebElement> PFRegID_Pop;
	public @FindBy(xpath = "//p[text() = 'Organization Details']") static WebElement OrgDetails_btn;
	public @FindBy(id = "Street Address") static WebElement streetAddr_TB;
	public @FindBy(xpath = "(//fieldset//select)[2]") static WebElement State_DD;
	public @FindBy(xpath = "(//fieldset//select)[3]") static WebElement City_DD;
	public @FindBy(id = "Zipcode") static WebElement ZipCode_onboard_TB;
	// public @FindBy(xpath = "//h1[contains(@class,
	// 'sameAddress')]//following::input[1]") static WebElement SameAddr_CB;
	public @FindBy(id = "checkbox-1") static WebElement SameAddr_CB;
	public @FindBy(xpath = "//legend[text()='Incorporated as']//following::select[1]") static WebElement IncorporatedAs_DD;
	public @FindBy(xpath = "//label[text() = 'Year of Incorporation']//following::div") static WebElement YearofIncorporation_Date;
	public @FindBy(xpath = "(//span[@class='cell day'])[1]") static WebElement DateofIncorporation_Date;
	public @FindBy(xpath = "//legend[text() = 'Place of Incorporation']//following::input[1]") static WebElement PlaceofIncorporation_TB;
	public @FindBy(id = "CIN Number") static WebElement CIN_Number_TB;
	public @FindBy(id = "LLPIN") static WebElement LLPIN_TB;
	public @FindBy(id = "Firm Registration Number") static WebElement FirmReg_TB;
	public @FindBy(id = "Shop & Establishment Reg No.") static WebElement shopEstablishment_TB;
	public @FindBy(xpath = "//h6[text() = 'GST Number *']//following::input[2]") static WebElement GST_No_Radio;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[1]/input[1]") static WebElement GST_AttachDocument_Btn;
	public @FindBy(xpath = "(//div[contains(text(), 'Recommended: .pdf')])[1]//following::ul[1]//a") static WebElement Verify_GST_Doc_L;
	public @FindBy(xpath = "//h6[text() = 'MSME Details *']//following::label[1]") static WebElement MSME_Yes_Radio;
	public @FindBy(xpath = "//h6[text() = 'MSME Details *']//following::label[2]") static WebElement MSME_No_Radio;
	public @FindBy(xpath = "(//i[@class='calendar-icon'])[2]") static WebElement MSMEEffectiveFrom_Date;
	public @FindBy(id = "Last Year turnover in INR*") static WebElement Last_Year_turnover_in_INR_TB;
	public @FindBy(xpath = "//h6[text() = 'E-invoice Applicability *']//following::label[2]") static WebElement Einvoice_Applicability_Radio;
	public @FindBy(xpath = "//h6[contains(text(), 'Can TCS be charged ')]//following::label[2]") static WebElement Can_TCS_Be_Charged_Radio;
	public @FindBy(xpath = "//h6[text() = 'TAN Number*']//following::input[2]") static WebElement TAN_No_Radio;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[2]/input[1]") static WebElement TAN_AttachDocument_Btn;
	public @FindBy(xpath = "(//div[contains(text(), 'Recommended: .pdf')])[1]//following::ul[2]//a") static WebElement Verify_TAN_Doc_L;
	public @FindBy(xpath = "//h6[text() = 'Aadhaar Number*']//following::label[2]") static WebElement Aadhaar_No_Radio;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[3]/input[1]") static WebElement Aadhaar_AttachDocument_Btn;
	public @FindBy(xpath = "//h6[text() = 'PF Registration ID *']//following::label[2]") static WebElement PFReg_No_Radio;
	public @FindBy(id = "Employee Count") static WebElement PFReg_EmpCount_TB;
	public @FindBy(xpath = "//h6[text() = 'ESI Registration ID *']//following::label[2]") static WebElement ESI_No_Radio;
	public @FindBy(id = "Number of Employees") static WebElement ESIReg_EmpCount_TB;
	public @FindBy(xpath = "//div[contains(text(), 'Contact Details')]") static WebElement ContactDetails_accordian;
	public @FindBy(id = "Name") static WebElement ContactDetails_Name_TB;
	public @FindBy(id = "Designation") static WebElement ContactDetails_Designation_TB;
	public @FindBy(xpath = "//legend[text()='Department']//following::select[1]") static WebElement ContactDetails_Dept_DD;
	public @FindBy(id = "Mobile Number") static WebElement ContactDetails_Mobile_Number_TB;
	public @FindBy(id = "Email") static WebElement ContactDetails_Email_TB;
	public @FindBy(xpath = "//legend[text()='Department']//following::select[2]") static WebElement ContactDetails_ContactCategory_DD;
	public @FindBy(xpath = "//button[text() = '+ Add Contact']") static WebElement ContactDetails_AddContact_Link;
	public @FindBy(xpath = "(//div[@class = 'v-expansion-panel__header'])[4]/div[1]") static WebElement ContactDetails_SecContact_SubAccordian;
	public @FindBy(xpath = "(//*[@id = 'Name'])[2]") static WebElement ContactDetails_SecName_TB;
	public @FindBy(xpath = "(//*[@id = 'Designation'])[2]") static WebElement ContactDetails_SecDesignation_TB;
	public @FindBy(xpath = "(//legend[text()='Department'])[2]//following::select[1]") static WebElement ContactDetails_SecDept_DD;
	public @FindBy(xpath = "(//*[@id = 'Mobile Number'])[2]") static WebElement ContactDetails_SecMobile_Number_TB;
	public @FindBy(xpath = "(//*[@id = 'Email'])[2]") static WebElement ContactDetails_SecEmail_TB;
	public @FindBy(xpath = "(//*[text() = 'Contact Category'])[2]//following::select[1]") static WebElement ContactDetails_SecContactCategory_DD;
	public @FindBy(xpath = "(//img[@data-v-97cd4e80])[11]") static WebElement Parnter_Registration_WarehouseBTN;
	public @FindBy(xpath = "(//img[@data-v-97cd4e80])[12]") static WebElement Parnter_Registration_WarehouseSec;
	public @FindBy(id = "Warehouse Name") static WebElement WarehouseName_TB;
	public @FindBy(id = "Stock Value ( INR - Lakhs )") static WebElement WarehouseStockValue_TB;
	public @FindBy(id = "Total Area (sq.ft)") static WebElement WarehouseTotalArea_TB;
	public @FindBy(id = "Street Address") static WebElement WarehouseStreetaddress_TB;
	public @FindBy(xpath = "//h6[text() = 'Warehouse Address']//following::select[1]") static WebElement WarehouseCountry_DD;
	public @FindBy(xpath = "//h6[text() = 'Warehouse Address']//following::select[2]") static WebElement WarehouseState_DD;
	public @FindBy(xpath = "//h6[text() = 'Warehouse Address']//following::select[3]") static WebElement WarehouseCity_DD;
	public @FindBy(id = "Zipcode") static WebElement WarehouseZipcode_DD;

	// Bank Details
	public @FindBy(xpath = "//*[text() = 'Bank Details']//preceding::img[1]") static WebElement BankDetails_Icon;
	public @FindBy(xpath = "//legend[text()='Account Category']//following::select[1]") static WebElement Bank_Account_Category;
	public @FindBy(xpath = "//legend[text()='Payment Mode']//following::select[1]") static WebElement Bank_Payment_Mode;
	public @FindBy(xpath = "//input[@id='Payment in favour of']") static WebElement Bank_Payment_Infavourof;
	public @FindBy(xpath = "//legend[text()='Account Type']//following::select[1]") static WebElement Bank_Account_Typey;
	public @FindBy(xpath = "//legend[text()='Bank Name']//following::select[1]") static WebElement Bank_Name;
	public @FindBy(xpath = "//input[@id='IFSC Code']") static WebElement Bank_IFSC_Code;
	public @FindBy(xpath = "//input[@id='Account Number']") static WebElement Bank_Account_Number;
	public @FindBy(xpath = "//input[@id='Payment Confirmation Mail Id']") static WebElement Bank_Payment_ConfirmationMailId;
	public @FindBy(xpath = "//*[text() = 'Save & Continue']") static WebElement SaveContinueBTN;
	public @FindBy(xpath = "(//button[contains(text(),'Delete')])[1]//img") static WebElement DeleteDetailsBTN;
	public @FindBy(xpath = "//button[text()='Yes']") static WebElement ConfirmationYesBTN;
	public @FindBy(xpath = "//button[text()='No']") static WebElement ConfirmationNoBTN;


	// Customer Details
	public @FindBy(xpath = "//*[text() = 'Credentials']//preceding::img[1]") static WebElement Credentials_Icon;
	public @FindBy(xpath = "//input[@id='Customer Name']") static WebElement Customer_Name_crd;
	public @FindBy(xpath = "//input[@id='Years in partnership']") static WebElement Years_in_partnerShip_crd;
	public @FindBy(xpath = "//input[@id='Approx Revenue ( INR - Lakhs )']") static WebElement Approx_Revenue_crd;
	public @FindBy(xpath = "//input[@id='References(Remarks)']") static WebElement Reference_crd;

	// Business Verticals
	public @FindBy(xpath = "//*[text() = 'Partnership Avenues']//preceding::img[1]") static WebElement PartnerShip_Avenues_Icon;
	public @FindBy(xpath = "//legend[text()='Business type']//following::select[1]") static WebElement Business_Type_BV;
	public @FindBy(xpath = "//legend[text()='Business Vertical']//following::select[1]") static WebElement Business_Verticals;
	public @FindBy(xpath = "//*[@id='multiSelectSecondarySubCategory']") static WebElement Business_Region;
	public @FindBy(xpath = "//legend[text()='Primary Business']//following::select[1]") static WebElement PrimaryBusiness_BV;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[1]") static WebElement BV_Region_Section;
	public @FindBy(xpath = "(//span/parent::li)[1]") static WebElement BV_Region_Section_firstindex_DD;
	public @FindBy(xpath = "//*[text()='PAN L&T']//preceding::input[@type='radio']") static WebElement Credential_Business_with;
	public @FindBy(xpath = "//*[contains(text(),'partner with any other Division')]") static WebElement Credentials_Second_Que_Img;
	public @FindBy(xpath = "(//*[text()='Yes'])[1]") static WebElement PA_Second_Yes_Icon;
	public @FindBy(xpath = "//input[@id='OD Details *']") static WebElement PA_OD_Details;
	public @FindBy(xpath = "//input[@id='Partner Code*']") static WebElement PA_Partner_Code;
	public @FindBy(xpath = "//textarea[@id='If currently not active, State reason']") static WebElement PA_Reason_Not_Active;
	public @FindBy(xpath = "//*[contains(text(),'senior management')]") static WebElement Credentials_Third_Que_Img;
	public @FindBy(xpath = "(//*[text()='Yes'])[2]") static WebElement PA_Third_Yes_Icon;
	public @FindBy(xpath = "//input[@id='Contact Name']") static WebElement PA_Contact_Name;
	public @FindBy(xpath = "(//input[@id='Designation*'])[1]") static WebElement PA_Contact_Designation;
	public @FindBy(xpath = "(//input[@id='Email'])[1]") static WebElement PA_Contact_Email;
	public @FindBy(xpath = "(//input[@id='Mobile Number*'])[1]") static WebElement PA_Contact_MobileNo;
	public @FindBy(xpath = "//*[contains(text(),'know about partner portal')]") static WebElement Credentials_Fourth_Que_Img;
	public @FindBy(xpath = "//legend[text()='Type of Reference']//following::select[1]") static WebElement Know_PartnerPortal;
	public @FindBy(xpath = "//input[@id='Name']") static WebElement Reference_PName;
	public @FindBy(xpath = "//input[@id='Company Name']") static WebElement Reference_PCompanyName;
	public @FindBy(xpath = "(//input[@id='Designation*'])[2]") static WebElement Reference_PDesignation;
	public @FindBy(xpath = "(//input[@id='Email'])[2]") static WebElement Reference_PEmail;
	public @FindBy(xpath = "//input[@id='Mobile Number']") static WebElement Reference_PMobileNo;
	public @FindBy(xpath = "(//*[text()='Yes'])[5]") static WebElement Engage_With_Radio;
	public @FindBy(xpath = "(//span[text()='Select Relationship'])//following::select") static WebElement Ass_Select_RelationShip;
	public @FindBy(xpath = "//input[@id='Employee Name']") static WebElement Ass_Employee_Name;
	public @FindBy(xpath = "//input[@id='Employee Relation']") static WebElement Ass_Employee_Relation;
	public @FindBy(xpath = "//input[@id='Psno']") static WebElement Ass_Employee_PSNo;
	public @FindBy(xpath = "//input[@id='rdIAccept_0']") static WebElement PA_Accknowledge_CheckBox;

	public @FindBy(xpath = "//*[contains(text(),'related party with any division')]") static WebElement Credentials_Fifth_Que_Img;
	public @FindBy(xpath = "(//*[text()='Yes'])[3]") static WebElement PA_Fifth_Yes_Icon;
	public @FindBy(xpath = "(//input[@id='Name'])[2]") static WebElement RP_Name;
	public @FindBy(xpath = "(//input[@id='Designation*'])[3]") static WebElement RP_Designation;
	public @FindBy(xpath = "(//input[@id='Email'])[3]") static WebElement RP_Email;
	public @FindBy(xpath = "(//input[@id='Mobile Number*'])[2]") static WebElement RP_Mobile;
	public @FindBy(xpath = "(//*[text()='No'])[4]") static WebElement RP_Pan_No;
	public @FindBy(xpath = "//*[contains(text(),'to engage with L & T Construction')]") static WebElement Credentials_Sixth_Que_Img;

	// Branch Details
	public @FindBy(xpath = "//*[text() = 'Branch']//preceding::img[1]") static WebElement Branch_Icon;
	public @FindBy(xpath = "//*[text()='Yes']") static WebElement Branch_Yes; // Branch Name Street Address State
																				// Zipcode Coordination Person Name
																				// Designation Mobile Number Email
	public @FindBy(xpath = "//input[@id='Branch Name']") static WebElement Branch_Name;
	public @FindBy(xpath = "//input[@id='Street Address']") static WebElement Branch_Street_Address;
	public @FindBy(xpath = "//legend[text()='State']//following::select[1]") static WebElement Branch_State;
	public @FindBy(xpath = "//legend[text()='City']//following::select[1]") static WebElement Branch_District;
	public @FindBy(xpath = "//input[@id='Zipcode']") static WebElement Branch_Zipcode;
	public @FindBy(xpath = "//input[@id='Coordination Person Name']") static WebElement Branch_Coord_Name;
	public @FindBy(xpath = "//input[@id='Designation']") static WebElement Branch_Designation;
	public @FindBy(xpath = "//input[@id='Mobile Number']") static WebElement Branch_Mobile_No;
	public @FindBy(xpath = "//input[@id='Email']") static WebElement Branch_Email;
	// Financial
	public @FindBy(xpath = "//*[text()='Financial']") static WebElement Financial_Icon;
	public @FindBy(xpath = "//input[@id='Current debt outstanding (Lakhs)']") static WebElement current_debt_outstanding;
	public @FindBy(xpath = "//input[@id='Debt to asset ratio ']") static WebElement debt_to_asset_ratio;
	public @FindBy(xpath = "//input[@id='Current assets to Current liabilities ']") static WebElement current_asset_to_current_liabilities;
	public @FindBy(xpath = "//input[@id='Current assets']") static WebElement Current_assets;
	public @FindBy(xpath = "//*[text()='Financial Strength']") static WebElement Financial_Strength_Icon;
	public @FindBy(xpath = "//input[@name='financial-backer' and @value='Y']") static WebElement Financial_backer_Yes;
	public @FindBy(xpath = "//input[@name='merger-status' and @value='Y']") static WebElement merger_status_Yes;
	public @FindBy(xpath = "//*[contains(text(),'working capital required')]//img") static WebElement FP_Que2_Icon;
	public @FindBy(xpath = "//*[contains(text(),'Primary and Secondary Banker')]//img") static WebElement Financial_Que2_Icon;
	public @FindBy(xpath = "//*[contains(text(),'firm has possibility')]//img") static WebElement Other_Que2_Icon;
	public @FindBy(xpath = "//legend[text()='Account Category']//following::select[1]") static WebElement Financial_Account_Category;
	public @FindBy(xpath = "(//legend[text()='Account Category']//following::select[1])[2]") static WebElement Financial_Secondary_Category;
	public @FindBy(xpath = "//input[@type='file']") static WebElement Financial_Backer_Attachment;
	public @FindBy(xpath = "//legend[text()='Bank Name']//following::select[1]") static WebElement Financial_Bank;
	public @FindBy(xpath = "(//legend[text()='Bank Name']//following::select[1])[2]") static WebElement Financial_SecondaryBank;
	public @FindBy(xpath = "//input[@id='IFSC Code']") static WebElement Financial_IFSCCode;
	public @FindBy(xpath = "//input[@id='Years of Association ']") static WebElement Financial_YearofAssociation;
	public @FindBy(xpath = "//input[@id='Coordination Person Name']") static WebElement Financial_CoordPersonName;
	public @FindBy(xpath = "//input[@id='Contact Designation']") static WebElement Financial_Designation;
	public @FindBy(xpath = "//input[@id='Mobile Number']") static WebElement Financial_MobileNumber;
	public @FindBy(xpath = "//input[@id='Email']") static WebElement Financial_Email;
	public @FindBy(xpath = "(//input[@id='IFSC Code'])[2]") static WebElement Financial_SecondaryIFSCCode;
	public @FindBy(xpath = "(//input[@id='Years of Association '])[2]") static WebElement Financial_SecondaryYearofAssociation;
	public @FindBy(xpath = "(//input[@id='Coordination Person Name'])[2]") static WebElement Financial_SecondaryCoordPersonName;
	public @FindBy(xpath = "(//input[@id='Contact Designation'])[2]") static WebElement Financial_SecondaryDesignation;
	public @FindBy(xpath = "(//input[@id='Mobile Number'])[2]") static WebElement Financial_SecondaryMobileNumber;
	public @FindBy(xpath = "(//input[@id='Email'])[2]") static WebElement Financial_SecondaryEmail;
	public @FindBy(xpath = "(//div[contains(text(), 'Recommended: .pdf')])[1]//following::ul[1]//a") static WebElement Financial_Banker_AttachmentTxt;
	public @FindBy(xpath = "//p[contains(text(),'Add Banker')]") static WebElement Add_Banker;
	public @FindBy(xpath = "//*[text()='Others']") static WebElement Others_Icon;
	public @FindBy(xpath = "(//legend[text()='Rating Agency']//following::select[1])") static WebElement Rating_Agency;
	public @FindBy(xpath = "//input[@id='Credit Rating']") static WebElement Credit_Rating;
	public @FindBy(xpath = "//input[@id='Remarks *']") static WebElement others_remarks;
	public @FindBy(xpath = "//p[contains(text(),'Remove Bank')]") static List<WebElement> remove_bank;
	public @FindBy(xpath = "//div[contains(@class,'v-card')]//img[@class='mr-4']") static List<WebElement> expand_icon;
	
	//Sustainability
	public @FindBy(xpath = "//*[text()='Sustainability']") static WebElement Sustainability_Icon;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[1]") static WebElement Sus_Que1_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[2]") static WebElement Sus_Que2_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[3]") static WebElement Sus_Que3_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[4]") static WebElement Sus_Que4_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[5]") static WebElement Sus_Que5_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and  @value='Yes'])[6]") static WebElement Sus_Que6_Yes;
	public @FindBy(xpath = "(//input[@id='Person Name'])[1]") static WebElement Person_Name1;
	public @FindBy(xpath = "(//input[@id='Person Name'])[2]") static WebElement Person_Name2;
	public @FindBy(xpath = "(//div[contains(@class,'v-card')]//img[@class='mr-4'])[2]") static WebElement expand_icon_que_2;
	public @FindBy(xpath = "(//div[contains(@class,'v-card')]//img[@class='mr-4'])[3]") static WebElement expand_icon_que_3;
	public @FindBy(xpath = "(//div[contains(@class,'v-card')]//img[@class='mr-4'])[4]") static WebElement expand_icon_que_4;
	public @FindBy(xpath = "(//div[contains(@class,'v-card')]//img[@class='mr-4'])[5]") static WebElement expand_icon_que_5;
	public @FindBy(xpath = "(//div[contains(@class,'v-card')]//img[@class='mr-4'])[6]") static WebElement expand_icon_que_6;
	public @FindBy(xpath = "(//input[@id='Designation'])[2]") static WebElement Designation_Que_2;
	public @FindBy(xpath = "(//input[@id='Mobile Number'])[2]") static WebElement MobileNumber_Que_2;
	public @FindBy(xpath = "(//input[@id='Email'])[2]") static WebElement Email_Que_2;

	// Attachments
	public @FindBy(xpath = "//*[text()='Attachments']") static WebElement Attachment_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[1]") static WebElement Attachments_PAN;
	public @FindBy(xpath = "//*[contains(text(),'GST registration')]//img") static WebElement GST_Registration_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[2]") static WebElement Attachments_GST_Registration;
	public @FindBy(xpath = "//*[contains(text(),'MSME certificate')]//img") static WebElement MSME_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[3]") static WebElement Attachments_MSME_Certificate;
	public @FindBy(xpath = "//*[contains(text(),'Shop establishment certificate')]//img") static WebElement ShopEst_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[4]") static WebElement Attachments_Shop_Establishment;
	public @FindBy(xpath = "//*[contains(text(),'Cancelled cheque')]//img") static WebElement Cancelled_Cheque_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[5]") static WebElement Attachments_Cancelled_cheque;
	public @FindBy(xpath = "//*[contains(text(),'Certificate by Chartered Accountant')]//img") static WebElement Chartered_Accountant_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[6]") static WebElement Attachments_Chartered_Accountant;
	public @FindBy(xpath = "//*[contains(text(),'Company Registration Certificate')]//img") static WebElement Company_Registration_Icon;
	public @FindBy(xpath = "(//input[@type='file'])[7]") static WebElement Attachments_Company_Registration;
	public @FindBy(xpath = "(//div[contains(text(),'Attached Files')]//child::span)[2]") static WebElement Attachments_Name;
	public @FindBy(xpath = "(//*[text()='Financial'])[2]") static WebElement FinancialAttachment_Icon;
	public @FindBy(xpath = "//a[@data-v-c5140474]") static WebElement FinancialAttachment_Name;

	// Innovation
	public @FindBy(xpath = "//*[text()='Innovation']") static WebElement Innovation_Icon;
	public @FindBy(xpath = "//input[@value='Yes']") static WebElement radioYesBtn;
	public @FindBy(xpath = "//textarea[@id='Details']") static WebElement radioYesBtnDetailsTA;
	public @FindBy(xpath = "//*[contains(text(),'Distinctive features of your past')]//img") static WebElement Innovation_Que_2_Icon;
	public @FindBy(id = "Project Name") static WebElement Innovation_Project_Name;
	public @FindBy(id = "Client") static WebElement Innovation_Client;
	public @FindBy(id = "Features") static WebElement Innovation_Features;
	// Manpower
	public @FindBy(xpath = "//*[text()='Manpower']") static WebElement Manpower_Icon;
	public @FindBy(xpath = "//*[contains(text(),'(Eg EPFO/ESI)')]//img") static WebElement Manpower_Que_1_Icon;

	// HSE Details
	public @FindBy(xpath = "//*[text()='HSE']") static WebElement HSE_Icon;
	public @FindBy(xpath = "//*[text()='Yes']") static WebElement Policy_Que;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])//input") static WebElement Policy_Stmt_Attachment;
	public @FindBy(xpath = "//span[@class='col']//ul//li//a[1]") static WebElement Policy_Stmt_AttachmentName;

	public @FindBy(xpath = "(//button[text() = 'Save & Continue'])[2]") static WebElement SaveAndContinue_Btn;
	public @FindBy(xpath = "(//button[text() = 'Save & Continue'])[1]") static WebElement SaveAndContinueOrg_Btn;

	// Partner Performance Request
	public @FindBy(xpath = "//span[contains(text(), 'Partner Performance Request')]") static WebElement partnerRequest_TB;
	public @FindBy(xpath = "//button[text()='Job Code']") static WebElement partnerReq_Jobcode_btn;
	public @FindBy(xpath = "//span[@title='clear']") static WebElement PartnerReq_Jobcode_Clear;
	public @FindBy(id = "lstJob") static WebElement PartnerReq_Jobcode_DD;
	public @FindBy(xpath = "(//span[@class='mat-option-text'])[1]") static WebElement DropDown_Select;
	public @FindBy(id = "icon-rightdateRange_Kendo") static WebElement PartnerReq_Datepicker_TB;
	public @FindBy(xpath = "//button[text()='Submit']") static WebElement PartnerReq_Evaluation_Submit;
	public @FindBy(xpath = "//*[text()='WO']") static WebElement PartnerReq_WO_btn;
	public @FindBy(xpath = "//*[text()='PO']") static WebElement PartnerReq_PO_btn;
	public @FindBy(xpath = "//div[@class='go-btn']//button") static WebElement PartnerEvaluation_GoBTN;
	public @FindBy(xpath = "//p[text()='Show']//following::kendo-dropdownlist") static WebElement PartnerReq_show_DD;
	public @FindBy(xpath = "(//li[@kendodropdownsselectable])[4]") static WebElement PartnerReq_show40_DD;
	public @FindBy(xpath = "//tbody[@role='presentation']//tr") static List<WebElement> Evaluation_Heading_Count;
//	public @FindBy(xpath = "//mat-select//span[contains(text(), 'ly')]") static WebElement PartnerReq_frequencyCheck_DD;
	public @FindBy(xpath = "(//tr/td/button[text()!='Update']/ancestor::tr/td[1])[1]") static WebElement PartnerReq_newOrderNo_L;
	public @FindBy(xpath = "(//tr/td/button[text()!='Update']/ancestor::tr/td[3])[1]") static WebElement PartnerReq_frequencyCheck_dd;
	public @FindBy(xpath = "//div[@role='listbox']/mat-option[1]") static WebElement PartnerReq_selectFrequency1_DD;
	public @FindBy(xpath = "(//tr/td/button[text()!='Update']/ancestor::tr/td[4])[1]//span/parent::button[@aria-pressed='true']") static WebElement PartnerReq_ISrating_toggle;
	public @FindBy(xpath = "((//tr/td/button[text()!='Update']/ancestor::tr/td)/button)[1]") static WebElement PartnerReq_submit_btn;
	public @FindBy(xpath = "//textarea[@id='Remarks']") static WebElement Partner_Sendback_Remarks;

	// Partner Performance Evaluation
	public @FindBy(xpath = "//div[@id='mat-dialog-title-0']//h1[1]") static List<WebElement> eipMsgbox_Pop;

	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static WebElement PartnerEvaluatorSearch_Menu;
	public @FindBy(xpath = "//span[text()=' Partner Performance Evaluation ']") static WebElement PartnerEvaluator_Menu;
	public @FindBy(xpath = "//p[@class='header']//a[contains(text(),'Partner Evaluation')]") static WebElement PartnerEvaluation_btn;
	public @FindBy(id = "icon-rightdateRange_Kendo") static WebElement PartnerEvaluator_Date;
	public @FindBy(xpath = "//td[contains(@class, 'k-range-start')]") static WebElement PartnerEvaluatorStart_Date;
	public @FindBy(xpath = "(//td[contains(@class,'k-state-selected')])[2]//following::td[1]") static WebElement PartnerEvaluatorEnd_date;
	public @FindBy(xpath = "//i[@title='Filter']") static WebElement PartnerEvaluatorfilter_icon;
	public @FindBy(xpath = "//input[@aria-label='Document Number Filter']") static WebElement PartnerEvaluatorDocNo_TB;
	public @FindBy(xpath = "//i[@title='Accept File']") static WebElement PartnerEvaluatorApprove_BTN;
	public @FindBy(xpath = "//i[@title='Senback']") static WebElement PartnerEvaluatorSendback_BTN;
	public @FindBy(xpath = "(//div[@role='tab'])[3]") static WebElement PartnerSendback_BTN;
	public @FindBy(xpath = "//tbody[@role='presentation']//tr//td[1]") static WebElement DocumentNumberTD;
	public @FindBy(xpath = "//i[@title='Heading Approve']") static List<WebElement> ApproveBTN;
	public @FindBy(xpath = "(//eipwftrace[@title='Trace WorkFlow']//i)[1]") static WebElement TraceBTN;
	public @FindBy(xpath = "//i[@title='Close']") static WebElement CloseTraceBTN;
	public @FindBy(xpath = "//i[@title='Heading Senback']") static List<WebElement> SenbackBTN;
	public @FindBy(xpath = "//input[@aria-label='Order Number Filter']") static WebElement LEPartnerNumber_txt;
	public @FindBy(xpath = "//td[contains(@aria-label, 'Order Number')]//input") static WebElement PartnerEvalFilterOrderNo_TB;
	public @FindBy(xpath = "//*[@title='Start Evaluation']") static List<WebElement> PartnerEvalStartEvaluation_btn;
	public @FindBy(xpath = "//div[@id='lblPOVAMaterial']") static WebElement PartnerEvalHeading_View;
	public @FindBy(xpath = "//div[@class='mat-body-content']//textarea") static List<WebElement> PartnerEvaluationQueRemarksTA;
	public @FindBy(xpath = "//div[@class='mat-body-content']/div[not(contains(@role, 'progressbar'))]//ul[1]//i") static List<WebElement> PartnerEvaluation1strating_btn;
	public @FindBy(xpath = "//div[@class='mat-body-content']/div[not(contains(@role, 'progressbar'))]//ul[2]//i") static List<WebElement> PartnerEvaluation2ndrating_btn;
	public @FindBy(xpath = "//div[@class='mat-body-content']/div[not(contains(@role, 'progressbar'))]//ul[3]//i") static List<WebElement> PartnerEvaluation3rdrating_btn;
	public @FindBy(xpath = "//div[@class='mat-body-content']/div[not(contains(@role, 'progressbar'))]//ul[4]//i") static List<WebElement> PartnerEvaluation4thrating_btn;
	public @FindBy(xpath = "//div[@class='mat-body-content']/div[not(contains(@role, 'progressbar'))]//ul[5]//i") static List<WebElement> PartnerEvaluation5thrating_btn;
	public @FindBy(id = "Remarks") static WebElement Remarks_TA;
	// public @FindBy(xpath =
	// "//html//body//div[5]//div//div[3]//div[2]//section//div//div[3]//div//div[1]//div//div//div//div[2]//div//div//input")
	// static WebElement Child_Window_Ele;

	// Create Grievance request in Partner Portal Management
	public @FindBy(xpath = "//*[@id='Username']") static WebElement Username;
	public @FindBy(xpath = "//*[@type='password']") static WebElement Password;
	public @FindBy(xpath = "//*[@placeholder='Enter the text as above']") static WebElement Captcha;
	public @FindBy(xpath = "//button[text()='LOGIN']") static WebElement Login;
	public @FindBy(xpath = "//span[text()='Grievance Request']") static WebElement GrievanceRequest;
	public @FindBy(xpath = "(//legend//following::select)[1]") static WebElement Category;
	// public @FindBy(xpath = "//*[text()='Supplier']") static WebElement
	// SelectCategory_dd;
	public @FindBy(xpath = "//legend[text()='Select category']/following::select[1]") static WebElement SelectCategory_dd;
	public @FindBy(xpath = "//option[text()='Supplier']") static WebElement SupplierCategory_ddvalue;
	public @FindBy(xpath = "//legend[text()='Job Details']/following::select[1]") static WebElement JobDetails;
	public @FindBy(xpath = "(//select)[3]") static WebElement SelectJob;
	public @FindBy(xpath = "(//select)[3]//option[1]") static List<WebElement> JobSelection;
	public @FindBy(xpath = "//ul[@class='selectList']/li[1]") static WebElement POSelection;
	public @FindBy(id = "multiSelectPrimarySubCategory") static WebElement PONumber;
	// public @FindBy(xpath = "//span[text()='multi-select']") static WebElement
	// PONumber;

	// Fill details in Create Grievance Request page
	public @FindBy(xpath = "//input[@placeholder='Search...']") static WebElement POSelection_Tb;
	public @FindBy(xpath = "//li[@class='selectItem']//span") static List<WebElement> PoSelection_DD;
	public @FindBy(xpath = "//*[contains(text(),'Create Grievance Request')]") static WebElement CreateGRButton;
	public @FindBy(xpath = "//*[@required='required']") static WebElement ReasonForGrievance_DD;
	public @FindBy(xpath = "//*[text()='MRN pending']") static WebElement SelectReasonForGrievance_DD;
	public @FindBy(xpath = "//textarea[contains(@class,'width-control-small lato-regular-input')]") static WebElement grie_description_TA_M;
	public @FindBy(xpath = "//input[@placeholder='Name of the attachment..']") static WebElement grie_NameOfTheAttachment_M;
	public @FindBy(xpath = "//p[contains(text(), 'Add Files')]/input") static WebElement AddAttachment;
	public @FindBy(xpath = "//input[@id='Reference Document number']") static WebElement ReferenceDocumentnumber_TB;
	public @FindBy(xpath = "//input[@id='L&T Employee or Site Person Contacted for this issue:']") static WebElement LnTEmployee_TB;
	public @FindBy(xpath = "//input[@type='checkbox']") static WebElement Grieagree_CB;
	public @FindBy(xpath = "//span[contains(text(), 'I hereby declare ')]//preceding::input[@type='checkbox']") static WebElement GrieDraftAgree_CB;
	public @FindBy(xpath = "//button[contains(@class,'btn submit-button')]") static WebElement Submit_btn;
	public @FindBy(xpath = "//p[contains(@class, 'Approver-Success-text')]") static WebElement GrievanceFinalMsg_Popup;

	// Grievance Request Draft Creation
	public @FindBy(xpath = "//button[contains(text(), 'Save as Draft')]") static WebElement saveasdraftbtn_M;
	public @FindBy(xpath = "//p[contains(@class, 'Approver-Success-text')]") static WebElement saveasdraftsuccessMsg_Pop;

	// Approval in EIP Portal
	public @FindBy(linkText = "Other User") static WebElement Otheruser_Tab;
	public @FindBy(id = "username") static WebElement approverUsername_TB;
	public @FindBy(id = "password-field") static WebElement approverPassword_TB;
	public @FindBy(id = "login-submit") static WebElement approverLogin_Btn;
	public @FindBy(linkText = "Sign Out") static WebElement Signout;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement ok_Btn;
	public @FindBy(xpath = "//input[contains(@class,'MenuSearchInput')]") static WebElement SearchMenu_TB;
	public @FindBy(xpath = "//span[text()=' Partner WorkBench ']") static WebElement PartnerWorkbench_M;
	public @FindBy(xpath = "(//button[text() = 'View'])[1]") static WebElement ActionsView_Btn;
	public @FindBy(xpath = "(//button[text() = 'Trace'])[2]") static WebElement ActionsTrace_Btn;
	public @FindBy(xpath = "//h5[@class='modal-title']") static WebElement WorkflowTraceTitle_Pop;
	public @FindBy(xpath = "//span[1]/div[contains(text(), 'Receiver:')]") static List<WebElement> WorkflowReceiver_Pop;
	public @FindBy(xpath = "//button[text()='ok']") static List<WebElement> WorkflowTraceOkBtn_btn;

	// Add business category in MyProfile
	public @FindBy(xpath = "//span[text()='My Profile']") static WebElement myprofile_M;
	public @FindBy(xpath = "//button[contains(text(), 'Add new Business')]") static WebElement addnewbusinessCat_Btn;
	public @FindBy(xpath = "(//*[@role='group'])[1]//child::select") static WebElement addnewbusinessCatpartner_Btn;
	public @FindBy(xpath = "//legend[text()='Partner Type']/following::select") static WebElement businesspartnertype_DD;
	public @FindBy(xpath = "(//div[@id='multiSelectSecondarySubCategory'])[1]") static WebElement businessCategory_DD;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[1]") static WebElement businesscategorysearch_TB;
	public @FindBy(xpath = "//span/parent::li") static WebElement businesscategory_firstindex_DD;
	public @FindBy(xpath = "(//div[@id='multiSelectSecondarySubCategory'])[2]") static WebElement businesssubcategory_DD;
	public @FindBy(xpath = "(//ul[@class='selectList'])[2]/li[1]") static WebElement businessSubcategory_firstindex_List;
	public @FindBy(xpath = "(//ul[@class='selectList'])[2]/li[2]") static WebElement businessSubcategory_secondindex_List;
	public @FindBy(xpath = "//span[text()='Clear']//parent::button") static WebElement addBusinessCategoryClear_Btn;
	public @FindBy(xpath = "//span[text()='Save']//parent::button") static WebElement addBusinessCategorySave_Btn;
	public @FindBy(xpath = "(//span[text()='Submit'])[2]") static WebElement addBusinessCategorySubmit_Btn;
	public @FindBy(xpath = "(//span[text()='Submit'])[1]") static WebElement addBusinessCategoryApprovalSubmit_Btn;
	public @FindBy(xpath = "//div[@typeoftable='ApprovedBusinessCategoryTable']//table//tr[@role='row']//th") static List<WebElement> BusinessCategoryHeader;
	public @FindBy(xpath = "//div[@typeoftable='ApprovedBusinessCategoryTable']//table//tbody//tr[@role='row']") static List<WebElement> BusinessCategoryTR;
	public @FindBy(xpath = "//div[@typeoftable='ApprovedBusinessCategoryTable']//table//tr[@role='row']//td") static List<WebElement> BusinessCategoryTD;


	// Add New Comapany
	public @FindBy(xpath = "//span[text() = 'Add New Company']") static WebElement addNewCompany_Menu;
	public @FindBy(xpath = "//*[contains(text(), 'Select to Add ne')]//following::select[1]") static WebElement selectAddNewCompany_DD;
	public @FindBy(xpath = "//*[text()= 'Business Category']//following::select[1]") static WebElement selectBusinessCategory_DD;
	public @FindBy(xpath = "//*[text()= 'Select Primary Business Type']//following::select[1]") static WebElement selectPrimaryBusinessType_DD;
	public @FindBy(xpath = "//*[text()= 'Business Vertical']//following::select[1]") static WebElement selectBusinessVertical_DD;
	public @FindBy(id = "multiSelectSecondarySubCategory") static WebElement Region_div;
	public @FindBy(xpath = "//*[@class='inputFilter']") static WebElement RegionSearch_TB;
	public @FindBy(xpath = "//*[@class='selectList']/li[1]") static WebElement chooseRegionfromSearch_UL;
	public @FindBy(xpath = "//*[text()= 'Primary Business']//following::select[1]") static WebElement selectPrimaryBusiness_DD;

	// Update Business Category Details
	public @FindBy(xpath = "(//td[@aria-colindex='5'])[1]//img") static WebElement updateBusinessCategory_icon;
	public @FindBy(xpath = "//span[text()='Update']/parent::button") static WebElement updateBusinessCategory_btn;

	// Add Address Details in Myprofile
	public @FindBy(xpath = "//p[contains(text(),'Add Files')]/input") static WebElement addaddress_attachment;

	// Update Address Details in Myprofile
	public @FindBy(xpath = "//button[text()='Address Details']") static WebElement addressdetails_Tab;
	public @FindBy(xpath = "//button[text()='Contact Details & Certificates']") static WebElement contactdetailandCertificate_Btn;
	public @FindBy(xpath = "(//table)[1]//thead//tr//th") static List<WebElement> detailsView_Header;
	public @FindBy(xpath = "(//table)[1]//tbody//tr") static List<WebElement> detailsView_TR;
	public @FindBy(xpath = "(//table)[1]//tbody//tr//td") static List<WebElement> detailsView_TD;
	public @FindBy(xpath = "(//button[contains(text(), 'Edit')])[1]") static WebElement editaddressdetail_Btn;
	public @FindBy(xpath = "(//div[text()='Address Type']//following::select)[1]") static WebElement addressType_DD;
	public @FindBy(xpath = "(//div[text()='Address line']/following::input)[1]") static WebElement addressline_TB;
	public @FindBy(xpath = "//div[text()='Country']/following-sibling::select") static WebElement selectcountry_DD;
	public @FindBy(xpath = "//div[text()='State']/following-sibling::select") static WebElement selectstate_DD;
	public @FindBy(xpath = "//div[text()='City']/following-sibling::select") static WebElement selectcity_DD;
	public @FindBy(xpath = "//div[text()='Zip Code']/following-sibling::input") static WebElement zipcode_TB;
	public @FindBy(id = "two") static WebElement SEZ_RB;
	public @FindBy(xpath = "//p[contains(text(), 'Add Files')]") static WebElement addressproofdoc_Btn;
	public @FindBy(xpath = "//div[@class='card contact-card']//button[text()='Update']") static WebElement addressupdate_Btn;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement addressSaved_OKBtn;
	public @FindBy(xpath = "//button[text()='Submit For Technical Approval']") static WebElement addressSubmitForApproval_Btn;

	// Grievance Request "Mark as Resolved" in EIP
	public @FindBy(xpath = "//button[text()='MARK IT RESOLVED']") static WebElement MarkItResolved_Btn;

	// Grievance Request "Send Back" in EIP
	public @FindBy(xpath = "//button[text()='SEND BACK']") static WebElement sendback_Btn;

	// Grievance Request "Forward" in EIP
	// "Forward To Roles" DD Start
	public @FindBy(xpath = "//div[@id='multiSelectForwardTo']/button") static WebElement Roles_DD;
	public @FindBy(xpath = "//*[@class='selectList']//span") static List<WebElement> listofRole;
	public @FindBy(xpath = "//span[text()='Buyer']/parent::li") static WebElement User1_List;
	public @FindBy(xpath = "//span[text()='Site-Project Head']/parent::li") static WebElement User2_List;
	public @FindBy(xpath = "//span[text()='Factory-Planning Incharge']/parent::li") static WebElement User3_List;
	public @FindBy(xpath = "//span[text()='TFL Project Manager']/parent::li") static WebElement User4_List;
	// "Forward To Roles" DD End

	// "Forward To Users" DD Start
	public @FindBy(xpath = "//*[@id='multiSelectForwardToUsers']") static WebElement forwardtousers_dd;
	public @FindBy(xpath = "(//ul)[5]/li[1]") static WebElement forwarduser_List;
	public @FindBy(xpath = "//*[text()='FORWARD']") static WebElement forward_btn;
	// "Forward To Users" DD End

	// Grievance History Start
	public @FindBy(tagName = "(//h4)[1]") static WebElement grie_partnerid_M;
	public @FindBy(xpath = "//*[text()='New']") static WebElement grie_New_menu;
	public @FindBy(xpath = "//*[text()='History']") static WebElement grie_history_menu;
	public @FindBy(xpath = "//*[text()='Request History']") static WebElement grie_historypagetitle_M;
	public @FindBy(xpath = "//table//tr[1]//button[1]") static WebElement viewdetails_btn;
	public @FindBy(xpath = "((//*[text()='View Details'])/ancestor::td/preceding-sibling::td[4]/span)[1]") static WebElement grie_reqno_M;
	public @FindBy(xpath = "//p[contains(text(), 'Job Code: ')]") static WebElement grie_jobcode_M;
	public @FindBy(xpath = "//p[contains(text(), 'Document Number: ')]") static WebElement grie_docno_M;
	public @FindBy(xpath = "//*[contains(text(), 'PO/WO Number:')]") static WebElement grie_order_M;
	public @FindBy(xpath = "//*[contains(text(), 'Updated Date:')]") static WebElement grie_updateddate_M;
	public @FindBy(tagName = "h3") static WebElement grie_partnername_M;
	public @FindBy(xpath = "//*[@id='trace']//tr[1]/td[1]") static WebElement grie_sender_M;
	public @FindBy(xpath = "(//select)[2]") static WebElement grie_reasonforgrievance_M;
	public @FindBy(xpath = "//*[text()='MRN pending']") static WebElement grie_SelectReasonForGrievance_M;
	public @FindBy(tagName = "textarea") static WebElement grie_Desc_of_Grievance_M;
	public @FindBy(xpath = "//input[contains(@placeholder, 'attachment')]") static WebElement grie_Attachment_desc_M;
	public @FindBy(xpath = "//a[contains(text(), '.pdf')]") static WebElement grie_Download_attachment_M;
	public @FindBy(id = "Reference Document number") static WebElement grie_reference_docno_M;
	public @FindBy(id = "L&T Employee or Site Person Contacted for this issue:") static WebElement grie_Contact_for_issue_M;
	public @FindBy(xpath = "//*[@class='back-arrow-icon']") static WebElement grie_backbtn_M;
	// Grievance History End

	// Grievance Draft Start
	public @FindBy(xpath = "//p[text()='Draft']") static WebElement grie_draftmenu_M;
	public @FindBy(xpath = "(//span[text()='Partner Portal']/following::img)[1]") static WebElement grie_declarationPopup_M;
	public @FindBy(xpath = "//span[text()='Attach Relevant documents/proofs']/following::input") static WebElement grie_attachmentDraft_M;
	public @FindBy(xpath = "//span[contains(text(), 'I hereby declare that')]/preceding-sibling::input") static WebElement grie_declaration_M;
	public @FindBy(xpath = "(//div[@id='claim-container']//button)[3]") static WebElement grie_draftsubmitbtn_M;
	public @FindBy(xpath = "//p[contains(text(), ' submitted successfully')]") static WebElement grie_successmsg_M;
	public @FindBy(xpath = "//p[contains(@class, 'Approver-Success-text')]") static WebElement grie_errormsg_Pop;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement grie_successbtn_M;
	// Grievance Draft End

	// Testimonial Start
	public @FindBy(xpath = "//span[text()='Testimonials']") static WebElement testi_testimonialMenu_M;
	public @FindBy(xpath = "//*[text()='Add Testimonials']") static WebElement testi_addtestimonialbtn_M;
	public @FindBy(id = "Employee Name*") static WebElement testi_empname_M;
	public @FindBy(id = "Designation*") static WebElement testi_designation_M;
	public @FindBy(id = "Mobile Number*") static WebElement testi_mobileno_M;
	public @FindBy(id = "E-mail*") static WebElement testi_email_M;
	public @FindBy(xpath = "//div[contains(text(), 'Company Logo*')]//p") static WebElement testi_attachcmpnylogo_M;
	// Test
	public @FindBy(xpath = "//div[contains(text(), 'Company Logo*')]//p/input") static WebElement testi_attachcmpnylogo_test_M;

	public @FindBy(xpath = "//div[contains(text(), 'Profile Picture')]//p/input") static WebElement testi_attachprofilepic_M;
	public @FindBy(id = "Comments*(maximum 250 characters)") static WebElement testi_comments_M;
	public @FindBy(xpath = "//button[contains(@class, 'btn-add-testimonial')]") static WebElement testi_submitbtn_M;
	public @FindBy(xpath = "//button[contains(@class, 'confirmation-button')]") static WebElement testi_confirmYes_Btn;
	public @FindBy(xpath = "//div[@class='tooltip-inner']") static WebElement testi_tooltip_M;
	public @FindBy(xpath = "//img[@class='card-img']") static WebElement testi_profilepic_M;

	// View Testimonial
	public @FindBy(xpath = "//*[aria-hidden='false']") static WebElement testimonial_View;
	public @FindBy(xpath = "//*[contains(@class, 'testimonialsName')]") static WebElement testimonial_PartnerName;
	public @FindBy(xpath = "//*[contains(@class, 'testimonialsDesignation')]") static WebElement testimonial_PartnerDesignation;
	public @FindBy(xpath = "//*[contains(@class, 'testimonialsDescription')]") static WebElement testimonial_PartnerDesc;

	// Testimonial End

	// Remarks
	public @FindBy(xpath = "//legend[text()='Remarks']/following::div/textarea") static WebElement Remarks;
	public @FindBy(xpath = "(//*[@class='btn btn-primary'])[2]") static WebElement ApproverSubmit;

	// Update Bank details
	public @FindBy(xpath = "//button[text() = 'Financial']") static WebElement MyProfileFinancial_Tab;
	public @FindBy(xpath = "//button[text() = 'Statutory Details']") static WebElement MyProfileStatutory_Tab;
	public @FindBy(xpath = "//button[text() = 'Bank details']") static WebElement MyProfileBankDetails_Tab;
	public @FindBy(xpath = "//*[contains(text(),'Add More Bank Details')]") static WebElement MyProfileBankAdd_icon;
	public @FindBy(xpath = "//button/*[@title='Edit']") static WebElement MyProfileBankEdit_icon;
	public @FindBy(id = "Payment in favour of") static WebElement BankDetailsPaymentFavour_txt;
	public @FindBy(xpath = "(//*[text()='Bank Name'])[2]//following::select") static WebElement BankName_DD;
	public @FindBy(xpath = "(//*[text()='Bank Name'])[1]//following::select") static WebElement BankNameAdmin_DD;
	public @FindBy(id = "IFSC Code") static WebElement BankIFSCCode_txt;
	public @FindBy(id = "Swift Code") static WebElement BankSwiftCode_txt;
	public @FindBy(id = "IBAN Code") static WebElement BankIBANCode_txt;
	public @FindBy(id = "Account Number") static WebElement BankAccNo_txt;
	public @FindBy(id = "Payment Confirmation Mail Id") static WebElement BankEmailId_txt;
	public @FindBy(xpath = "//p[contains(text(), 'Add Files')]/input") static WebElement BankDetailsFileAttachment_Btn;
	public @FindBy(xpath = "(//p[contains(text(), 'Add Files')]/input)[6]") static WebElement BankDetailsFileCustomerAttachment_Btn;
	public @FindBy(xpath = "//button[text() = 'Update']") static WebElement DetailsUpdate_Btn;
	public @FindBy(xpath = "//button[text() = 'Save']") static WebElement DetailsSave_Btn;
	public @FindBy(xpath = "//legend[text()='Account Category']//following::select[1]") static WebElement Account_Category_DD;
	public @FindBy(xpath = "//legend[text()='Account Category']//following::select[2]") static WebElement Account_Type_DD;
	public @FindBy(xpath = "//legend[text()='Account Category']//following::select[3]") static WebElement Payment_Mode_DD;
	public @FindBy(xpath = "//table//tbody") static List<WebElement> Bank_Details_TR;
	public @FindBy(xpath = "//table//tbody//tr") static List<WebElement> Bank_Status_TT;

	public @FindBy(xpath = "//*[@class='empanel-modal-close']//following::img") static WebElement Empanelment_PopupClose;
	public @FindBy(xpath = "//*[@class='modal-body']//following::img") static WebElement Modal_Body_PopupClose;
	public @FindBy(xpath = "//button[@aria-label='Close' and @class='close']") static WebElement Tracking_PopupClose;

	
	// GST Details
	public @FindBy(xpath = "//button[text() = 'GST Details']") static WebElement GSTDetails_Tab;
	public @FindBy(xpath = "//p[text() = 'Remaining GST List']") static WebElement RemainingGSTList_L;
	public @FindBy(xpath = "//*[contains(@class, 'edit-icon')]") static WebElement GSTEdit_Icon;
	public @FindBy(xpath = "//p[text() = 'Partner Reg no.']//following::p[1]") static WebElement PartnerRegNo_L;
	public @FindBy(xpath = "//p[text() = 'Vendor name']//following::p[1]") static WebElement VendorName_L;
	public @FindBy(xpath = "//p[text() = 'GST country']//following::p[1]") static WebElement GSTCountry_L;
	public @FindBy(xpath = "//p[text() = 'GST State']//following::select[1]") static WebElement GSTState_dd;
	public @FindBy(xpath = "//label/*[text() = 'Single Registration']") static WebElement SingleReg_radio;
	public @FindBy(id = "GST Identification no.") static WebElement GSTNo_TB;
	public @FindBy(xpath = "//*[text() = 'GST registration date']//following::input[1]") static WebElement GStRegDate_Input;
	public @FindBy(xpath = "(//*[text() = 'GST registration date']//following::span[text() = '1'])[1]") static WebElement GStRegDateSelection_Date;
	public @FindBy(xpath = "//*[text() = 'GST Effective From']//following::input[1]") static WebElement GStEffectiveFrom_Input;
	public @FindBy(xpath = "//*[text() = 'GST Effective From']//following::span[text() = '1'][1]") static WebElement GStEffectiveFromSelection_Date;
	public @FindBy(xpath = "//*[@id= 'Threshold turnover limit']") static WebElement GStThreshHoldLimit;
	public @FindBy(xpath = "//p[text() = 'Type of Dealers']//following::select[1]") static WebElement GSTTypeofDealers;
	public @FindBy(xpath = "//*[@id = 'gstDocumentId']//following::input[1]") static WebElement GStFileUpload_Btn;
	public @FindBy(xpath = "//*[@id = 'gstDocumentId']//following::li/a[1]") static WebElement GStAttachmentFileName_Label;
	public @FindBy(xpath = "//span[text() = 'Save GST Details']") static WebElement GStSaveBTN;
	public @FindBy(xpath = "//button[text() = 'Ok']") static WebElement GStSaveOKBTN;
	public @FindBy(xpath = "//span[text() = 'Update GST Details']") static WebElement GStUpdateBTN;
	public @FindBy(xpath = "//button[text() = 'Submit For Financial Approval']") static WebElement GStApprovalBTN;
	public @FindBy(xpath = "//input[@placeholder='Search gst number']") static WebElement GSTSearchTB;
	public @FindBy(xpath = "//button[@aria-label='Close']") static WebElement GSTAddCloseBTN;
	public @FindBy(xpath = "//div[@role='document']") static WebElement GSTAddPopup;
	public @FindBy(xpath = "(//table)[1]//tr//th") static List<WebElement> GSTApprovedTH;
	public @FindBy(xpath = "(//table)[2]//tr//th") static List<WebElement> GSTUnApprovedTH;
	public @FindBy(xpath = "(//table//tbody)[1]//tr") static List<WebElement> GSTApprovedTR;
	public @FindBy(xpath = "(//table//tbody)[2]//tr") static List<WebElement> GSTUnApprovedTR;

	public @FindBy(xpath = "//button[text() = 'ok']") static WebElement GStTrackStatusOkBTN;
	public @FindBy(xpath = "//button[text() = 'APPROVE']") static WebElement AApprovalBTN;
	public @FindBy(xpath = "//button[text() = 'REJECT']") static WebElement ARejectBTN;
	public @FindBy(xpath = "//button[text() = 'SEND BACK']") static WebElement ASendbackBTN;
	public @FindBy(id = "Remarks") static WebElement ApproveRemarks;
	public @FindBy(xpath = "//button[text() = 'Submit']") static WebElement ApproveSubmitBTN;

	// Add GST Details
	public @FindBy(xpath = "//button[text() = '+ Add more GST']") static WebElement GSTAdd_Icon;
	public @FindBy(xpath = "//p[contains(text() ,'Pending')]") static WebElement GSTPending_Icon;
	public @FindBy(xpath = "//*[@title='Filter']") static WebElement GSTFilter_Icon;
	public @FindBy(xpath = "//input[@aria-label='Document No. Filter']") static WebElement GSTFilter_TB;
	public @FindBy(xpath = "//tbody[@role='presentation']//tr[1]") static WebElement GSTRecordAvailable;
	public @FindBy(xpath = "//tbody[@role='presentation']//tr[1]//td[2]//following::a") static WebElement GSTDocRefNoLT;
	public @FindBy(id = "workflow-history") static WebElement GSTDocRefNoTrace;
	public @FindBy(xpath = "//button[text()='View']") static WebElement ViewBTN;

	// Add Contact Details & Certificates

	public @FindBy(xpath = "//button[text() = 'Technical']") static WebElement Technical_Tab;
	public @FindBy(xpath = "//button[text() = 'Contact Details & Certificates']") static WebElement ContactCertificate_Tab;
	public @FindBy(xpath = "(//*[contains(text(),'+Add More')])[2]") static WebElement AddMoreContactBTN;
	public @FindBy(xpath = "//*[@id = 'Name']") static WebElement ContactDetails_Name;
	public @FindBy(xpath = "//*[@id = 'Designation']") static WebElement ContactDetails_Designation;
	public @FindBy(xpath = "//legend[text() = 'Department']//following::select[1]") static WebElement ContactDetails_Department;
	public @FindBy(xpath = "//*[@id = 'Department Name']") static WebElement ContactDetails_DeptName;
	public @FindBy(xpath = "//*[@id = 'Mobile Number']") static WebElement ContactDetails_MobileNo;
	public @FindBy(xpath = "//*[@id = 'Email']") static WebElement ContactDetails_Email;
	public @FindBy(xpath = "//legend[text() = 'Contact Category']//following::select[1]") static WebElement ContactDetails_Category;
	public @FindBy(xpath = "//button[text() = 'Save']") static WebElement ContactSaveBTN;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[1]") static WebElement Contact_VStatus;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[2]") static WebElement Contact_VCategory;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[3]") static WebElement Contact_VName;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[4]") static WebElement Contact_VDesignation;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[5]") static WebElement Contact_VDepartment;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[6]") static WebElement Contact_VMobileNo;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[7]") static WebElement Contact_VEmail;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[8]") static WebElement Contact_VRemarks;
	public @FindBy(id = "techtab1") static WebElement Technical_Approval_Submit;

	public @FindBy(xpath = "//*[@aria-hidden='false']") static WebElement ContactDetailsExists;
	public @FindBy(xpath = "//*[@title='Edit']") static WebElement ContactDetails_Edit_Icon;
	public @FindBy(xpath = "//button[text() = 'Update']") static WebElement ContactUpdateBTN;
	public @FindBy(xpath = "//*[contains(text(), 'Add More Address Details')]") static WebElement AddressAddBTN;
	public @FindBy(xpath = "//*[@title='Delete']") static WebElement Details_Delete_Icon;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement Details_Delete_okBTN;

	// Financial Performance
	public @FindBy(xpath = "//button[text()='Financial Performance']") static WebElement Financial_PerformanceBTN;
	public @FindBy(xpath = "//*[contains(text(), 'Add More Financial Details')]") static WebElement AddMoreFinancial_Btn;
	public @FindBy(xpath = "//legend[text() = 'Financial Year']//following::select[1]") static WebElement Financial_Year;
	public @FindBy(xpath = "//*[@id = 'Assessed turnover over (lakhs)']") static WebElement Asset_TurnOver;
	public @FindBy(xpath = "//*[@id = 'Asset value (lakhs)']") static WebElement Asset_Value;
	public @FindBy(xpath = "//*[@id = 'Gross Profit (lakhs)']") static WebElement Gross_Profit;
	public @FindBy(xpath = "//*[@id = 'Net Profit (lakhs)']") static WebElement Net_Profit;
	public @FindBy(xpath = "//*[@id = 'RoA']") static WebElement RoA;
	public @FindBy(xpath = "//*[@id = 'RoCE']") static WebElement RoCE;
	public @FindBy(xpath = "(//*[contains(text(), 'Add Files')])//following::input") static WebElement Attach_Documents;
	public @FindBy(xpath = "//button[text()='Save']") static WebElement Financial_SaveBTN;

	// Add Branch
	public @FindBy(xpath = "//*[text()='arrow_drop_down']") static WebElement Branch_Type_Arr;
	public @FindBy(xpath = "//p[contains(@class,'action-text') and contains(text(),'Created')]") static WebElement Branch_Created_L;
	public @FindBy(xpath = "//*[text()='New Branch']") static WebElement Branch_Type_New;
	public @FindBy(xpath = "//*[contains(text(), 'Branch Details')]") static WebElement BranchDetails_Icon;
	public @FindBy(xpath = "//*[contains(text(), '+Add Branch')]") static WebElement AddBranchDetails_BTN;
	public @FindBy(xpath = "//legend[text() = 'Partner Type']//following::select[1]") static WebElement Partner_Type;
	public @FindBy(xpath = "//*[@id = 'Branch Name']") static WebElement Branch_NameTxt;
	public @FindBy(xpath = "//legend[text() = 'Street']//following::input[1]") static WebElement Branch_AddressTxt;
	public @FindBy(xpath = "//legend[text() = 'Country']//following::select[1]") static WebElement Branch_CountryDD;
	public @FindBy(xpath = "//legend[text() = 'State']//following::select[1]") static WebElement Branch_StateDD;
	public @FindBy(xpath = "//legend[text() = 'City']//following::select[1]") static WebElement Branch_CityDD;
	public @FindBy(xpath = "//legend[text() = 'Zipcode']//following::input[1]") static WebElement Branch_ZipcodeTxt;

	// Update Branch
	public @FindBy(xpath = "//*[@title='Edit']") static WebElement Branch_Edit_Icon;
	public @FindBy(xpath = "//button[text()='Update']") static WebElement BranchUpdate_BTN;
	public @FindBy(xpath = "//button[text()='Clear']") static WebElement BranchClear_BTN;
	

	// Submit Branch Approval
	public @FindBy(xpath = "//*[text()='Submit']") static WebElement BranchSubmitApproval_BTN;

	public @FindBy(xpath = "//legend[text() = 'Coordination Person Name']//following::input[1]") static WebElement Coordination_NameTxt;
	public @FindBy(xpath = "//legend[text() = 'Designation']//following::input[1]") static WebElement DesignationTxt;
	public @FindBy(xpath = "//legend[text() = 'Mobile Number']//following::input[1]") static WebElement MobileNoTxt;
	public @FindBy(xpath = "(//div[@class='modal-body']//fieldset//input[@type='text'])[6]") static WebElement EmailTxt;
	public @FindBy(xpath = "//*[text()='Submit']") static WebElement BranchSubmitBTN;
	public @FindBy(xpath = "//button[text()='Save as Draft']") static WebElement BranchSaveDraftBTN;
	public @FindBy(xpath = "//div[@class='modal-body']//button[text()='Yes']") static WebElement Branch_Submit_Yes_BTN;

	// Partner Registration
	// KYP Details
	public @FindBy(xpath = "(//*[@class = 'partner-registration-heading py-3'])/child::span") static WebElement Parnter_Registration_Header_Title;
	public @FindBy(xpath = "//button[text() = 'REGISTER']") static WebElement Parnter_RegistrationBTN;
	public @FindBy(xpath = "//legend[text()= 'Country *']//following::select") static WebElement Parnter_Registration_Country;
	public @FindBy(xpath = "//legend[text()= 'National ID *']//following::select") static WebElement Parnter_Registration_Nationality;
	public @FindBy(xpath = "//*[@id = 'Organization Name*']") static WebElement Parnter_Registration_OrgName;
	public @FindBy(xpath = "//legend[text()= 'PAN*']//following::input") static WebElement Parnter_Registration_PANNo;
	public @FindBy(xpath = "//div[@class='col verify-col pl-3']/child::button") static WebElement Parnter_Registration_PANNoVerify;
	public @FindBy(xpath = "//p[@class='verify-btn-success") static WebElement Parnter_Registration_PANNoVerified;
	public @FindBy(xpath = "//table//tbody//a") static WebElement Email_Verification_Confirmation;

	// Contact Details
	public @FindBy(xpath = "(//img[@data-v-1b99b65c])[3]") static WebElement Parnter_Registration_ContactDetails;
	public @FindBy(xpath = "//*[@id = 'Coordination Person Name*']") static WebElement Parnter_Registration_CoordName;
	public @FindBy(xpath = "//*[@id = 'Designation*']") static WebElement Parnter_Registration_Desg;
	public @FindBy(xpath = "//*[@name = 'Website']") static WebElement Parnter_Registration_Website;
	public @FindBy(xpath = "//*[@id = 'Mobile Number*']") static WebElement Parnter_Registration_MobNo;
	public @FindBy(xpath = "//*[@id = 'Email*']") static WebElement Parnter_Registration_Email;
	public @FindBy(xpath = "//input[@placeholder='Enter OTP']") static WebElement Parnter_Registration_EnterEmailOTP;

	public @FindBy(xpath = "//button[text() = 'Send OTP to Email']") static WebElement Parnter_Reg_OTP_EMail;
	public @FindBy(xpath = "//button[text() = 'Verify']") static WebElement Parnter_Reg_OTP_EMail_Verify;
	// Business Profile
	public @FindBy(xpath = "(//img[@data-v-1b99b65c])[4]") static WebElement Parnter_Registration_BusinessDetails;
	public @FindBy(xpath = "//legend[text() = 'Partner For *']//following::select") static WebElement Parnter_Registration_PartnerFor;
	// Primary Category
	public @FindBy(xpath = "//legend[text() = 'Primary Business *']//following::select") static WebElement Parnter_Registration_PrimaryBus;
	public @FindBy(xpath = "//legend[text() = 'Business Type*']//following::select") static WebElement Parnter_Registration_BusType;
	public @FindBy(xpath = "//*[@id = 'multiSelectPrimaryCategory']") static WebElement Parnter_Registration_PrimaryCategory;
	public @FindBy(xpath = "//*[@id = 'multiSelectPrimarySubCategory']") static WebElement Parnter_Registration_PrimarySubCategory;
	public @FindBy(xpath = "//span[text() = 'Key Material*']//following::select") static WebElement Parnter_Registration_KeyCat;
	// Secondary Category
	public @FindBy(xpath = "//legend[text()= 'Secondary Business']//following::select") static WebElement Parnter_Registration_SecondaryBus;
	public @FindBy(xpath = "(//*[@id= 'multiSelectPrimarySubCategory'])[2]") static WebElement Parnter_Registration_SecBusType;
	public @FindBy(xpath = "//*[@id='multiSelectSecondaryCategory']//span") static WebElement Parnter_Registration_SecCategory;
	public @FindBy(xpath = "//span[contains(text(),'Key Material*')]") static WebElement Parnter_Reg_SecCategoryLabel;
	public @FindBy(xpath = "//*[@id = 'multiSelectSecondarySubCategory']") static WebElement Parnter_Registration_secSubCategory;

	// Credentials
	public @FindBy(xpath = "(//img[@data-v-1b99b65c])[5]") static WebElement Parnter_Registration_credentials;
	public @FindBy(xpath = "//input[@name = 'UserName']") static WebElement Parnter_Registration_UserName;
	public @FindBy(xpath = "//input[@name = 'Password']") static WebElement Parnter_Registration_Password;
	public @FindBy(xpath = "//input[@name = 'Confirm Password']") static WebElement Parnter_Registration_ReenterPassword;
	public @FindBy(xpath = "//input[@name = 'Terms and Conditions']") static WebElement Parnter_Registration_TermsandConditions;
	public @FindBy(xpath = "//*[contains(text(),'Register')]") static WebElement Parnter_Registration_BTN;

	// Common for Registration
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[1]") static WebElement Regbusinesscategorysearch_TB;
	public @FindBy(xpath = "(//span/parent::li)[1]") static WebElement Regbusinesscategory_firstindex_DD;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[2]") static WebElement RegbusinessSubcategorysearch_TB;
	public @FindBy(xpath = "(//span/parent::li)[2]") static WebElement RegbusinessSubcategory_firstindex_DD;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[3]") static WebElement RegbusinessSeccTypesearch_TB;
	public @FindBy(xpath = "(//span/parent::li)[3]") static WebElement RegbusinessSeccBusinessTypeList_firstindex_DD;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[4]") static WebElement RegbusinessSeccategorysearch_TB;
	public @FindBy(xpath = "(//span/parent::li)[4]") static WebElement RegbusinessSeccategory_firstindex_DD;
	public @FindBy(xpath = "(//input[@placeholder='Search...'])[5]") static WebElement RegbusinessSecSubcategorysearch_TB;
	public @FindBy(xpath = "(//span/parent::li)[5]") static WebElement RegbusinessSecSubcategory_firstindex_DD;

	// Validate OTP
	public @FindBy(xpath = "(//*[text()='Validate OTP'])/following::input") static WebElement Reg_Mobile_OTP_Verify;
	public @FindBy(xpath = "//button[text() = 'VERIFY']") static WebElement Reg_OTP_Mobile_VerifyBTN;
	public @FindBy(xpath = "//div[text() = 'Reset']") static WebElement Reg_ResetBTN;

	// Common
	public @FindBy(xpath = "//html") static WebElement initialnode;
	public @FindBy(xpath = "//*[@class='px-3']") static WebElement formclick;
	public @FindBy(xpath = "//eipmessagebox//p[text()='Invalid Credential']") static WebElement Login_Error_Popup;

	// Partner Feedback

	public @FindBy(xpath = "//h4[@class='sub-heading']") static WebElement Partner_Number;
	public @FindBy(xpath = "//span[text() = 'Partner Feedback']") static WebElement Partner_Feedback;
	public @FindBy(xpath = "//legend[text() = 'Job Details']//following::select") static WebElement JobDetails_DD_PF;
	public @FindBy(xpath = "//button[text() = 'Projectwise']") static WebElement ProjectWiseBTN_PF;
	public @FindBy(xpath = "//button[text() = 'Orderwise']") static WebElement OrderWiseBTN_PF;
	public @FindBy(xpath = "//button[contains(text(),'Give Feedback')]") static WebElement GiveFeedBackBTN;
	public @FindBy(xpath = "//*[text()='Job Code']//following::p[2]") static WebElement JobCode_PF;
	public @FindBy(xpath = "//*[text()='Job Name']//following::p[2]") static WebElement JobName_PF;
	public @FindBy(xpath = "//input[@id='Name']") static WebElement Name_PF;
	public @FindBy(xpath = "//input[@id='Designation']") static WebElement Designation_PF;
	public @FindBy(xpath = "//input[@id='Email']") static WebElement Emailid_PF;
	public @FindBy(xpath = "//input[@id='Mobile Number']") static WebElement MobNo_PF;
	public @FindBy(xpath = "(//input[@value= 'Very Satisfied'])[1]") static WebElement FirstQue_PF;
	public @FindBy(xpath = "(//input[@value= 'Very Satisfied'])[2]") static WebElement SecondQue_PF;
	public @FindBy(xpath = "(//input[@value='5'])[1]") static WebElement ThirdQue_1_PF;
	public @FindBy(xpath = "(//input[@value='4'])[2]") static WebElement ThirdQue_2_PF;
	public @FindBy(xpath = "(//input[@value='3'])[3]") static WebElement ThirdQue_3_PF;
	public @FindBy(xpath = "(//input[@value='2'])[4]") static WebElement ThirdQue_4_PF;
	public @FindBy(xpath = "(//input[@value='1'])[5]") static WebElement ThirdQue_5_PF;
	public @FindBy(xpath = "(//input[@value='3'])[6]") static WebElement FourthQue_1_PF;
	public @FindBy(xpath = "(//input[@value='4'])[7]") static WebElement FourthQue_2_PF;
	public @FindBy(xpath = "(//input[@value='5'])[8]") static WebElement FourthQue_3_PF;
	public @FindBy(xpath = "//*[contains(text(),'Issue Resoulution Experience')]//child::img") static WebElement IRE_PF;
	public @FindBy(xpath = "(//input[@value='No'])[1]") static WebElement IRE_1_PF;
	public @FindBy(xpath = "(//input[@value='Very Satisfied'])[3]") static WebElement IRE_2_PF;
	public @FindBy(xpath = "(//input[@value='Satisfied'])[4]") static WebElement IRE_3_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[1]") static WebElement IRE_1TA_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[2]") static WebElement IRE_2TA_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[3]") static WebElement IRE_3TA_PF;
	public @FindBy(xpath = "//*[contains(text(),'Communication')]//child::img") static WebElement Communication_PF;
	public @FindBy(xpath = "(//input[@value='Satisfied'])[5]") static WebElement Communication_1_PF;
	public @FindBy(xpath = "(//input[@value='Very Satisfied'])[6]") static WebElement Communication_2_PF;
	public @FindBy(xpath = "(//input[@value='Yes'])[2]") static WebElement Communication_3_PF;
	public @FindBy(xpath = "(//input[@value='No'])[3]") static WebElement Communication_4_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[4]") static WebElement Communication_1TA_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[5]") static WebElement Communication_2TA_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[6]") static WebElement Communication_3TA_PF;
	public @FindBy(xpath = "(//textarea[@id='Remarks'])[7]") static WebElement Communication_4TA_PF;
	public @FindBy(xpath = "//*[contains(text(),'General')]//child::img") static WebElement General_PF;
	public @FindBy(xpath = "(//input[@value='Yes, I will add my contact details below'])") static WebElement General_1_PF;
	public @FindBy(xpath = "(//input[@id='Name'])[2]") static WebElement General_1Name_PF;
	public @FindBy(xpath = "(//input[@id='Designation'])[2]") static WebElement General_1Designation_PF;
	public @FindBy(xpath = "//input[@id='Email ID']") static WebElement General_1Emailid_PF;
	public @FindBy(xpath = "(//input[@id='Mobile Number'])[2]") static WebElement General_1MobNo_PF;
	public @FindBy(xpath = "(//input[@value='Yes'])[4]") static WebElement General_2_PF;
	public @FindBy(xpath = "(//input[@id='Name'])[3]") static WebElement General_2Name_PF;
	public @FindBy(xpath = "(//input[@id='Designation'])[3]") static WebElement General_2Designation_PF;
	public @FindBy(xpath = "(//input[@id='Email ID'])[2]") static WebElement General_2Emailid_PF;
	public @FindBy(xpath = "(//input[@id='Mobile Number'])[3]") static WebElement General_2MobNo_PF;
	public @FindBy(xpath = "//button[contains(text(),'Save as Draft')]") static WebElement PF_SaveDraftBTN;
	public @FindBy(xpath = "//button[text()='Submit Feedback']") static WebElement PF_SubmitFeedbackBTN;
	public @FindBy(xpath = "//p[@class='text-center document-number-text p-0 m-0']") static WebElement PF_Draft_DocumentNo;

	// Partner Status Update
	public @FindBy(xpath = "//*[@title='Access Based Menu']") static WebElement Access_Based_Menu;
	public @FindBy(xpath = "//*[text()='Business Apps']") static WebElement Business_Apps_Menu;
	public @FindBy(xpath = "//*[text()='Partner Portal']") static WebElement Partner_portal_Menu;
	public @FindBy(xpath = "//*[text()='Partner Performance Evaluation']") static WebElement Partner_performance_Evaluation;
	public @FindBy(xpath = "//*[text()='Partner WorkBench']") static WebElement Partner_Workbench_Menu;
	public @FindBy(xpath = "//*[contains(text(),'Vendor Master & Forensics')]") static WebElement VendorMaster_Menu;
	public @FindBy(xpath = "//input[@placeholder='Minimum 5 characters']") static WebElement SearchTB;
	public @FindBy(xpath = "(//button[text()='View Profile'])[1]") static WebElement ViewProfileBTN;
	public @FindBy(xpath = "(//div[contains(@class,'row')])[1]//div[contains(@class,'col-12')]") static List<WebElement> ProfileInfo;
	public @FindBy(xpath = "//select[@placeholder='select action']") static WebElement adminActionDD;
	public @FindBy(xpath = "//span[contains(text(),'Admin Action')]//preceding-sibling::select") static WebElement adminActionLB;
	public @FindBy(xpath = "//div[text()='Select Status']//following::select") static WebElement partnerStatusDD;
	public @FindBy(xpath = "//*[@class='calendar-icon']//following::input[@type='text']") static WebElement DatepickerTB;
	public @FindBy(xpath = "(//span[@class='cell day selected today']//following-sibling::span)[1]") static WebElement Date_pickerDP;
	public @FindBy(xpath = "//textarea[@placeholder='Max 500 characters']") static WebElement StatusRemarksTA;
	public @FindBy(xpath = "//*[contains(text(),'Add Files')]//input") static WebElement StatusFileAttachTB;
	public @FindBy(xpath = "//button[text()='Submit']") static WebElement StatusSubmitBTN;
	public @FindBy(xpath = "//i[@id='profiledropdownbtn']") static WebElement LogoutImgBTN;
	public @FindBy(xpath = "//span[@class='ml-1' ]//img") static WebElement LogoutImgBTN1;
	public @FindBy(xpath = "//a[text()='Sign Out']") static WebElement SignOutBTN;
	public @FindBy(xpath = "//*[@id='profiledropdownbtn']") static WebElement ProfileImgBTN;
	public @FindBy(xpath = "(//*[@id='workflow-history'])[2]") static WebElement documentSearchBTN;
	public @FindBy(xpath = "(//*[@id='workflow-history'])[1]") static WebElement documentSearch1BTN;
	public @FindBy(xpath = "(//button[text()='View'])[1]") static WebElement viewDocumentBTN;
	public @FindBy(xpath = "(//button[text()='Trace'])[1]") static WebElement TraceDocumentBTN;
	public @FindBy(xpath = "//*[contains(text(),'Payment in Favour of')]//following::input") static WebElement updatePaymentinfavourof;
	public @FindBy(xpath = "(//*[contains(text(),'Account Holder Name:')]//following::span)[1]") static WebElement ViewUpdatedAccountHolderName;
	public @FindBy(xpath = "//*[contains(text(),'Address line')]//following::input") static WebElement updateAddressLine;
	public @FindBy(xpath = "(//*[contains(text(),'State')]//following::select)[1]") static WebElement updateState;
	public @FindBy(xpath = "(//*[contains(text(),'State')]//following::select)[2]") static WebElement updateCity;
	public @FindBy(xpath = "//*[contains(text(),'Zip Code')]//following::input") static WebElement updateZipcode;
	public @FindBy(xpath = "(//*[contains(text(),'Registered Office Address:')]//following::div)[1]") static WebElement ViewUpdatedRegisteredAddress;
	public @FindBy(xpath = "//span[@title='Customer Registration']") static WebElement CustomerRegistrationLabel;
	public @FindBy(xpath = "//span[contains(text(),'Add New Customer')]") static WebElement AddCustomerBTN;
	public @FindBy(xpath = "(//fieldset//select)[1]") static WebElement CountryDD;
	public @FindBy(xpath = "//input[@id='PAN Number/TAN number']") static WebElement PANorTANNoTB;
	public @FindBy(xpath = "(//fieldset//select)[2]") static WebElement CompanyDD;
	public @FindBy(xpath = "//input[@id='Customer Name']") static WebElement CustomerNameTB;
	public @FindBy(xpath = "//input[@id='Company Registration Number']") static WebElement CompanyRegistrationNOTB;
	public @FindBy(xpath = "(//fieldset//select)[3]") static WebElement SectorDD;
	public @FindBy(xpath = "(//fieldset//select)[4]") static WebElement NatureDD;
	public @FindBy(xpath = "(//fieldset//select)[5]") static WebElement CustomerGroupDD;
	public @FindBy(xpath = "//input[@id='Address']") static WebElement CustomerAddressTB;
	public @FindBy(xpath = "(//fieldset//select)[7]") static WebElement StateDD;
	public @FindBy(xpath = "(//fieldset//select)[8]") static WebElement CityDD;
	public @FindBy(xpath = "//input[@id='ZipCode']") static WebElement CustomerZipCodeTB;
	public @FindBy(xpath = "(//fieldset//input[@type='radio' and @value='N'])[1]") static WebElement VANRegisterNumerRB;
	public @FindBy(xpath = "(//fieldset//input[@type='radio' and @value='Y'])[2]") static WebElement TANRegisterNumerRB;
	public @FindBy(xpath = "//input[@id='VAT Registration Number']") static WebElement VANRegisterNumberTB;
	public @FindBy(xpath = "//input[@id='GST Number']") static WebElement GSTNumberTB;
	public @FindBy(xpath = "//input[@id='TAN Number']") static WebElement TANNumberTB;
	public @FindBy(xpath = "(//input[@type='file'])[2]") static WebElement TANNumberAttachment;
	public @FindBy(xpath = "//input[@id='Last financial year ITR filing ack.number']") static WebElement ITRFilingTB;
	public @FindBy(xpath = "(//input[@type='file'])[1]") static WebElement VANRegisterNumberAttachment;
	public @FindBy(xpath = "//input[@id='Last financial year turnover']") static WebElement FinancialYearTurnOverTB;
	public @FindBy(xpath = "//input[@id='CRISIL Rating']") static WebElement CRISIL_Rating;
	public @FindBy(xpath = "(//input[@type='file'])[3]") static WebElement BalanceSheetAttachment;
	public @FindBy(xpath = "(//input[@type='file'])[4]") static WebElement ITRFilingAttachment;
	public @FindBy(xpath = "(//input[@type='file'])[5]") static WebElement RelevantDocumentAttachment;
	public @FindBy(xpath = "//button[contains(text(),'Add Bank')]") static WebElement AddBankBTN;
	public @FindBy(xpath = "//button[contains(text(),'Add Branch')]") static WebElement AddBranchBTN;
	public @FindBy(xpath = "//button[contains(text(),'Save Draft')]") static WebElement SaveDraftBTN;
	public @FindBy(xpath = "//button[contains(text(),'for Approval')]") static WebElement SubmitForApprovalBTN;
	public @FindBy(xpath = "//input[@id='workflow-history']") static WebElement SearchCustomerTB;

	public @FindBy(xpath = "(//button[text()='APPROVE'])[1]") static WebElement approveDocumentBTN;
	public @FindBy(xpath = "//*[@id='Remarks']") static WebElement statusUpdateRemarksBTN;
	public @FindBy(xpath = "//*[text()='Submit']") static WebElement statusUpdateSubmitBTN;
	public @FindBy(xpath = "(//button[text()='Ok'])[1]") static WebElement statusUpdateOkBTN;
	public @FindBy(xpath = "(//button[text()='ok'])[1]") static WebElement documentTraceOkBTN;

	
	//Update Contact
	public @FindBy(xpath = "//*[contains(text(),'Contact Person Name')]//following::input") static WebElement updateContactName;
	public @FindBy(xpath = "//*[contains(text(),'New Mobile number')]//following::input") static WebElement updateMobileNo;
	public @FindBy(xpath = "//*[contains(text(),'New email id')]//following::input") static WebElement updateEmailID;
	public @FindBy(xpath = "(//*[contains(text(),'Contact Type')]//following-sibling::div)[1]") static WebElement UpdateContactType;
	public @FindBy(xpath = "(//*[contains(text(),'Contact Type')]//following-sibling::div)[3]") static WebElement UpdateContactName;
	public @FindBy(xpath = "(//*[contains(text(),'Contact Type')]//following-sibling::div)[5]") static WebElement UpdateContactMobileNo;
	public @FindBy(xpath = "(//*[contains(text(),'Contact Type')]//following-sibling::div)[7]") static WebElement UpdateContactEmail;
	//Update Country
	public @FindBy(xpath = "//div[text()='Select Country']//following::select") static WebElement updateCountryDD;
	//Update Company Name
	public @FindBy(xpath = "//*[contains(text(),'Company Name')]//following::input") static WebElement updateCompanyName;
	public @FindBy(xpath = "//*[contains(text(),'Vendor Name')]//parent::div") static WebElement vendorName;
	public @FindBy(xpath = "//*[contains(text(),'New PAN Number')]//following::input") static WebElement updatePANNo;
	public @FindBy(xpath = "//*[contains(text(),'Remarks')]//following::textarea") static WebElement adminActionRemarks;

	//Update MSME Details
	public @FindBy(xpath = "(//table)[2]//tr//td[2]//button[contains(text(),'Edit')]") static WebElement EditMsmeDetailsPipeline;
	public @FindBy(xpath = "(//table)[1]//tr//td[2]//button[contains(text(),'Edit')]") static WebElement EditMsmeDetailsApproved;
	public @FindBy(xpath = "(//input[@type='radio' and @value='N'])[1]") static WebElement TANNo_RB_No;
	public @FindBy(xpath = "(//input[@type='radio' and @value='N'])[2]") static WebElement Aadhar_RB_No;
	public @FindBy(xpath = "(//input[@type='radio' and @value='N'])[3]") static WebElement MSME_RB_No;
	public @FindBy(xpath = "(//input[@type='radio' and @value='Y'])[1]") static WebElement TANNo_RB_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and @value='Y'])[2]") static WebElement Aadhar_RB_Yes;
	public @FindBy(xpath = "(//input[@type='radio' and @value='Y'])[3]") static WebElement MSME_RB_Yes;
	public @FindBy(id = "Tan Number") static WebElement TAN_No_TB;
	public @FindBy(id = "Aadhaar Number") static WebElement Aadhar_No_TB;
	public @FindBy(xpath = "(//*[@id='msme'])[1]") static WebElement MSME_Type_DD;
	public @FindBy(id = "MSME Number") static WebElement MSME_No_TB;
	public @FindBy(xpath = "(//*[@id='msme'])[2]") static WebElement MSME_Classification_Year_DD;

	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[1]/input[1]") static WebElement TAN_AttachDoc_Btn;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[2]/input[1]") static WebElement Aadhar_AttachDocument_Btn;
	public @FindBy(xpath = "(//p[contains(text(),'Add Files')])[3]/input[1]") static WebElement MSME_AttachDocument_Btn;
	public @FindBy(xpath = "(//div[contains(text(), 'Recommended: .pdf')])[2]//following::ul[1]//a") static WebElement Verify_Aadhar_Doc_L;
	public @FindBy(xpath = "(//div[contains(text(), 'Recommended: .pdf')])[3]//following::ul[1]//a") static WebElement Verify_MSME_Doc_L;
	
	//Tax contact details
	public @FindBy(xpath = "(//button[text()='Tax Contact Details'])[1]") static WebElement taxContactDetailsBTN;
	public @FindBy(id = "GST Contact Name") static WebElement taxContactNameTB;
	public @FindBy(id = "Designation") static WebElement taxContactDesignationTB;
	public @FindBy(id = "GST Contact Number") static WebElement taxContactMobilenoTB;
	public @FindBy(id = "Email") static WebElement taxContactEmailTB;
	public @FindBy(xpath = "(//img[@title='Edit'])[1]") static WebElement taxContactEditBTN;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[1]") static WebElement taxContact_Name;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[2]") static WebElement taxContact_No;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[3]") static WebElement taxContact_Email;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[4]") static WebElement taxContact_GSTNO;
	public @FindBy(xpath = "(//div[contains(@class,'answer-heading')])[5]") static WebElement taxContact_State;
	
	//My Profile View
	public @FindBy(xpath = "//span[text()='General']") static WebElement General_View;
	public @FindBy(xpath = "//h4[text()='Organisation Details']") static WebElement Organisation_Details_View;
	public @FindBy(xpath = "//h4[text()='Bank Details']") static WebElement Bank_Details_View;
	public @FindBy(xpath = "//h4[text()='Credentials']") static WebElement Credentails_View;
	public @FindBy(xpath = "//h4[text()='Partnership Avenues']") static WebElement Partnership_Avenues_View;
	public @FindBy(xpath = "//span[text()='Financial']") static WebElement Financial_View;
	public @FindBy(xpath = "//h4[text()='Financial Strength']") static WebElement Financial_Strength_View;
	public @FindBy(xpath = "//span[text()='Quality']") static WebElement Quality_View;
	public @FindBy(xpath = "//h4[text()='Control System']") static WebElement Control_System_View;
	public @FindBy(xpath = "//h4[text()='Certification']") static WebElement Certification_View;
	public @FindBy(xpath = "//span[text()='Infra Production']") static WebElement Infra_Production_View;
	public @FindBy(xpath = "//h4[text()='Infrastructure']") static WebElement Infrastructure_View;
	public @FindBy(xpath = "//h4[text()='Capacity']") static WebElement Capactity_View;
	public @FindBy(xpath = "//span[text()='HSE']") static WebElement HSE_View;
	public @FindBy(xpath = "//h4[text()='Awards and Certifications']") static WebElement Awards_Certification_View;
	public @FindBy(xpath = "//h4[text()='Best Practices']") static WebElement Best_Practices_View;
	public @FindBy(xpath = "//h4[text()='Sustainability']") static WebElement Sustainability_View;
	public @FindBy(xpath = "//h4[text()='Statutory']") static WebElement Statutory_View;
	public @FindBy(xpath = "//span[text()='IT']") static WebElement IT_Heading_View;
	public @FindBy(xpath = "//h4[text()='IT']") static WebElement IT_View;
	public @FindBy(xpath = "//span[text()='Manpower']") static WebElement ManPower_View;
	public @FindBy(xpath = "//h4[text()='Workforce Details']") static WebElement Workforce_Details_View;
	public @FindBy(xpath = "//h4[text()='Statutory Compliance']") static WebElement Statutory_Compilance_View;
	public @FindBy(xpath = "//span[text()='Sustainability']") static WebElement Sustainability_Heading_View;
	public @FindBy(xpath = "//h4[text()='Sustainability']") static WebElement Sustainability_ViewTT;
	public @FindBy(xpath = "//span[text()='Attachments']") static WebElement Attachments_View;
	public @FindBy(xpath = "//h4[text()='General']") static WebElement General_ViewTT;
	public @FindBy(xpath = "//div[@class='organisationDetail']//div[@class='col-4']") static List<WebElement> OrganizationDTHView;
	public @FindBy(xpath = "//div[@class='organisationDetail']//div[@class='col-sm']") static List<WebElement> OrganizationDTDView;
	public @FindBy(xpath = "(//table)[1]//thead//tr//th") static List<WebElement> Table1DetailsTHView;
	public @FindBy(xpath = "(//table)[1]//tbody//tr") static List<WebElement> Table1DetailsTRView;
	public @FindBy(xpath = "(//table)[2]//thead//tr//th") static List<WebElement> Table2DetailsTHView;
	public @FindBy(xpath = "(//table)[2]//tbody//tr") static List<WebElement> Table2DetailsTRView;
	public @FindBy(xpath = "(//table)[3]//thead//tr//th") static List<WebElement> Table3DetailsTHView;
	public @FindBy(xpath = "(//table)[3]//tbody//tr") static List<WebElement> Table3DetailsTRView;
	public @FindBy(xpath = "//div[@class='col-sm inner-title']") static WebElement PartnershipAvenuesQue2;
	public @FindBy(xpath = "//div[@class='col-sm text-left']") static WebElement PartnershipAvenuesAns2;
	public @FindBy(xpath = "//div[contains(@class,'inner-title')]") static List<WebElement> QuestionDiv;
	public @FindBy(xpath = "//div[@class='col-1 text-left']") static List<WebElement> AnswerDiv;
	public @FindBy(xpath = "//div[@class='col-sm text-left']//child::a") static List<WebElement> Answer1Div;
	public @FindBy(xpath = "//div[@class='col-sm text-left']//div[@class='col-sm text-left']//child::span") static List<WebElement> Answer2Div;

	// Common Error
	@FindBy(how = How.XPATH, using = "(//eipmessagebox//h1)[1]")
	public static WebElement ErrorAlert;

	@FindBy(how = How.XPATH, using = "(//eipmessagebox//p)[1]")
	public static WebElement ErrorAlertText;

	@FindBy(how = How.XPATH, using = "(//eipmessagebox//button)[1]")
	public static WebElement AcceptAlertR;

}
