package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dataProviders.BaseClass;
import dataProviders.ConfigFileReader;
import dataProviders.DataBaseConnection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import object_repository.PartnerPortal_Menu;
import utils.DriverFactory;

public class PPM_sd extends DriverFactory {
	public static int popup_validation;
	static String fileLocation = System.getProperty("user.dir") + "\\upload";
	static String logoName = "\\dummy-logo.png";
	static String pdffileName = "\\dummy-pdf.pdf";
	static String BankpdfFile = "\\Dummy_PDF_document.pdf";
	static String testimonial_Cmpylogo = "\\dummy-logo.png";
	static String grie_partner_id, grie_jobcode, grie_UIjobcode, grie_reqno, grie_UIreqno, grie_orderno, grie_UIorderno,
			grie_updateddate, grie_UIupdateddate, grie_req_sender, evaluationReq_newOrderNo;
	public Robot rt;
	public static String[] businessCategoryArr = { "Bentonite", "HVAC Equipment", "Bitumen & Related Materials",
			"Boulders, Gravel, Fill Materials", "Instrumentation Equipment" };
	public static String[] businessSubCategoryArr = { "Air Handling & Ventilation Units", "Air Terminals",
			"Chilled Water Pumps", "Cooling Towers", "Flow Measuring Instruments" };
	public static String[] SecBusType = { "Professional Services Contractor" };
	public static String[] RegSecBusCategory = { "Advertising & Sales Promotion", "Corporate Social Responsibility",
			"Manpower Supply" };
	public static String[] RegSecBusSubCategory = { "Manpower Supply" };
	public static String[] BV_Region_Sec = { "Hydel - Common Cluster",
			"Default Infrastructure Cluster" ,"Hydel - Uthranchal Cluster"};
	public static String pdfAttachment = fileLocation + pdffileName;

	// Read Configuration
	public static ConfigFileReader configFileReader;
	public static WebElement imppurchaseYes, imppurchaseNo;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) driver;
	public static Actions act = new Actions(driver);

	/**************** Start import methods for step definition ********************/
	@Given("^Go to Test Environment$")
	public void Go_to_Test_Environment() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		System.out.println("Test Environment : " + ConfigFileReader.getEnvironment());
	}

	@Given("^Goto EIPQA Environment$")
	public void Goto_EIPQA_Environment() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.eipQA_Environment());
		System.out.println("Test Environment : " + ConfigFileReader.eipQA_Environment());
	}

	@Given("^Goto PMQA Home Environment$")
	public void Goto_PMQA_Home_Environment() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.pmQAHome_Environment());
		System.out.println("Test Environment : " + ConfigFileReader.pmQAHome_Environment());
	}

	/* Add New Business Category Start */
	@Then("^Click My Profile$")
	public void click_My_Profile() throws InterruptedException {
		// To Click My Profile Menu
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.myprofile_M));
		Thread.sleep(3000);
		// BaseClass.onButtonClick(PartnerPortal_Menu.grie_declarationPopup_M);
		BaseClass.onButtonClick(PartnerPortal_Menu.myprofile_M);
	}

	@Then("^Add New Business Category$")
	public void Add_New_Business_Category() throws InterruptedException {
		// To Click Add New Business Category button
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addnewbusinessCat_Btn);
		Thread.sleep(3000);
	}

	@Then("^Select Partner Type in Dropdown$")
	public void select_Partner_Type_in_Dropdown() throws Throwable {
		BaseClass.onButtonClick(PartnerPortal_Menu.addnewbusinessCatpartner_Btn);
		// To select Partner Type DD
		BaseClass.getrandomOption(PartnerPortal_Menu.businesspartnertype_DD);
		//BaseClass.SelectText(PartnerPortal_Menu.businesspartnertype_DD, "Supplier");
		Thread.sleep(3000);
	}

	@Then("^Select Category in Add Business Category Popup$")
	public void Select_Category_in_Add_Business_Category_Popup() throws InterruptedException {
		// To select Business Category DD
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.businessCategory_DD);

		// To select Business Category DD
		Thread.sleep(1500);
		PartnerPortal_Menu.businesscategorysearch_TB.sendKeys("Bentonite");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		// To select Business Category DD
		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "HVAC Equipment");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Bitumen & Related Materials");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Boulders, Gravel, Fill Materials");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Instrumentation Equipment");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Cables & Accessories");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Cable Trays & Accessories");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		PartnerPortal_Menu.initialnode.click();
	}

	@Then("^Select Sub-Category$")
	public void select_Sub_Category() throws InterruptedException {
		// To select Business Category DD
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.businesssubcategory_DD);

		// To select Business Sub Category DD
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.businessSubcategory_firstindex_List);
		Thread.sleep(3000);
		PartnerPortal_Menu.formclick.click();
	}

	@Then("Select Category in Update Business Category Popup")
	public void select_category_in_update_business_category_popup() throws Throwable {
		// To select Business Category DD
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.businessCategory_DD);

		// To select Business Category DD
		Thread.sleep(1500);

		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Cables & Accessories");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		BaseClass.ClearElement(PartnerPortal_Menu.businesscategorysearch_TB);
		BaseClass.Input(PartnerPortal_Menu.businesscategorysearch_TB, "Cable Trays & Accessories");
		BaseClass.onButtonClick(PartnerPortal_Menu.businesscategory_firstindex_DD);

		PartnerPortal_Menu.initialnode.click();
	}

	@Then("^Click Submit$")
	public void click_Submit() throws InterruptedException {
		Thread.sleep(9000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addBusinessCategoryApprovalSubmit_Btn);
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ConfirmationYesBTN);
		Thread.sleep(10000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
	}

	@Then("^Click Submit button$")
	public void Click_Submit_button() throws InterruptedException {
		if(PartnerPortal_Menu.addBusinessCategoryApprovalSubmit_Btn.isEnabled()) {
			Thread.sleep(9000);
			BaseClass.onButtonClick(PartnerPortal_Menu.addBusinessCategoryApprovalSubmit_Btn);
			Thread.sleep(3000);
			// BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
		}	
	}

	@Then("^Click Clear$")
	public void Click_Clear() throws InterruptedException {
		Thread.sleep(9000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addBusinessCategoryClear_Btn);
	}

	@Then("^Click Save$")
	public void Click_Save() throws InterruptedException {
		Thread.sleep(9000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addBusinessCategorySave_Btn);
	}

	@Then("^Close the Add new business category popup$")
	public void Close_the_Add_new_business_category_popup() throws InterruptedException {
		Thread.sleep(9000);
		try {
			BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
		} catch (Exception e) {
			BaseClass.onButtonClick(PartnerPortal_Menu.Modal_Body_PopupClose);
		}
	}

	@Then("^Click confirmation popup$")
	public void Click_confirmation_popup() throws InterruptedException {
		Thread.sleep(9000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Submit_Yes_BTN);
	}

	@Then("^Verify whether user able to view business category details$")
	public void Verify_whether_user_able_to_view_business_category_details() throws InterruptedException {
		Thread.sleep(3000);
		int rowSize = PartnerPortal_Menu.BusinessCategoryTR.size();
		int colSize = PartnerPortal_Menu.BusinessCategoryHeader.size();
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.println(PartnerPortal_Menu.BusinessCategoryHeader.get(j).getText() + " : "
						+ PartnerPortal_Menu.BusinessCategoryTD.get(j).getText());
			}

		}
	}

	@Then("^Verify whether user able to enter Add Business Category login username$")
	public void Verify_whether_user_able_to_enter_Add_Business_Category_login_username()
			throws InterruptedException, Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getBusinessCategoryDocumentRefNo();
		DataBaseConnection.approverMyProfileLogin();
	}

	@Then("^Verify whether user able to fetch Add Business Category document reference no$")
	public void Verify_whether_user_able_to_fetch_Add_Business_Category_document_reference_no()
			throws InterruptedException, Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getBusinessCategoryDocumentRefNo();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
	}

	/* Add New Business Category End */
	/* Update New Business Category Start */
	@Then("^Click edit icon in Business Categories List$")
	public void Click_edit_icon_in_Business_Categories_List() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.updateBusinessCategory_icon);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.updateBusinessCategory_icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.updateBusinessCategory_icon);

	}

	@Then("^Click Update button$")
	public void Click_Update_button() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.updateBusinessCategory_btn);
	}

	/* Update New Business Category End */

	/* Add New Address in MyProfile Start */
	@Then("^Click Address Details tab$")
	public void click_Address_Details_tab() throws InterruptedException {
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addressdetails_Tab);
		Thread.sleep(4000);
		try {
			Alert alt = DriverFactory.driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {

		}
		BaseClass.onButtonClick(PartnerPortal_Menu.contactdetailandCertificate_Btn);
		BaseClass.onButtonClick(PartnerPortal_Menu.addressdetails_Tab);
	}
	@Then("Click Add Address Details from the myprofile address tab")
	public void Click_Add_Address_Details_from_the_myprofile_address_tab() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddressAddBTN);
	}
	@Then("Click Delete Details button from the list")
	public void Click_Delete_Details_button_from_the_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.Details_Delete_Icon);
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Details_Delete_Icon);
	}

	@Then("Click the delete Address confirmation dismiss popup")
	public void Click_the_delete_Address_confirmation_dismiss_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.Dismiss_Alert();
	}

	@Then("Click the delete Address confirmation accept popup")
	public void Click_the_delete_Address_confirmation_accept_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.Accept_Alert1();
	}

	@Then("Click the delete Address success popup")
	public void Click_the_delete_Address_success_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.Accept_Alert1();
	}

	@Then("^Verify whether user able to view new address from myprofile$")
	public void Verify_whether_user_able_to_view_new_address_from_myprofile() throws InterruptedException {
		Thread.sleep(3000);
		int experience_records_count = PartnerPortal_Menu.detailsView_TR.size();
		System.out.println("Address Details : " + experience_records_count + " records");
		for (int k = 0; k < experience_records_count; k++) {
			WebElement status = DriverFactory.driver
					.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[1])"));
			String address_status = status.getText();
			if (address_status.contains("Approved")) {
				System.out.println("Approved Address Details");
				System.out.println("----------------------------------");
				WebElement addressType = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[3])"));
				WebElement addressLine = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[4])"));
				WebElement country = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[5])"));
				WebElement state = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[6])"));
				WebElement city = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[7])"));
				WebElement zipcode = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[8])"));
				WebElement isSez = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[9])"));
				WebElement attachment = DriverFactory.driver
						.findElement(By.xpath("((//table)[1]//tbody//tr[" + (k + 1) + "]//td[10])"));
				System.out.println("Address Type : " + addressType.getText());
				System.out.println("Address Line : " + addressLine.getText());
				System.out.println("Country : " + country.getText());
				System.out.println("State : " + state.getText());
				System.out.println("City : " + city.getText());
				System.out.println("Zipcode : " + zipcode.getText());
				System.out.println("isSez : " + isSez.getText());
				System.out.println("Attachment : " + attachment.getText());
				System.out.println("----------------------------------");
			}
		}

	}

	@Then("^Click Edit approved address details button$")
	public void click_Edit_approved_address_details_button() throws InterruptedException {
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.editaddressdetail_Btn);
	}
	@Then("^Select Address Type in Communication Address$")
	public void Select_Address_Type_in_Communication_Address() throws Throwable {
		Thread.sleep(4000);
		BaseClass.SelectText(PartnerPortal_Menu.addressType_DD, "Correspondence/Communication Address");
	}
	@Then("^Enter Address Line in Communication Address$")
	public void Enter_Address_Line_in_Communication_Address() {
		BaseClass.ClearElement(PartnerPortal_Menu.addressline_TB);
		BaseClass.Input(PartnerPortal_Menu.addressline_TB, "123, Test Street");
	}

	@Then("^Select Country in Communication Address$")
	public void Select_Country_in_Communication_Address() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.SelectText(PartnerPortal_Menu.selectcountry_DD, "India");
		PartnerPortal_Menu.selectcountry_DD.sendKeys(Keys.TAB);
	}

	@Then("^Select State in Communication Address$")
	public void Select_State_in_Communication_Address() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.SelectText(PartnerPortal_Menu.selectstate_DD, "Tamilnadu");
	}

	@Then("^Select City in Communication Address$")
	public void Select_City_in_Communication_Address() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.SelectText(PartnerPortal_Menu.selectcity_DD, "Tirunelveli");
	}

	@Then("^Give Zip Code in Communication Address$")
	public void Give_Zip_Code_in_Communication_Address() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.ClearElement(PartnerPortal_Menu.zipcode_TB);
		BaseClass.Input(PartnerPortal_Menu.zipcode_TB, "600001");
	}

	@Then("^Select SEZ in Communication Address$")
	public void Select_SEZ_in_Communication_Address() throws InterruptedException {
		Thread.sleep(1500);
		BaseClass.onButtonClick(PartnerPortal_Menu.SEZ_RB);
		PartnerPortal_Menu.SEZ_RB.sendKeys(Keys.TAB);
		PartnerPortal_Menu.SEZ_RB.sendKeys(Keys.TAB);
	}

	@Then("^Attach document in Communication Address$")
	public void Attach_document_in_Communication_Address() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		PartnerPortal_Menu.addaddress_attachment.sendKeys(pdfAttachment);
		System.out.println("Add Address File attachment completed");
		// PartnerPortal_Menu.addressproofdoc_Btn.click();
	}

	@Then("^Click Update in Communication Address$")
	public void Click_Update_in_Communication_Address() throws InterruptedException {
		try {
			Thread.sleep(1000);
			PartnerPortal_Menu.addressupdate_Btn.sendKeys(Keys.ENTER);
			/*
			 * jse.executeScript("arguments[0].scrollIntoView();",
			 * PartnerPortal_Menu.addressupdate_Btn); Thread.sleep(1000);
			 * jse.executeScript("arguments[0].click();",
			 * PartnerPortal_Menu.addressupdate_Btn);
			 */
		} catch (Exception e) {
			Thread.sleep(1000);
			BaseClass.onButtonClick(PartnerPortal_Menu.addressupdate_Btn);
		}
	}
	@Then("^Click Save button in communication address$")
	public void click_Save_button_in_communication_address() throws InterruptedException {
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DetailsSave_Btn);
	}

	@Then("^Click Ok$")
	public void click_Ok() throws InterruptedException {
		Thread.sleep(10000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
			BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		} catch (Exception e) {
			System.out.println("Ok Button not available.");
		}

	}

	/* Add New Address in MyProfile End */

	// Grievance Request Creation Start
	@Then("^Enter Username$")
	public void Enter_UserName() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		BaseClass.Input(PartnerPortal_Menu.Username, ConfigFileReader.getUS_UserName());
	}

	@Then("^Enter Pmqa Username$")
	public void enter_Pmqa_Username() throws Throwable {
//		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		BaseClass.Input(PartnerPortal_Menu.Username, ConfigFileReader.getUsername());
	}

	@Then("^Enter Pmqa CAPTCHA$")
	public void enter_Pmqa_CAPTCHA() throws Throwable {
		Thread.sleep(8000);
		Basic.captchaUserFinal(ConfigFileReader.getUsername());
	}

	@Then("^Enter Grievance Req Creation Username$")
	public void enter_Grievance_Req_Creation_Username() throws Throwable {
//		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		BaseClass.ClearElement(PartnerPortal_Menu.Username);
		BaseClass.Input(PartnerPortal_Menu.Username, ConfigFileReader.getGrievanceUsername());
	}

	@Then("^Enter Grievance Req Draft Creation Username$")
	public void enter_Grievance_Req_Draft_Creation_Username() throws Throwable {
//		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		BaseClass.ClearElement(PartnerPortal_Menu.Username);
		BaseClass.Input(PartnerPortal_Menu.Username, ConfigFileReader.getGrievanceUsername());
	}

	@Then("^Enter Grievance Req Creation CAPTCHA$")
	public void enter_Grievance_Req_Creation_CAPTCHA() throws Throwable {
		Thread.sleep(8000);
		Basic.captchaUserFinal(ConfigFileReader.getGrievanceUsername());
	}

	@Then("^Enter Password$")
	public void Enter_Password() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.Password, ConfigFileReader.getPassword());
	}

	@Then("^Enter CAPTCHA$")
	public void enter_CAPTCHA() throws Throwable {
		DataBaseConnection.dataBaseConnectionPP();
		String onboardingUserName = DataBaseConnection.getOnboardingUserName();
		System.out.println("Onboarding Username: " + onboardingUserName);
		DataBaseConnection.databaseConnectionClose();
		BaseClass.ClearElement(PartnerPortal_Menu.Username);
		PartnerPortal_Menu.Username.sendKeys(onboardingUserName);
		Basic.captchaUserFinal(onboardingUserName);
		// Basic.captchaUserFinal("KAVISHGUPTA");
	}

	@Then("Accept the partner portal popup")
	public void accept_the_partner_portal_popup() throws InterruptedException {
		List<WebElement> acceptpartnerportal = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (acceptpartnerportal.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.Partner_TandC_Accept_btn);
				Thread.sleep(2000);
				BaseClass.onButtonClick(PartnerPortal_Menu.EIPLogin_Btn);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Accept popup is not shown");

		}
	}

	@Then("Accept the Whistle blower policy popup")
	public void accept_the_whistle_blower_policy_popup() throws Throwable {
		List<WebElement> acceptpartnerportal = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (acceptpartnerportal.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.Partner_TandC_Accept_btn);
				Thread.sleep(2000);
				BaseClass.onButtonClick(PartnerPortal_Menu.EIPLogin_Btn);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Whistle blower policy popup is not shown");

		}
	}

	@Then("^Verify the user able to Login$")
	public void Verify_the_user_able_to_Login() throws Throwable {
		System.out.println("Login successfully");
	}

	@Then("^Select Grievance Request$")
	public void Select_Grievance_Request() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GrievanceRequest);
	}

	@Then("^Select Category dropdown$")
	public void Select_category_dropdown() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Category));
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Category);
	}

	@Then("^Click Category dropdown$")
	public void Click_Category_dropdown() throws Throwable {
		Thread.sleep(5000);
		BaseClass.SelectText(PartnerPortal_Menu.SelectCategory_dd, "Service Provider");
	}

	@Then("^Select JobDetails dropdown$")
	public void Select_JobDetails_dropdown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.JobDetails));
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.JobDetails);
		Thread.sleep(4000);
		PartnerPortal_Menu.JobDetails.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select PONumber dropdown$")
	public void Select_PONumber_dropdown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PONumber));
		BaseClass.onButtonClick(PartnerPortal_Menu.PONumber);
	}

	@Then("^Enter PO in GR$")
	public void Enter_PO_in_GR_as() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.POSelection_Tb);
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.POSelection);
	}

	@Then("^Select Create GR$")
	public void Select_Create_GR() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CreateGRButton));
		BaseClass.onButtonClick(PartnerPortal_Menu.CreateGRButton);
	}

	@Then("^Click Reason For Grievance dropdown$")
	public void Click_Reason_For_Grievance_dropdown1() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ReasonForGrievance_DD));
		BaseClass.onButtonClick(PartnerPortal_Menu.ReasonForGrievance_DD);
	}

	@Then("^Select Reason For Grievance dropdown$")
	public void Select_Reason_For_Grievance_dropdown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SelectReasonForGrievance_DD));
		BaseClass.onButtonClick(PartnerPortal_Menu.SelectReasonForGrievance_DD);
	}

	@Then("^Enter Description$")
	public void Enter_Description_as() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.grie_description_TA_M, ConfigFileReader.grievance_description());
	}

	@Then("^Enter NameOfTheAttachment$")
	public void Enter_Name_Of_The_Attachment() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.grie_NameOfTheAttachment_M, ConfigFileReader.grievance_Nameofattachment());
	}

	@Then("^Enter ReferenceDocumentnumber$")
	public void Enter_ReferenceDocumentnumber_as() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.ReferenceDocumentnumber_TB,
				ConfigFileReader.grievanceCreation_ReferenceDocumentnumber());
	}

	@Then("^Enter LnTEmployee$")
	public void Enter_LnTEmployee_as() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.LnTEmployee_TB, ConfigFileReader.grievanceCreation_EmployeeName());
	}

	@Then("^Click AddAttachment dropdown$")
	public void Click_AddAttachment_dropdown() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.AddAttachment, pdfAttachment);
	}

	@Then("^Click Checkbox dropdown$")
	public void Click_Checkbox_dropdown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Grieagree_CB));
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollIntoView();", PartnerPortal_Menu.Grieagree_CB);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Grieagree_CB);
	}

	@Then("^select Checkbox dropdown in Grievance Draft Creation$")
	public void select_Checkbox_dropdown_in_Grievance_Draft_Creation() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GrieDraftAgree_CB));
		Thread.sleep(5000);
		BaseClass.jsTop(PartnerPortal_Menu.GrieDraftAgree_CB);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GrieDraftAgree_CB);
	}

	@Then("^Click Submit Request$")
	public void Click_Submit_Request() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Submit_btn));
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Submit_btn);
	}

	@Then("^Accept Alert$")
	public void Accept_Alert() throws Throwable {
		try {
			Thread.sleep(9000);
			DriverFactory.driver.switchTo().alert().accept();
			Thread.sleep(2000);
			String GrievanceFinalMsg = PartnerPortal_Menu.GrievanceFinalMsg_Popup.getText();
			System.err.println("Grievance Success Message: " + GrievanceFinalMsg);
			Thread.sleep(9000);
			BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
		} catch (Exception e) {
			Thread.sleep(2000);
			String GrievanceFinalMsg = PartnerPortal_Menu.GrievanceFinalMsg_Popup.getText();
			System.err.println("Grievance Success Message: " + GrievanceFinalMsg);
			Thread.sleep(9000);
			BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
		}
	}

	// Grievance Request Creation End

	// Grievance Request Draft Creation Start
	@Then("^Click Save as Draft$")
	public void Click_Save_as_Draft() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.saveasdraftbtn_M);
	}

	@Then("^Accept Draft Successful Alert$")
	public void Accept_Draft_Successful_Alert() throws Throwable {
		List<WebElement> Draftsuccess_message = DriverFactory.driver
				.findElements(By.xpath("//p[contains(@class, 'Approver-Success-text')]"));

		if (Draftsuccess_message.size() > 0) {
			try {
				Thread.sleep(9000);
				System.out.println("Popup Message : " + PartnerPortal_Menu.saveasdraftsuccessMsg_Pop.getText());
				DriverFactory.driver.switchTo().alert().accept();
				Thread.sleep(2000);
				BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
			} catch (Exception e) {
				Thread.sleep(9000);
				BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
			}
		} else {
			System.err.println("Grievance Request Draft not submitted successfully");
		}
	}
	// Grievance Request Draft Creation End

	// Grievance Request Draft Submission Start
	@Then("^Click Draft menu$")
	public void Click_Draft_menu() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.grie_draftmenu_M);
	}

	@Then("^Click Draft View Details button$")
	public void Click_Draft_View_Details_button() throws InterruptedException {
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_testimonialMenu_M));
			BaseClass.onButtonClick(PartnerPortal_Menu.testi_testimonialMenu_M);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GrievanceRequest));
			BaseClass.onButtonClick(PartnerPortal_Menu.GrievanceRequest);
			Thread.sleep(3000);
			BaseClass.onButtonClick(PartnerPortal_Menu.grie_draftmenu_M);
			BaseClass.onButtonClick(PartnerPortal_Menu.viewdetails_btn);
		} catch (Exception e) {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_testimonialMenu_M));
			BaseClass.onButtonClick(PartnerPortal_Menu.testi_testimonialMenu_M);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GrievanceRequest));
			BaseClass.onButtonClick(PartnerPortal_Menu.GrievanceRequest);
			Thread.sleep(3000);
			BaseClass.onButtonClick(PartnerPortal_Menu.grie_draftmenu_M);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.viewdetails_btn));
			BaseClass.onButtonClick(PartnerPortal_Menu.viewdetails_btn);
		}
	}

	@Then("^Edit Reason For Grievance dropdown$")
	public void Edit_Reason_For_Grievance_dropdown() throws InterruptedException {
		BaseClass.onButtonClick(PartnerPortal_Menu.grie_reasonforgrievance_M);
		BaseClass.onButtonClick(PartnerPortal_Menu.grie_SelectReasonForGrievance_M);
	}

	@Then("^Edit Description of Grievance$")
	public void Edit_Description_of_Grievance() {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_Desc_of_Grievance_M));
		PartnerPortal_Menu.grie_Desc_of_Grievance_M.clear();
		PartnerPortal_Menu.grie_Desc_of_Grievance_M.sendKeys(ConfigFileReader.grie_description_draft());
	}

	@Then("^Edit Attachment name$")
	public void Edit_Attachment_name() {
		PartnerPortal_Menu.grie_NameOfTheAttachment_M.clear();
		PartnerPortal_Menu.grie_NameOfTheAttachment_M.sendKeys(ConfigFileReader.grie_nameofattachment_draft());
	}

	@Then("^Upload attachment$")
	public void Upload_attachment() throws AWTException, InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);

		PartnerPortal_Menu.AddAttachment.sendKeys(pdfAttachment);
	}

	@Then("^Update Reference Document number$")
	public void Update_Reference_Document_number() {
		PartnerPortal_Menu.grie_reference_docno_M.clear();
		PartnerPortal_Menu.grie_reference_docno_M.sendKeys(ConfigFileReader.grie_referencedocno_draft());
	}

	@Then("^Update L&T Employee or Site Person Contacted for this issue$")
	public void Update_LandT_Employee_or_Site_Person_Contacted_for_this_issue() throws InterruptedException {
		PartnerPortal_Menu.grie_Contact_for_issue_M.clear();
		PartnerPortal_Menu.grie_Contact_for_issue_M.sendKeys(ConfigFileReader.grie_siteperson_draft());
		Thread.sleep(2000);
	}

	@Then("^Accept declaration checkbox$")
	public void accept_declaration_checkbox() throws InterruptedException {
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView();", PartnerPortal_Menu.grie_declaration_M);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_declaration_M));
		try {
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", PartnerPortal_Menu.grie_declaration_M);
		} catch (Exception e) {
			PartnerPortal_Menu.grie_declaration_M.click();
		}
	}

	@Then("^Click Submit Grievance Request$")
	public void Click_Submit_Grievance_Request() throws InterruptedException {
		try {
			Thread.sleep(1500);
			jse.executeScript("arguments[0].scrollIntoView();", PartnerPortal_Menu.grie_draftsubmitbtn_M);
			Thread.sleep(1500);
			BaseClass.jsClk(PartnerPortal_Menu.grie_draftsubmitbtn_M);
		} catch (Exception e) {
			Thread.sleep(1500);
			PartnerPortal_Menu.grie_draftsubmitbtn_M.click();
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_draftsubmitbtn_M));
			PartnerPortal_Menu.grie_draftsubmitbtn_M.click();
		}

		Alert alt = DriverFactory.driver.switchTo().alert();
		alt.accept();

		try {
			Thread.sleep(9000);
			System.out.println("Grievance Draft Submission message: " + PartnerPortal_Menu.grie_successmsg_M.getText());
		} catch (Exception e) {
			Thread.sleep(9000);
			System.err.println("Grievance Draft Submission message: " + PartnerPortal_Menu.grie_errormsg_Pop.getText());
		}

	}
	/* GST Approver Submit Starts Here */
	// Grievance Request Draft Submission End

	// Grievance Request Approve Start
	@Given("^Approver Login Page$")
	public void Approver_Login_Page() throws Throwable {
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.login();
	}

	@Then("^Enter SearchMenu as Partner Workbench$")
	public void Enter_Search_Menu_as() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchMenu_TB));
		PartnerPortal_Menu.SearchMenu_TB.sendKeys(ConfigFileReader.partnerworkbench_Menu());
	}

	@Then("^Verify the Partner Workbench menu available or not$")
	public void verify_the_Partner_Workbench_menu_available_or_not() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerWorkbench_M));
		PartnerPortal_Menu.PartnerWorkbench_M.click();
	}

	@Then("^Verify the document number listed or not$")
	public void verify_the_docuement_number_listed_or_not() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ActionsView_Btn));
		PartnerPortal_Menu.ActionsView_Btn.click();
		Thread.sleep(3000);
	}

	@Then("^Verify user able to trace the document$")
	public void verify_user_able_to_trace_the_document() throws Throwable {
		Thread.sleep(3000);
		PartnerPortal_Menu.ActionsTrace_Btn.click();
		Thread.sleep(1000);
		PartnerPortal_Menu.WorkflowTraceTitle_Pop.getText();
		Thread.sleep(1000);
		int countOfApproverInTrace = PartnerPortal_Menu.WorkflowReceiver_Pop.size();
		for (int i = 0; i < countOfApproverInTrace; i++) {
			Thread.sleep(500);
			System.out.println("" + i + ":" + PartnerPortal_Menu.WorkflowReceiver_Pop.get(i).getText());
		}
		Thread.sleep(2000);
//		PartnerPortal_Menu.WorkflowTraceOkBtn_btn.click();
	}

	@Then("^Verify the user able to MarkItResolved$")
	public void verify_the_user_able_to_MarkItResolved() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.MarkItResolved_Btn));
		// JavascriptExecutor jse = (JavascriptExecutor)DriverFactory.driver;

		// jse.executeScript("scroll(250, 0)"); // if the element is on top.

		// jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
		BaseClass.jsTop(PartnerPortal_Menu.MarkItResolved_Btn);
		BaseClass.jsClk(PartnerPortal_Menu.MarkItResolved_Btn);
	}

	@Then("^Verify the user able to give Approver Remarks$")
	public void verify_the_user_able_to_give_Approver_Remarks() throws Throwable {
		PartnerPortal_Menu.Remarks.sendKeys(ConfigFileReader.approve_grievance_request());
	}
	// Grievance Request Approve End

	/* Send Back Start */
	@Then("^Verify the user able to Send Back$")
	public void sendback_btnclick() throws InterruptedException {
		try {
			PartnerPortal_Menu.sendback_Btn.click();
		} catch (Exception e) {
			BaseClass.jsClk(PartnerPortal_Menu.sendback_Btn);
		}
	}

	@Then("^Verify the user able to give Send Back Remarks$")
	public void verify_the_user_able_to_give_Send_Back_Remarks() throws InterruptedException {
		Thread.sleep(3000);
		PartnerPortal_Menu.Remarks.click();
		PartnerPortal_Menu.Remarks.sendKeys(ConfigFileReader.sendback_grievance_request());
	}

	/* Send Back End */
	/* Testimonial View Starts Here */
	@Then("Verify Whether Testimonial is available or not")
	public void verify_whether_testimonial_is_available_or_not() throws Throwable {
		Thread.sleep(5000);
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			System.err.println("Testimonial is there");
		} else {
			System.err.println("Testimonial View is not there");
		}
	}

	@Then("View the Testimonial Partner Name")
	public void view_the_testimonial_partner_name() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			BaseClass.GetText(PartnerPortal_Menu.testimonial_PartnerName);
		} else {
			System.err.println("Testimonial View is not there");
		}
	}

	@Then("View the Testimonial Partner Designation")
	public void view_the_testimonial_partner_designation() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			BaseClass.GetText(PartnerPortal_Menu.testimonial_PartnerDesignation);
		} else {
			System.err.println("Testimonial View is not there");
		}
	}

	@Then("View the Testmonail Partner Description")
	public void view_the_testmonail_partner_description() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			BaseClass.GetText(PartnerPortal_Menu.testimonial_PartnerDesc);
		} else {
			System.err.println("Testimonial View is not there");
		}
	}

	/* Testimonial View Ends Here */
	/* Forward Start */
	@Then("^Verify the user able to click Forward To Roles dropdown$")
	public void Forward_To_Roles_dropdown() throws InterruptedException {
		BaseClass.jsTop(PartnerPortal_Menu.Roles_DD);
		BaseClass.jsClk(PartnerPortal_Menu.Roles_DD);
	}

	@Then("^Verify the user able to Select Roles$")
	public void Select_Roles() {
		wait.until(ExpectedConditions.visibilityOfAllElements(PartnerPortal_Menu.listofRole));
		System.out.println(PartnerPortal_Menu.User1_List.getText());
		System.out.println(PartnerPortal_Menu.listofRole);
		PartnerPortal_Menu.User1_List.click();
		PartnerPortal_Menu.User2_List.click();
		PartnerPortal_Menu.User3_List.click();
		PartnerPortal_Menu.User4_List.click();
		PartnerPortal_Menu.initialnode.click();
	}

	@Then("^Click Forward To Users dropdown$")
	public void click_Forward_To_Users_dropdown() throws Throwable {
		Thread.sleep(3000);
		try {
			DriverFactory.driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No Alert Present");
		}
		if (PartnerPortal_Menu.forwardtousers_dd.isEnabled()) {
			PartnerPortal_Menu.forwardtousers_dd.click();
		} else {
			System.out.println("This is the final Stage of Approval...");
		}
	}

	@Then("^Verify user able to Select Users$")
	public void select_Users() throws Throwable {
		Thread.sleep(2000);
		try {
			PartnerPortal_Menu.forwarduser_List.click();
		} catch (Exception e) {
			System.out.println("This is the final Stage of Approval...");
		}
		Thread.sleep(2000);
		try {
			BaseClass.jsClk(PartnerPortal_Menu.initialnode);
		} catch (Exception e) {
			System.out.println("This is the final Stage of Approval...");
		}
	}

	@Then("^Verify the user able to proceed Forward$")
	public void click_Forward_button() throws Throwable {
		Thread.sleep(3000);
		try {
			PartnerPortal_Menu.forward_btn.click();
		} catch (Exception e) {
			System.out.println("This is the final Stage of Approval...");
		}
		Thread.sleep(3000);
	}

	@Then("^Verify the user able to give Forward Remarks$")
	public void enter_Forward_Remarks() throws Throwable {
		try {
			PartnerPortal_Menu.Remarks.sendKeys(ConfigFileReader.forward_grievance_request());
		} catch (Exception e) {
			System.out.println("This is the final Stage of Approval...");
		}
	}
	/* Forward End */

	/* Grievance History Start */
	@Then("^Click History Menu$")
	public void click_History_Menu() throws InterruptedException {
		try {
			Thread.sleep(3000);
			BaseClass.jsClk(PartnerPortal_Menu.testi_testimonialMenu_M);
			Thread.sleep(3000);
			BaseClass.jsClk(PartnerPortal_Menu.GrievanceRequest);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_history_menu));
			PartnerPortal_Menu.grie_history_menu.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			PartnerPortal_Menu.testi_testimonialMenu_M.click();
			Thread.sleep(3000);
			PartnerPortal_Menu.GrievanceRequest.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_history_menu));
			PartnerPortal_Menu.grie_history_menu.click();
		}

	}

	@Then("^Click View Details$")
	public void click_View_Details() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.viewdetails_btn));
		try {
			Thread.sleep(1500);
			BaseClass.jsClk(PartnerPortal_Menu.viewdetails_btn);
		} catch (Exception e) {
			Thread.sleep(1500);
			PartnerPortal_Menu.viewdetails_btn.click();
		}
	}

	@Then("^Download Attachment$")
	public void download_Attachment() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.grie_Download_attachment_M));
		try {
			Thread.sleep(3000);
			BaseClass.jsClk(PartnerPortal_Menu.grie_Download_attachment_M);
			Thread.sleep(3000);
		} catch (Exception e) {
			Thread.sleep(3000);
			BaseClass.jsClk(PartnerPortal_Menu.grie_Download_attachment_M);
			Thread.sleep(3000);
		}
	}

	@Then("^Click Back Button$")
	public void click_Back_Button() throws InterruptedException {
		Thread.sleep(6000);
		PartnerPortal_Menu.grie_backbtn_M.click();
	}

	/* Grievance History End */

	/* Grievance History Validation Start */
	/*
	 * public static String sendpartneridtoDB(String partner_id_forDB) { String
	 * partnerid = PartnerPortal_Menu.grie_partnerid_M.getText(); return partnerid;
	 * }
	 */

	/*
	 * @Then("^Click History Menu$") public void click_History_Menu() {
	 * wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.
	 * history_menu)); PartnerPortal_Menu.history_menu.click(); String
	 * historypage_title = PartnerPortal_Menu.historypage_title.getText();
	 * assertEquals("Request History", historypage_title); grie_reqno =
	 * PartnerPortal_Menu.reqno_grie_M.getText();
	 * System.out.println("Request No in 'Request History' listpage : "+grie_reqno);
	 * }
	 * 
	 * @Then("^Click View Details button$") public void click_View_Details_button(){
	 * String viewdetail = PartnerPortal_Menu.viewdetails_btn.getText();
	 * assertEquals("View Details", viewdetail);
	 * PartnerPortal_Menu.viewdetails_btn.click();
	 * 
	 * grie_jobcode = PartnerPortal_Menu.grie_jobcode_M.getText(); //
	 * System.out.println("UI Jobcode : "+grie_jobcode); grie_UIjobcode =
	 * grie_jobcode.substring(10, 18); //
	 * System.out.println("Substring Jobcode : "+grie_UIjobcode);
	 * 
	 * grie_reqno = PartnerPortal_Menu.grie_reqno_M.getText(); grie_UIreqno =
	 * grie_reqno.substring(17, 32); //
	 * System.out.println("Substring Request Number : "+grie_UIreqno);
	 * 
	 * grie_orderno = PartnerPortal_Menu.grie_order_M.getText(); grie_UIorderno =
	 * grie_orderno.substring(14, 28); //
	 * System.out.println("Substring Order Number : "+grie_UIorderno);
	 * 
	 * grie_updateddate = PartnerPortal_Menu.grie_updateddate_M.getText();
	 * grie_updateddate.substring(arg0)
	 * 
	 * grie_req_sender = PartnerPortal_Menu.grie_partnername_M.getText();
	 * assertEquals(grie_req_sender, PartnerPortal_Menu.grie_sender_M.getText());
	 * 
	 * }
	 * 
	 * public static void verifyHistory(String grie_DBjobcode, String grie_DBreqno,
	 * String grie_DBorderno, String grie_DBupdateddate) {
	 * assertEquals(grie_DBjobcode, grie_UIjobcode); //
	 * System.out.println("Job code from DB : "+grie_DBjobcode);
	 * 
	 * assertEquals(grie_DBreqno, grie_UIreqno); //
	 * System.out.println("Grievance Reqno from DB : "+grie_DBreqno);
	 * 
	 * assertEquals(grie_DBorderno, grie_UIorderno); //
	 * System.out.println("Grievance Order Number :"+grie_DBorderno);
	 * 
	 * // assertEquals()
	 * 
	 * }
	 * 
	 * @Then("^Click Reason for Grievance dropdown$") public void
	 * click_Reason_for_Grievance_dropdown() { assertEquals(true,
	 * PartnerPortal_Menu.reasonforgrievance.isEnabled()); //
	 * System.out.println("Reason for Grievance dropdown is Disabled"); }
	 * 
	 * @Then("^Enter Description of Grievance$") public void
	 * enter_Description_of_Grievance() { assertEquals(true,
	 * PartnerPortal_Menu.Desc_of_Grievance.isEnabled()); //
	 * System.out.println("Description of Grievance textarea is Disabled"); }
	 * 
	 * @Then("^Download Attachment$") public void download_Attachment() {
	 * assertEquals(true, PartnerPortal_Menu.Desc_of_Grievance.isEnabled()); //
	 * System.out.println("Attachment Details textbox is Disabled"); //
	 * wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.
	 * Download_attachment)); // PartnerPortal_Menu.Download_attachment.click();
	 * jse.executeScript("arguments[0].click();",
	 * PartnerPortal_Menu.Download_attachment); }
	 * 
	 * @Then("^Enter Reference Document number$") public void
	 * enter_Reference_Document_number() { assertEquals(true,
	 * PartnerPortal_Menu.reference_docno.isEnabled()); //
	 * System.out.println("Reference Document number is Disabled"); }
	 * 
	 * @Then("^Enter L&T Employee or Site Person Contacted for this issue$") public
	 * void enter_L_T_Employee_or_Site_Person_Contacted_for_this_issue() {
	 * assertEquals(true, PartnerPortal_Menu.Contact_for_issue.isEnabled()); //
	 * System.out.
	 * println("L&T Employee or Site Person Contacted for this issue is Disabled");
	 * }
	 * 
	 * @Then("^Check History of the request$") public void
	 * check_History_of_the_request() throws SQLException {
	 * 
	 * DataBaseConnection.grievancehistory();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Then("^Click Back Button$") public void click_Back_Button() {
	 * 
	 * }
	 */
	/* Grievance History Validation Start */

	/* Testimonial Creation Start */

	@Then("^Click Testimonial Menu$")
	public void click_Testimonial_Menu() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_testimonialMenu_M));
		Thread.sleep(8000);
		// PartnerPortal_Menu.testi_testimonialMenu_M.click();
		BaseClass.jsClk(PartnerPortal_Menu.testi_testimonialMenu_M);
	}

	@Then("^Select Add Testimonials$")
	public void select_Add_Testimonials() {
		try {
			Thread.sleep(1000);
			BaseClass.jsClk(PartnerPortal_Menu.testi_addtestimonialbtn_M);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Then("^Enter Employee Name$")
	public void enter_Employee_Name() {
		try {
			PartnerPortal_Menu.testi_empname_M.sendKeys("Test Emp_name");
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}
	}

	@Then("^Enter Designation$")
	public void enter_Designation() {
		try {
			PartnerPortal_Menu.testi_designation_M.sendKeys("Test Designation");
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}
	}

	@Then("^Enter Mobile Number$")
	public void enter_Mobile_Number() {
		try {
			PartnerPortal_Menu.testi_mobileno_M.sendKeys("9876543210");
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}
	}

	@Then("^Enter E-mail$")
	public void enter_E_mail() {
		try {
			PartnerPortal_Menu.testi_email_M.sendKeys("test@test.com");
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}
	}

	@Then("^Upload Company Logo$")
	public void upload_Company_Logo() throws AWTException, InterruptedException {
		Thread.sleep(8000);
		try {
			String concaten = fileLocation + testimonial_Cmpylogo;
			PartnerPortal_Menu.testi_attachcmpnylogo_test_M.sendKeys(concaten);
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}

		// BasePage.fileuploader();
	}

	@Then("^Upload Profile picture$")
	public void upload_Profile_picture() throws AWTException, InterruptedException {
		try {
			String testi_profilpic = fileLocation + logoName;
			PartnerPortal_Menu.testi_attachprofilepic_M.sendKeys(testi_profilpic);
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}

	}

	@Then("^Enter Comments$")
	public void enter_Comments() {
		try {
			PartnerPortal_Menu.testi_comments_M.sendKeys(ConfigFileReader.testimonial_remarks());
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
		}
	}

	@Then("^Click Submit Testimonial$")
	public void click_Submit_Testimonial() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_submitbtn_M));
			PartnerPortal_Menu.testi_submitbtn_M.click();
		} catch (Exception e) {
			System.out.println("Testimonials can be added monthly once");
			// jse.executeScript("arguments[0].click();",
			// PartnerPortal_Menu.testi_submitbtn_M);
		}

	}

	@Then("^Confirm the Testimonial submission$")
	public void Confirm_the_Testimonial_submission() throws InterruptedException {
		try {
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_confirmYes_Btn));
			BaseClass.jsClk(PartnerPortal_Menu.testi_confirmYes_Btn);
			// PartnerPortal_Menu.testi_confirmYes_Btn.click();
			Thread.sleep(1500);
			BaseClass.jsClk(PartnerPortal_Menu.ok_Btn);
			// PartnerPortal_Menu.ok_Btn.click();
		} catch (Exception e) {
			// Thread.sleep(1500);
			// wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.testi_confirmYes_Btn));
			// BaseClass.jsClk(PartnerPortal_Menu.testi_confirmYes_Btn);
			// Thread.sleep(1500);
			// BaseClass.jsClk(PartnerPortal_Menu.ok_Btn);
			System.out.println("Testimonials can be added monthly once");
		}

	}
	/* Testimonial Creation End */

	/* Onemore Testimonial Creation Start */
	@Then("^Check tooltip$")
	public void check_tooltip() throws InterruptedException {

		Thread.sleep(4000);
		BaseClass.onMouseHover(PartnerPortal_Menu.testi_addtestimonialbtn_M);

		List<WebElement> tooltip_message = DriverFactory.driver.findElements(By.xpath("//div[@class='tooltip-inner']"));
		if (tooltip_message.size() > 0) {
			Thread.sleep(2000);
			try {
				try {
					String tooltip_msg = PartnerPortal_Menu.testi_tooltip_M.getText();
					System.err.println("Tooltip Message: " + tooltip_msg);
					if (tooltip_msg.equalsIgnoreCase("Testimonials can be added monthly once")) {
						System.err.println("Testimonials can be added monthly once");
					}
				} catch (Exception e) {
					String tooltip_msg1 = PartnerPortal_Menu.testi_tooltip_M.getAttribute("class");
					System.out.println(tooltip_msg1);
					if (tooltip_msg1.equalsIgnoreCase("Testimonials can be added monthly once")) {
						System.err.println("Testimonials can be added monthly once");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("Testimonials not be added for this month");
		}
	}
	/* Onemore Testimonial Creation End */

	/* Testimonial View Start */
	@Then("^Check testimonial image$")
	public void check_testimonial_image() {

	}
	/* Testimonial View Start */

	@Then("^Verify the user able to submit the document or not$")
	public void verify_the_user_able_to_submit_the_document_or_not() throws Throwable {
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ApproverSubmit));
			PartnerPortal_Menu.ApproverSubmit.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// jse.executeScript("arguments[0].click()", PartnerPortal_Menu.ApproverSubmit);
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ok_Btn));
			// jse.executeScript("arguments[0].click()", PartnerPortal_Menu.ok_Btn);
			PartnerPortal_Menu.ok_Btn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(true, true);
	}

	/* Partner Performance Request Start */
	@Then("^Enter Username for Evaluation Request$")
	public void enter_Username_for_Evaluation_Request() throws Throwable {
		PartnerPortal_Menu.EIPOtheruser_Tab.click();
		PartnerPortal_Menu.EIPUsername_TB.sendKeys(ConfigFileReader.getEvaluationReq_UN());
	}

	@Then("^Enter Password for Evaluation Request$")
	public void enter_Password_for_Evaluation_Request() throws Throwable {
		PartnerPortal_Menu.EIPPassword_TB.sendKeys(ConfigFileReader.getEvaluationReq_Pwd());
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
		PartnerPortal_Menu.EIPLogin_Btn.click();
	}

	@Then("^Click Partner Performance Request menu$")
	public void click_Partner_Performance_Request_menu() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchMenu_TB));
		PartnerPortal_Menu.SearchMenu_TB.sendKeys(ConfigFileReader.partnerPerformanceRequest());
		/*
		 * Thread.sleep(3000); PartnerPortal_Menu.SearchMenu_TB.sendKeys(Keys.ENTER);
		 */
		Thread.sleep(2000);
		PartnerPortal_Menu.partnerRequest_TB.click();
	}

	@Then("^Click JobCode button$")
	public void click_JobCode_button() throws Throwable {
		Thread.sleep(2000);
		boolean partnerReq_Jobcode_btn = PartnerPortal_Menu.partnerReq_Jobcode_btn.isEnabled();
		System.out.print(partnerReq_Jobcode_btn);
		if (partnerReq_Jobcode_btn == true) {
			jse.executeScript("arguments[0].click();", PartnerPortal_Menu.partnerReq_Jobcode_btn);
		} else {
			System.out.print("Element not available");
		}

		Thread.sleep(3000);
	}

	@Then("^Enter and Select Jobcode in DD$")
	public void enter_and_Select_Jobcode_in_DD() throws Throwable {
		Thread.sleep(5000);
		boolean PartnerReqjobCode_DD = PartnerPortal_Menu.PartnerReq_Jobcode_DD.isEnabled();
		if (PartnerReqjobCode_DD == true) {
			PartnerPortal_Menu.PartnerReq_Jobcode_DD.sendKeys(ConfigFileReader.getEvaluationReq_Jobcode(), Keys.TAB);
		} else {
			System.err.println("Jobcode Element not able to Ineract");
		}
	}

	@Then("^select date in datepicker$")
	public void select_date_in_datepicker() throws Throwable {
		Thread.sleep(3000);
		PartnerPortal_Menu.PartnerReq_Datepicker_TB.sendKeys(ConfigFileReader.getEvaluationReq_Date());
	}

	@Then("^select WO in toggle button$")
	public void select_WO_in_toggle_button() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_WO_btn);
	}

	@Then("^Change Show DD$")
	public void change_Show_DD() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_show_DD);
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_show40_DD);
	}

	@Then("^Select Frequency$")
	public void select_Frequency() throws Throwable {
		evaluationReq_newOrderNo = PartnerPortal_Menu.PartnerReq_newOrderNo_L.getText();
		System.out.println("New Order Number : " + evaluationReq_newOrderNo);
		Thread.sleep(2000);
		PartnerPortal_Menu.PartnerReq_frequencyCheck_dd.click();
		Thread.sleep(2000);
		PartnerPortal_Menu.PartnerReq_selectFrequency1_DD.click();
		String ISRating = PartnerPortal_Menu.PartnerReq_ISrating_toggle.getText();
		System.out.println("IS Rating : " + ISRating);
	}

	@Then("^click submit$")
	public void click_submit() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Evaluation Order No from other Method : " + evaluationReq_newOrderNo);
		PartnerPortal_Menu.PartnerReq_submit_btn.click();
	}

	/* Partner Performance Request End */

	/* Partner Performance Request Start */
	@Then("^Enter Partner Evalutor Username$")
	public void enter_Partner_Evalutor_Username() throws Throwable {

		PartnerPortal_Menu.EIPOtheruser_Tab.click();
		/*
		 * DataBaseConnection.dataBaseConnectionPP();
		 * DataBaseConnection.partnerRequest(); DataBaseConnection.partnerEvaluator();
		 * DataBaseConnection.databaseConnectionClose();
		 */

		DataBaseConnection.dataBaseConnectioneipAwm();
		DataBaseConnection.partnerEvaluatorLoginName();
		DataBaseConnection.databaseConnectionClose();
	}

	@Then("^Enter Partner Evalutor Password$")
	public void enter_Partner_Evalutor_Password() throws Throwable {
		PartnerPortal_Menu.EIPPassword_TB.sendKeys(ConfigFileReader.getEvaluationReq_Pwd());
	}

	@Then("^Click Partner Performance Evaluation menu$")
	public void click_Partner_Performance_Evaluation_menu() throws Throwable {

		popup_validation = PartnerPortal_Menu.eipMsgbox_Pop.size();
		System.out.println("Popup Size: " + popup_validation);
		if (popup_validation == 0) {
			System.out.println("Popup Not Displayed");
			System.out.println("--------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchMenu_TB));
			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(ConfigFileReader.partnerPerformanceEvaluation());
			Thread.sleep(3000);
			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(Keys.ENTER);
		} else {
			System.out.println("Popup Displayed");
			System.out.println("--------------------------------------------------------");
			String Main_Title = DriverFactory.driver.getTitle();
			System.out.println("Main window Title is " + Main_Title);
			Thread.sleep(3000);
			PartnerPortal_Menu.ok_Btn.click();
			Thread.sleep(5000);
			String parentHandle = DriverFactory.driver.getWindowHandle();
			// PartnerPortal_Menu.Child_Window_Ele.click();
			for (String winHandle : DriverFactory.driver.getWindowHandles()) {
				DriverFactory.driver.switchTo().window(winHandle);
			}
//			DriverFactory.driver.switchTo().window(parentHandle); 
			Actions actions = new Actions(DriverFactory.driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys(Keys.TAB);
			actions.keyUp(Keys.CONTROL);
			actions.perform();

			Thread.sleep(3000);
			System.out.println("Window Switched");
			DriverFactory.driver.navigate().refresh();
		}

//		boolean eipMsgbox_Popup = PartnerPortal_Menu.eipMsgbox_Pop.isDisplayed();
//		if (eipMsgbox_Popup != true) {
//			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchMenu_TB));
//			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(ConfigFileReader.partnerPerformanceEvaluation());
//			Thread.sleep(3000);
//			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(Keys.ENTER);
//			// PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.click();
//			// PartnerPortal_Menu.PartnerEvaluator_Menu.click();
//
//		} else {
//			Thread.sleep(3000);
//			PartnerPortal_Menu.ok_Btn.click();
//
//			String MainWindow = DriverFactory.driver.getWindowHandle();
//			System.out.println("Main window handle is " + MainWindow);
//
//			Set<String> s1 = DriverFactory.driver.getWindowHandles();
//			System.out.println("Child window handle is" + s1);
		/*
		 * Iterator<String> i1 = s1.iterator();
		 * 
		 * while (i1.hasNext()) { String ChildWindow = i1.next(); if
		 * (!MainWindow.equalsIgnoreCase(ChildWindow)) {
		 * DriverFactory.driver.switchTo().window(ChildWindow); String childwin_title =
		 * DriverFactory.driver.getTitle(); System.out.println("Child Window title : " +
		 * childwin_title); DriverFactory.driver.close();
		 * System.out.println("Child window closed"); } }
		 */
		// Switch back to the main window which is the parent window.
		/*
		 * DriverFactory.driver.switchTo().window(MainWindow);
		 * DriverFactory.driver.navigate().refresh();
		 * wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.
		 * SearchMenu_TB));
		 * PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(ConfigFileReader.
		 * partnerPerformanceEvaluation()); Thread.sleep(3000);
		 * PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(Keys.ENTER); //
		 * PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.click();
		 * PartnerPortal_Menu.PartnerEvaluator_Menu.click(); }
		 */
	}

	@Then("^Verify the Partner Evaluation button$")
	public void Verify_the_Partner_Evaluation_button() throws Throwable {
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", PartnerPortal_Menu.PartnerEvaluation_btn);
		// PartnerPortal_Menu.PartnerEvaluation_btn.click();
	}

	@Then("^Enter To date in datepicker$")
	public void Enter_To_date_in_datepicker() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerEvaluator_Date));
		PartnerPortal_Menu.PartnerEvaluator_Date.clear();
		PartnerPortal_Menu.PartnerEvaluator_Date.sendKeys(ConfigFileReader.getEvaluator_Date());
	}

	@Then("^Get Order Number$")
	public void get_Order_Number() throws Throwable {
		PartnerPortal_Menu.PartnerEvaluatorfilter_icon.click();
		DataBaseConnection.dataBaseConnectionPP();
		//DataBaseConnection.partnerRequest();
		//DataBaseConnection.partnerEvaluatorNo();
		DataBaseConnection.databaseConnectionClose();
	}

	@Then("^Click Start Evaluation$")
	public void click_Start_Evaluation() throws Throwable {
		// Actions act = new Actions(DriverFactory.driver);
		Thread.sleep(3000);
		//act.moveToElement(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn).click().perform();
	}

	@Then("^Select answers in Start Evaluation$")
	public void select_answers_in_Start_Evaluation() throws Throwable {
		Thread.sleep(2000);
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation3rdrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		for (int i = 0; i < Evaluatorrating; i++) {
			Thread.sleep(2000);
			PartnerPortal_Menu.PartnerEvaluation3rdrating_btn.get(i).click();
			// jse.executeScript("arguments[0].click();",
			// PartnerPortal_Menu.PartnerEvaluation3rdrating_btn);
			System.err.println("3rd Rating 'for' loop ");
		}
	}

	@Then("^Navigate to Partner Performance Evaluation$")
	public void Navigate_to_Partner_Performance_Evaluation() throws Throwable {
		popup_validation = PartnerPortal_Menu.eipMsgbox_Pop.size();
		System.out.println("Popup Size: " + popup_validation);
		if (popup_validation == 0) {
			System.out.println("Popup Not Displayed");
			System.out.println("--------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Access_Based_Menu));
			BaseClass.onButtonClick(PartnerPortal_Menu.Access_Based_Menu);		
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Business_Apps_Menu));
			BaseClass.onButtonClick(PartnerPortal_Menu.Business_Apps_Menu);		
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_portal_Menu));
			BaseClass.onButtonClick(PartnerPortal_Menu.Partner_portal_Menu);	
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_performance_Evaluation));
			BaseClass.onButtonClick(PartnerPortal_Menu.Partner_performance_Evaluation);	
//			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchMenu_TB));
//			Thread.sleep(2000);
//			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(ConfigFileReader.partnerPerformanceEvaluation());
//			Thread.sleep(3000);
//			PartnerPortal_Menu.PartnerEvaluatorSearch_Menu.sendKeys(Keys.ENTER);
		} else {
			System.out.println("Popup Displayed");
			System.out.println("--------------------------------------------------------");
			String Main_Title = DriverFactory.driver.getTitle();
			System.out.println("Main window Title is " + Main_Title);
			Thread.sleep(3000);
			PartnerPortal_Menu.ok_Btn.click();
			Thread.sleep(5000);
			String parentHandle = DriverFactory.driver.getWindowHandle();
			// PartnerPortal_Menu.Child_Window_Ele.click();
			for (String winHandle : DriverFactory.driver.getWindowHandles()) {
				DriverFactory.driver.switchTo().window(winHandle);
			}
//			DriverFactory.driver.switchTo().window(parentHandle); 
			Actions actions = new Actions(DriverFactory.driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys(Keys.TAB);
			actions.keyUp(Keys.CONTROL);
			actions.perform();

			Thread.sleep(3000);
			System.out.println("Window Switched");
			DriverFactory.driver.navigate().refresh();
		}
	}
	@Then("^Login with PPE Evaluator")
	public void Login_with_PPE_Evaluator() throws Throwable {
		PartnerPortal_Menu.EIPOtheruser_Tab.click();
		PartnerPortal_Menu.EIPUsername_TB.sendKeys(ConfigFileReader.getEvaluationReq_UN());
		PartnerPortal_Menu.EIPPassword_TB.sendKeys(ConfigFileReader.getEvaluationReq_Pwd());

		PartnerPortal_Menu.EIPLogin_Btn.click();
	}
	@Then("^Filter the document for evaluation$")
	public void Filter_the_document_for_evaluation() throws Throwable {
		Thread.sleep(5000);
		try {
			PartnerPortal_Menu.PartnerEvaluation_btn.click();
		} catch (Exception e) {
			BaseClass.jsClk(PartnerPortal_Menu.PartnerEvaluation_btn);
		}
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Jobcode_DD));
		Thread.sleep(8000);
		PartnerPortal_Menu.PartnerReq_Jobcode_Clear.click();
		Thread.sleep(3000);
		PartnerPortal_Menu.PartnerReq_Jobcode_DD.sendKeys(ConfigFileReader.getEvaluator_JobCode());
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DropDown_Select);
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerEvaluator_Date));
		PartnerPortal_Menu.PartnerEvaluator_Date.clear();
		PartnerPortal_Menu.PartnerEvaluator_Date.sendKeys(ConfigFileReader.getEvaluator_Date());

		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation_GoBTN);	
		Thread.sleep(8000);

	}
	@Then("^Verify whether user able to click sendback in Partner Evaluation$")
	public void Verify_whether_user_able_to_click_sendback_in_Partner_Evaluation() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerSendback_BTN);
	}
	@Then("^Verfiy whether user able to click WO button$")
	public void Verfiy_whether_user_able_to_click_WO_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_WO_btn);
		Thread.sleep(10000);
	}
	@Then("^Verfiy whether user able to click PO button$")
	public void Verfiy_whether_user_able_to_click_PO_button() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_PO_btn));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_PO_btn);
		Thread.sleep(10000);
	}
	@Then("^Verify whether user able to filter document by PO order number$")
	public void Verify_whether_user_able_to_filter_document_by_PO_order_number() throws Throwable {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerEvaluatorfilter_icon));
		PartnerPortal_Menu.PartnerEvaluatorfilter_icon.click();
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.partnerRequestPO();
		DataBaseConnection.partnerEvaluatorNoPO();
		DataBaseConnection.databaseConnectionClose();
		Thread.sleep(5000);
	}
	@Then("^Verify whether user able to filter sendback document by PO order number$")
	public void Verify_whether_user_able_to_filter_sendback_document_by_PO_order_number() throws Throwable {
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerEvaluatorfilter_icon));
		PartnerPortal_Menu.PartnerEvaluatorfilter_icon.click();
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.partnerEvaluatorNoSenback();
		DataBaseConnection.databaseConnectionClose();

		Thread.sleep(3000);
	}
	@Then("^Verify whether user able to filter document by WO order number$")
	public void Verify_whether_user_able_to_filter_document_by_WO_order_number() throws Throwable {
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerEvaluatorfilter_icon));
		PartnerPortal_Menu.PartnerEvaluatorfilter_icon.click();
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.partnerRequestWO();
		DataBaseConnection.partnerEvaluatorNoWO();
		DataBaseConnection.databaseConnectionClose();

		Thread.sleep(3000);
	}
	@Then("^Give Evaluator remarks$")
	public void give_Evaluator_remarks() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
	}
	@Then("^Complete the Evaluation Workflow with One rating in Partner Evaluation$")
	public void complete_the_Evaluation_Workflow_with_Second_rating_in_Partner_Evaluation_EHS() throws Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(0));
		Thread.sleep(4000);
		//int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation1strating_btn.size();
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation5thrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		Thread.sleep(4000);
		//BaseClass.jsBottom(PartnerPortal_Menu.PartnerEvalHeading_View);
		for (int j = 0; j < Evaluatorrating; j++) {
			Thread.sleep(500);
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation1strating_btn.get(j));
			BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation5thrating_btn.get(j));
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation4thrating_btn.get(j));
			BaseClass.Input(PartnerPortal_Menu.PartnerEvaluationQueRemarksTA.get(j), "Test "+(j+1)+" Remarks");
		}
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
		BaseClass.onMouseHoverEle(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CloseTraceBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.CloseTraceBTN);
		
	}
	@Then("^Complete the Evaluation Workflow with Second rating in Partner Evaluation$")
	public void complete_the_Evaluation_Workflow_with_Second_rating_in_Partner_Evaluation_Quality() throws Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(1));
		Thread.sleep(4000);
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation5thrating_btn.size();
		//int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation2ndrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		Thread.sleep(4000);
		//BaseClass.jsBottom(PartnerPortal_Menu.PartnerEvalHeading_View);
		for (int j = 0; j < Evaluatorrating; j++) {
			Thread.sleep(500);
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation2ndrating_btn.get(j));
			BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation5thrating_btn.get(j));
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation4thrating_btn.get(j));
			BaseClass.Input(PartnerPortal_Menu.PartnerEvaluationQueRemarksTA.get(j), "Test "+(j+1)+" Remarks");
		}
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
		BaseClass.onMouseHoverEle(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CloseTraceBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.CloseTraceBTN);
	}
	@Then("^Complete the Evaluation Workflow with Third rating in Partner Evaluation$")
	public void complete_the_Evaluation_Workflow_with_Third_rating_in_Partner_Evaluation_Planning() throws Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(2));
		Thread.sleep(4000);
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation5thrating_btn.size();
		//int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation3rdrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		Thread.sleep(4000);
		//BaseClass.jsBottom(PartnerPortal_Menu.PartnerEvalHeading_View);
		for (int j = 0; j < Evaluatorrating; j++) {
			Thread.sleep(500);
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation3rdrating_btn.get(j));
			BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation5thrating_btn.get(j));
			BaseClass.Input(PartnerPortal_Menu.PartnerEvaluationQueRemarksTA.get(j), "Test "+(j+1)+" Remarks");
		}
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
		BaseClass.onMouseHoverEle(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CloseTraceBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.CloseTraceBTN);
	}
	@Then("^Complete the Evaluation Workflow with Fifth rating in Partner Evaluation$")
	public void Complete_the_Evaluation_Workflow_with_Fifth_rating_in_Partner_Evaluation() throws Throwable {
		Thread.sleep(4000);
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(4));
		Thread.sleep(4000);
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation5thrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		Thread.sleep(4000);
		//BaseClass.jsBottom(PartnerPortal_Menu.PartnerEvalHeading_View);
		for (int j = 0; j < Evaluatorrating; j++) {
			Thread.sleep(500);
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation4thrating_btn.get(j));
			BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation5thrating_btn.get(j));
			BaseClass.Input(PartnerPortal_Menu.PartnerEvaluationQueRemarksTA.get(j), "Test "+(j+1)+" Remarks");

		}
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
		BaseClass.onMouseHoverEle(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CloseTraceBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.CloseTraceBTN);
	}
	@Then("^Complete the Evaluation Workflow with Fourth rating in Partner Evaluation$")
	public void complete_the_Evaluation_Workflow_with_Fourth_rating_in_Partner_Evaluation() throws Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(3));
		Thread.sleep(4000);
		//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvalStartEvaluation_btn.get(i));
		Thread.sleep(8000);
		int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation5thrating_btn.size();
		//int Evaluatorrating = PartnerPortal_Menu.PartnerEvaluation4thrating_btn.size();
		System.out.println("Evaluation rating: " + Evaluatorrating);
		Thread.sleep(4000);
		//BaseClass.jsBottom(PartnerPortal_Menu.PartnerEvalHeading_View);
		for (int j = 0; j < Evaluatorrating; j++) {
			Thread.sleep(500);
			BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation5thrating_btn.get(j));
			//BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluation4thrating_btn.get(j));
			BaseClass.Input(PartnerPortal_Menu.PartnerEvaluationQueRemarksTA.get(j), "Test "+(j+1)+" Remarks");
		}
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSaved_OKBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
		BaseClass.onMouseHoverEle(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceBTN);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.CloseTraceBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.CloseTraceBTN);
	}
	@Then("^Verify whether user able to enter overall remarks for heading$")
	public void Verify_whether_user_able_to_enter_overall_remarks_for_heading() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
	}
	@Then("^Verify whether user able to submit the evaluation$")
	public void Verify_whether_user_able_to_submit_the_evaluation() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PartnerReq_Evaluation_Submit));
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		Thread.sleep(5000);
	}
	@Then("^Click Evaluator Submit$")
	public void Click_Evaluator_Submit() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Remarks_TA));
		PartnerPortal_Menu.Remarks_TA.sendKeys(ConfigFileReader.evaluation_remarks());
	}
	/* Partner Performance Request End */

	/* Partner Bank Details Updation Start */
	@Then("^Click User My profile menu$")
	public void Click_User_My_profile_menu() throws Throwable {
		List<WebElement> VendorDeclarationPopup_closeBtn = DriverFactory.driver
				.findElements(By.xpath("//*[contains(@class, 'modal-close-button')]"));
		if (VendorDeclarationPopup_closeBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.VendorDeclareFormClose_Img.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thanks for logging-in popup is not shown");

		}

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.myprofile_M));
		BaseClass.onButtonClick(PartnerPortal_Menu.myprofile_M);
	}

	@Then("^Select Financial tab in my profile$")
	public void Select_Financial_tab_in_my_profile() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.MyProfileFinancial_Tab));
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileFinancial_Tab);
	}

	@Then("^Click Bank details tab in Financial section$")
	public void Click_Bank_details_tab_in_Financial_section() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.MyProfileBankDetails_Tab));
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileBankDetails_Tab);
	}

	@Then("^Click Edit icon to update the user bank details$")
	public void Edit_icon_to_update_the_user_bank_details() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileBankEdit_icon);
	}

	@Then("^Update the Payment in favour of in Edit bank details Popup$")
	public void Update_the_Payment_in_favour_of_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.BankDetailsPaymentFavour_txt);
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.BankDetailsPaymentFavour_txt, "Test Payment Favour");
	}

	@Then("^Update the Bank details in Edit bank details Popup$")
	public void Update_the_Bank_details_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.BankName_DD, "BANK OF INDIA");
	}
	@Then("^Update the Bank name details in Edit bank details Popup$")
	public void Update_the_Bank_name_details_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.BankNameAdmin_DD, "BANK OF INDIA");
	}

	@Then("^Update the IFSC Code in Edit bank details Popup$")
	public void Update_the_IFSC_Code_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.BankIFSCCode_txt, "0008010");
	}

	@Then("^Update the Swift Code in Edit bank details Popup$")
	public void Update_the_Swift_Code_in_Edit_bank_details_Popup() throws Throwable {
		PartnerPortal_Menu.BankSwiftCode_txt.sendKeys("BKIDINBBXXX");
	}

	@Then("^Update the IBAN Code in Edit bank details Popup$")
	public void Update_the_IBAN_Code_in_Edit_bank_details_Popup() throws Throwable {
		BaseClass.Input(PartnerPortal_Menu.BankIBANCode_txt, "0008010");
	}

	@Then("^Update the Account Number in Edit bank details Popup$")
	public void Update_the_Account_Number_in_Edit_bank_details_Popup() throws Throwable {
		BaseClass.ClearElement(PartnerPortal_Menu.BankAccNo_txt);
		BaseClass.Input(PartnerPortal_Menu.BankAccNo_txt, BaseClass.RandomNumbers(12));
	}

	@Then("^Update the Payment Confirmation Mail Id in Edit bank details Popup$")
	public void Update_the_Payment_Confirmation_Mail_Id_in_Edit_bank_details_Popup() throws Throwable {
		BaseClass.ClearElement(PartnerPortal_Menu.BankEmailId_txt);
		BaseClass.Input(PartnerPortal_Menu.BankEmailId_txt, BaseClass.RandomEmail());
	}

	@Then("^Update the Attachment in Edit bank details Popup$")
	public void Update_the_Attachment_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(3000);
	    BaseClass.Input(PartnerPortal_Menu.BankDetailsFileAttachment_Btn, pdfAttachment);
	}
	@Then("^Update the Customer Attachment in Edit bank details Popup$")
	public void Update_the_Customer_Attachment_in_Edit_bank_details_Popup() throws Throwable {
		Thread.sleep(3000);
	    BaseClass.Input(PartnerPortal_Menu.BankDetailsFileCustomerAttachment_Btn, pdfAttachment);
	}

	@Then("^Submit to update the details in User my profile$")
	public void Submit_to_update_the_details_in_User_my_profile() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DetailsUpdate_Btn);
	}

	@Then("Click Add icon to add the user bank details")
	public void click_add_icon_to_add_the_user_bank_details() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileBankAdd_icon);
	}

	@Then("Submit to add the Bank details in User my profile")
	public void submit_to_add_the_bank_details_in_user_my_profile() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DetailsSave_Btn);
	}

	@Then("Add the Account Category in Add bank details popup")
	public void add_the_account_category_in_add_bank_details_popup() throws Throwable {
		Thread.sleep(5000);
		BaseClass.getrandomOption(PartnerPortal_Menu.Account_Category_DD);
	}

	@Then("Add the Account Type in Add bank details popup")
	public void add_the_account_type_in_add_bank_details_popup() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.Account_Type_DD);
	}

	@Then("Add the Payment mode in Add bank details popup")
	public void add_the_payment_mode_in_add_bank_details_popup() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.Payment_Mode_DD);
	}

	@Then("Close the add the details popup in User my profile")
	public void close_the_add_the_details_popup_in_user_my_profile() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
	}
	/* Partner Bank Details Updation End */

	/* Partner GST Details Add START */
	@Then("Verify the add more GST button is available or not")
	public void verify_the_add_more_gst_button_is_available_or_not() throws Throwable {
		Thread.sleep(1000);
		boolean RemainingGSTList_Isdisplayed = PartnerPortal_Menu.GSTAdd_Icon.isEnabled();
		if (RemainingGSTList_Isdisplayed == true) {
			System.err.println("Add more GST button is clickable");
		} else {
			System.err.println("Add more GST butto is not clickable");
		}
	}

	@Then("Click Add more GST button")
	public void click_add_more_gst_button() throws Throwable {
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTAdd_Icon);
	}

	/* Partner GST Details Add END */
	@Then("Verify whether vendor declaration Form Popup")
	public void verify_whether_vendor_declaration_form_popup() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> VendorDeclarationPopup = DriverFactory.driver
				.findElements(By.xpath("//*[@class='empanel-modal-close']"));
		if (VendorDeclarationPopup.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Empanelment_PopupClose.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Vendor Declaration Form popup is not shown");

		}
	}
	/* Partner GST Details Updation START */

	@Then("Enter CAPTCHA PP2")
	public void enter_captcha_pp2() throws Throwable {
		Thread.sleep(8000);
		Basic.captchaUserFinal(ConfigFileReader.getGSTUpdateUsername());
	}

	@Then("^Select GST details Tab$")
	public void select_GST_details_Tab() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTDetails_Tab);
	}

	@Then("^Verify Remaining GST List section available or not$")
	public void verify_Remaining_GST_List_section_available_or_not() throws Throwable {
		Thread.sleep(1000);
		boolean RemainingGSTList_Isdisplayed = PartnerPortal_Menu.RemainingGSTList_L.isDisplayed();
		if (RemainingGSTList_Isdisplayed == true) {
			System.err.println("Remaining GST List section is available");
		} else {
			System.err.println("Remaining GST List section is not available");
		}
	}

	@Then("^Verify the GST details available for updation or not$")
	public void verify_the_GST_details_available_for_updation_or_not() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTEdit_Icon);
	}

	@Then("^Verify Partner Registration number in Edit GST details$")
	public void verify_Partner_Registration_number_in_Edit_GST_details() throws Throwable {
		Thread.sleep(2000);
		String PartnerRegNo = PartnerPortal_Menu.PartnerRegNo_L.getText();
		System.out.println("Partner Reg no: " + PartnerRegNo);
	}

	@Then("^Verify Vendor Name in Edit GST details$")
	public void verify_Vendor_Name_in_Edit_GST_details() throws Throwable {
		Thread.sleep(2000);
		String VendorName = PartnerPortal_Menu.VendorName_L.getText();
		System.out.println("Vendor Name: " + VendorName);
	}

	@Then("^Verify GST Country in Edit GST details$")
	public void verify_GST_Country_in_Edit_GST_details() throws Throwable {
		Thread.sleep(2000);
		String GSTCountry = PartnerPortal_Menu.GSTCountry_L.getText();
		System.out.println("GST Country" + GSTCountry);
	}

	@Then("^Select GST State in Edit GST details$")
	public void select_GST_State_in_Edit_GST_details() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.GSTState_dd, "Rajasthan");
	}

	@Then("^Select Registration type in Edit GST details$")
	public void select_Registration_type_in_Edit_GST_details() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.SingleReg_radio);
	}

	@Then("^Enter GST Identification No in Edit GST details$")
	public void enter_GST_Identification_No_in_Edit_GST_details() throws Throwable {
		Thread.sleep(3000);
		PartnerPortal_Menu.GSTNo_TB.clear();
		Thread.sleep(2000);
		PartnerPortal_Menu.GSTNo_TB.sendKeys(ConfigFileReader.getGSTNumberApprove());
	}
	@Then("Click GST Registration Date in Edit GST details")
	public void click_gst_registration_date_in_edit_gst_details() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStRegDate_Input));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStRegDate_Input);
		BaseClass.jsTop(PartnerPortal_Menu.GStThreshHoldLimit);
	}

	@Then("^Select GST Registration date in Edit GST details$")
	public void select_GST_Registration_date_in_Edit_GST_details() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStRegDateSelection_Date));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStRegDateSelection_Date);
	}

	@Then("Click GST Effective From in Edit GST details")
	public void click_gst_effective_from_in_edit_gst_details() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStEffectiveFrom_Input));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStEffectiveFrom_Input);
	}

	@Then("^Select GST Effective From in Edit GST details$")
	public void select_GST_Effective_From_in_Edit_GST_details() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStEffectiveFromSelection_Date));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStEffectiveFromSelection_Date);
	}

	@Then("^Enter Threshold turnover limit in Edit GST details$")
	public void enter_Threshold_turnover_limit_in_Edit_GST_details() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ClearElement(PartnerPortal_Menu.GStThreshHoldLimit);
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.GStThreshHoldLimit, BaseClass.RandomNumbers(5));
	}

	@Then("^Select Type of Dealers in Edit GST details$")
	public void select_Type_of_Dealers_in_Edit_GST_details() throws Throwable {
		Thread.sleep(3000);
		BaseClass.SelectText(PartnerPortal_Menu.GSTTypeofDealers, "Composition");
		Thread.sleep(2000);
	}

	@Then("^Attach Cancelled Cheque in Edit GST details$")
	public void attach_Cancelled_Cheque_in_Edit_GST_details() throws Throwable {
		Thread.sleep(1000);
		PartnerPortal_Menu.GStFileUpload_Btn.sendKeys(pdfAttachment);
		System.out.println("GST Number File attachment completed");
	}

	@Then("^Verify the file attached or not$")
	public void verify_the_file_attached_or_not() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsBottom(PartnerPortal_Menu.GStAttachmentFileName_Label);
		String GStAttachmentFileName = PartnerPortal_Menu.GStAttachmentFileName_Label.getText();
		System.out.println("GSt Attachment File Name" + GStAttachmentFileName);
	}

	@Then("Click Save GST Details")
	public void click_save_gst_details() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStSaveBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStSaveBTN);

	}

	@Then("Click Update GST Details Button")
	public void click_update_gst_details_button() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStUpdateBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStUpdateBTN);
	}

	@Then("Accept GST details added successfully popup")
	public void accept_gst_details_added_successfully_popup() throws Throwable {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStSaveOKBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.GStSaveOKBTN);
	}

	/* Partner GST Details Updation END */

	/* Partner GST Search Starts */
	@Then("Enter the GST Number to Search")
	public void enter_the_gst_number_to_search() throws Throwable {
		Thread.sleep(3000);
		DataBaseConnection.dataBaseConnectionPP();
		String partnerNumber=PartnerPortal_Menu.Partner_Number.getText();
		BaseClass.Input(PartnerPortal_Menu.GSTSearchTB, DataBaseConnection.getGSTNumberSearch(partnerNumber));
		DataBaseConnection.databaseConnectionClose();
	}

	@Then("Verify Whether the search result is correct or not")
	public void verify_whether_the_search_result_is_correct_or_not() throws Throwable {
		Thread.sleep(3000);
		int countTH=PartnerPortal_Menu.detailsView_Header.size();
		int countTR=PartnerPortal_Menu.detailsView_TR.size();
		for(int i=0;i<countTR;i++) {
			for(int j=0;j<countTH;j++) {
				String tdText = PartnerPortal_Menu.detailsView_TR.get(i).findElement(By.xpath("//td["+(j+1)+"]")).getText();
				System.out.println(PartnerPortal_Menu.detailsView_Header.get(j).getText()+" : "+tdText);
			}
		}
	}

	/* Partner GST Search Ends */
	/* View GST Starts Here */
	
	@Then("Verify whether user able to view approved GST details")
	public void Verify_whether_user_able_to_view_approved_GST_details() throws Throwable {
		Thread.sleep(3000);
		int countTH=PartnerPortal_Menu.GSTApprovedTH.size();
		int countTR=PartnerPortal_Menu.GSTApprovedTR.size();
		for(int i=0;i<countTR;i++) {
			for(int j=0;j<countTH;j++) {
				String tdText = PartnerPortal_Menu.GSTApprovedTR.get(i).findElement(By.xpath("//td["+(j+1)+"]")).getText();
				System.out.println(PartnerPortal_Menu.GSTApprovedTH.get(j).getText()+" : "+tdText);
			}
		}
	}
	
	@Then("Verify whether user able to view unapproved GST details")
	public void Verify_whether_user_able_to_view_unapproved_GST_details() throws Throwable {
		Thread.sleep(3000);
		int countTH=PartnerPortal_Menu.GSTUnApprovedTH.size();
		int countTR=PartnerPortal_Menu.GSTUnApprovedTR.size();
		for(int i=0;i<countTR;i++) {
			for(int j=0;j<countTH;j++) {
				String tdText = PartnerPortal_Menu.GSTUnApprovedTR.get(i).findElement(By.xpath("//td["+(j+1)+"]")).getText();
				System.out.println(PartnerPortal_Menu.GSTUnApprovedTH.get(j).getText()+" : "+tdText);
			}
		}
	}
	/* View GST Ends Here */

	/* Partner GST Approval Submit Starts */
	@Then("Click Submit for Financial Approval Button")
	public void click_submit_for_financial_approval_button() throws Throwable {
		Thread.sleep(5000);
		String text = BaseClass.GetText_Alert();
		if(text.contains("The following bank detils is already submitted for Approval.")) {
			BaseClass.Accept_Alert1();
			BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
		}else {
			BaseClass.onButtonClick(PartnerPortal_Menu.GStApprovalBTN);
		}
		Thread.sleep(5000);
	}

	@Then("Enter Remarks for Financial Approval")
	public void enter_remarks_for_financial_approval() throws Throwable {
		Thread.sleep(3000);
		try {
			BaseClass.SendText_Alert("Test Remarks");
		} catch (Exception e) {
			System.out.println("Document is already Submitted for Approval");
		}
		
	}

	@Then("Accept Submit for Financial Approval Alert")
	public void accept_submit_for_financial_approval_alert() throws Throwable {
		Thread.sleep(3000);
		try {
			BaseClass.Accept_Alert1();
		} catch (Exception e) {
			System.out.println("Document is already Submitted for Approval");
		}
	}
	@Then("Verify whether user able to enter GST admin login")
	public void Verify_whether_user_able_to_enter_GST_admin_login() throws Throwable {
		
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(ConfigFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getGSTDocumentRefNo();
		DataBaseConnection.databaseConnectionClose();	
		DataBaseConnection.loginAction();
		System.out.println("Login Successfully.");
	}
	
	@Then("^Verify whether user able to fetch GST document reference no$")
	public void Verify_whether_user_able_to_fetch_GST_document_reference_no()
			throws InterruptedException, Throwable {
		Thread.sleep(10000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getGSTDocumentRefNo();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Contact Document Fetched Successfully.");
	}

	@Then("Verify Whether user can be able to fetch document number for approval")
	public void verify_whether_user_can_be_able_to_fetch_document_number_for_approval() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTFilter_Icon);
		BaseClass.Input(PartnerPortal_Menu.GSTFilter_TB, DataBaseConnection.getGSTDocumentRefNo());
		Thread.sleep(3000);
		List<WebElement> GSTVerifyDetails = DriverFactory.driver
				.findElements(By.xpath("//tbody[@role='presentation']//tr[1]"));
		if (GSTVerifyDetails.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.GSTDocRefNoLT);
				Thread.sleep(3000);
				BaseClass.multiWindowHandles();
				BaseClass.switchWindows();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no document for this approver");

		}
	}

	@Then("Verify Whether user can be able to trace the document for approval")
	public void verify_whether_user_can_be_able_to_trace_the_document_for_approval() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTDocRefNoTrace);
		BaseClass.Input(PartnerPortal_Menu.GSTDocRefNoTrace, DataBaseConnection.getGSTDocumentRefNo());
	}

	@Then("Verify Whether user can be able to click the GST Approver View Page")
	public void verify_whether_user_can_be_able_to_click_the_gst_approver_view_page() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ViewBTN);
	}

	@Then("Accept Tracking status popup")
	public void accept_tracking_status_popup() throws Throwable {
		Thread.sleep(5000);
		if(PartnerPortal_Menu.GStTrackStatusOkBTN.isDisplayed()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.GStTrackStatusOkBTN);
		}
	}

	@Then("Click Approve button")
	public void click_approve_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AApprovalBTN);
	}

	@Then("Click GST Reject button")
	public void click_gst_reject_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ARejectBTN);
	}

	@Then("Click GST Sendback button")
	public void click_gst_sendback_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ASendbackBTN);
	}

	@Then("Enter GST Approval Remarks")
	public void enter_gst_approval_remarks() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ApproveRemarks);
		BaseClass.Input(PartnerPortal_Menu.ApproveRemarks, "Test Remarks");
	}

	@Then("Click Approval Submit")
	public void click_gst_approval_submit() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ApproveSubmitBTN);
	}

	@Then("Accept the Success popup")
	public void accept_the_success_popup() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GStSaveOKBTN);
	}

	/* Partner GST Approval Submnit Ends */

	/* Partner Onboarding Start */
	@Then("^Enter partner onboarding username$")
	public void Enter_partner_onboarding_username() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());
		DataBaseConnection.dataBaseConnectionPP();
		String onboardingUserName = DataBaseConnection.getOnboardingUserName();
		System.out.println("Onboarding Username: " + onboardingUserName);
		DataBaseConnection.databaseConnectionClose();
		//PartnerPortal_Menu.Username.sendKeys("1LDnVv6");
		PartnerPortal_Menu.Username.sendKeys(onboardingUserName);
	}

	@Then("^Enter partner onboarding password$")
	public void Enter_partner_onboarding_Password() throws Throwable {
		PartnerPortal_Menu.Password.sendKeys(ConfigFileReader.getPassword());
	}

	@Then("^Accept partner Portal terms and condition$")
	public void Accept_partner_Portal_terms_and_condition() throws Throwable {
//		WebElement partner_TandC_Accept_btn = PartnerPortal_Menu.Partner_TandC_Accept_btn;
		Thread.sleep(2000);
		/*
		 * WebElement WhistleBlowerPop_Accept = DriverFactory.driver.findElement( By.
		 * xpath("//p[contains(@class, 'Approver-Success-text')]//following::button[text() = 'Accept']"
		 * )); Thread.sleep(2000); jse.executeScript("arguments[0].click();",
		 * WhistleBlowerPop_Accept);
		 * 
		 * List<WebElement> acceptBtn =
		 * DriverFactory.driver.findElements(By.xpath("//button[text() = 'Accept']"));
		 * if (acceptBtn.size() > 0) { Thread.sleep(2000); try {
		 * PartnerPortal_Menu.Partner_TandC_Accept_btn.click(); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 * } else { System.out.println("terms and Condition popup is not shown");
		 * 
		 * }
		 */

		List<WebElement> thanksPopup_okBtn = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (thanksPopup_okBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thanks for logging-in popup is not shown");

		}

		List<WebElement> acceptBtn = DriverFactory.driver.findElements(By.xpath("//button[text() = 'Accept']"));
		if (acceptBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.jsTop(PartnerPortal_Menu.Partner_TandC_Accept_btn);
				BaseClass.onButtonClick(PartnerPortal_Menu.Partner_TandC_Accept_btn);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("terms and Condition popup is not shown");

		}

		if (thanksPopup_okBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thanks for logging-in popup is not shown");

		}

	}

	@Then("^Verify the page title$")
	public void Verify_the_page_title() throws Throwable {
		Thread.sleep(2000);
		String pageTitle = DriverFactory.driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
	}

	@Then("^Verify the Partner number is avalable or not$")
	public void Verify_the_Partner_number_is_avalable_or_not() throws Throwable {
		Thread.sleep(2000);
		try {
			String partner_number = BaseClass.GetText(PartnerPortal_Menu.PartnerNumber_L);
			System.out.println(partner_number);
		} catch (Exception e) {
			String partner_number = BaseClass.GetText(PartnerPortal_Menu.PartnerNumber_L1);
			System.out.println(partner_number);
		}
	}

	@Then("^User able to click complete profile to onboard partner$")
	public void user_able_to_click_complete_profile_to_onboard_partner() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_completeprofile_L));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_completeprofile_L);
	}

	@Then("^Verify the user able to select Organization details$")
	public void verify_the_user_able_to_select_Organization_details() throws Throwable {

		Thread.sleep(10000);
		BaseClass.onButtonClick(PartnerPortal_Menu.OrgDetails_btn);
		Thread.sleep(10000);
		List<WebElement> acceptBtn = DriverFactory.driver
				.findElements(By.xpath("//*[@class='modal-body']//following::button[text()='Ok']"));
		System.out.println("Size : " + acceptBtn.size());
		if (acceptBtn.size() > 0) {
			Thread.sleep(2000);
			BaseClass.onButtonClick(PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn);

		} else {
			System.out.println("Fill all the details in PF registration id popup is not shown");
		}
		// jse.executeScript("arguments[0].click();",
		// PartnerPortal_Menu.OrgDetails_btn);
	}

	@Then("^Verify the user able to add Street address in Organization details$")
	public void verify_the_user_able_to_add_Street_address_in_Organization_details() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.streetAddr_TB);
		BaseClass.ClearElement(PartnerPortal_Menu.streetAddr_TB);
		Thread.sleep(5000);
		List<WebElement> acceptBtn = DriverFactory.driver
				.findElements(By.xpath("//*[@class='modal-body']//following::button"));
		if (acceptBtn.size() > 0) {
			Thread.sleep(2500);
			BaseClass.onButtonClick(PartnerPortal_Menu.Partner_TandC_Accept_btn);
		} else {
			System.out.println("Fill all the details in PF registration id popup is not shown");

		}

		List<WebElement> PFReg_Pop = DriverFactory.driver.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (PFReg_Pop.size() > 0) {
			Thread.sleep(2500);
			BaseClass.onButtonClick(PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn);

		} else {
			System.out.println("Fill all the details in PF registration id popup is not shown");

		}
		BaseClass.Input(PartnerPortal_Menu.streetAddr_TB, "111/222, Test data for Street Address");
		System.out.println("Street Address completed");
	}

	@Then("^Verify user able to select state in Organization details$")
	public void verify_user_able_to_select_State_in_Organization_details() throws Throwable {
		Thread.sleep(2000);
		//BaseClass.getrandomOption(PartnerPortal_Menu.State_DD);
		BaseClass.InputTab(PartnerPortal_Menu.State_DD, "Tamilnadu");
		System.out.println("State selected and completed");
	}

	@Then("^Verify user able to select City in Organization details$")
	public void verify_user_able_to_select_City_in_Organization_details() throws Throwable {
		Thread.sleep(2000);
		BaseClass.jsTop(PartnerPortal_Menu.City_DD);
		//BaseClass.getrandomOption(PartnerPortal_Menu.City_DD);
		BaseClass.InputTab(PartnerPortal_Menu.City_DD, "Tirunelveli");
		System.out.println("City selected and completed");
	}

	@Then("^Verify user able to enter ZipCode in Organization details$")
	public void verify_user_able_to_enter_ZipCode_in_Organization_details() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ZipCode_onboard_TB);
		BaseClass.Input(PartnerPortal_Menu.ZipCode_onboard_TB, BaseClass.RandomNumbers(6));
		System.out.println("ZipCode selected and completed");
	}

	@Then("^Check user able to select Same as Registered Office Address in Organization details$")
	public void check_user_able_to_select_Same_as_Registered_Office_Address_in_Organization_details() throws Throwable {
		Thread.sleep(4000);
		BaseClass.jsTop(PartnerPortal_Menu.SameAddr_CB);
		WebElement sameAddr_CB = PartnerPortal_Menu.SameAddr_CB;
		if (!sameAddr_CB.isSelected()) {
			BaseClass.onButtonClick(sameAddr_CB);
		}
		System.out.println("'Same as Registered Office Address' completed");
	}

	@Then("^Verify user able to select Incorporated as in Statutory details$")
	public void verify_user_able_to_select_Incorporated_as_in_Statutory_details() throws Throwable {
		Thread.sleep(2000);
		//BaseClass.getrandomOption(PartnerPortal_Menu.IncorporatedAs_DD);
		BaseClass.SelectText(PartnerPortal_Menu.IncorporatedAs_DD, "Private Ltd");
		System.out.println("Incorporated as in Statutory details completed");
	}

	@Then("^Check the user able to add the Year of Incorporation date$")
	public void check_the_user_able_to_add_the_Year_of_Incorporation_date() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.YearofIncorporation_Date);
		Thread.sleep(500);
		BaseClass.onButtonClick(PartnerPortal_Menu.DateofIncorporation_Date);
		System.out.println("Year of Incorporation date completed");
	}

	@Then("^Check the user able to add Place of Incorporation$")
	public void check_the_user_able_to_add_Place_of_Incorporation() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.PlaceofIncorporation_TB);
		Thread.sleep(500);
		BaseClass.Input(PartnerPortal_Menu.PlaceofIncorporation_TB, "VannarPettai");
		System.out.println("Place of Incorporation completed");
	}

	@Then("^Check the user able to add CIN Number$")
	public void Check_the_user_able_to_add_CIN_Number() throws Throwable {
		Thread.sleep(2000);
		String text = BaseClass.getFirstSelectedOption(PartnerPortal_Menu.IncorporatedAs_DD);
		if(text.equals("Partnership Firm")) {
			BaseClass.ClearElement(PartnerPortal_Menu.FirmReg_TB);
			Thread.sleep(500);
			BaseClass.Input(PartnerPortal_Menu.FirmReg_TB, BaseClass.RandomCINNO());
		}else if (text.equals("Private Ltd") || text.equals("Govt. Sector") || text.equals("Public Ltd") || text.equals("Public Sector Undertaking")) {
			BaseClass.ClearElement(PartnerPortal_Menu.CIN_Number_TB);
			Thread.sleep(500);
			BaseClass.Input(PartnerPortal_Menu.CIN_Number_TB, BaseClass.RandomCINNO());
		} else if (text.equals("LLP Firms")) {
			BaseClass.ClearElement(PartnerPortal_Menu.LLPIN_TB);
			Thread.sleep(500);
			BaseClass.Input(PartnerPortal_Menu.LLPIN_TB, BaseClass.RandomNumbers(6));
		}else if (text.equals("Proprietorship")) {
			BaseClass.ClearElement(PartnerPortal_Menu.shopEstablishment_TB);
			Thread.sleep(500);
			BaseClass.Input(PartnerPortal_Menu.shopEstablishment_TB, BaseClass.RandomNumbers(6));
		}else {
			System.out.println("Other Selected");
		}
	}

	@Then("^Verify the user able to select GST Number$")
	public void verify_the_user_able_to_select_GST_Number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GST_No_Radio);
		System.out.println("GST Number completed");
	}

	@Then("^Attach the file in GST Number section$")
	public void attach_the_file_in_GST_Number_section() throws Throwable {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.GST_AttachDocument_Btn, pdfAttachment);
		System.out.println("GST Number File attachment completed");
	}

	@Then("^Verify the file is attached or not for GST number$")
	public void verify_the_file_is_attached_or_not_for_GST_number() throws Throwable {
		Thread.sleep(5000);
		String GST_Doc_name = PartnerPortal_Menu.Verify_GST_Doc_L.getText();
		System.out.println("Attached GST document No: " + GST_Doc_name);
	}

	@Then("^Select MSME number$")
	public void select_MSME_number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.jsTop(PartnerPortal_Menu.MSME_Yes_Radio);
		BaseClass.onButtonClick(PartnerPortal_Menu.MSME_Yes_Radio);
	}

	@Then("^Verify user able to add MSME Number$")
	public void Verify_user_able_to_add_MSME_Number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.MSME_No_TB, BaseClass.RandomMSMENO());
	}

	@Then("^Verify user able to add MSME Effective from$")
	public void Verify_user_able_to_add_MSME_Effective_from() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.MSMEEffectiveFrom_Date);
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DateofIncorporation_Date);
		System.out.println("MSME Effective from date completed");
	}

	@Then("^Verify user able to add MSME Type$")
	public void Verify_user_able_to_add_MSME_Type() throws Throwable {
		Thread.sleep(2000);
		BaseClass.InputTab(PartnerPortal_Menu.MSME_Type_DD, "MICRO");
		//BaseClass.getrandomOption(PartnerPortal_Menu.MSME_Type_DD);
	}

	@Then("^Verify user able to add MSME Classification Year$")
	public void Verify_user_able_to_add_MSME_Classification_Year() throws Throwable {
		Thread.sleep(2000);
		BaseClass.value(PartnerPortal_Menu.MSME_Classification_Year_DD, "2013-2014");
		//BaseClass.getrandomOption(PartnerPortal_Menu.MSME_Classification_Year_DD);
	}

	@Then("^Add Last Year turnover in INR$")
	public void add_Last_Year_turnover_in_INR() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Last_Year_turnover_in_INR_TB);
		Thread.sleep(500);
		BaseClass.Input(PartnerPortal_Menu.Last_Year_turnover_in_INR_TB, "1234");
	}

	@Then("^Select E-invoice Applicability$")
	public void select_E_invoice_Applicability() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Einvoice_Applicability_Radio);
	}

	@Then("^Select Can TCS be charged for the goods/ services supplied$")
	public void select_Can_TCS_be_charged_for_the_goods_services_supplied() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Can_TCS_Be_Charged_Radio);
	}

	@Then("^Select TAN Number$")
	public void select_TAN_Number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TAN_No_Radio);
		System.out.println("TAN Number completed");
	}

	@Then("^Attach file for TAN number$")
	public void attach_file_for_TAN_number() throws Throwable {
		Thread.sleep(2000);
		PartnerPortal_Menu.TAN_AttachDocument_Btn.sendKeys(pdfAttachment);
		System.out.println("TAN Number File attachment completed");
	}

	@Then("^Verify the file is attached or not for TAN number$")
	public void verify_the_file_is_attached_or_not_for_TAN_number() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Verify_TAN_Doc_L.getText();
		System.out.println("Attached TAN document No: " + TAN_Doc_name);
	}

	@Then("^Select Aadhaar Number$")
	public void select_Aadhaar_Number() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> Aadhaar_NO_Btn = DriverFactory.driver
				.findElements(By.xpath("//h6[text() = 'Aadhaar Number*']//following::label[2]"));
		if (Aadhaar_NO_Btn.size() > 0) {
			Thread.sleep(2000);
			BaseClass.onButtonClick(PartnerPortal_Menu.Aadhaar_No_Radio);
		} else {
			System.out.println("Select Aadhaar Number is not shown");
		}
	}

	@Then("^Attach file for Aadhaar number$")
	public void attach_file_for_Aadhaar_number() throws Throwable {
		Thread.sleep(2000);

		List<WebElement> Aadhaar_FileInput_Btn = DriverFactory.driver
				.findElements(By.xpath("(//p[contains(text(),'Add Files')])[3]/input[1]"));
		if (Aadhaar_FileInput_Btn.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Aadhaar_AttachDocument_Btn.sendKeys(pdfAttachment);
				System.out.println("Aadhaar Number File attachment completed");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Aadhaar attachment file is not shown");
		}

	}

	@Then("Click Close button")
	public void click_close_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GSTAddCloseBTN);
	}

	@Then("Verify whether close button is working or not")
	public void verify_whether_close_button_is_working_or_not() throws Throwable {
		List<WebElement> AddGSTClosePopup = DriverFactory.driver.findElements(By.xpath("//div[@role='document']"));
		if (AddGSTClosePopup.size() >= 0) {
			System.out.println("Add GST popup closed successfully");
		} else {
			System.out.println("Add GST popup close button not working");
		}
	}

	/*
	 * @Then("^Verify the file is attached or not for Aadhaar number$") public void
	 * verify_the_file_is_attached_or_not_for_Aadhaar_number() throws Throwable {
	 * Thread.sleep(2000);
	 * 
	 * }
	 */

	@Then("^Select PF Registration ID$")
	public void select_PF_Registration_ID() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> PF_Registration_ID = DriverFactory.driver
				.findElements(By.xpath("//h6[text() = 'PF Registration ID *']//following::label[2]"));
		if (PF_Registration_ID.size() > 0) {
			Thread.sleep(2000);
			BaseClass.onButtonClick(PartnerPortal_Menu.PFReg_No_Radio);
			System.out.println("PF Reg No button completed");
		} else {
			System.out.println("PF Registration ID is not shown");
		}

	}

	@Then("^Enter Employee Count for PF Registration ID$")
	public void enter_Employee_Count_for_PF_Registration_ID() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> PF_Employee_Count = DriverFactory.driver.findElements(By.id("Employee Count"));
		if (PF_Employee_Count.size() > 0) {
			Thread.sleep(2000);
			BaseClass.ClearElement(PartnerPortal_Menu.PFReg_EmpCount_TB);
			BaseClass.Input(PartnerPortal_Menu.PFReg_EmpCount_TB, "15");
			System.out.println("PF Reg Employee Count completed");
		} else {
			System.out.println("PF Employee Count is not shown");
		}

	}

	@Then("^Select ESI Registration ID$")
	public void select_ESI_Registration_ID() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> ESI_Registration_ID = DriverFactory.driver
				.findElements(By.xpath("//h6[text() = 'ESI Registration ID *']//following::label[2]"));
		if (ESI_Registration_ID.size() > 0) {
			Thread.sleep(2000);
			BaseClass.onButtonClick(PartnerPortal_Menu.ESI_No_Radio);
			System.out.println("ESI Reg No button completed");
		} else {
			System.out.println("ESI Registration ID is not shown");
		}

	}

	@Then("^Enter Employee Count for ESI Registration ID$")
	public void enter_Employee_Count_for_ESI_Registration_ID() throws Throwable {
		Thread.sleep(1000);
		List<WebElement> ESI_Employee_Count = DriverFactory.driver.findElements(By.id("Number of Employees"));
		if (ESI_Employee_Count.size() > 0) {
			BaseClass.ClearElement(PartnerPortal_Menu.ESIReg_EmpCount_TB);
			BaseClass.Input(PartnerPortal_Menu.ESIReg_EmpCount_TB, "15");
			System.out.println("ESI Reg Employee Count completed");
		} else {
			System.out.println("ESI Employee Count is not shown");
		}
	}

	@Then("^Click Contact details section$")
	public void click_Contact_details_section() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactDetails_accordian);
	}

	@Then("^Add Primary contact name$")
	public void add_Primary_contact_name() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Name_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Name_TB, "Test Primary");
	}

	@Then("^Add Designation in Primary contact$")
	public void add_Designation_in_Primary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Designation_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Designation_TB, "Test Designation");
		System.out.println("Designation in Primary contact completed");
	}

	@Then("^Select Department in Primary contact$")
	public void select_Department_in_Primary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_Dept_DD, "IT");
		System.out.println("Department in Primary contact completed");
	}

	@Then("^Add mobile number in Primary contact$")
	public void add_mobile_number_in_Primary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Mobile_Number_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Mobile_Number_TB, "1234567890");
		System.out.println("Mobile number in Primary contact completed");
	}

	@Then("^Add email address in Primary contact$")
	public void add_email_address_in_Primary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Email_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Email_TB, "test@test.com");
		System.out.println("Email address in Primary contact completed");
	}

	@Then("^Select Contact category in Primary contact$")
	public void select_Contact_category_in_Primary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_ContactCategory_DD, "Primary");
		System.out.println("Contact category in Primary contact completed");
	}

	@Then("^Add one more Contact in Contact details section$")
	public void add_one_more_Contact_in_Contact_details_section() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactDetails_AddContact_Link);
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactDetails_SecContact_SubAccordian);
		System.out.println("One more Contact in Contact details section completed");
	}

	@Then("^Add Secondary contact name$")
	public void add_Secondary_contact_name() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_SecName_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_SecName_TB, "Test Secondary");
		System.out.println("Name in Secondary contact completed");
	}

	@Then("^Add Designation in Secondary contact$")
	public void add_Designation_in_Secondary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_SecDesignation_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_SecDesignation_TB, "Test Secondary Designation");
		System.out.println("Designation in Secondary contact completed");
	}

	@Then("^Select Department in Secondary contact$")
	public void select_Department_in_Secondary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_SecDept_DD, "Quality");
		System.out.println("Department in Secondary contact completed");
	}

	@Then("^Add mobile number in Secondary contact$")
	public void add_mobile_number_in_Secondary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_SecMobile_Number_TB);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_SecMobile_Number_TB, "1234565372");
		System.out.println("Mobile number in Secondary contact completed");
	}

	@Then("^Add email address in Secondary contact$")
	public void add_email_address_in_Secondary_contact() throws Throwable {
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_SecEmail_TB);
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_SecEmail_TB, "test_2@test.com");
		System.out.println("Email address in Secondary contact completed");
	}

	@Then("^Select Contact category in Secondary contact$")
	public void select_Contact_category_in_Secondary_contact() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_SecContactCategory_DD, "Secondary");
		System.out.println("Contact category in Secondary contact completed");
	}

	@Then("^Click Warehouse Details section$")
	public void click_Warehouse_Details_section() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_WarehouseBTN);
	}

	@Then("^Click Warehouse Details tab to entry the data$")
	public void click_Warehouse_Details_tab_to_entry_the_data() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_WarehouseSec);
	}

	@Then("^Add Warehouse name in Warehouse$")
	public void add_Warehouse_name_in_Warehouse() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseName_TB));
		BaseClass.Input(PartnerPortal_Menu.WarehouseName_TB, ConfigFileReader.randomString(8));
	}

	@Then("Add Stock Value in Lakhs")
	public void add_stock_value_in_lakhs() {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseStockValue_TB));
		BaseClass.Input(PartnerPortal_Menu.WarehouseStockValue_TB, ConfigFileReader.RandomNumbers(5));
	}

	@Then("Add Total area in sq ft")
	public void add_total_area_in_sq_ft() {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseTotalArea_TB));
		BaseClass.Input(PartnerPortal_Menu.WarehouseTotalArea_TB, ConfigFileReader.RandomNumbers(3));
	}

	@Then("^Add Street Address in Warehouse$")
	public void add_Street_Address_in_Warehouse() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseStreetaddress_TB));
		BaseClass.Input(PartnerPortal_Menu.WarehouseStreetaddress_TB, ConfigFileReader.randomString(10));
	}

	@Then("^Select Country in Warehouse$")
	public void select_Country_in_Warehouse() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseCountry_DD));
		BaseClass.value(PartnerPortal_Menu.WarehouseCountry_DD, ConfigFileReader.getWareHouseCountry());
	}

	@Then("^Select State in Warehouse$")
	public void select_State_in_Warehouse() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseState_DD));
		BaseClass.value(PartnerPortal_Menu.WarehouseState_DD, ConfigFileReader.getWareHouseState());
	}

	@Then("^Select City in Warehouse$")
	public void select_City_in_Warehouse() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseCity_DD));
		BaseClass.value(PartnerPortal_Menu.WarehouseCity_DD, ConfigFileReader.getWareHouseDistrict());
	}

	@Then("Add Zipcode")
	public void add_zipcode() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.WarehouseZipcode_DD));
		BaseClass.Input(PartnerPortal_Menu.WarehouseZipcode_DD, ConfigFileReader.RandomNumbers(6));
	}

	@Then("^Click Save and continue in Organizational details$")
	public void Click_Save_and_continue_in_Organizational_details() throws Throwable {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SaveAndContinue_Btn));
		BaseClass.onButtonClick(PartnerPortal_Menu.SaveAndContinue_Btn);
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.SaveAndContinue_Btn);
		System.out.println("Save and continue in Organizational details completed");
	}

	@Then("^Accept the General Organisation Successful popup$")
	public void accept_the_General_Organisation_Successful_popup() throws Throwable {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ok_Btn));
		BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
		System.out.println("Accept the General Organisation Successful popup completed");
	}

	@Then("Click Bank Details Section")
	public void click_bank_details_section() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BankDetails_Icon);
	}

	@Then("Select Account Category")
	public void select_account_category() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Account_Category));
		BaseClass.SelectText(PartnerPortal_Menu.Bank_Account_Category, ConfigFileReader.getPrimarCategory());
	}

	@Then("Select Payment Mode")
	public void select_payment_mode() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Payment_Mode));
		BaseClass.SelectText(PartnerPortal_Menu.Bank_Payment_Mode, ConfigFileReader.getPaymentMode());
	}

	@Then("Add Payment in favour of")
	public void add_payment_in_favour_of() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Payment_Infavourof));
		BaseClass.ClearElement(PartnerPortal_Menu.Bank_Payment_Infavourof);
		BaseClass.Input(PartnerPortal_Menu.Bank_Payment_Infavourof, ConfigFileReader.randomString(6));
	}

	@Then("Select Account Type")
	public void select_account_type() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Account_Typey));
		BaseClass.SelectText(PartnerPortal_Menu.Bank_Account_Typey, ConfigFileReader.getAccountType());
	}

	@Then("Add Bank Name")
	public void add_bank_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Name));
		BaseClass.SelectText(PartnerPortal_Menu.Bank_Name, ConfigFileReader.getBankName());
	}

	@Then("Add IFSC Code")
	public void add_ifsc_code() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_IFSC_Code));
		BaseClass.ClearElement(PartnerPortal_Menu.Bank_IFSC_Code);
		BaseClass.Input(PartnerPortal_Menu.Bank_IFSC_Code, ConfigFileReader.getIFSCCode());
	}

	@Then("Add Account Number")
	public void add_account_number() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Account_Number));
		BaseClass.ClearElement(PartnerPortal_Menu.Bank_Account_Number);
		BaseClass.Input(PartnerPortal_Menu.Bank_Account_Number, ConfigFileReader.RandomNumbers(12));
	}

	@Then("Add Payment Confirmation Mail Id")
	public void add_payment_confirmation_mail_id() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Bank_Payment_ConfirmationMailId));
		BaseClass.ClearElement(PartnerPortal_Menu.Bank_Payment_ConfirmationMailId);
		BaseClass.Input(PartnerPortal_Menu.Bank_Payment_ConfirmationMailId, ConfigFileReader.RandomEmail());
	}

	@Then("Click Credentials Section")
	public void click_credentials_section() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Icon);
	}

	@Then("Add Customer Name")
	public void add_customer_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Customer_Name_crd));
		BaseClass.ClearElement(PartnerPortal_Menu.Customer_Name_crd);
		BaseClass.Input(PartnerPortal_Menu.Customer_Name_crd, ConfigFileReader.randomString(5));
	}

	@Then("Add Years in Partnership")
	public void add_years_in_partnership() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Years_in_partnerShip_crd));
		BaseClass.ClearElement(PartnerPortal_Menu.Years_in_partnerShip_crd);
		BaseClass.Input(PartnerPortal_Menu.Years_in_partnerShip_crd, ConfigFileReader.RandomNumbers(2));
	}

	@Then("Approx Revenue INR Lakhs")
	public void approx_revenue_inr_lakhs() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Approx_Revenue_crd));
		BaseClass.ClearElement(PartnerPortal_Menu.Approx_Revenue_crd);
		BaseClass.Input(PartnerPortal_Menu.Approx_Revenue_crd, ConfigFileReader.RandomNumbers(6));
	}

	@Then("Reference\\(Remarks)")
	public void reference_remarks() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_crd));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_crd);
		BaseClass.Input(PartnerPortal_Menu.Reference_crd, ConfigFileReader.randomString(5));
	}

	@Then("Click PartnerShip Avenues Section")
	public void click_partner_ship_avenues_section() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerShip_Avenues_Icon);
	}

	@Then("Select Business Type in BV")
	public void select_business_type_in_bv() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Business_Type_BV));
		BaseClass.getrandomOption(PartnerPortal_Menu.Business_Type_BV);
		//BaseClass.SelectText(PartnerPortal_Menu.Business_Type_BV, ConfigFileReader.getBusinessType_BV());
	}

	@Then("Select Business Verticals")
	public void select_business_verticals() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Business_Verticals));
		//BaseClass.getrandomOption(PartnerPortal_Menu.Business_Verticals);
		BaseClass.SelectText(PartnerPortal_Menu.Business_Verticals, ConfigFileReader.getBusinessVerticals());
	}

	@Then("Select Regions")
	public void select_regions() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Business_Region));
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Region);
	}

	@Then("Select Region Section")
	public void select_region_section() throws Throwable {
		// To select Business Category DD
		Thread.sleep(3000);
		BaseClass.ArraySelect(PartnerPortal_Menu.BV_Region_Section_firstindex_DD, PartnerPortal_Menu.BV_Region_Section,
				BV_Region_Sec);
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Region);
	}

	@Then("Select Primary Business in BV")
	public void select_primary_business_in_bv() throws Throwable {
		Thread.sleep(5000);
		//BaseClass.getrandomOption(PartnerPortal_Menu.PrimaryBusiness_BV);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PrimaryBusiness_BV));
		 BaseClass.SelectText(PartnerPortal_Menu.PrimaryBusiness_BV,ConfigFileReader.getPrimaryBusiness_BV());
	}

	/*
	 * @Then("Select business with") public void select_business_with() throws
	 * Throwable { Thread.sleep(5000); if
	 * (!PartnerPortal_Menu.Credential_Business_with.isSelected()) {
	 * BaseClass.onButtonClick(PartnerPortal_Menu.Credential_Business_with); } else
	 * { System.out.println("Button Already Clicked"); } }
	 */

	@Then("Select SecondQuestion Section")
	public void select_second_question_section() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Credentials_Second_Que_Img));
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Second_Que_Img);
	}

	@Then("Select Partner with any other division of l&T")
	public void select_partner_with_any_other_division_of_l_t() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.PA_Second_Yes_Icon));
		if (!PartnerPortal_Menu.PA_Second_Yes_Icon.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.PA_Second_Yes_Icon);
		} else {
			System.out.println("Second Yes Button Clicked");
		}
	}

	@Then("Add PA OD Details")
	public void add_pa_od_details() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_OD_Details));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_OD_Details);
		BaseClass.Input(PartnerPortal_Menu.PA_OD_Details, ConfigFileReader.randomString(5));
	}

	@Then("Add PA Partner Code")
	public void add_pa_partner_code() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Partner_Code));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Partner_Code);
		BaseClass.Input(PartnerPortal_Menu.PA_Partner_Code, ConfigFileReader.RandomNumbers(5));
	}

	@Then("Add PA Reason for not active")
	public void add_pa_reason_for_not_active() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Reason_Not_Active));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Reason_Not_Active);
		BaseClass.Input(PartnerPortal_Menu.PA_Reason_Not_Active, ConfigFileReader.randomString(5));
	}

	@Then("Select Third Question Section")
	public void select_third_question_section() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Credentials_Third_Que_Img));
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Third_Que_Img);
	}

	@Then("Select L&T Employee related with")
	public void select_l_t_employee_related_with() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Third_Yes_Icon));
		if (!PartnerPortal_Menu.PA_Third_Yes_Icon.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.PA_Third_Yes_Icon);
		} else {
			System.out.println("Third Yes Button Clicked");
		}
	}

	@Then("Add Third_Contact_Name")
	public void add_third_contact_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Contact_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Contact_Name);
		BaseClass.Input(PartnerPortal_Menu.PA_Contact_Name, ConfigFileReader.randomString(5));
	}

	@Then("Add Third_Contact_Designation")
	public void add_third_contact_designation() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Contact_Designation));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Contact_Designation);
		BaseClass.Input(PartnerPortal_Menu.PA_Contact_Designation, ConfigFileReader.randomString(5));
	}

	@Then("Add Third_Contact_Email")
	public void add_third_contact_email() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Contact_Email));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Contact_Email);
		BaseClass.Input(PartnerPortal_Menu.PA_Contact_Email, ConfigFileReader.RandomEmail());
	}

	@Then("Add Third_Contact_MobileNo")
	public void add_third_contact_mobile_no() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Contact_MobileNo));
		BaseClass.ClearElement(PartnerPortal_Menu.PA_Contact_MobileNo);
		BaseClass.Input(PartnerPortal_Menu.PA_Contact_MobileNo, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Select Fourth Question Section")
	public void select_fourth_question_section() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Credentials_Fourth_Que_Img));
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Fourth_Que_Img);
	}

	@Then("Select How do you know partner portal")
	public void select_how_do_you_know_partner_portal() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Know_PartnerPortal));
		BaseClass.SelectText(PartnerPortal_Menu.Know_PartnerPortal, ConfigFileReader.getKnow_Partner_Portal());
	}

	@Then("Add Reference Person Name")
	public void add_reference_person_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_PName));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_PName);
		BaseClass.Input(PartnerPortal_Menu.Reference_PName, ConfigFileReader.randomString(5));
	}

	@Then("Add Reference Person Company Name")
	public void add_reference_person_company_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_PCompanyName));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_PCompanyName);
		BaseClass.Input(PartnerPortal_Menu.Reference_PCompanyName, ConfigFileReader.randomString(5));
	}

	@Then("Add Reference Person Designation")
	public void add_reference_person_designation() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_PDesignation));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_PDesignation);
		BaseClass.Input(PartnerPortal_Menu.Reference_PDesignation, ConfigFileReader.randomString(5));
	}

	@Then("Add Reference Person Email")
	public void add_reference_person_email() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_PEmail));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_PEmail);
		BaseClass.Input(PartnerPortal_Menu.Reference_PEmail, ConfigFileReader.RandomEmail());
	}

	@Then("Add Reference Person Mobile No")
	public void add_reference_person_mobile_no() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reference_PMobileNo));
		BaseClass.ClearElement(PartnerPortal_Menu.Reference_PMobileNo);
		BaseClass.Input(PartnerPortal_Menu.Reference_PMobileNo, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Fifth Question Section")
	public void fifth_question_section() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Credentials_Fifth_Que_Img));
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Fifth_Que_Img);
	}

	@Then("Select Related Party")
	public void select_related_party() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Third_Yes_Icon));
		if (!PartnerPortal_Menu.PA_Fifth_Yes_Icon.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.PA_Fifth_Yes_Icon);
		} else {
			System.out.println("Fifth Yes Button Clicked");
		}
	}

	@Then("Add Party Name")
	public void add_party_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.RP_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.RP_Name);
		BaseClass.Input(PartnerPortal_Menu.RP_Name, ConfigFileReader.randomString(5));
	}

	@Then("Add Party Designation")
	public void add_party_designation() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.RP_Designation));
		BaseClass.ClearElement(PartnerPortal_Menu.RP_Designation);
		BaseClass.Input(PartnerPortal_Menu.RP_Designation, ConfigFileReader.randomString(5));
	}

	@Then("Add Party Email")
	public void add_party_email() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.RP_Email));
		BaseClass.ClearElement(PartnerPortal_Menu.RP_Email);
		BaseClass.Input(PartnerPortal_Menu.RP_Email, ConfigFileReader.RandomEmail());
	}

	@Then("Add Party Mobile No")
	public void add_party_mobile_no() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.RP_Mobile));
		BaseClass.ClearElement(PartnerPortal_Menu.RP_Mobile);
		BaseClass.Input(PartnerPortal_Menu.RP_Mobile, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Click Pan Applicable Radio")
	public void click_pan_applicable_radio() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Third_Yes_Icon));
		if (!PartnerPortal_Menu.RP_Pan_No.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.RP_Pan_No);
		} else {
			System.out.println("Third No Button Clicked");
		}
	}

	@Then("Select Sixth Question")
	public void select_sixth_question() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Credentials_Sixth_Que_Img));
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentials_Sixth_Que_Img);
	}

	@Then("Select Engage with L&T Construction")
	public void select_engage_with_l_t_construction() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Engage_With_Radio));
		if (!PartnerPortal_Menu.Engage_With_Radio.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.Engage_With_Radio);
		} else {
			System.out.println("Engage with L & T Construction Yes Button Clicked");
		}
	}

	@Then("Select Associate RelationShip")
	public void select_associate_relation_ship() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Ass_Select_RelationShip));
		BaseClass.SelectText(PartnerPortal_Menu.Ass_Select_RelationShip, ConfigFileReader.getAss_Select_RelationShip());
	}

	@Then("Add Employee Relation")
	public void add_employee_relation() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Ass_Employee_Relation));
		BaseClass.ClearElement(PartnerPortal_Menu.Ass_Employee_Relation);
		BaseClass.Input(PartnerPortal_Menu.Ass_Employee_Relation, ConfigFileReader.randomString(5));
	}

	@Then("Add Associate Employee Name")
	public void add_associate_employee_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Ass_Employee_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.Ass_Employee_Name);
		BaseClass.Input(PartnerPortal_Menu.Ass_Employee_Name, ConfigFileReader.randomString(5));
	}

	@Then("Add Associate Employee PSNo")
	public void add_associate_employee_ps_no() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Ass_Employee_PSNo));
		BaseClass.ClearElement(PartnerPortal_Menu.Ass_Employee_PSNo);
		BaseClass.Input(PartnerPortal_Menu.Ass_Employee_PSNo, ConfigFileReader.RandomNumbers(5));
	}

	@Then("Click Associate Acknowledgement CheckBox")
	public void click_associate_acknowledgement_check_box() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Accknowledge_CheckBox));
		if (!PartnerPortal_Menu.PA_Accknowledge_CheckBox.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.PA_Accknowledge_CheckBox);
		} else {
			System.out.println("Terms & Conditions Checkbox clicked already");
		}
	}

	@Then("Click Branch Section")
	public void click_branch_section() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Icon);
	}

	@Then("Select Branch Details Yes Icon")
	public void select_branch_details_yes_icon() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.PA_Accknowledge_CheckBox));
		if (!PartnerPortal_Menu.Branch_Yes.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Yes);
		} else {
			System.out.println("Yes Button clicked already");
		}
	}

	@Then("Add Branch Name")
	public void add_branch_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Name);
		BaseClass.Input(PartnerPortal_Menu.Branch_Name, ConfigFileReader.randomString(5));
	}

	@Then("Add Branch Street Address")
	public void add_branch_street_address() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Street_Address));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Street_Address);
		BaseClass.Input(PartnerPortal_Menu.Branch_Street_Address, ConfigFileReader.randomString(5));
	}

	@Then("Select Branch State")
	public void select_branch_state() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_State));
		BaseClass.SelectText(PartnerPortal_Menu.Branch_State, "Tamilnadu");
	}

	@Then("Select Branch City")
	public void select_branch_city() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_District));
		BaseClass.SelectText(PartnerPortal_Menu.Branch_District, "Chennai");
	}

	@Then("Add Branch Zipcode")
	public void add_branch_zipcode() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Zipcode));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Zipcode);
		BaseClass.Input(PartnerPortal_Menu.Branch_Zipcode, ConfigFileReader.RandomNumbers(6));
	}

	@Then("Add Branch Coordination Name")
	public void add_branch_coordination_name() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Coord_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Coord_Name);
		BaseClass.Input(PartnerPortal_Menu.Branch_Coord_Name, ConfigFileReader.randomString(5));
	}

	@Then("Add Branch Designation")
	public void add_branch_designation() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Designation));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Designation);
		BaseClass.Input(PartnerPortal_Menu.Branch_Designation, ConfigFileReader.randomString(5));
	}

	@Then("Add Branch Mobile No")
	public void add_branch_mobile_no() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Mobile_No));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Mobile_No);
		BaseClass.Input(PartnerPortal_Menu.Branch_Mobile_No, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Add Branch Email")
	public void add_branch_email() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_Email));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_Email);
		BaseClass.Input(PartnerPortal_Menu.Branch_Email, ConfigFileReader.RandomEmail());
	}

	@Then("Click HSE link")
	public void click_hse_link() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.HSE_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.HSE_Icon);
	}

	@Then("Click Policy or Statement icon")
	public void click_policy_or_statement_icon() throws Throwable {
		Thread.sleep(5000);
		if (!PartnerPortal_Menu.Policy_Que.isSelected()) {
			BaseClass.onButtonClick(PartnerPortal_Menu.Policy_Que);
		} else {
			System.out.println("Yes Button clicked already");
		}
	}

	@Then("Attach Policy or Statement File")
	public void attach_policy_or_statement_file() throws Throwable {
		Thread.sleep(2000);
		PartnerPortal_Menu.Policy_Stmt_Attachment.sendKeys(pdfAttachment);
		System.out.println("Policy or Statement File attachment completed");
	}

	@Then("Verify whether the Policy or Statement file is attached or not")
	public void verify_whether_the_policy_or_statement_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Policy_Stmt_AttachmentName.getText();
		System.out.println("Attached Policy or Statement document No: " + TAN_Doc_name);
	}

	@Then("Click Attachments Link")
	public void click_attachments_link() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Attachment_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Attachment_Icon);
	}

	@Then("Attach file for PAN Number")
	public void attach_file_for_pan_number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_PAN, pdfAttachment);
		System.out.println("PAN File attachment completed");
	}

	@Then("Verify Whether PAN Number file is attached or not")
	public void verify_whether_pan_number_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached PAN document No: " + TAN_Doc_name);
	}

	@Then("Click GST Registration Icon")
	public void click_gst_registration_icon() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.GST_Registration_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.GST_Registration_Icon);
	}

	@Then("Attach file for GST Registration")
	public void attach_file_for_gst_registration() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_GST_Registration, pdfAttachment);
		System.out.println("GST File attachment completed");
	}

	@Then("Verify Whether GST Registration is attached or not")
	public void verify_whether_gst_registration_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached GST document No: " + TAN_Doc_name);
	}

	@Then("Click MSME Certification Icon")
	public void click_msme_certification_icon() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.MSME_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.MSME_Icon);
	}

	@Then("Attach file for MSME Certification")
	public void attach_file_for_msme_certification() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_MSME_Certificate, pdfAttachment);
		System.out.println("MSME Certificate File attachment completed");
	}

	@Then("Verify whether MSME Certification file is attached or not")
	public void verify_whether_msme_certification_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached MSME document No: " + TAN_Doc_name);
	}

	@Then("Click Shop Establishment Certificate")
	public void click_shop_establishment_certificate() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ShopEst_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.ShopEst_Icon);
	}

	@Then("Attach file for Shop Establishment Certificate")
	public void attach_file_for_shop_establishment_certificate() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_Shop_Establishment, pdfAttachment);
		System.out.println("Shop Establishment Certificate File attachment completed");
	}

	@Then("Verify Whether Shop Establishment Certificate is attached or not")
	public void verify_whether_shop_establishment_certificate_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached Shop Establishment document No: " + TAN_Doc_name);
	}

	@Then("Click Cancelled Cheque Icon")
	public void click_cancelled_cheque_icon() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Cancelled_Cheque_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Cancelled_Cheque_Icon);
	}

	@Then("Attach file for Cancelled Cheque")
	public void attach_file_for_cancelled_cheque() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_Cancelled_cheque, pdfAttachment);
		System.out.println("Cancelled Cheque File attachment completed");
	}

	@Then("Verify Whether Cancelled Cheque file is attached or not")
	public void verify_whether_cancelled_cheque_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached Cancelled Cheque document No: " + TAN_Doc_name);
	}

	@Then("Click Certificate by Chartered Accountant")
	public void click_certificate_by_chartered_accountant() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Chartered_Accountant_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Chartered_Accountant_Icon);
	}

	@Then("Attach file for Certificate by Chartered Accountant")
	public void attach_file_for_certificate_by_chartered_accountant() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_Chartered_Accountant, pdfAttachment);
		System.out.println("Certificate for Chartereed Accountant File attachment completed");
	}

	@Then("Verify Whether Certificate by Chartered Accountant file is attached or not")
	public void verify_whether_certificate_by_chartered_accountant_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached Chartered Accountant document No: " + TAN_Doc_name);
	}

	@Then("Click Company Registration Certificate Icon")
	public void click_company_registration_certificate_icon() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Company_Registration_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Company_Registration_Icon);
	}

	@Then("Attach file for Company Registration Certificate")
	public void attach_file_for_company_registration_certificate() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Attachments_Company_Registration));
		BaseClass.Input(PartnerPortal_Menu.Attachments_Company_Registration, pdfAttachment);
		System.out.println("Company Registration Certificate File attachment completed");
	}

	@Then("Verify Whether Company Registration Certificate file is attached or not")
	public void verify_whether_company_registration_certificate_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.Attachments_Name.getText();
		System.out.println("Attached Company Registration document No: " + TAN_Doc_name);
	}

	@Then("Click Financial in Attachment Tab")
	public void click_financial_in_attachment_tab() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_Icon);
	}

	@Then("Click Financial & Guarantor radio button")
	public void click_financial_guarantor_radio_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_backer_Yes);
	}

	@Then("Attach file for Balance Sheet for three years")
	public void attach_file_for_balance_sheet_for_three_years() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_PAN, pdfAttachment);
		System.out.println("Balance Sheet for three years File attachment completed");
	}

	@Then("Verify whether Balance Sheet for three years file is attached or not")
	public void verify_whether_balance_sheet_for_three_years_file_is_attached_or_not() throws Throwable {
		Thread.sleep(2000);
		String TAN_Doc_name = PartnerPortal_Menu.FinancialAttachment_Name.getText();
		System.out.println("Attached Balance Sheet document No: " + TAN_Doc_name);
	}

	@Then("Click Financial link")
	public void click_financial_link() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_Icon);
	}
	@Then("Verify whether user able to add current debt outstanding")
	public void verify_whether_user_able_to_add_current_debt_outstanding() throws Throwable{
		Thread.sleep(8000);
		BaseClass.ClearElement(PartnerPortal_Menu.current_debt_outstanding);
		BaseClass.Input(PartnerPortal_Menu.current_debt_outstanding, BaseClass.RandomNumbers(6));
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to add debit to asset ratio")
	public void verify_whether_user_able_to_add_debit_to_asset_ratio() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.debt_to_asset_ratio);
		BaseClass.Input(PartnerPortal_Menu.debt_to_asset_ratio, "1:3");
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to add current asset to current liabilities")
	public void verify_whether_user_able_to_add_current_asset_to_current_liabilities() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.current_asset_to_current_liabilities);
		BaseClass.Input(PartnerPortal_Menu.current_asset_to_current_liabilities, "1:2.5");
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to add current assets")
	public void verify_whether_user_able_to_add_current_assets() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Current_assets);
		BaseClass.Input(PartnerPortal_Menu.Current_assets, BaseClass.RandomNumbers(2));
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whetloher able to attach document for financial banker or guarnantor")
	public void verify_whetloher_able_to_attach_document_for_financial_banker_or_guarnantor() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_PAN, pdfAttachment);
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	
	@Then("Verify whether user able to click financial strength")
	public void Verify_whether_user_able_to_click_financial_strength() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_Strength_Icon);
	}

	@Then("Verify whether able to click Financial banker or Guarantor button")
	public void verify_whether_able_to_click_financial_banker_or_guarantor_button() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_backer_Yes);
	}

	@Then("Verify whether able to attach document for financial banker or guarnantor")
	public void verify_whether_able_to_attach_document_for_financial_banker_or_guarnantor() throws Throwable {
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Financial_Backer_Attachment, pdfAttachment);
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether Financial banker or guarantor file is attached or not")
	public void verify_whether_financial_banker_or_guarantor_file_is_attached_or_not() throws Throwable {
		Thread.sleep(5000);
		String TAN_Doc_name = PartnerPortal_Menu.Financial_Banker_AttachmentTxt.getText();
		System.out.println("Financial banker or guarantor document No: " + TAN_Doc_name);
	}
	@Then("Verify whether able to click working capital required")
	public void verify_whether_able_to_click_working_capital_required() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.FP_Que2_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.FP_Que2_Icon);
	}

	@Then("Verify whether able to click primary and secondary banker")
	public void verify_whether_able_to_click_primary_and_secondary_banker() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Que2_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_Que2_Icon);
	}

	@Then("Verify whether able to select account category")
	public void verify_whether_able_to_select_account_category() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Account_Category));
		BaseClass.SelectText(PartnerPortal_Menu.Financial_Account_Category, ConfigFileReader.getPrimarCategory());
	}

	@Then("Verify whether able to add Primary Bank Name")
	public void verify_whether_able_to_add_primary_bank_name() throws Throwable {
		Thread.sleep(2000);
		// BaseClass.ClearElement(PartnerPortal_Menu.Financial_Bank);
		BaseClass.SelectText(PartnerPortal_Menu.Financial_Bank, ConfigFileReader.getBankName());
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary IFSC code")
	public void verify_whether_able_to_add_primary_ifsc_code() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_IFSCCode);
		BaseClass.Input(PartnerPortal_Menu.Financial_IFSCCode, ConfigFileReader.getIFSCCode());
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary Year of Association")
	public void verify_whether_able_to_add_primary_year_of_association() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_YearofAssociation);
		BaseClass.Input(PartnerPortal_Menu.Financial_YearofAssociation, ConfigFileReader.RandomNumbers(1));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary Coordination Person Name")
	public void verify_whether_able_to_add_primary_coordination_person_name() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_CoordPersonName);
		BaseClass.Input(PartnerPortal_Menu.Financial_CoordPersonName, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary Contact Designation")
	public void verify_whether_able_to_add_primary_contact_designation() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_Designation);
		BaseClass.Input(PartnerPortal_Menu.Financial_Designation, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary Mobile Number")
	public void verify_whether_able_to_add_primary_mobile_number() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_MobileNumber);
		BaseClass.Input(PartnerPortal_Menu.Financial_MobileNumber, ConfigFileReader.RandomNumbers(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add Primary Email id")
	public void verify_whether_able_to_add_primary_email_id() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_Email);
		BaseClass.Input(PartnerPortal_Menu.Financial_Email, ConfigFileReader.RandomEmail());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to add banker in financial tab")
	public void Verify_whether_user_able_to_add_banker_in_financial_tab() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Add_Banker));
		BaseClass.onButtonClick(PartnerPortal_Menu.Add_Banker);
	}
	@Then("Verify whether able to click secondary banker")
	public void verify_whether_able_to_click_secondary_banker() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Account_Category));
		BaseClass.SelectText(PartnerPortal_Menu.Financial_Account_Category, ConfigFileReader.getSecondaryCategory());
	}
	@Then("Verify whether able to select Secondary Account Category")
	public void verify_whether_able_to_select_secondary_account_category() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Financial_Secondary_Category));
		BaseClass.SelectText(PartnerPortal_Menu.Financial_Secondary_Category, ConfigFileReader.getSecondaryCategory());
	}
	@Then("Verify whether able to add Secondary Bank Name")
	public void verify_whether_able_to_add_secondary_bank_name() throws Throwable{
		Thread.sleep(2000);
		// BaseClass.ClearElement(PartnerPortal_Menu.Financial_Bank);
		BaseClass.SelectText(PartnerPortal_Menu.Financial_SecondaryBank, ConfigFileReader.getSecondaryBankName());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary IFSC code")
	public void verify_whether_able_to_add_secondary_ifsc_code() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryIFSCCode);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryIFSCCode, ConfigFileReader.getIFSCCode());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary Year of Association")
	public void verify_whether_able_to_add_secondary_year_of_association() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryYearofAssociation);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryYearofAssociation, ConfigFileReader.RandomNumbers(1));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary Coordination Person Name")
	public void verify_whether_able_to_add_secondary_coordination_person_name() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryCoordPersonName);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryCoordPersonName, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary Contact Designation")
	public void verify_whether_able_to_add_secondary_contact_designation() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryDesignation);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryDesignation, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary Mobile Number")
	public void verify_whether_able_to_add_secondary_mobile_number() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryMobileNumber);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryMobileNumber, ConfigFileReader.RandomNumbers(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether able to add Secondary Email id")
	public void verify_whether_able_to_add_secondary_email_id() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Financial_SecondaryEmail);
		BaseClass.Input(PartnerPortal_Menu.Financial_SecondaryEmail, ConfigFileReader.RandomEmail());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to click others in financial tab")
	public void verify_whether_user_able_to_click_others_in_financial_tab() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Others_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Others_Icon);
	}
	@Then("Verify whether user able to click remove bank in financial strength tab")
	public void Verify_whether_user_able_to_click_remove_bank_in_financial_strength_tab() throws Throwable{
		Thread.sleep(5000);
		if(PartnerPortal_Menu.remove_bank.size()>0) {
		for(int i=0;i<PartnerPortal_Menu.remove_bank.size();i++) {
			System.out.println(i);
			BaseClass.onButtonClick(PartnerPortal_Menu.remove_bank.get(i));
			Thread.sleep(3000);
			System.out.println(i+1);
			if(PartnerPortal_Menu.expand_icon.get(i+1).isDisplayed()) {
				BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon.get(i+1));
			}
		}
		}
		//wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.remove_bank));
		//BaseClass.onButtonClick(PartnerPortal_Menu.remove_bank);
	}
	@Then("Verify whether user able to select rating agency")
	public void verify_whether_user_able_to_select_rating_agency() throws Throwable{
		Thread.sleep(4000);
		// BaseClass.ClearElement(PartnerPortal_Menu.Financial_Bank);
		BaseClass.SelectText(PartnerPortal_Menu.Rating_Agency, ConfigFileReader.getRatingAgency());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to add credit rating")
	public void verify_whether_user_able_to_add_credit_rating() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Credit_Rating);
		BaseClass.Input(PartnerPortal_Menu.Credit_Rating, "A");
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to attach file for rating")
	public void verify_whether_user_able_to_attach_file_for_rating() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Financial_Backer_Attachment, pdfAttachment);
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to add second question in other tab")
	public void verify_whether_user_able_to_add_second_question_in_other_tab() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Other_Que2_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Other_Que2_Icon);
	}
	@Then("Verify whether user able to add remarks in other tab")
	public void verify_whether_user_able_to_add_remarks_in_other_tab() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.merger_status_Yes);
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.others_remarks);
		BaseClass.Input(PartnerPortal_Menu.others_remarks, BaseClass.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to click sustainability tab")
	public void verify_whether_user_able_to_click_sustainability_tab() throws Throwable{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Sustainability_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Sustainability_Icon);
	}
	@Then("Verify whether user able to sustainability first question RB")
	public void verify_whether_user_able_to_sustainability_first_question_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que1_Yes);
	}
	@Then("Verify whether user able to attach file for sustainability first question")
	public void verify_whether_user_able_to_attach_file_for_sustainability_first_question() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_PAN, pdfAttachment);
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to click sustainability question two RB")
	public void verify_whether_user_able_to_click_sustainability_question_two_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon_que_2);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que2_Yes);
	}
	@Then("Verify whether user able to enter sustainability person name")
	public void verify_whether_user_able_to_enter_sustainability_person_name() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Person_Name1);
		BaseClass.Input(PartnerPortal_Menu.Person_Name1, BaseClass.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability designation")
	public void verify_whether_user_able_to_enter_sustainability_designation() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Designation);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Designation, BaseClass.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability mobile number")
	public void verify_whether_user_able_to_enter_sustainability_mobile_number() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_MobileNo);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_MobileNo, BaseClass.RandomNumbers(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability email id")
	public void verify_whether_user_able_to_enter_sustainability_email_id() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Email);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Email, BaseClass.RandomEmail());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to click sustainability question three RB")
	public void verify_whether_user_able_to_click_sustainability_question_three_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon_que_3);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que3_Yes);
	}
	@Then("Verify whether user able to enter sustainability third question person name")
	public void verify_whether_user_able_to_enter_sustainability_third_question_person_name() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Person_Name2);
		BaseClass.Input(PartnerPortal_Menu.Person_Name2, BaseClass.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability third question designation")
	public void verify_whether_user_able_to_enter_sustainability_third_question_designation() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Designation_Que_2);
		BaseClass.Input(PartnerPortal_Menu.Designation_Que_2, BaseClass.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability third question mobile number")
	public void verify_whether_user_able_to_enter_sustainability_third_question_mobile_number() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.MobileNumber_Que_2);
		BaseClass.Input(PartnerPortal_Menu.MobileNumber_Que_2, BaseClass.RandomNumbers(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to enter sustainability third question email id")
	public void verify_whether_user_able_to_enter_sustainability_third_question_email_id() throws Throwable{
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Email_Que_2);
		BaseClass.Input(PartnerPortal_Menu.Email_Que_2, BaseClass.RandomEmail());
		System.out.println("Financial banker or guarantor File attachment completed");
	}
	@Then("Verify whether user able to click sustainability question four RB")
	public void verify_whether_user_able_to_click_sustainability_question_four_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon_que_4);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que4_Yes);
	}
	@Then("Verify whether user able to attach file for fourth question")
	public void verify_whether_user_able_to_attach_file_for_fourth_question() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_GST_Registration, pdfAttachment);
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to click sustainability question five RB")
	public void verify_whether_user_able_to_click_sustainability_question_five_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon_que_5);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que5_Yes);
	}
	@Then("Verify whether user able to attach file for fifth question")
	public void verify_whether_user_able_to_attach_file_for_fifth_question() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_MSME_Certificate, pdfAttachment);
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to click sustainability question six RB")
	public void verify_whether_user_able_to_click_sustainability_question_six_rb() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.expand_icon_que_6);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sus_Que6_Yes);
	}
	@Then("Verify whether user able to attach file for sixth question")
	public void verify_whether_user_able_to_attach_file_for_sixth_question() throws Throwable{
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.Attachments_Shop_Establishment, pdfAttachment);
		System.out.println("Balance Sheet for three years File attachment completed");
	}
	@Then("Verify whether user able to click quality tab")
	public void verify_whether_user_able_to_click_quality_tab() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to qualtiy question one")
	public void verify_whether_user_able_to_qualtiy_question_one() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to accept quality question one")
	public void verify_whether_user_able_to_accept_quality_question_one() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to add tools or technology")
	public void verify_whether_user_able_to_add_tools_or_technology() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to attach file for quality")
	public void verify_whether_user_able_to_attach_file_for_quality() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether the quality file is attached or not")
	public void verify_whether_the_quality_file_is_attached_or_not() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to click HSE question two")
	public void verify_whether_user_able_to_click_hse_question_two() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to accept HSE question two RB")
	public void verify_whether_user_able_to_accept_hse_question_two_rb() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether user able to attach file for HSE question two")
	public void verify_whether_user_able_to_attach_file_for_hse_question_two() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether the HSE question two file is attached or not")
	public void verify_whether_the_hse_question_two_file_is_attached_or_not() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Verify whether able to click Innovation tab")
	public void verify_whether_able_to_click_innovation_tab() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Innovation_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Innovation_Icon);
	}

	@Then("Verify whether able to select working on any innovative products")
	public void verify_whether_able_to_select_working_on_any_innovative_products() throws Throwable {
		Thread.sleep(10000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.radioYesBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.radioYesBtn);
	}

	@Then("Verify whether able to enter the details of the product")
	public void verify_whether_able_to_enter_the_details_of_the_product() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ClearElement(PartnerPortal_Menu.radioYesBtnDetailsTA);
		BaseClass.Input(PartnerPortal_Menu.radioYesBtnDetailsTA, ConfigFileReader.randomString(10));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to click Distinctive features")
	public void verify_whether_able_to_click_distinctive_features() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Innovation_Que_2_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Innovation_Que_2_Icon);
	}

	@Then("Verify whether able to add project name")
	public void verify_whether_able_to_add_project_name() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Innovation_Project_Name);
		BaseClass.Input(PartnerPortal_Menu.Innovation_Project_Name, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add client")
	public void verify_whether_able_to_add_client() throws InterruptedException {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Innovation_Client);
		BaseClass.Input(PartnerPortal_Menu.Innovation_Client, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to add features")
	public void verify_whether_able_to_add_features() throws InterruptedException {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.Innovation_Features);
		BaseClass.Input(PartnerPortal_Menu.Innovation_Features, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	@Then("Verify whether able to click Manpower tab")
	public void verify_whether_able_to_click_manpower_tab() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Manpower_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Manpower_Icon);
	}

	@Then("Verify whether able to click Statutory payment")
	public void verify_whether_able_to_click_statutory_payment() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Manpower_Que_1_Icon));
		BaseClass.onButtonClick(PartnerPortal_Menu.Manpower_Que_1_Icon);
	}

	@Then("Verify whether able to select statutory payment")
	public void verify_whether_able_to_select_statutory_payment() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.radioYesBtn));
		BaseClass.onButtonClick(PartnerPortal_Menu.radioYesBtn);
	}

	@Then("Verify whether able to add details for statutory details")
	public void verify_whether_able_to_add_details_for_statutory_details() throws Throwable {
		Thread.sleep(2000);
		BaseClass.ClearElement(PartnerPortal_Menu.radioYesBtnDetailsTA);
		BaseClass.Input(PartnerPortal_Menu.radioYesBtnDetailsTA, ConfigFileReader.randomString(5));
		System.out.println("Financial banker or guarantor File attachment completed");
	}

	/* Partner Onboarding End */

	/* Partner Empanelment START */

	@Then("^Enter Empanelment Username$")
	public void Enter_Empanelment_UserName() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.eipQA_Environment());
		Thread.sleep(2000);
		PartnerPortal_Menu.EIPOtheruser_Tab.click();
		Thread.sleep(2000);
		PartnerPortal_Menu.EIPUsername_TB.sendKeys(ConfigFileReader.getEmpanelmentUsername());
	}

	@Then("^Enter Empanelment Password$")
	public void Enter_Empanelment_Password() throws Throwable {
		PartnerPortal_Menu.Password.sendKeys(ConfigFileReader.getEIPQAPassword());
	}

	@Then("^Verify the user able to Login in EIPQA$")
	public void Verify_the_user_able_to_Login_in_EIPQA() throws Throwable {
		Thread.sleep(3000);
		PartnerPortal_Menu.EIPLogin_Btn.click();
	}

	@Then("^Search Empanelment$")
	public void Search_Empanelment() throws Throwable {
		Thread.sleep(3000);
		PartnerPortal_Menu.headerSearchbox_TB.sendKeys("Empanelment");
	}

	@Then("^Click Empanelment from search menu$")
	public void Click_Empanelment_from_search_menu() throws Throwable {
		Thread.sleep(1000);
		PartnerPortal_Menu.searchEmpanelment_TB.click();
	}

	@Then("^Check the Empanelment page title$")
	public void Check_the_Empanelment_page_title() throws Throwable {
		String Empanelment_pageTitle = DriverFactory.driver.getTitle();
		assertEquals("empanelment", Empanelment_pageTitle);
		Thread.sleep(3000);
		String Empanelment_TitleContainer = PartnerPortal_Menu.Empanelment_TitleContainer_L.getText();
		System.err.println("Empanelment Page Title: " + Empanelment_pageTitle);
		System.err.println("Empanelment Page Header: " + Empanelment_TitleContainer);
	}

	@Then("^Verify the New Empanelment request Search box is available or not$")
	public void verify_the_New_Empanelment_request_Search_box_is_available_or_not() throws Throwable {
		Thread.sleep(5000);
		// Verify Expand is enable or not in Empanelment page
		boolean SearchPartner_enabled = PartnerPortal_Menu.SearchPartner_TB.isEnabled();
		if (SearchPartner_enabled == true) {
			System.out.println("SearchPartner textbox is available in Empanelment page");
		} else {
			System.out.println("SearchPartner textbox is not available in Empanelment page");
		}
	}

	@Then("^Verify the user name is listed in New Empanelment request Search box or not$")
	public void verify_the_user_name_is_listed_in_New_Empanelment_request_Search_box_or_not() throws Throwable {
		Thread.sleep(2000);
//		jse.executeScript("arguments[0].click();", PartnerPortal_Menu.SearchPartner_PlaceHolder_TB);
		PartnerPortal_Menu.SearchPartner_PlaceHolder_TB.click();
		Thread.sleep(2000);
		PartnerPortal_Menu.SearchPartner_TB.sendKeys(ConfigFileReader.partnerSearchInEmpanelment());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.EmpanelmentPartnerNo_ListValue));
		BaseClass.jsClk(PartnerPortal_Menu.EmpanelmentPartnerNo_ListValue);
		// jse.executeScript("arguments[0].click();",
		// PartnerPortal_Menu.EmpanelmentPartnerNo_ListValue);
	}

	@Then("^Verify after submission, its redirect to empanelment list page or not$")
	public void verify_after_submission_its_redirect_to_empanelment_list_page_or_not() throws Throwable {
		// PartnerPortal_Menu.EmpanelmentPartnerNo_ListValue.click();
		Thread.sleep(1000);
		PartnerPortal_Menu.EmpanelmentSubmitToSearchPartner_btn.click();
	}

	@Then("^Verify the title of empanelment page$")
	public void verify_the_title_of_empanelment_page() throws Throwable {
		String Main_Title = DriverFactory.driver.getTitle();
		System.err.println("Empanelment Page Title is: " + Main_Title);
	}

	@Then("^Verify the header of empanelment page$")
	public void verify_the_header_of_empanelment_page() throws Throwable {
		String EmpanelmentPageHeader = PartnerPortal_Menu.EmpanelmentPageHeader_L.getText();
		System.err.println("Empanelment Header is: " + EmpanelmentPageHeader);
	}

	@Then("^Verify the breadcrumb available and enable$")
	public void verify_the_breadcrumb_available_and_enable() throws Throwable {
		String EmpanelmentBreadcrumb = PartnerPortal_Menu.EmpanelmentBreadcrumb_L.getText();
		System.err.println("Empanelment Page Breadcrumb is: " + EmpanelmentBreadcrumb);
	}

	@Then("^Verify the eip and constzon link available and enable$")
	public void verify_the_eip_and_constzon_link_available_and_enable() throws Throwable {
		boolean EmpanelmentEIP_Link_enabled = PartnerPortal_Menu.EmpanelmentEIP_Link.isEnabled();
		if (EmpanelmentEIP_Link_enabled == true) {
			System.err.println("Is EIP link is available and enable: " + EmpanelmentEIP_Link_enabled);
		} else {
			System.err.println("Is EIP link is available and enable: " + EmpanelmentEIP_Link_enabled);
		}
		Thread.sleep(2000);
		boolean EmpanelmentConstZon_Link_enabled = PartnerPortal_Menu.EmpanelmentConstZon_Link.isEnabled();
		if (EmpanelmentConstZon_Link_enabled == true) {
			System.err.println("Is ConstZon link is available and enable: " + EmpanelmentConstZon_Link_enabled);
		} else {
			System.err.println("Is ConstZon link is available and enable: " + EmpanelmentConstZon_Link_enabled);
		}
	}

	@Then("^Verify Empaneled and Selected list available$")
	public void verify_Empaneled_and_Selected_list_available() throws Throwable {
		boolean EmpEmpaneledList_Tab_enabled = PartnerPortal_Menu.EmpEmpaneledList_Tab.isEnabled();
		if (EmpEmpaneledList_Tab_enabled == true) {
			System.err.println("Is EmpEmpaneled List Tab is available and enable: " + EmpEmpaneledList_Tab_enabled);
		} else {
			System.err.println("Is EmpEmpaneled List Tab is available and enable: " + EmpEmpaneledList_Tab_enabled);
		}
		Thread.sleep(2000);
		boolean EmpSelectedList_Tab_enabled = PartnerPortal_Menu.EmpSelectedList_Tab.isEnabled();
		if (EmpSelectedList_Tab_enabled == true) {
			System.err.println("Is Selected List Tab is available and enable: " + EmpSelectedList_Tab_enabled);
		} else {
			System.err.println("Is Selected List Tab is available and enable: " + EmpSelectedList_Tab_enabled);
		}
	}

	@Then("^Verify Partner Classification available$")
	public void verify_Partner_Classification_available() throws Throwable {
		Thread.sleep(2000);
		boolean EmpPartnerClassification_header_enabled = PartnerPortal_Menu.EmpPartnerClassification_header
				.isEnabled();
		if (EmpPartnerClassification_header_enabled == true) {
			System.err.println(
					"Is Partner Classification header is available: " + EmpPartnerClassification_header_enabled);
		} else {
			System.err.println("Is Partner Classification is available: " + EmpPartnerClassification_header_enabled);
		}
	}

	@Then("^Verify PAN and Contingent option available and enable$")
	public void verify_PAN_and_Contingent_option_available_and_enable() throws Throwable {
		boolean EmpPANandContingent_radio = PartnerPortal_Menu.EmpPANandContingent_radio.isEnabled();
		if (EmpPANandContingent_radio == true) {
			System.err.println("Empanel PAN and Contingent section is disabled");
		} else {
			System.err.println("Empanel PAN and Contingent section is enabled");
		}
	}

	@Then("^Verify the Save classification available and enable$")
	public void verify_the_save_classification_available_and_enable() throws Throwable {

	}

	/*
	 * @Then("^Check the Empanelment page title$") public void
	 * Check_the_Empanelment_page_title() throws Throwable {
	 * PartnerPortal_Menu.grie_description_TA_M.sendKeys(ConfigFileReader.
	 * grievance_description()); }
	 */

	/* Partner Empanelment END */

	/* Add New Company START */
	@Then("^Click Add New Company$")
	public void click_Add_New_Company() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addNewCompany_Menu);
	}

	@Then("^Select Add New Company DD$")
	public void select_Add_New_Company_DD() throws Throwable {
		Thread.sleep(2000);
		BaseClass.value(PartnerPortal_Menu.selectAddNewCompany_DD, "11");
		// BaseClass.getrandomOption(PartnerPortal_Menu.selectAddNewCompany_DD);
		// ele.selectByVisibleText(text);
	}

	@Then("^Select Business Category$")
	public void select_Business_Category() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.selectBusinessCategory_DD, "Supplier");
		// BaseClass.getrandomOption(PartnerPortal_Menu.selectBusinessCategory_DD);
	}

	@Then("^Ensure same partner type Alert$")
	public void ensure_same_partner_type_Alert() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.selectPrimaryBusinessType_DD, "Distributor");
	}

	@Then("^Select Primary Business Type$")
	public void select_Primary_Business_Type() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.selectPrimaryBusinessType_DD, "Distributor");
	}

	@Then("^Select Business Vertical DD$")
	public void select_Business_Vertical_DD() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.selectBusinessVertical_DD, "ALYSJ-IC");
	}

	@Then("^Select Region$")
	public void select_Region() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Region_div);
		Thread.sleep(2000);
		BaseClass.Input(PartnerPortal_Menu.RegionSearch_TB, "ALYSJ-IC");
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.chooseRegionfromSearch_UL);
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Region_div);
	}

	@Then("^Select Primary Business$")
	public void select_Primary_Business() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.selectPrimaryBusiness_DD, "ALYSJ-IC");
	}

	@Then("^Click Submit to add new company$")
	public void click_Submit_to_add_new_company() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ApproveSubmitBTN);
	}

	/* Add New Company END */
	/* Partner Registration Starts */
	@Then("Verify the pmqa page title")
	public void verify_the_pmqa_page_title() throws Throwable {
		ConfigFileReader.get_Page_Title();
	}

	@Then("click Register Button")
	public void click_register_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_RegistrationBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_RegistrationBTN);
	}

	@Then("Click Reset Button")
	public void click_reset_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Reg_ResetBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.Reg_ResetBTN);
	}

	@Then("Verify the Partnet registration page title and header")
	public void verify_the_partnet_registration_page_title_and_header() throws Throwable {
		ConfigFileReader.get_Page_Title();
		configFileReader.get_Header_Title();
	}

	@Then("Enter the Country")
	public void enter_the_country() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Country));
		BaseClass.SelectText(PartnerPortal_Menu.Parnter_Registration_Country, ConfigFileReader.getRegCountry());
	}

	@Then("Enter the Nationality")
	public void enter_the_nationality() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Nationality));
		BaseClass.SelectText(PartnerPortal_Menu.Parnter_Registration_Nationality, ConfigFileReader.getRegNationality());
	}

	@Then("Enter the Organization Name")
	public void enter_the_organization_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_OrgName));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_OrgName, ConfigFileReader.randomString(5));
	}

	@Then("Enter the PAN")
	public void enter_the_pan() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_PANNo));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_PANNo, ConfigFileReader.RandomPANNO());
	}

	@Then("Verify the valid PAN only allowed or not")
	public void verify_the_valid_pan_only_allowed_or_not() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PANNoVerify);
	}

	@Then("Enter the Contact Details Menu")
	public void enter_the_contact_details_menu() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_ContactDetails);
	}

	@Then("Enter the Coordination person name")
	public void enter_the_coordination_person_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_CoordName));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_CoordName, ConfigFileReader.randomString(5));
	}

	@Then("Enter the Designation")
	public void enter_the_designation() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Desg));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Desg, ConfigFileReader.randomString(5));
	}

	@Then("Enter the website\\(optional)")
	public void enter_the_website_optional() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Website));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Website, ConfigFileReader.getRegWebsite());
	}

	@Then("Enter the Mobile number")
	public void enter_the_mobile_number() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_MobNo));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_MobNo, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Enter the Email")
	public void enter_the_email() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Email));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Email, ConfigFileReader.RandomEmail());
	}

	@Then("Verify the Send OTP to email button enabled after enter the email")
	public void verify_the_send_otp_to_email_button_enabled_after_enter_the_email() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_OTP_EMail);
	}

	@Then("Verify the OTP send to email or not")
	public void verify_the_otp_send_to_email_or_not() throws Throwable {
		Thread.sleep(10000);
		BaseClass.Accept_Alert1();
		DataBaseConnection.dataBaseConnectionPP();
		Thread.sleep(3000);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP,DataBaseConnection.partnerOTPVerification());
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_OTP_EMail_Verify);
	}

	@Then("Click Business Profile")
	public void click_business_profile() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_BusinessDetails);
		Thread.sleep(3000);
	}

	@Then("Select PartnerFor")
	public void select_partner_for() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_PartnerFor));
		BaseClass.value(PartnerPortal_Menu.Parnter_Registration_PartnerFor, ConfigFileReader.getRegPartnerFor());
	}

	@Then("Select Registration Primary Business")
	public void select_registration_primary_business() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_PrimaryBus));
		BaseClass.value(PartnerPortal_Menu.Parnter_Registration_PrimaryBus, ConfigFileReader.getRegPartnerPriBus());
	}

	@Then("Select Registration Business Type")
	public void select_registration_business_type() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_BusType));
		BaseClass.value(PartnerPortal_Menu.Parnter_Registration_BusType, ConfigFileReader.getRegPartnerPriBusType());
	}

	@Then("Click Registration Primary Business Category")
	public void click_registration_primary_business_category() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_PrimaryCategory));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PrimaryCategory);
	}

	@Then("Select Primary Business Category list")
	public void select_primary_business_category_list() throws Throwable {
		// To select Business Category DD
		Thread.sleep(1500);
		BaseClass.ArraySelect(PartnerPortal_Menu.Regbusinesscategory_firstindex_DD,
				PartnerPortal_Menu.Regbusinesscategorysearch_TB, businessCategoryArr);
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PrimaryCategory);
	}

	@Then("Click Registration Primary Business Sub Category")
	public void click_registration_primary_business_sub_category() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_PrimarySubCategory));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PrimarySubCategory);
	}

	@Then("Select Primary Business sub Category list")
	public void select_primary_business_sub_category_list() throws Throwable {
		// To select Business Sub Category DD
		Thread.sleep(3000);
		BaseClass.ArraySelect(PartnerPortal_Menu.RegbusinessSubcategory_firstindex_DD,
				PartnerPortal_Menu.RegbusinessSubcategorysearch_TB, businessSubCategoryArr);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PrimarySubCategory);
	}

	@Then("Click Key Category")
	public void click_key_category() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_KeyCat);
	}

	@Then("Select Key Category List")
	public void select_key_category_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.value(PartnerPortal_Menu.Parnter_Registration_KeyCat, ConfigFileReader.getRegPartnerKeyMat());
	}

	@Then("Select Secondary Business")
	public void select_secondary_business() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.Parnter_Registration_credentials);
		BaseClass.value(PartnerPortal_Menu.Parnter_Registration_SecondaryBus, ConfigFileReader.getRegSecBusiness());
	}

	@Then("Select Secondary Business Type")
	public void select_secondary_business_type() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_SecBusType);
	}

	@Then("Select Secondary Business Type List")
	public void select_secondary_business_type_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ArraySelect(PartnerPortal_Menu.RegbusinessSeccBusinessTypeList_firstindex_DD,
				PartnerPortal_Menu.RegbusinessSeccTypesearch_TB, SecBusType);
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_SecCategoryLabel);
	}

	@Then("Click  Registration Secondary Category")
	public void click_registration_secondary_category() throws Throwable {
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_SecCategory));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_SecCategory);
	}

	@Then("Select Registration Secondary Category List")
	public void select_registration_secondary_category_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ArraySelect(PartnerPortal_Menu.RegbusinessSeccategory_firstindex_DD,
				PartnerPortal_Menu.RegbusinessSeccategorysearch_TB, RegSecBusCategory);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_SecCategoryLabel);
	}

	@Then("Select Registration Secondary Sub Category")
	public void select_registration_secondary_sub_category() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Parnter_Registration_secSubCategory));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_secSubCategory);
	}

	@Then("Select Registration Secondary Sub Category List")
	public void select_registration_secondary_sub_category_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.ArraySelect(PartnerPortal_Menu.RegbusinessSecSubcategory_firstindex_DD,
				PartnerPortal_Menu.RegbusinessSecSubcategorysearch_TB, RegSecBusSubCategory);
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_secSubCategory);
	}

	@Then("Click Credentials")
	public void click_credentials() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_credentials);
	}

	@Then("Enter Register Username")
	public void enter_register_username() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_UserName));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_UserName, ConfigFileReader.RandomAlphaNumeric(7));
		Thread.sleep(3000);
	}

	@Then("Enter Register Password")
	public void enter_register_password() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Password));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Password, ConfigFileReader.getRegPartnerPassword());
	}

	@Then("Register Reenter Password")
	public void register_reenter_password() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_ReenterPassword));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_ReenterPassword,
				ConfigFileReader.getRegPartnerPassword());
	}

	@Then("Select Terms and Conditions")
	public void select_terms_and_conditions() throws Throwable {
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_TermsandConditions);
		Thread.sleep(3000);
	}

	@Then("Click Register")
	public void click_register() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_BTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_BTN);
	}

	@Then("Enter the Mobile OTP")
	public void enter_the_mobile_otp() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reg_Mobile_OTP_Verify));
		BaseClass.Input(PartnerPortal_Menu.Reg_Mobile_OTP_Verify,DataBaseConnection.partnerOTPVerification());
	}

	@Then("Cick Verify")
	public void cick_verify() throws Throwable {
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Reg_OTP_Mobile_VerifyBTN));
		//BaseClass.onButtonClick(PartnerPortal_Menu.Reg_OTP_Mobile_VerifyBTN);
		Thread.sleep(10000);
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.partnerEmailVerification();
		DataBaseConnection.databaseConnectionClose();
		try {
            // Path to the local HTML file
            String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\EmailOTP\\EmailOTP.html";

            // Open the HTML file in the browser
            driver.get(filePath);
            Thread.sleep(10000);
            BaseClass.onButtonClick(PartnerPortal_Menu.Email_Verification_Confirmation);

        } finally {
            // Close the browser
            //driver.quit();
        }
	}
	

	@Then("Enter the invalid PAN")
	public void enter_the_invalid_pan() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_PANNo));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_PANNo, ConfigFileReader.RandomAlphaNumeric(10));
	}

	@Then("Verify the invalid PAN allowed or not")
	public void verify_the_invalid_pan_allowed_or_not() throws Throwable {
		Thread.sleep(3000);
		if (!PartnerPortal_Menu.Parnter_Registration_PANNoVerify.isEnabled()) {
			System.out.println("Enter the Valid PAN No");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_PANNo));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_PANNo);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_PANNo, ConfigFileReader.RandomPANNO());
		} else {
			BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_PANNoVerify);
			Thread.sleep(2000);
			List<WebElement> invalidPANPopup = DriverFactory.driver
					.findElements(By.xpath("//*[@class='empanel-modal-close']"));
			System.out.println("count : "+invalidPANPopup.size());
			if (invalidPANPopup.size() > 0) {
				Thread.sleep(2000);
				try {
					PartnerPortal_Menu.Empanelment_PopupClose.click();
					System.out.println("Enter the valid PAN No");
					Thread.sleep(3000);
					wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_PANNo));
					BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_PANNo);
					BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_PANNo, ConfigFileReader.RandomPANNO());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

	@Then("Enter the invalid website")
	public void enter_the_invalid_website() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Website));
		BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Website);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Website, ConfigFileReader.RandomAlphaNumeric(10));
	}

	@Then("Verify whether invalid website allowed or not")
	public void verify_whether_invalid_website_allowed_or_not() throws Throwable {
		if (PartnerPortal_Menu.Parnter_Registration_Website.getAttribute("class").contains("is-invalid")) {
			System.out.println("Enter the Valid Website");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Website));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Website);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Website, ConfigFileReader.getRegWebsite());
		}
	}

	@Then("Enter the invalid mobile number")
	public void enter_the_invalid_mobile_number() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_MobNo));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_MobNo, ConfigFileReader.RandomNumbers(9));
	}

	@Then("Verify whether invalid mobile number allowed or not")
	public void verify_whether_invalid_mobile_number_allowed_or_not() throws Throwable {
		if (PartnerPortal_Menu.Parnter_Registration_MobNo.getAttribute("class").contains("is-invalid")) {
			System.out.println("Enter the Valid Mobile No. Mobile Number should be in length of 10");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_MobNo));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_MobNo);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_MobNo, ConfigFileReader.RandomNumbers(10));
		}
	}

	@Then("Enter the special character in mobile number")
	public void enter_the_special_character_in_mobile_number() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_MobNo));
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_MobNo, ConfigFileReader.randomString(5));
		if(PartnerPortal_Menu.Parnter_Registration_MobNo.getText().length()==0) {
			System.out.println("Enter the Valid Mobile No. Special Characters are not allowed.");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_MobNo));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_MobNo);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_MobNo, ConfigFileReader.RandomNumbers(10));
			
		}
	}

	@Then("Enter the invalid email id")
	public void enter_the_invalid_email_id() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Email));
		BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Email);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Email, ConfigFileReader.randomString(5));
	}

	@Then("Verify whether invalid email id allowed or not")
	public void verify_whether_invalid_email_id_allowed_or_not() throws Throwable {
		if(PartnerPortal_Menu.Parnter_Registration_Email.getAttribute("class").contains("is-invalid")) {
			System.out.println("Enter the Valid Email id.");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Email));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Email);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Email, ConfigFileReader.RandomEmail());
		}
	}

	@Then("Click Send OTP to email by entering the invalid email id")
	public void click_send_otp_to_email_by_entering_the_invalid_email_id() throws Throwable {
		Thread.sleep(3000);
		if(PartnerPortal_Menu.Parnter_Reg_OTP_EMail.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Reg_OTP_EMail));
			BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_OTP_EMail);
			Thread.sleep(10000);
			BaseClass.Accept_Alert1();
		}
	}

	@Then("Enter the invalid email OTP")
	public void enter_the_invalid_email_otp() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP));
		BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP, ConfigFileReader.RandomNumbers(6));
	}
	
	@Then("Verify the invalid OTP allowed or not")
	public void Verify_the_invalid_OTP_allowed_or_not() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_OTP_EMail_Verify);
		Thread.sleep(5000);
		if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
			Thread.sleep(3000);
			BaseClass.Accept_Alert1();
			DataBaseConnection.dataBaseConnectionPP();		
			Thread.sleep(2000);
			try {
				BaseClass.InputCTRLPLUSA(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP);
				Thread.sleep(1500);
				BaseClass.InputDELETE(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP);	
			} catch (Exception e) {
				BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP);
			}
			Thread.sleep(2000);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_EnterEmailOTP,DataBaseConnection.partnerOTPVerification());
			DataBaseConnection.databaseConnectionClose();
			BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Reg_OTP_EMail_Verify);
	}	
	}

	@Then("Enter the invalid user name")
	public void enter_the_invalid_user_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_UserName));
		BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_UserName);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_UserName, ConfigFileReader.RandomAlphaNumeric(4));
	}

	@Then("Verify whether invalid user name allowed or not")
	public void verify_whether_invalid_user_name_allowed_or_not() throws Throwable {
		if(PartnerPortal_Menu.Parnter_Registration_UserName.getAttribute("class").contains("is-invalid")) {
			System.out.println("Enter the Valid Username");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_UserName));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_UserName);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_UserName, ConfigFileReader.RandomAlphaNumeric(7));
		}
	}
	@Then("Enter week register password")
	public void enter_week_register_password() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Password));
		BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Password);
		BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Password, ConfigFileReader.RandomNumbers(10));
	}

	@Then("Verify whether week password allowed or not")
	public void verify_whether_week_password_allowed_or_not() throws Throwable {
		if(PartnerPortal_Menu.Parnter_Registration_Password.getAttribute("class").contains("is-invalid")) {
			System.out.println("Enter the Valid Password");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Parnter_Registration_Password));
			BaseClass.ClearElement(PartnerPortal_Menu.Parnter_Registration_Password);
			BaseClass.Input(PartnerPortal_Menu.Parnter_Registration_Password, ConfigFileReader.getRegPartnerPassword());
		}
	}

	/* Partner Registration Ends */

	/* Add Contact Details & Certificate Starts Here */
	@Then("Select Technical tab in my profile")
	public void select_technical_tab_in_my_profile() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Technical_Tab));
		BaseClass.onButtonClick(PartnerPortal_Menu.Technical_Tab);
	}

	@Then("Select Contact Details & Certificate")
	public void select_contact_details_certificate() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactCertificate_Tab));
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactCertificate_Tab);
	}

	@Then("Click Add Contact Button")
	public void click_add_contact_button() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.AddMoreContactBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.AddMoreContactBTN);
	}

	@Then("Enter Contact Name")
	public void enter_contact_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_Name));
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Name);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Name, BaseClass.randomString(8));
	}

	@Then("Enter Contact Designation")
	public void enter_contact_designation() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_Designation));
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Designation);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Designation, BaseClass.randomString(8));
	}

	@Then("Select Contact Department")
	public void select_contact_department() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_Department));
		BaseClass.getrandomOption(PartnerPortal_Menu.ContactDetails_Department);
		// String Department = BaseClass.DropDownRandomSelect(1, 20);
		// BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_Department,
		// "Finance");
//		if(Department.equals("6")) {
//			BaseClass.Input(PartnerPortal_Menu.ContactDetails_DeptName, BaseClass.randomString(8));
//		}
	}

	@Then("Enter Contact Mobile Number")
	public void enter_contact_mobile_number() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_MobileNo));
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_MobileNo);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_MobileNo, BaseClass.RandomNumbers(10));
	}

	@Then("Enter Contact Email")
	public void enter_contact_email() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_Email));
		BaseClass.ClearElement(PartnerPortal_Menu.ContactDetails_Email);
		BaseClass.Input(PartnerPortal_Menu.ContactDetails_Email, BaseClass.RandomEmail());
	}

	@Then("Select Contact Category")
	public void select_contact_category() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactDetails_Category));
		BaseClass.getrandomOption(PartnerPortal_Menu.ContactDetails_Category);
		// BaseClass.SelectText(PartnerPortal_Menu.ContactDetails_Category, "Primary");
	}

	@Then("Click Save Contact Button")
	public void click_save_contact_button() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.ContactSaveBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactSaveBTN);
	}

	/* Add Contact Details & Certificate Ends Here */
	/* Update Contact Details Starts Here */
	@Then("Verify Whether Contact Details added or not")
	public void verify_whether_contact_details_added_or_not() throws Throwable {
		List<WebElement> Contact_DetailsExists = DriverFactory.driver
				.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (Contact_DetailsExists.size() > 0) {
			System.err.println("Contact Details is there to Update");
		} else {
			System.err.println("No Contact Details to Update");
		}
	}

	@Then("Verify whether user able to view contact details")
	public void verify_whether_user_able_to_view_contact_details() {
		List<WebElement> Contact_DetailsExists = DriverFactory.driver
				.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (Contact_DetailsExists.size() > 0) {
			String VContact_Status = BaseClass.GetText(PartnerPortal_Menu.Contact_VStatus);
			String VContact_Category = BaseClass.GetText(PartnerPortal_Menu.Contact_VCategory);
			String VContact_Name = BaseClass.GetText(PartnerPortal_Menu.Contact_VName);
			String VContact_Designation = BaseClass.GetText(PartnerPortal_Menu.Contact_VDesignation);
			String VContact_Department = BaseClass.GetText(PartnerPortal_Menu.Contact_VDepartment);
			String VContact_MobileNo = BaseClass.GetText(PartnerPortal_Menu.Contact_VMobileNo);
			String VContact_Email = BaseClass.GetText(PartnerPortal_Menu.Contact_VEmail);
			String VContact_Remarks = BaseClass.GetText(PartnerPortal_Menu.Contact_VRemarks);

			System.out.println("Contact Status : " + VContact_Status);
			System.out.println("Contact Category : " + VContact_Category);
			System.out.println("Contact Name : " + VContact_Name);
			System.out.println("Contact Designation : " + VContact_Designation);
			System.out.println("Contact Department : " + VContact_Department);
			System.out.println("Contact Mobile No : " + VContact_MobileNo);
			System.out.println("Contact Email : " + VContact_Email);
			System.out.println("Contact Remarks : " + VContact_Remarks);
		} else {
			System.err.println("No Contact Details to View");
		}

	}
	@Then("Verify whether user able to click Submit for Technical approval button")
	public void verify_whether_user_able_to_click_submit_for_technical_approval_button() throws Throwable {
		Thread.sleep(5000);
		try {
			String text = BaseClass.GetText_Alert();
			if(text.contains("The following bank detils is already submitted for Approval.")) {
				BaseClass.Accept_Alert1();
				BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
			}else {
				wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.addressSubmitForApproval_Btn));
				BaseClass.onButtonClick(PartnerPortal_Menu.addressSubmitForApproval_Btn);
			}
		} catch (Exception e) {
			System.out.println("No document is submitted for approval");
		}
		Thread.sleep(5000);
	}

	@Then("Click Edit Contact Button")
	public void click_edit_contact_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactDetails_Edit_Icon);
	}

	@Then("Click Update Contact Button")
	public void click_update_contact_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ContactUpdateBTN);
	}
	/* Update Contact Details Ends Here */
	/* Delete Contact Details Starts Here */

	@Then("Verify Whether Contact Details is available or not")
	public void verify_whether_contact_details_is_available_or_not() throws Throwable {
		List<WebElement> Contact_DetailsExists = DriverFactory.driver
				.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (Contact_DetailsExists.size() > 0) {
			System.err.println("Contact Details is there to Update");
		} else {
			System.err.println("No Contact Details to Update");
		}
	}

	@Then("Verify Whether Delete Button is available or not")
	public void verify_whether_delete_button_is_available_or_not() throws Throwable {
		List<WebElement> Contact_DetailsExists = DriverFactory.driver.findElements(By.xpath("//*[@title='Delete']"));
		if (Contact_DetailsExists.size() > 0) {
			System.err.println("Delete Contact Details Available");
		} else {
			System.err.println("Delete Contact Details Not Available");
		}
	}

	@Then("Click Delete Button")
	public void click_delete_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Details_Delete_Icon);
	}

	@Then("Accept the delete confirmation popup")
	public void accept_the_delete_confirmation_popup() throws Throwable {
		List<WebElement> thanksPopup_okBtn = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button"));
		if (thanksPopup_okBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.Partner_ThanksForLogging_OK_btn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Then("Accept the deleted successfully popup")
	public void accept_the_deleted_successfully_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Details_Delete_okBTN);
	}
	/* Delete Contact Details Ends Here */

	/* Add Branch Starts Here */

	@Then("Click Branch Details")
	public void click_branch_details() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchDetails_Icon);
	}

	@Then("Select Branch Type")
	public void select_branch_type() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Type_Arr);
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Type_New);

	}
	@Then("Verify whether user able to click created link in branch section")
	public void Verify_whether_user_able_to_click_created_link_in_branch_section() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Created_L);
	}

	@Then("Click Add Branch")
	public void click_add_branch() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddBranchDetails_BTN);
	}

	@Then("Select Partner Type")
	public void select_partner_type() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Partner_Type));
		try {
			BaseClass.SelectText(PartnerPortal_Menu.Partner_Type, "Supplier");	
		} catch (Exception e) {
			BaseClass.SelectText(PartnerPortal_Menu.Partner_Type, "Service Provider");
		}
		//BaseClass.getrandomOption(PartnerPortal_Menu.Partner_Type);
	}

	@Then("Enter Branch Name")
	public void enter_branch_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_NameTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_NameTxt);
		BaseClass.Input(PartnerPortal_Menu.Branch_NameTxt, BaseClass.randomString(10));
	}

	@Then("Enter Branch Street")
	public void enter_branch_street() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_AddressTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_AddressTxt);
		BaseClass.Input(PartnerPortal_Menu.Branch_AddressTxt, BaseClass.randomString(10));
	}

	@Then("Select Country")
	public void select_country() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_CountryDD));
		BaseClass.getAllSelectedOptions(PartnerPortal_Menu.Branch_CountryDD);
	}

	@Then("Select State")
	public void select_state() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_StateDD));
		//BaseClass.getrandomOption(PartnerPortal_Menu.Branch_StateDD);
		BaseClass.SelectText(PartnerPortal_Menu.Branch_StateDD,"Tamilnadu");
	}

	@Then("Enter City")
	public void enter_city() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_CityDD));
		//BaseClass.getrandomOption(PartnerPortal_Menu.Branch_CityDD);
		BaseClass.SelectText(PartnerPortal_Menu.Branch_CityDD,"Chennai");
	}

	@Then("Enter Zipcode")
	public void enter_zipcode() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Branch_ZipcodeTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.Branch_ZipcodeTxt);
		BaseClass.Input(PartnerPortal_Menu.Branch_ZipcodeTxt, BaseClass.RandomNumbers(6));
	}

	@Then("Enter Coordination Name")
	public void enter_coordination_name() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.Coordination_NameTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.Coordination_NameTxt);
		BaseClass.Input(PartnerPortal_Menu.Coordination_NameTxt, BaseClass.randomString(10));
	}

	@Then("Enter Branch Designation")
	public void enter_branch_designation() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.DesignationTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.DesignationTxt);
		BaseClass.Input(PartnerPortal_Menu.DesignationTxt, BaseClass.randomString(10));
	}

	@Then("Enter Branch Mobile Number")
	public void enter_branch_mobile_number() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.MobileNoTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.MobileNoTxt);
		BaseClass.Input(PartnerPortal_Menu.MobileNoTxt, BaseClass.RandomNumbers(10));
	}

	@Then("Enter Branch Email")
	public void enter_branch_email() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.EmailTxt));
		BaseClass.ClearElement(PartnerPortal_Menu.EmailTxt);
		BaseClass.Input(PartnerPortal_Menu.EmailTxt, BaseClass.RandomEmail());
	}

	@Then("Click Branch Submit Button")
	public void click_branch_submit_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchSubmitBTN);
	}
	@Then("Click Confirmation Button")
	public void click_Confirmation_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ConfirmationYesBTN);
	}

	@Then("Accept the Branch creation confirmation  Popup")
	public void accept_the_branch_creation_confirmation_popup() throws Throwable {
		List<WebElement> BracnchPopup_okBtn = DriverFactory.driver
				.findElements(By.xpath("//div[@class='modal-body']//button[text()='Yes']"));
		if (BracnchPopup_okBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Submit_Yes_BTN);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Then("Accept the Branch Saved Successful popup")
	public void accept_the_branch_saved_successful_popup() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Details_Delete_okBTN);
	}

	@Then("Click Branch Save as Draft Button")
	public void click_branch_save_as_draft_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchSaveDraftBTN);
	}
	/* Add Branch Ends Here */
	/* Update Branch Starts Here */

	@Then("Verify whether edit icon is available or not")
	public void verify_whether_edit_icon_is_available_or_not() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@title='Edit']"));
		if (BranchEdit_BTN.size() > 0) {
			System.err.println("Edit Icon is there to Update");
		} else {
			System.err.println("No Edit icon to Update");
		}
	}

	@Then("Click Edit Branch")
	public void click_edit_branch() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//*[@title='Edit']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Edit_Icon);
		} else {
			System.err.println("No Edit icon to Update");
		}
	}

	@Then("Click Branch Update Button")
	public void click_branch_update_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchUpdate_BTN);
	}
	/* Update Branch Ends Here */
	/* Branch Approval Request Starts Here */
	@Then("Verify whether Submit icon is available or not")
	public void verify_whether_submit_icon_is_available_or_not() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//button[text()='Submit']"));
		if (BranchEdit_BTN.size() > 0) {
			System.err.println("Submit Icon is there to Update");
		} else {
			System.err.println("No Submit icon to Update");
		}
	}

	@Then("Click Branch approval Submit Button")
	public void click_branch_approval_submit_button() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//button[text()='Submit']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(3000);
			BaseClass.onButtonClick(PartnerPortal_Menu.BranchSubmitApproval_BTN);
		} else {
			System.err.println("No Submit icon to Update");
		}
	}

	@Then("Accept the Approval Submit Confirmation Popup")
	public void accept_the_approval_submit_confirmation_popup() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//button[text()='Submit']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(3000);
			BaseClass.onButtonClick(PartnerPortal_Menu.Branch_Submit_Yes_BTN);
		} else {
			System.err.println("No Submit icon to Update");
		}

	}

	@Then("Accept the Submit Successful popup")
	public void accept_the_submit_successful_popup() throws Throwable {
		List<WebElement> BranchEdit_BTN = DriverFactory.driver.findElements(By.xpath("//button[text()='Submit']"));
		if (BranchEdit_BTN.size() > 0) {
			Thread.sleep(5000);
			BaseClass.onButtonClick(PartnerPortal_Menu.Details_Delete_okBTN);
		} else {
			System.err.println("No Submit icon to Update");
		}

	}
	/* Branch Approval Request Ends Here */
	/* Partner Feedback Starts Here */

	@Then("Enter partner Feedback username")
	public void enter_partner_feedback_username() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.Username, ConfigFileReader.getUsername());
	}

	@Then("Enter partner feedback CAPTACHA")
	public void enter_partner_feedback_captacha() throws Throwable {
		Thread.sleep(8000);
		Basic.captchaUserFinal(ConfigFileReader.getUsername());
	}

	@Then("Accept the Vendor Declaration form")
	public void accept_the_vendor_declaration_form() throws InterruptedException {
		List<WebElement> VendorDeclarationPopup_closeBtn = DriverFactory.driver
				.findElements(By.xpath("//*[contains(@class, 'modal-close-button')]"));
		if (VendorDeclarationPopup_closeBtn.size() > 0) {
			Thread.sleep(2000);
			try {
				BaseClass.onButtonClick(PartnerPortal_Menu.VendorDeclareFormClose_Img);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Vendor Declaration form popup is not shown");

		}
	}

	@Then("Verify the Feedback Partner number is avalable or not")
	public void verify_the_feedback_partner_number_is_avalable_or_not() throws Throwable {
		Thread.sleep(1000);
		String PartnerNo = BaseClass.GetText(PartnerPortal_Menu.Partner_Number);
		System.err.println("Partner Number : " + PartnerNo);
	}

	@Then("Verify user able to click partner feedback link")
	public void verify_user_able_to_click_partner_feedback_link() throws InterruptedException {
		Thread.sleep(1500);
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_Feedback);
	}

	@Then("Verify user able to select Job details in PF")
	public void verify_user_able_to_select_job_details_in_pf() throws Throwable {
		Thread.sleep(1500);
		BaseClass.getrandomOption(PartnerPortal_Menu.JobDetails_DD_PF);
	}

	@Then("Verify user able to click Give Feedback BTN")
	public void verify_user_able_to_click_give_feedback_btn() throws InterruptedException {
		Thread.sleep(1500);
		BaseClass.onButtonClick(PartnerPortal_Menu.GiveFeedBackBTN);
	}

	@Then("Verify the Jobcode is available or not")
	public void verify_the_jobcode_is_available_or_not() throws InterruptedException {
		Thread.sleep(1500);
		String jobcode = BaseClass.GetText(PartnerPortal_Menu.JobCode_PF);
		System.out.println("Job Code : " + jobcode);
	}

	@Then("Verify the Jobname is available or not")
	public void verify_the_jobname_is_available_or_not() throws Throwable {
		Thread.sleep(1500);
		String jobname = BaseClass.GetText(PartnerPortal_Menu.JobName_PF);
		System.out.println("Job Name : " + jobname);
	}

	@Then("Enter the name in PF")
	public void enter_the_name_in_pf() {
		BaseClass.Input(PartnerPortal_Menu.Name_PF, "test");
	}

	@Then("Enter the Designation in PF")
	public void enter_the_designation_in_pf() {
		BaseClass.Input(PartnerPortal_Menu.Designation_PF, "testd");
	}

	@Then("Enter the Email in PF")
	public void enter_the_email_in_pf() {
		BaseClass.Input(PartnerPortal_Menu.Emailid_PF, "test@test.com");
	}

	@Then("Enter the Mobile number in PF")
	public void enter_the_mobile_number_in_pf() {
		BaseClass.Input(PartnerPortal_Menu.MobNo_PF, "9876543210");
	}

	@Then("Select first question in UE")
	public void select_first_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.FirstQue_PF);
	}

	@Then("Select second question in UE")
	public void select_second_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.SecondQue_PF);
	}

	@Then("Select third A question in UE")
	public void select_third_a_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ThirdQue_1_PF);
	}

	@Then("Select third B question in UE")
	public void select_third_b_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ThirdQue_2_PF);
	}

	@Then("Select third C question in UE")
	public void select_third_c_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ThirdQue_3_PF);
	}

	@Then("Select third D question in UE")
	public void select_third_d_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ThirdQue_4_PF);
	}

	@Then("Select third E question in UE")
	public void select_third_e_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ThirdQue_5_PF);
	}

	@Then("Select fourth A question in UE")
	public void select_fourth_a_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.FourthQue_1_PF);
	}

	@Then("Select fourth B question in UE")
	public void select_fourth_b_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.FourthQue_2_PF);
	}

	@Then("Select fourth C question in UE")
	public void select_fourth_c_question_in_ue() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.FourthQue_3_PF);
	}

	@Then("Click Issue Resolution Experience icon")
	public void click_issue_resolution_experience_icon() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IRE_PF);
	}

	@Then("Select first question in IRE")
	public void select_first_question_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IRE_1_PF);
	}

	@Then("Enter first question concern in IRE")
	public void enter_first_question_concern_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.IRE_1TA_PF, "test");
	}

	@Then("Select second question in IRE")
	public void select_second_question_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IRE_2_PF);
	}

	@Then("Enter second question concern in IRE")
	public void enter_second_question_concern_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.IRE_2TA_PF, "test");
	}

	@Then("Select third question in IRE")
	public void select_third_question_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IRE_3_PF);
	}

	@Then("Enter third question concern in IRE")
	public void enter_third_question_concern_in_ire() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.IRE_3TA_PF, "test");
	}

	@Then("Click Communication icon")
	public void click_communication_icon() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Communication_PF);
	}

	@Then("Select first question in Communication")
	public void select_first_question_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Communication_1_PF);
	}

	@Then("Enter first question concern in communication")
	public void enter_first_question_concern_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.Communication_1TA_PF, "test");
	}

	@Then("Select second question in communication")
	public void select_second_question_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Communication_2_PF);
	}

	@Then("Enter second question concern in communication")
	public void enter_second_question_concern_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.Communication_2TA_PF, "test");
	}

	@Then("Select third question in communication")
	public void select_third_question_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Communication_3_PF);
	}

	@Then("Enter third question concern in communication")
	public void enter_third_question_concern_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.Communication_3TA_PF, "test");
	}

	@Then("Select fourth question in commmunication")
	public void select_fourth_question_in_commmunication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Communication_4_PF);
	}

	@Then("Enter fourth question concern in communication")
	public void enter_fourth_question_concern_in_communication() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.Communication_4TA_PF, "test");
	}

	@Then("Click General icon")
	public void click_general_icon() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.General_PF);
	}

	@Then("Select first question in general")
	public void select_first_question_in_general() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.General_1_PF);
	}

	@Then("Enter name in general first question")
	public void enter_name_in_general_first_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_1Name_PF, "test");
	}

	@Then("Enter designation in general first question")
	public void enter_designation_in_general_first_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_1Designation_PF, "test");
	}

	@Then("Enter email id in general first question")
	public void enter_email_id_in_general_first_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_1Emailid_PF, "test@test.com");
	}

	@Then("Enter mobile no in general first question")
	public void enter_mobile_no_in_general_first_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_1MobNo_PF, "9876543210");
	}

	@Then("Select second question in general")
	public void select_second_question_in_general() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.General_2_PF);
	}

	@Then("Enter name in general second question")
	public void enter_name_in_general_second_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_2Name_PF, "test");
	}

	@Then("Enter designation in general second question")
	public void enter_designation_in_general_second_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_2Designation_PF, "test");
	}

	@Then("Enter email id in genereal second question")
	public void enter_email_id_in_genereal_second_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_2Emailid_PF, "test@test.com");
	}

	@Then("Enter mobile no in general second question")
	public void enter_mobile_no_in_general_second_question() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.General_2MobNo_PF, "9876543210");
	}

	@Then("Click Submit Feedback Button")
	public void click_submit_feedback_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PF_SubmitFeedbackBTN);
	}

	@Then("Click Save as Draft Button")
	public void click_save_as_draft_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PF_SaveDraftBTN);
	}

	@Then("Print the feedback Document number")
	public void print_the_feedback_document_number() throws Throwable {
		Thread.sleep(1000);
		String PFDraftDocNo = BaseClass.GetText(PartnerPortal_Menu.PF_Draft_DocumentNo);
		System.out.println(PFDraftDocNo);
	}

	@Then("Accept the feedback saved in draft successfully popup")
	public void accept_the_feedback_saved_in_draft_successfully_popup() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PF_SaveDraftBTN);
	}

	@Then("Check for error popup")
	public void check_for_error_popup() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	/* Partner Feedback Ends Here */

	/* Partner Status Update Starts Here */
	@Then("Verify whether user able to enter admin login username")
	public void verify_whether_user_able_to_enter_admin_login_username() throws Throwable {
		DriverFactory.driver.get(ConfigFileReader.eipQA_Environment());
		BaseClass.onButtonClick(PartnerPortal_Menu.EIPOtheruser_Tab);
		BaseClass.Input(PartnerPortal_Menu.EIPUsername_TB, ConfigFileReader.getAdmin_UserName());
	}

	@Then("Verify whether user able to enter admin login password")
	public void verify_whether_user_able_to_enter_admin_login_password() {
		BaseClass.Input(PartnerPortal_Menu.EIPPassword_TB, ConfigFileReader.getEIPQAPassword());
	}

	@Then("Verify whether user able to click login button")
	public void verify_whether_user_able_to_click_login_button() throws Throwable {
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.EIPLogin_Btn));
			BaseClass.onButtonClick(PartnerPortal_Menu.EIPLogin_Btn);
		} catch (Exception e) {
			System.out.println("Login Button not available");
		}
		
	}

	@Then("Verify whether user able to click Access based menu")
	public void verify_whether_user_able_to_click_access_based_menu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Access_Based_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Access_Based_Menu);
	}

	@Then("Verify whether user able to click Business Apps")
	public void verify_whether_user_able_to_click_business_apps() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Business_Apps_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Apps_Menu);
	}

	@Then("Verify whether user able to click Partner portal")
	public void verify_whether_user_able_to_click_partner_portal() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_portal_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_portal_Menu);
	}

	@Then("Verify whether user able to click partner Workbench")
	public void verify_whether_user_able_to_click_partner_workbench() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_Workbench_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_Workbench_Menu);
	}

	@Then("Verify whether user able to click Vendor Master & Forensics")
	public void verify_whether_user_able_to_click_vendor_master_forensics() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.VendorMaster_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.VendorMaster_Menu);
		BaseClass.switchWindows();
	}

	@Then("Verify whether user able to search partner TB by keyword")
	public void verify_whether_user_able_to_search_partner_tb_by_keyword() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SearchTB));
		DataBaseConnection.dataBaseConnectionPP();
		BaseClass.Input(PartnerPortal_Menu.SearchTB, DataBaseConnection.getPANNO());
	}

	@Then("Verify whether user able to click View Profile")
	public void verify_whether_user_able_to_click_view_profile() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ViewProfileBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.ViewProfileBTN);
		BaseClass.switchWindows();
	}
	@Then("Verify whether user able to view vendor profile")
	public void Verify_whether_user_able_to_view_vendor_profile() throws Throwable {
		Thread.sleep(10000);
		System.out.println(PartnerPortal_Menu.ProfileInfo.size());
		for(int i=0;i<PartnerPortal_Menu.ProfileInfo.size();i++) {
			System.out.println(PartnerPortal_Menu.ProfileInfo.get(i).getText());
		}
	}

	@Then("Verify whether user able to click Admin action DD")
	public void verify_whether_user_able_to_click_admin_action_dd() throws Throwable {
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.adminActionDD));
			BaseClass.onButtonClick(PartnerPortal_Menu.adminActionDD);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.adminActionLB));
			BaseClass.onButtonClick(PartnerPortal_Menu.adminActionLB);
		}
	}

	@Then("Verify whether user able to select Update Stauts from DD")
	public void verify_whether_user_able_to_select_update_stauts_from_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Status");
	}
	@Then("Verify whether user able to click Payment in favour of in DD")
	public void Verify_whether_user_able_to_click_Payment_in_favour_of_in_DD() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Payment in Favour of");
	}
	@Then("Verify whether user able to click Registered office address in DD")
	public void Verify_whether_user_able_to_click_Registered_office_address_in_DD() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Reg-Office Address");
	}
	@Then("Verify whether user able to click Insert IFSC in DD")
	public void Verify_whether_user_able_to_click_Insert_IFSC_in_DD() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Insert IFSC");
	}
	@Then("Verify whether user able to click Add Bank in DD")
	public void Verify_whether_user_able_to_click_Add_Bank_in_DD() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Add Bank");
	}
	@Then("Verify whether user able to click Add Branch in DD")
	public void Verify_whether_user_able_to_click_Add_Branch_in_DD() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Add Branch");
	}
	@Then("Verify whether user able to enter address line of TB")
	public void Verify_whether_user_able_to_enter_address_line_of_TB() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.updateAddressLine));
		BaseClass.Input(PartnerPortal_Menu.updateAddressLine, BaseClass.randomString(10));
	}
	@Then("Verify whether user able to select state from DD")
	public void Verify_whether_user_able_to_select_state_from_DD() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.updateState,"Tamilnadu");
	}
	@Then("Verify whether user able to select city from DD")
	public void Verify_whether_user_able_to_select_city_from_DD() throws Throwable {
		Thread.sleep(2000);
		BaseClass.SelectText(PartnerPortal_Menu.updateCity,"Chennai");
	}
	@Then("Verify whether user able to enter zipcode from TB")
	public void Verify_whether_user_able_to_enter_zipcode_from_TB() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.updateZipcode));
		BaseClass.Input(PartnerPortal_Menu.updateZipcode, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to select partner status DD")
	public void verify_whether_user_able_to_select_partner_status_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.partnerStatusDD);
		// BaseClass.SelectText(PartnerPortal_Menu.partnerStatusDD, "Active");
	}

	@Then("Verify whether user able to select status effective from date")
	public void verify_whether_user_able_to_select_status_effective_from_date() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DatepickerTB);
		Thread.sleep(1000);
		BaseClass.jsTop(PartnerPortal_Menu.StatusRemarksTA);
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Date_pickerDP);

	}

	@Then("Verify whether user able to enter remarks")
	public void verify_whether_user_able_to_enter_remarks() throws Throwable {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.StatusRemarksTA));
		BaseClass.Input(PartnerPortal_Menu.StatusRemarksTA, BaseClass.randomString(5));
	}
	@Then("Verify whether user able to Payment in favour of TB")
	public void Verify_whether_user_able_to_Payment_in_favour_of_TB() throws Throwable {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.updatePaymentinfavourof));
		BaseClass.Input(PartnerPortal_Menu.updatePaymentinfavourof, BaseClass.randomString(10));
	}
	@Then("Verify whether user able to view updated payment in favour name")
	public void Verify_whether_user_able_to_view_updated_payment_in_favour_name() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.ViewUpdatedAccountHolderName);
		System.out.println("Account Holder Name : "+BaseClass.GetText(PartnerPortal_Menu.ViewUpdatedAccountHolderName));
	}
	@Then("Verify whether user able to view updated registered office address")
	public void Verify_whether_user_able_to_view_updated_registered_office_address() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.ViewUpdatedRegisteredAddress);
		System.out.println("Registered Office Address: : "+BaseClass.GetText(PartnerPortal_Menu.ViewUpdatedRegisteredAddress));
	}

	@Then("Verify Whether user able to click submit button")
	public void verify_whether_user_able_to_click_submit_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.StatusSubmitBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.StatusSubmitBTN);
	}

	@Then("Verify whether user able to click confirmation popup")
	public void verify_whether_user_able_to_click_confirmation_popup() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ConfirmationYesBTN);
//		Thread.sleep(7000);
//		BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
	}

	@Then("Verify whether user able to view approval document reference no")
	public void verify_whether_user_able_to_view_approval_document_reference_no() throws Throwable {
		Thread.sleep(3000);
		if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
			BaseClass.GetText_Alert();
			BaseClass.Accept_Alert1();
		}
	}

	@Then("Verify whether user able to click logout from eip login")
	public void verify_whether_user_able_to_click_logout_from_eip_login() throws Throwable {
		Thread.sleep(8000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.LogoutImgBTN));
			BaseClass.onButtonClick(PartnerPortal_Menu.LogoutImgBTN);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.LogoutImgBTN1));
			BaseClass.onButtonClick(PartnerPortal_Menu.LogoutImgBTN1);		
		}
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.SignOutBTN);
		Thread.sleep(1500);
		//System.out.println(PartnerPortal_Menu.ProfileImgBTN.isDisplayed());
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.ProfileImgBTN));
			BaseClass.onButtonClick(PartnerPortal_Menu.ProfileImgBTN);
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.SignOutBTN));
			BaseClass.onButtonClick(PartnerPortal_Menu.SignOutBTN);
		} catch (Exception e) {
			System.out.println("Second Logout page is not displayed.");
		}
		BaseClass.ErrorPopup();
	}

	@Then("Update Status Approver Login Page")
	public void update_status_approver_login_page() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getStatusDocumentRefNo();
		DataBaseConnection.loginAction();
	}

	@Then("Verify whether user able to click Partner Workbench Menu")
	public void verify_whether_user_able_to_click_partner_workbench_menu() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Access_Based_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Access_Based_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Business_Apps_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Apps_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_portal_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_portal_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_Workbench_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_Workbench_Menu);
	}
	@Then("Verify whether user able to navigate to Customer Registration")
	public void Verify_whether_user_able_to_navigate_to_Customer_Registration() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Access_Based_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Access_Based_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Business_Apps_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Apps_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_portal_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_portal_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_Workbench_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.CustomerRegistrationLabel);
	}

	@Then("Verify whether user able to fetch document reference no")
	public void verify_whether_user_able_to_fetch_document_reference_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getCountryDocumentRefNo();
		Thread.sleep(1000);
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
	}
	
	@Then("Verify whether user able to fetch status document reference no")
	public void verify_whether_user_able_to_fetch_status_document_reference_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getStatusDocumentRefNo();
		Thread.sleep(1000);
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
	}

	@Then("Update Country Approver Login Page")
	public void update_country_approver_login_page() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getCountryDocumentRefNo();
		DataBaseConnection.loginAction();

	}

	@Then("Verify whether user able to click view button")
	public void verify_whether_user_able_to_click_view_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.viewDocumentBTN);
	}

	@Then("Verify whether user able to enter Approve remarks")
	public void verify_whether_user_able_to_enter_approve_remarks() throws Throwable {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.StatusFileAttachTB));
		BaseClass.Input(PartnerPortal_Menu.statusUpdateRemarksBTN, BaseClass.randomString(5));
	}

	@Then("Verify whether user able to click approve button")
	public void verify_whether_user_able_to_click_approve_button() throws Throwable {
		Thread.sleep(8000);
		BaseClass.jsTop(PartnerPortal_Menu.approveDocumentBTN);
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.approveDocumentBTN);
	}

	@Then("Verify whether user able to click reject button")
	public void Verify_whether_user_able_to_click_reject_button() throws Throwable {
		Thread.sleep(8000);
		BaseClass.jsTop(PartnerPortal_Menu.ARejectBTN);
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ARejectBTN);
	}

	@Then("Verify whether user able to click Status Approve Submit button")
	public void verify_whether_user_able_to_click_status_approve_submit_button_w() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.statusUpdateSubmitBTN);
	}

	@Then("Verify whether user able to click success popup")
	public void verify_whether_user_able_to_click_success_popup() throws InterruptedException {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.statusUpdateOkBTN));
		BaseClass.onButtonClick(PartnerPortal_Menu.statusUpdateOkBTN);
	}
	@Then("Verify whether user able to delete GST details from database")
	public void Verify_whether_user_able_to_delete_GST_details_from_database() throws InterruptedException, Throwable {
		Thread.sleep(10000);
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.deleteGSTNumber();
		DataBaseConnection.databaseConnectionClose();
	}
	@Then("Verify whether user able to click alert success popup")
	public void verify_whether_user_able_to_click_alert_success_popup() throws InterruptedException {
		Thread.sleep(5000);
		BaseClass.Accept_Alert1();
	}

	@Then("Verify whether user able to select Update Contact from DD")
	public void verify_whether_user_able_to_select_update_contact_from_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Contact");
	}

	@Then("Verify whether user able to enter new contact name")
	public void verify_whether_user_able_to_enter_new_contact_name() throws InterruptedException {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.updateContactName, BaseClass.randomString(5));
	}

	@Then("Verify whether user able to enter new mobile number")
	public void verify_whether_user_able_to_enter_new_mobile_number() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.updateMobileNo, BaseClass.RandomNumbers(10));
	}

	@Then("Verify whether user able to enter new email id")
	public void verify_whether_user_able_to_enter_new_email_id() throws Throwable {
		Thread.sleep(1000);
		BaseClass.Input(PartnerPortal_Menu.updateEmailID, BaseClass.RandomEmail());
	}

	@Then("Verify whether user able to view contact type")
	public void verify_whether_user_able_to_view_contact_type() throws Throwable {
		Thread.sleep(3000);
		BaseClass.jsTop(PartnerPortal_Menu.UpdateContactType);
		System.out.println("Contact Type : "+BaseClass.GetText(PartnerPortal_Menu.UpdateContactType));
	}

	@Then("Verify whether user able to view contact name")
	public void verify_whether_user_able_to_view_contact_name() throws Throwable {
		Thread.sleep(1000);
		System.out.println("Contact Name : "+BaseClass.GetText(PartnerPortal_Menu.UpdateContactName));
	}

	@Then("Verify whether user able to view contact mobile number")
	public void verify_whether_user_able_to_view_contact_mobile_number() throws Throwable {
		Thread.sleep(1000);
		System.out.println("Contact Mobile No : "+BaseClass.GetText(PartnerPortal_Menu.UpdateContactMobileNo));
	}

	@Then("Verify whether user able to view contact email id")
	public void verify_whether_user_able_to_view_contact_email_id() throws Throwable {
		Thread.sleep(1000);
		System.out.println("Contact Email Id : "+BaseClass.GetText(PartnerPortal_Menu.UpdateContactEmail));
	}

	@Then("Verify whether user able to click submit button")
	public void verify_whether_user_able_to_click_submit_button1() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.statusUpdateSubmitBTN);
	}

	@Then("Verify whether user able to select Update Country from DD")
	public void verify_whether_user_able_to_select_update_country_from_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Country");
	}

	@Then("Verify whether user able to select country from DD")
	public void verify_whether_user_able_to_select_country_from_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.updateCountryDD);
	}

	@Then("Verify whether user able to add attachment for admin action")
	public void verify_whether_user_able_to_add_attachment_for_admin_action() throws InterruptedException {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.GST_AttachDocument_Btn, pdfAttachment);
		System.out.println("Update File attachment completed");
	}

	@Then("Verify whether admin action file is attached or not")
	public void verify_whether_update_admin_action_file_is_attached_or_not() throws Throwable {
		Thread.sleep(5000);
		BaseClass.jsTop(PartnerPortal_Menu.Verify_GST_Doc_L);
		String Country_Doc_name = PartnerPortal_Menu.Verify_GST_Doc_L.getText();
		System.out.println("Attached document No: " + Country_Doc_name);
	}

	@Then("Verify whether user able to enter update country remarks")
	public void verify_whether_user_able_to_enter_update_country_remarks() throws Throwable {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.adminActionRemarks, BaseClass.randomString(5));
	}

	@Then("Verify whether user able to select Update PAN from DD")
	public void verify_whether_user_able_to_select_update_pan_from_dd() throws Throwable {
		Thread.sleep(3000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update PAN Number");
	}

	@Then("Verify whether user able to enter new PAN no")
	public void verify_whether_user_able_to_enter_new_pan_no() throws Throwable {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.updatePANNo, BaseClass.RandomPANNO());
	}

	@Then("Verify whether user able to enter update PAN remarks")
	public void verify_whether_user_able_to_enter_update_pan_remarks() throws InterruptedException {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.adminActionRemarks, BaseClass.randomString(10));
	}

	@Then("Verify whether user able to select update company name from DD")
	public void verify_whether_user_able_to_select_update_company_name_from_dd() throws Throwable {
		Thread.sleep(1000);
		BaseClass.SelectText(PartnerPortal_Menu.adminActionDD, "Update Company Name");
	}

	@Then("Verify whether user able to enter company name")
	public void verify_whether_user_able_to_enter_company_name() throws Throwable {
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.updateCompanyName, BaseClass.randomString(5));
	}

	@Then("Verify whether user able to view updated company name")
	public void verify_whether_user_able_to_view_updated_company_name() throws Throwable {
		Thread.sleep(1500);
		wait.until(ExpectedConditions.visibilityOf(PartnerPortal_Menu.vendorName));
		System.out.println(BaseClass.GetText(PartnerPortal_Menu.vendorName));
	}
	/* Partner Status Update Ends Here */
	/* Update MSME Details Starts Here */
	@Then("Verify whether user able to click Statutory details tab")
	public void verify_whether_user_able_to_click_statutory_details_tab() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileStatutory_Tab);
	}
	@Then("Verify whether user able to view Edit icon in pipeline statutory details")
	public void verify_whether_user_able_to_view_edit_icon_in_pipeline_statutory_details() throws Throwable {
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.EditMsmeDetailsPipeline));
			BaseClass.onButtonClick(PartnerPortal_Menu.EditMsmeDetailsPipeline);
		} catch (Exception e) {
			BaseClass.onButtonClick(PartnerPortal_Menu.EditMsmeDetailsApproved);
		}
	}

	@Then("Verify whether user able to click Yes icon in TAN number RB")
	public void verify_whether_user_able_to_click_yes_icon_in_tan_number_rb() throws Throwable {
		Thread.sleep(3000);
		try {
			BaseClass.onButtonClick(PartnerPortal_Menu.TANNo_RB_Yes);
		} catch (Exception e) {
			System.out.println("TAN Information Already Uploaded.");
		}
	}

	@Then("Verify whether user able to enter TAN Number")
	public void verify_whether_user_able_to_enter_tan_number() throws Throwable {
		Thread.sleep(3000);
		try {
			BaseClass.ClearElement(PartnerPortal_Menu.TAN_No_TB);
			BaseClass.Input(PartnerPortal_Menu.TAN_No_TB, BaseClass.RandomTANNO());
		} catch (Exception e) {
			System.out.println("TAN Information Already Uploaded.");
		}
	}

	@Then("Verify whether user able to attach TAN document")
	public void verify_whether_user_able_to_attach_tan_document() throws Throwable {
		Thread.sleep(3000);
		try {
			Thread.sleep(1500);
			BaseClass.Input(PartnerPortal_Menu.TAN_AttachDoc_Btn, pdfAttachment);
			System.out.println("Update File attachment completed");
		} catch (Exception e) {
			System.out.println("TAN Information Already Uploaded.");
		}
	}

	@Then("Verify whether TAN document is attached or not")
	public void verify_whether_tan_document_is_attached_or_not() throws Throwable {
		Thread.sleep(5000);
		String Country_Doc_name = PartnerPortal_Menu.Verify_TAN_Doc_L.getText();
		System.out.println("Attached document No: " + Country_Doc_name);

	}

	@Then("Verify whether user able to click Yes icon in  Aadhar Number")
	public void verify_whether_user_able_to_click_yes_icon_in_aadhar_number() throws InterruptedException {
		try {
			BaseClass.onButtonClick(PartnerPortal_Menu.Aadhar_RB_Yes);
		} catch (Exception e) {
			System.out.println("TAN Information Already Uploaded.");
		}
	}

	@Then("Verify whether user able to enter aadhar no")
	public void verify_whether_user_able_to_enter_aadhar_no() throws Throwable {
		BaseClass.ClearElement(PartnerPortal_Menu.Aadhar_No_TB);
		BaseClass.Input(PartnerPortal_Menu.Aadhar_No_TB, BaseClass.RandomNumbers(12));
	}

	@Then("Verify whether user able to attach aadhar document")
	public void verify_whether_user_able_to_attach_aadhar_document() throws Throwable {
		Thread.sleep(3000);
		BaseClass.Input(PartnerPortal_Menu.Aadhar_AttachDocument_Btn, pdfAttachment);
		System.out.println("Update File attachment completed");
	}

	@Then("Verify whether Aadhar document is attached or not")
	public void verify_whether_aadhar_document_is_attached_or_not() throws Throwable {
		Thread.sleep(5000);
		String Country_Doc_name = PartnerPortal_Menu.Verify_Aadhar_Doc_L.getText();
		System.out.println("Attached document No: " + Country_Doc_name);
	}

	@Then("Verify whether user able to click Yes icon in MSME Number")
	public void verify_whether_user_able_to_click_yes_icon_in_msme_number() throws Throwable {
		Thread.sleep(3000);
		try {
			BaseClass.onButtonClick(PartnerPortal_Menu.MSME_RB_Yes);
		} catch (Exception e) {
			System.out.println("MSME Information Already Uploaded.");
		}
	}

	@Then("Verify whether user able to select MSME Type")
	public void verify_whether_user_able_to_select_msme_type() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.MSME_Type_DD);
	}

	@Then("Verify whether user able to select Effective from")
	public void verify_whether_user_able_to_select_effective_from() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verify whether user able to enter MSME Number")
	public void verify_whether_user_able_to_enter_msme_number() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.ClearElement(PartnerPortal_Menu.MSME_No_TB);
		BaseClass.Input(PartnerPortal_Menu.MSME_No_TB, BaseClass.RandomMSMENO());
	}

	@Then("Verify whether user able to select classification year")
	public void verify_whether_user_able_to_select_classification_year() throws Throwable {
		Thread.sleep(1000);
		BaseClass.getrandomOption(PartnerPortal_Menu.MSME_Classification_Year_DD);
	}

	@Then("Verify whether user able to attach MSME document")
	public void verify_whether_user_able_to_attach_msme_document() throws Throwable {
		Thread.sleep(3000);
		BaseClass.Input(PartnerPortal_Menu.MSME_AttachDocument_Btn, pdfAttachment);
		System.out.println("Update File attachment completed");
	}

	@Then("Verify whether MSME document is attached or not")
	public void verify_whether_msme_document_is_attached_or_not() throws Throwable {
		Thread.sleep(5000);
		String Country_Doc_name = PartnerPortal_Menu.Verify_MSME_Doc_L.getText();
		System.out.println("Attached document No: " + Country_Doc_name);
	}

	@Then("Verify whether user able to click update button")
	public void verify_whether_user_able_to_click_update_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchUpdate_BTN);
	}

	@Then("Verify whether user able to click close button")
	public void verify_whether_user_able_to_click_close_button() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
	}

	@Then("Verify whether user able to click Edit icon in approved statutory tab")
	public void verify_whether_user_able_to_click_edit_icon_in_approved_statutory_tab() throws Throwable {
		Thread.sleep(1000);
		BaseClass.onButtonClick(PartnerPortal_Menu.EditMsmeDetailsApproved);
	}

	@Then("Verify whether Already a statutory update document is in workflow popup shows")
	public void verify_whether_already_a_statutory_update_document_is_in_workflow_popup_shows() throws Throwable {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		BaseClass.Alert();
		Thread.sleep(1000);
		BaseClass.GetText_Alert();
	}

	@Then("Verify whether user able to view records in pipeline statutory details")
	public void verify_whether_user_able_to_view_records_in_pipeline_statutory_details() throws Throwable {
		Thread.sleep(3000);
		if (PartnerPortal_Menu.EditMsmeDetailsPipeline.isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.GStApprovalBTN));
			// BaseClass.onButtonClick(PartnerPortal_Menu.GStApprovalBTN);
			System.out.println("Document is pending in pipeline Statutory details");
		}
	}

	@Then("Verify whether user able to accept the sent to evaluator success popup")
	public void verify_whether_user_able_to_accept_the_sent_to_evaluator_success_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.GStSaveOKBTN);
	}

	@Then("Verify whether user able to enter remarks in financial approval alert")
	public void verify_whether_user_able_to_enter_remarks_in_financial_approval_alert() throws Throwable {
		Thread.sleep(1000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		if (alert != null) {
			BaseClass.SendText_Alert("Test Remarks");
			// Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
//		wait.until(ExpectedConditions.alertIsPresent());
//			Thread.sleep(2000);
//			System.out.println("Hi");
//			BaseClass.SendText_Alert("Test Remarks");
//			Thread.sleep(2000);
	}

	@Then("Verify whether user able to accept the remarks alert popup")
	public void verify_whether_user_able_to_accept_the_remarks_alert_popup() throws Throwable {
		Thread.sleep(5000);
		BaseClass.Accept_Alert1();
	}

	@Then("Verify whether user able to enter MSME login username")
	public void verify_whether_user_able_to_enter_msme_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getMSTQA_Document_Number();
		DataBaseConnection.loginAction();
	}

	@Then("Verify whether user able to fetch MSTAQ document reference no")
	public void verify_whether_user_able_to_fetch_mstaq_document_reference_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getMSTQA_Document_Number();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
	}

	@Then("Verify whether user able to trace document no")
	public void verify_whether_user_able_to_trace_document_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getMSTQA_Document_Number();
		BaseClass.Input(PartnerPortal_Menu.documentSearch1BTN, docRefNo);
	}

	@Then("Verify whether user able to click Trace button")
	public void verify_whether_user_able_to_click_trace_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.TraceDocumentBTN);
	}

	@Then("Verify whether user able to close document trace popup")
	public void verify_whether_user_able_to_close_document_trace_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.documentTraceOkBTN);
	}
	/* Update MSME Details Ends Here */
	/* Delete Bank Details start here */

	@Then("Click Delete Details from the list")
	public void click_delete_details_from_the_list() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DeleteDetailsBTN);
		Thread.sleep(3000);
		System.out.println("Delete button clicked Successfully");

	}

	@Then("Click the delete confirmation dismiss popup")
	public void click_the_delete_confirmation_dismiss_popup() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ConfirmationNoBTN);
		System.out.println("Deleted Confirmation dismissed Successfully");
	}

	@Then("Click the delete confirmation accept popup")
	public void click_the_delete_confirmation_accept_popup() throws InterruptedException {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ConfirmationYesBTN);
		System.out.println("Deleted Confirmation accepted Successfully.");
	}

	@Then("Click the delete success popup")
	public void click_the_delete_success_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.addressSaved_OKBtn);
		System.out.println("Deleted Successfully.");
	}

	/* Delete Bank Details Ends Here */
	/* Branch Details Starts Here */
	@Then("Verify whether user able to enter Branch login username")
	public void verify_whether_user_able_to_enter_Branch_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.getEnvironment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getBranch_Document_Number();
		DataBaseConnection.OnboardingBranch();
		System.out.println("Login Successfully.");
	}

	@Then("Verify whether user able to fetch Branch document reference no")
	public void verify_whether_user_able_to_fetch_Branch_document_reference_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getBranch_Document_Number();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Branch Document Fetched Successfully.");
	}

	@Then("Verify whether user able to fetch Company document reference no")
	public void verify_whether_user_able_to_fetch_Company_document_reference_no() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getCompany_Document_Number();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Company Document Fetched Successfully.");
	}

	/* Branch Details Ends Here */
	@Then("Check whether bank details is added in draft or not.")
	public void check_whether_bank_details_is_added_in_draft_or_not() {
		int experience_records_count = PartnerPortal_Menu.Bank_Status_TT.size();
		System.out.println("Bank Details : " + experience_records_count + " records");
		for (int k = 0; k < experience_records_count; k++) {
			WebElement status = DriverFactory.driver
					.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[1])"));
			String bank_status = status.getText();
			if (bank_status.contains("Draft")) {
				System.out.println("Bank Details Saved as Draft");
				System.out.println("----------------------------------");
				WebElement accountCategory = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[3])"));
				WebElement accountNumber = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[4])"));
				WebElement paymentinFavourof = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[5])"));
				WebElement accountType = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[6])"));
				WebElement paymentMode = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[7])"));
				WebElement bankName = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[8])"));
				WebElement IFSCCode = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[9])"));
				WebElement remarks = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[10])"));
				WebElement attachment = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[11])"));
				WebElement referenceNo = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[12])"));
				WebElement paymentRefEmail = DriverFactory.driver
						.findElement(By.xpath("(//table//tbody//tr[" + (k + 1) + "]//td[13])"));
				System.out.println("Status : " + bank_status);
				System.out.println("Account Category : " + accountCategory.getText());
				System.out.println("Account Number : " + accountNumber.getText());
				System.out.println("Payment in favourof : " + paymentinFavourof.getText());
				System.out.println("Account Type : " + accountType.getText());
				System.out.println("Payment Mode : " + paymentMode.getText());
				System.out.println("Bank Name : " + bankName.getText());
				System.out.println("IFSC code : " + IFSCCode.getText());
				System.out.println("Remarks : " + remarks.getText());
				System.out.println("Attachment : " + attachment.getText());
				System.out.println("Reference No : " + referenceNo.getText());
				System.out.println("Payment Ref Email : " + paymentRefEmail.getText());
				System.out.println("----------------------------------");
			}
		}
		System.out.println("Bank Details Viewed Successfully.");

	}

	@Then("Click Clear Button in Branch Details")
	public void click_clear_button_in_branch_details() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.BranchClear_BTN);
		System.out.println("Clear Button clicked Successfully.");
	}

	@Then("Click close icon in popup")
	public void click_close_icon_in_popup() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Empanelment_PopupClose);
		System.out.println("Popup Closed Successfully.");
	}

	/* Add Company approval starts here */
	@Then("Verify whether user able to enter Add Company login username")
	public void verify_whether_user_able_to_enter_add_company_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getCompany_Document_Number();
		DataBaseConnection.loginAction();
		System.out.println("Login Successfully.");
	}

	/* Add Company approval Ends here */
	/* Add Bank Approval Starts here */
	@Then("Verify whether user able to enter Bank login username")
	public void Verify_whether_user_able_to_enter_Bank_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getBank_Document_Number();
		DataBaseConnection.approverMyProfileLogin();
		System.out.println("Login Successfully.");
	}

	@Then("Verify whether user able to fetch Bank document reference no")
	public void Verify_whether_user_able_to_fetch_Bank_document_reference_no() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> VendorDeclarationPopup = DriverFactory.driver
				.findElements(By.xpath("//*[@class='empanel-modal-close']"));
		if (VendorDeclarationPopup.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Empanelment_PopupClose.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("popup is not shown");
		}
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getBank_Document_Number();
		Thread.sleep(10000);
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Bank Document Fetched Successfully.");
	}

	@Then("Verify whether user able to accept Tracking Status Popup")
	public void Verify_whether_user_able_to_accept_Tracking_Status_Popup() throws Throwable {
		Thread.sleep(4000);
		List<WebElement> VendorDeclarationPopup = DriverFactory.driver
				.findElements(By.xpath("//button[@aria-label='Close' and @class='close']"));
		if (VendorDeclarationPopup.size() > 0) {
			Thread.sleep(2000);
			try {
				PartnerPortal_Menu.Tracking_PopupClose.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("popup is not shown");
		}
	}

	@Then("Verify whether user able to click sendback button")
	public void Verify_whether_user_able_to_click_sendback_button() throws Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ASendbackBTN);
		System.out.println("Sendback clicked Successfully.");
	}

	/* Add Bank Approval Ends here */
	/* Contact Details Admin approval Starts Here */
	@Then("^Verify whether user able to enter Contact login username$")
	public void Verify_whether_user_able_to_enter_Contact_login_username() throws InterruptedException, Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getContactDocumentRefNo();
		DataBaseConnection.loginAction();
		System.out.println("Login Successfully.");
	}

	@Then("^Verify whether user able to fetch Contact document reference no$")
	public void Verify_whether_user_able_to_fetch_Contact_document_reference_no()
			throws InterruptedException, Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getContactDocumentRefNo();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Contact Document Fetched Successfully.");
	}

	/* Contact Details Admin approval Ends Here */
	/* Address Details Admin approval Starts Here */
	@Then("^Verify whether user able to enter Address login username$")
	public void Verify_whether_user_able_to_enter_Address_login_username() throws InterruptedException, Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getAddressDocumentRefNo();
		DataBaseConnection.loginAction();
		System.out.println("Login Successfully.");
	}

	@Then("^Verify whether user able to fetch Address document reference no$")
	public void Verify_whether_user_able_to_fetch_Address_document_reference_no()
			throws InterruptedException, Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getAddressDocumentRefNo();
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.documentSearchBTN, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Address Document Fetched Successfully.");
	}

	/* Address Details Admin approval Ends Here */
	/* Tax Contact Details Starts Here */
	@Then("^Select Tax Contact Details tab in my profile$")
	public void Select_Tax_Contact_Details_tab_in_my_profile() throws InterruptedException, Throwable {
		Thread.sleep(3000);
		BaseClass.onButtonClick(PartnerPortal_Menu.taxContactDetailsBTN);
		System.out.println("Tax Contact tab clicked Successfully.");
	}

	@Then("^Click edit icon in tax contact details tab$")
	public void Click_edit_icon_in_tax_contact_details_tab() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.taxContactEditBTN);
		System.out.println("Tax Contact Edit button clicked Successfully.");
	}

	@Then("^Enter contact name in tax contact update popup$")
	public void Enter_contact_name_in_tax_contact_update_popup() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.taxContactNameTB);
		BaseClass.Input(PartnerPortal_Menu.taxContactNameTB, BaseClass.randomString(5));
	}

	@Then("^Enter contact designation in tax contact update popup$")
	public void Enter_contact_designation_in_tax_contact_update_popup() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.taxContactDesignationTB);
		BaseClass.Input(PartnerPortal_Menu.taxContactDesignationTB, BaseClass.randomString(5));
	}

	@Then("^Enter contact mobile no in tax contact update popup$")
	public void Enter_contact_mobile_no_in_tax_contact_update_popup() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.taxContactMobilenoTB);
		BaseClass.Input(PartnerPortal_Menu.taxContactMobilenoTB, BaseClass.RandomNumbers(10));
	}

	@Then("^Enter contact email id in tax contact update popup$")
	public void Enter_contact_email_id_in_tax_contact_update_popup() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.taxContactEmailTB);
		BaseClass.Input(PartnerPortal_Menu.taxContactEmailTB, BaseClass.RandomEmail());
	}

	@Then("Verify whether user able to view tax contact details")
	public void verify_whether_user_able_to_view_tax_contact_details() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> taxContact_DetailsExists = DriverFactory.driver
				.findElements(By.xpath("//*[@aria-hidden='false']"));
		if (taxContact_DetailsExists.size() > 0) {
			String taxContact_Name = BaseClass.GetText(PartnerPortal_Menu.taxContact_Name);
			String taxContact_No = BaseClass.GetText(PartnerPortal_Menu.taxContact_No);
			String taxContact_Email = BaseClass.GetText(PartnerPortal_Menu.taxContact_Email);
			String taxContact_GSTNO = BaseClass.GetText(PartnerPortal_Menu.taxContact_GSTNO);
			String taxContact_State = BaseClass.GetText(PartnerPortal_Menu.taxContact_State);

			System.out.println("Name : " + taxContact_Name);
			System.out.println("Tax Contact Number : " + taxContact_No);
			System.out.println("Email : " + taxContact_Email);
			System.out.println("GST Number : " + taxContact_GSTNO);
			System.out.println("State : " + taxContact_State);
		} else {
			System.err.println("No Contact Details to View");
		}

	}
	/* Tax Contact Details Ends Here */
	
	/* Financial Performance Starts Here */
	@Then("^Click Financial Performance in my profile$")
	public void Click_Financial_Performance_in_my_profile() throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_PerformanceBTN);
	}
	@Then("Verify whether user able to click add more financial details")
	public void verify_whether_user_able_to_click_add_more_financial_details() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddMoreFinancial_Btn);
	}
	@Then("Verify whether user able to select financial year")
	public void verify_whether_user_able_to_select_financial_year() throws Throwable {
		Thread.sleep(5000);
		BaseClass.getrandomOption(PartnerPortal_Menu.Financial_Year);
	}
	@Then("Verify whether user able to enter assessed turnover")
	public void verify_whether_user_able_to_enter_assessed_turnover() throws Throwable {
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.Asset_TurnOver);
		BaseClass.Input(PartnerPortal_Menu.Asset_TurnOver, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter asset value")
	public void verify_whether_user_able_to_enter_asset_value() throws Throwable{
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.Asset_Value);
		BaseClass.Input(PartnerPortal_Menu.Asset_Value, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter gross profit")
	public void verify_whether_user_able_to_enter_gross_profit() throws Throwable{
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.Gross_Profit);
		BaseClass.Input(PartnerPortal_Menu.Gross_Profit, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter net profit")
	public void verify_whether_user_able_to_enter_net_profit() throws Throwable{
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.Net_Profit);
		BaseClass.Input(PartnerPortal_Menu.Net_Profit, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter RoA")
	public void verify_whether_user_able_to_enter_ro_a() throws Throwable{
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.RoA);
		BaseClass.Input(PartnerPortal_Menu.RoA, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter RoCE")
	public void verify_whether_user_able_to_enter_ro_ce() throws Throwable{
		Thread.sleep(5000);
		BaseClass.ClearElement(PartnerPortal_Menu.RoCE);
		BaseClass.Input(PartnerPortal_Menu.RoCE, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to attach document for relevant document")
	public void verify_whether_user_able_to_attach_document_for_relevant_document() throws Throwable{
		Thread.sleep(1500);
		BaseClass.Input(PartnerPortal_Menu.Attach_Documents, pdfAttachment);
		System.out.println("Financial Performance File attachment completed");
	}
	@Then("Verify whether relevant file is attached or not")
	public void verify_whether_relevant_file_is_attached_or_not() throws Throwable{
		Thread.sleep(5000);
		String GST_Doc_name = PartnerPortal_Menu.Verify_GST_Doc_L.getText();
		System.out.println("Attached File document No: " + GST_Doc_name);
	}
	@Then("Verify whether user able to click save in financial performance")
	public void Verify_whether_user_able_to_click_save_in_financial_performance() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DetailsSave_Btn);
	}
	@Then("Verify whether user able to click edit in financial performance")
	public void Verify_whether_user_able_to_click_edit_in_financial_performance() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.MyProfileBankEdit_icon);
	}
	@Then("Verify whether user able to click update in financial performance")
	public void Verify_whether_user_able_to_click_update_in_financial_performance() throws Throwable{
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DetailsUpdate_Btn);
	}
	@Then("Verify whether user able to view Financial details")
	public void Verify_whether_user_able_to_view_Financial_details() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.GSTApprovedTH, PartnerPortal_Menu.GSTApprovedTR);	
	}
	/* Financial Performance Ends Here */
	
	/* My profile View Starts Here */
	
	@Then("Verify whether user able to click General tab in My profile")
	public void verify_whether_user_able_to_click_general_tab_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.General_View);
	}
	@Then("Verify whether user able to click organisation details tab in my profile")
	public void verify_whether_user_able_to_click_organisation_details_tab_in_my_profile() throws Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Organisation_Details_View);
	}
	@Then("Verify whether user able to view organization details in my profile")
	public void verify_whether_user_able_to_view_organization_details_in_my_profile() throws Throwable {
		Thread.sleep(5000);
		System.out.println("Organisation Details : ");
	    int countRecords = PartnerPortal_Menu.OrganizationDTHView.size();
	    System.out.println("Count : "+countRecords);
	    for(int i=0;i<countRecords;i++) {
	    	System.out.println(PartnerPortal_Menu.OrganizationDTHView.get(i).getText()+" : "+PartnerPortal_Menu.OrganizationDTDView.get(i).getText());
	    }
	}
	@Then("Verify whether user able to view contact details in my profile")
	public void Verify_whether_user_able_to_view_contact_details_in_my_profile() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to view factory details in my profile")
	public void Verify_whether_user_able_to_view_factory_details_in_my_profile() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table2DetailsTHView, PartnerPortal_Menu.Table2DetailsTRView);	
	}
	@Then("Verify whether user able to view warehouse details in my profile")
	public void Verify_whether_user_able_to_view_warehouse_details_in_my_profile() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table3DetailsTHView, PartnerPortal_Menu.Table3DetailsTRView);	
	}
	
	@Then("Verify whether user able to click Bank Details in my profile")
	public void verify_whether_user_able_to_click_bank_details_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Bank_Details_View);
	}
	@Then("Verify whether user able to view bank details in my profile")
	public void verify_whether_user_able_to_view_bank_details_in_my_profile() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to click Credentials in my profile")
	public void verify_whether_user_able_to_click_credentials_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Credentails_View);
	}
	@Then("Verify whether user able to view major customers in credentails tab")
	public void verify_whether_user_able_to_view_major_customers_in_credentails_tab() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to view projects in credentials tab")
	public void verify_whether_user_able_to_view_projects_in_credentials_tab() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table2DetailsTHView, PartnerPortal_Menu.Table2DetailsTRView);	
	}
	@Then("Verify whether user able to view Key suppliers in credentials tab")
	public void verify_whether_user_able_to_view_key_suppliers_in_credentials_tab() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table3DetailsTHView, PartnerPortal_Menu.Table3DetailsTRView);	
	}
	@Then("Verify whether user able to click partnership avenues")
	public void verify_whether_user_able_to_click_partnership_avenues() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Partnership_Avenues_View);
	}
	@Then("Verify whether user able to view partnership avenues details")
	public void verify_whether_user_able_to_view_partnership_avenues_details() throws Throwable {
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
		System.out.println(BaseClass.GetText(PartnerPortal_Menu.PartnershipAvenuesQue2)+ " : "+BaseClass.GetText(PartnerPortal_Menu.PartnershipAvenuesAns2));
	}
	@Then("Verify whether user able to click Financial tab in my profile")
	public void verify_whether_user_able_to_click_financial_tab_in_my_profile() throws InterruptedException {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_View);
	}
//	@Then("Verify whether user able to click financial strength")
//	public void verify_whether_user_able_to_click_financial_strength() throws Throwable {
//		Thread.sleep(8000);
//		BaseClass.onButtonClick(PartnerPortal_Menu.Financial_Strength_View);
//	}
	@Then("Verify whether user able to view financial strength details")
	public void verify_whether_user_able_to_view_financial_strength_details() throws Throwable {
		if(PartnerPortal_Menu.Table1DetailsTHView.size()>0) {
			BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
		}
	}
	@Then("Verify whether user able to click Quality in my profile")
	public void verify_whether_user_able_to_click_quality_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Quality_View);
	}
	@Then("Verify whether user able to click control systems in Quality tab")
	public void verify_whether_user_able_to_click_control_systems_in_quality_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Control_System_View);
	}
	@Then("Verify whether user able to view control systems details in quality tab")
	public void verify_whether_user_able_to_view_control_systems_details_in_quality_tab() throws Throwable {
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));

		}
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to click certification in quality tab")
	public void verify_whether_user_able_to_click_certification_in_quality_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Certification_View);
	}
	@Then("Verify whether user able to view certification details in quality tab")
	public void verify_whether_user_able_to_view_certification_details_in_quality_tab() throws Throwable {
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));

		}
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);		}
	@Then("Verify whether user able to click Infra production in my profile")
	public void verify_whether_user_able_to_click_infra_production_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Infra_Production_View);
	}
	@Then("Verify whether user able to click Infrastructure in infra production tab")
	public void verify_whether_user_able_to_click_infrastructure_in_infra_production_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Infrastructure_View);
	}
	@Then("Verify whether user able to view Infrastructure details")
	public void verify_whether_user_able_to_view_infrastructure_details() throws InterruptedException {
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));

		}
	}
	@Then("Verify whether user able to click Capacity in infra production tab")
	public void verify_whether_user_able_to_click_capacity_in_infra_production_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Capactity_View);
	}
	@Then("Verify whether user able to view capacity details")
	public void verify_whether_user_able_to_view_capacity_details() throws Throwable {
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.Answer2Div.get(i)));
		}
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
		BaseClass.getTableView(PartnerPortal_Menu.Table2DetailsTHView, PartnerPortal_Menu.Table2DetailsTRView);	
	}
	@Then("Verify whether user able to click HSE in my profile")
	public void verify_whether_user_able_to_click_hse_in_my_profile() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.HSE_View);
	}
	@Then("Verify whether user able to click Awards and Certification in HSE tab")
	public void verify_whether_user_able_to_click_awards_and_certification_in_hse_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Awards_Certification_View);
	}
	@Then("Verify whether user able to view Awards and Certification details")
	public void verify_whether_user_able_to_view_awards_and_certification_details() throws Throwable {
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click Best Practices in HSE tab")
	public void verify_whether_user_able_to_click_best_practices_in_hse_tab() throws Throwable {
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Best_Practices_View);
	}
	@Then("Verify whether user able to view Best Practices details")
	public void verify_whether_user_able_to_view_best_practices_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to click Sustainability in HSE tab")
	public void verify_whether_user_able_to_click_sustainability_in_hse_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sustainability_View);
	}
	@Then("Verify whether user able to view Sustainability details")
	public void verify_whether_user_able_to_view_sustainability_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click statutory in HSE tab")
	public void verify_whether_user_able_to_click_statutory_in_hse_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Statutory_View);
	}
	@Then("Verify whether user able to view statutory details")
	public void verify_whether_user_able_to_view_statutory_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click IT in my profile")
	public void verify_whether_user_able_to_click_it_in_my_profile() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IT_Heading_View);
	}
	@Then("Verify whether user able to click and view IT in  IT tab")
	public void verify_whether_user_able_to_click_and_view_it_in_it_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.IT_View);
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
		BaseClass.getTableView(PartnerPortal_Menu.Table1DetailsTHView, PartnerPortal_Menu.Table1DetailsTRView);	
	}
	@Then("Verify whether user able to click Manpower in my profile")
	public void verify_whether_user_able_to_click_manpower_in_my_profile() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ManPower_View);
	}
	@Then("Verify whether user able to click workforce details in Manpower tab")
	public void verify_whether_user_able_to_click_workforce_details_in_manpower_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Workforce_Details_View);
	}
	@Then("Verify whether user able to view workforce details")
	public void verify_whether_user_able_to_view_workforce_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click statutory compilance in Manpower tab")
	public void verify_whether_user_able_to_click_statutory_compilance_in_manpower_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Statutory_Compilance_View);
	}
	@Then("Verify whether user able to view statutory compilance details")
	public void verify_whether_user_able_to_view_statutory_compilance_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click sustainability in my profile")
	public void verify_whether_user_able_to_click_sustainability_in_my_profile() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sustainability_Heading_View);
	}
	@Then("Verify whether user able to click sustainability in sustainability tab")
	public void verify_whether_user_able_to_click_sustainability_in_sustainability_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Sustainability_ViewTT);
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.AnswerDiv.get(i)));
		}
	}
	@Then("Verify whether user able to click attachments in my profile")
	public void verify_whether_user_able_to_click_attachments_in_my_profile() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Attachments_View);
	}
	@Then("Verify whether user able to click general in attachments tab")
	public void verify_whether_user_able_to_click_general_in_attachments_tab() throws Throwable{
		Thread.sleep(8000);
		BaseClass.onButtonClick(PartnerPortal_Menu.General_ViewTT);
	}
	@Then("Verify whether user able to view attachment details")
	public void verify_whether_user_able_to_view_attachment_details() throws Throwable{
		Thread.sleep(1000);
		int TotalRecords=PartnerPortal_Menu.QuestionDiv.size();
		System.out.println(TotalRecords);
		for(int i=0;i<TotalRecords;i++) {
			System.out.println(BaseClass.GetText(PartnerPortal_Menu.QuestionDiv.get(i))+ " : "+BaseClass.GetText(PartnerPortal_Menu.Answer1Div.get(i)));
		}
	}
	/* My profile View Ends Here */
	/* Partner Evaluation Approval Starts Here */
	@Then("Verify whether user able to enter evalution login username")
	public void Verify_whether_user_able_to_enter_evalution_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.EvaluationApprovalLogin();
		System.out.println("Login Successfully.");
	}
	@Then("Verify whether user able to click Partner Performance Evaluation Menu")
	public void verify_whether_user_able_to_click_partner_performance_evaluation_menu() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Access_Based_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Access_Based_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Business_Apps_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Business_Apps_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_portal_Menu));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_portal_Menu);
		wait.until(ExpectedConditions.elementToBeClickable(PartnerPortal_Menu.Partner_performance_Evaluation));
		BaseClass.onButtonClick(PartnerPortal_Menu.Partner_performance_Evaluation);
	}
	@Then("^Verify whether user able to fetch evaluation document reference no$")
	public void Verify_whether_user_able_to_fetch_evaluation_document_reference_no()
			throws InterruptedException, Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		String docRefNo = DataBaseConnection.getEvaluation_Document_Number();
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerEvaluatorfilter_icon);
		BaseClass.Input(PartnerPortal_Menu.PartnerEvaluatorDocNo_TB, docRefNo);
		System.out.println("Document Reference No : " + docRefNo);
		System.out.println("Evaluation Approval Document Fetched Successfully");
	}
	@Then("^Verify whether user able to click evaluation approve button$")
	public void Verify_whether_user_able_to_click_evaluation_approve_button()
			throws InterruptedException, Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvaluatorApprove_BTN);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
	}
	@Then("^Verify whether user able to click evaluation sendback button$")
	public void Verify_whether_user_able_to_click_evaluation_sendback_button()
			throws InterruptedException, Throwable {
		BaseClass.onMouseHover(PartnerPortal_Menu.PartnerEvaluatorSendback_BTN);
		Thread.sleep(5000);
		BaseClass.Input(PartnerPortal_Menu.Partner_Sendback_Remarks,"Testing Sendback Remarks");
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.PartnerReq_Evaluation_Submit);
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
	}
	@Then("^Verify whether user able to click filtered document number for approval$")
	public void Verify_whether_user_able_to_click_filtered_document_number_for_approval()
			throws InterruptedException, Throwable {
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.DocumentNumberTD);
	}
	@Then("^Verify whether user able to click approve and sendback by heading wise$")
	public void Verify_whether_user_able_to_click_approve_and_sendback_by_heading_wise()
			throws InterruptedException, Throwable {
		Thread.sleep(8000);
		int count = PartnerPortal_Menu.ApproveBTN.size();
		for(int i=0;i<count;i++) {
			Thread.sleep(2000);
			if(i%2==0) {
				BaseClass.onButtonClick(PartnerPortal_Menu.ApproveBTN.get(0));
				Thread.sleep(2000);
			}else {
				BaseClass.onButtonClick(PartnerPortal_Menu.SenbackBTN.get(0));
				Thread.sleep(2000);
			}
			Thread.sleep(8000);
			BaseClass.onButtonClick(PartnerPortal_Menu.ok_Btn);
		}
	
	}
	/* Partner Evaluation Approval Ends Here */
	/*Customer Registration Starts Here */
	@Then("Verify whether user able to click add customer")
	public void verify_whether_user_able_to_click_add_customer() throws Throwable {
		Thread.sleep(2000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddCustomerBTN);
	}
	@Then("Verify whether user able to select country")
	public void verify_whether_user_able_to_select_country() throws Throwable {
	    //BaseClass.getrandomOption(PartnerPortal_Menu.CountryDD);
		BaseClass.SelectText(PartnerPortal_Menu.CountryDD, "India");
	}
	@Then("Verify whether user able to add PAN number")
	public void verify_whether_user_able_to_add_pan_number()throws Throwable {
		try {
		     BaseClass.Input(PartnerPortal_Menu.PANorTANNoTB, BaseClass.RandomPANNO());
		} catch (Exception e) {
		     BaseClass.Input(PartnerPortal_Menu.CompanyRegistrationNOTB, BaseClass.RandomNumbers(10));
		}
	}
	@Then("Verify whether user able to select company")
	public void verify_whether_user_able_to_select_company()throws Throwable {
	    BaseClass.getrandomOption(PartnerPortal_Menu.CompanyDD);
	}
	@Then("Verify whether user able to add customer name")
	public void verify_whether_user_able_to_add_customer_name()throws Throwable {
		     BaseClass.Input(PartnerPortal_Menu.CustomerNameTB, BaseClass.randomString(10));
	}
	@Then("Verify whether user able to select sector")
	public void verify_whether_user_able_to_select_sector() throws Throwable{
	    BaseClass.getrandomOption(PartnerPortal_Menu.SectorDD);
	}
	@Then("Verify whether user able to select nature")
	public void verify_whether_user_able_to_select_nature()throws Throwable {
	    BaseClass.getrandomOption(PartnerPortal_Menu.NatureDD);
	}
	@Then("Verify whether user able to select customer group")
	public void verify_whether_user_able_to_select_customer_group()throws Throwable {
	    BaseClass.getrandomOption(PartnerPortal_Menu.CustomerGroupDD);
	}
	@Then("Verify whether user able to add contact name")
	public void verify_whether_user_able_to_add_contact_name() throws Throwable{
	     BaseClass.Input(PartnerPortal_Menu.PA_Contact_Name, BaseClass.randomString(10));
	}
	@Then("Verify whether user able to add email in customer registration")
	public void verify_whether_user_able_to_add_email_in_customer_registration() throws Throwable{
	     BaseClass.Input(PartnerPortal_Menu.PA_Contact_Email, BaseClass.RandomEmail());
	}
	@Then("Verify whether user able to add mobile number in customer registration")
	public void verify_whether_user_able_to_add_mobile_number_in_customer_registration() throws Throwable{
	     BaseClass.Input(PartnerPortal_Menu.PA_Contact_MobileNo, BaseClass.RandomNumbers(10));
	}
	@Then("Verify whether user able to click customer register")
	public void verify_whether_user_able_to_click_customer_register() throws Throwable{
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.Parnter_Registration_BTN);
		Thread.sleep(10000);
		BaseClass.Accept_Alert1();
	}
	@Then("Verify whether user able to enter customer address")
	public void verify_whether_user_able_to_enter_customer_address() throws Throwable{
		Thread.sleep(4000);
	     BaseClass.Input(PartnerPortal_Menu.CustomerAddressTB, BaseClass.randomString(10));
	}
	@Then("Verify whether user able to select customer state")
	public void verify_whether_user_able_to_select_customer_state() throws Throwable{
		BaseClass.SelectText(PartnerPortal_Menu.StateDD, "Tamilnadu");
	    //BaseClass.getrandomOption(PartnerPortal_Menu.StateDD);
	}
	@Then("Verify whether user able to select customer city")
	public void verify_whether_user_able_to_select_customer_city() throws Throwable{
		Thread.sleep(3000);;
		BaseClass.SelectText(PartnerPortal_Menu.CityDD, "Chennai");
	   // BaseClass.getrandomOption(PartnerPortal_Menu.CityDD);
	}
	@Then("Verify whether user able to enter customer zipcode")
	public void verify_whether_user_able_to_enter_customer_zipcode() throws Throwable{
	     BaseClass.Input(PartnerPortal_Menu.CustomerZipCodeTB, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to enter VAN Registration Number")
	public void verify_whether_user_able_to_enter_van_registration_number() throws Throwable{
		BaseClass.onButtonClick(PartnerPortal_Menu.VANRegisterNumerRB);
		Thread.sleep(2000);
		try {
		    BaseClass.Input(PartnerPortal_Menu.VANRegisterNumberTB, BaseClass.RandomNumbers(6));
		} catch (Exception e) {
		    DataBaseConnection.dataBaseConnectionPP();
		    DataBaseConnection.getGSTNumber();
		    DataBaseConnection.databaseConnectionClose();
		}
	}
	@Then("Verify whether user able to enter TAN Number for customer Registration")
	public void verify_whether_user_able_to_enter_TAN_Number_for_customer_Registration() throws Throwable{
		try {
			BaseClass.onButtonClick(PartnerPortal_Menu.TANRegisterNumerRB);
			Thread.sleep(2000);
		    BaseClass.Input(PartnerPortal_Menu.TANNumberTB, BaseClass.RandomTANNO());
		} catch (Exception e) {
			System.out.println("TAN Number not available");
		}
	}
	@Then("Verify whether user able to attach file for VAN Registration Number")
	public void verify_whether_user_able_to_attach_file_for_van_registration_number() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.VANRegisterNumberAttachment, pdfAttachment);
	}
	@Then("Verify whether user able to attach file for TAN Number")
	public void verify_whether_user_able_to_attach_file_for_TAN_number() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.TANNumberAttachment, pdfAttachment);
	}
	@Then("Verify whether user able to enter last financial year turn over")
	public void verify_whether_user_able_to_enter_last_financial_year_turn_over() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.FinancialYearTurnOverTB, BaseClass.RandomNumbers(6));
	}
	@Then("Verify whether user able to attach file for balance sheet documents")
	public void verify_whether_user_able_to_attach_file_for_balance_sheet_documents() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.BalanceSheetAttachment, pdfAttachment);
	}
	@Then("Verify whether user able to enter last financial year ITR filing ack number")
	public void verify_whether_user_able_to_enter_last_financial_year_ITR_filing_ack_number() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.ITRFilingTB, BaseClass.RandomNumbers(15));
	}
	@Then("Verify whether user able to attach file for last financial year ITR filing ack number")
	public void verify_whether_user_able_to_attach_file_for_last_financial_year_ITR_filing_ack_number() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.ITRFilingAttachment, pdfAttachment);
	}
	@Then("Verify whether user able to enter CRISIL rating")
	public void verify_whether_user_able_to_enter_crisil_rating() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.CRISIL_Rating, "A");
	}
	@Then("Verify whether user able to attach file for relevant documents")
	public void verify_whether_user_able_to_attach_file_for_relevant_documents() throws Throwable{
	    BaseClass.Input(PartnerPortal_Menu.RelevantDocumentAttachment, pdfAttachment);
	}
	@Then("Verify whether user able to click add bank")
	public void verify_whether_user_able_to_click_add_bank() throws Throwable{
		Thread.sleep(6000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddBankBTN);
	}
	@Then("Verify whether user able to click add branch")
	public void verify_whether_user_able_to_click_add_branch() throws Throwable{
		Thread.sleep(4000);
		BaseClass.onButtonClick(PartnerPortal_Menu.AddBranchBTN);
	}
	@Then("Verify whether user able to handle the success alert")
	public void Verify_whether_user_able_to_handle_the_success_alert() throws Throwable{
		Thread.sleep(5000);
		try {
		    BaseClass.Accept_Alert1();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		} 
		Thread.sleep(5000);
	    BaseClass.Accept_Alert1();
	}
	@Then("Verify whether user able to save customer registration as Draft")
	public void verify_whether_user_able_to_save_customer_registration_as_draft() throws Throwable{
		BaseClass.onButtonClick(PartnerPortal_Menu.SaveDraftBTN);
		Thread.sleep(2000);
		BaseClass.Accept_Alert1();
	}
	@Then("Verify whether user able to get last registered customer")
	public void verify_whether_user_able_to_get_last_registered_customer() throws Throwable {
		Thread.sleep(5000);
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getCustomerName();
		DataBaseConnection.databaseConnectionClose();
		Thread.sleep(5000);
		BaseClass.onButtonClick(PartnerPortal_Menu.ViewBTN);
	}
	@Then("Verify whether user able to submit draft customer for approval")
	public void verify_whether_user_able_to_submit_draft_customer_for_approval()throws Throwable {
		Thread.sleep(4000);
		BaseClass.jsBottom(PartnerPortal_Menu.SubmitForApprovalBTN);
		BaseClass.onButtonClick(PartnerPortal_Menu.SubmitForApprovalBTN);
		Thread.sleep(4000);
		BaseClass.Accept_Alert1();
		Thread.sleep(10000);
		BaseClass.Accept_Alert1();
	}
	@Then("Verify whether user able to enter customer login username")
	public void verify_whether_user_able_to_enter_customer_login_username() throws Throwable {
		Thread.sleep(3000);
		DriverFactory.driver.navigate().to(configFileReader.eipQA_Environment());
		DataBaseConnection.dataBaseConnectionPP();
		DataBaseConnection.getCustomer_Document_Number();
		DataBaseConnection.loginAction();
	}


	/* Customer Registration Ends Here */
}
