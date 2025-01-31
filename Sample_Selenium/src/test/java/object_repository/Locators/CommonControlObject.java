package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonControlObject {

	@FindBy(how = How.ID, using = "ibtAdvanceSearch")
	public static WebElement advanceSearch;

	@FindBy(how = How.XPATH, using = "(//*[@id='ibtSearch']//input)[5]")
	public static WebElement docNo;

	@FindBy(how = How.XPATH, using = "//input[@id='ibtSearch']")
	public static WebElement search;

	@FindBy(how = How.ID, using = "btnClear")
	public static WebElement clear;

	@FindBy(how = How.XPATH, using = "//div[text()=' All ']")
	public static WebElement all;

	@FindBy(how = How.XPATH, using = "//div[text()=' Expired ']")
	public static WebElement expired;

	@FindBy(how = How.XPATH, using = "//div[text()=' Authorized ']")
	public static WebElement authorized;
	
	@FindBy(how = How.XPATH, using = "//li[@role='option']")
	public static List<WebElement> optionLi;

	@FindBy(how = How.XPATH, using = "//div[text()=' Inprogress ']")
	public static WebElement inprogress;

	@FindBy(how = How.XPATH, using = "//div[text()=' For Action ']")
	public static WebElement forAction;

	@FindBy(how = How.XPATH, using = "//td[@role='gridcell']//div")
	public static WebElement searchDocNumber;
	
	@FindBy(how = How.XPATH, using= "//kendo-grid-list/div/div[1]/table/tbody/tr[1]/td")
	public static List<WebElement> created_Doc_Details;

	@FindBy(how = How.XPATH, using = "//tbody//tr[1]//td[2]//div")
	public static WebElement searchDocNumberApproveorReject;

	@FindBy(how = How.XPATH, using = "//i[@title='Refresh']")
	public static WebElement refresh;

	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
	public static WebElement filter;

	@FindBy(how = How.XPATH, using = "(//input)[2]")
	public static WebElement docfilternumber;

	@FindBy(how = How.XPATH, using = "//*[@title='Go to the last page']")
	public static WebElement lastPage;

	@FindBy(how = How.XPATH, using = "//*[@title='Go to the next page']")
	public static WebElement nextPage;

	@FindBy(how = How.XPATH, using = "//*[@title='Go to the previous page']")
	public static WebElement previousPage;

	@FindBy(how = How.XPATH, using = "//*[@title='Go to the first page']")
	public static WebElement firstPage;

	@FindBy(how = How.XPATH, using = "//*[@class='k-pager-info k-label']")
	public static WebElement pageNumberSzie;

	@FindBy(how = How.ID, using = "profiledropdownbtn")
	public static WebElement profileIcon;

	@FindBy(how = How.LINK_TEXT, using = "Sign Out")
	public static WebElement signOut;

	@FindBy(how = How.XPATH, using = "//*[@id='lblRateContract']/div/app-landing/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[9]")
	public static WebElement status;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement ok;

	@FindBy(how = How.XPATH, using = "//li[@class='active ng-star-inserted']//a[1]")
	public static WebElement landingPageTitle;

	@FindBy(how = How.TAG_NAME, using = "select")
	public static WebElement show;

	@FindBy(how = How.XPATH, using = "//select/option")
	public static List<WebElement> selectNumberofItems;

	@FindBy(how = How.TAG_NAME, using = "kendo-pager-info")
	public static WebElement pageInfo;

	@FindBy(how = How.XPATH, using = "//i[@title='Expand']")
	public static WebElement expand;

	@FindBy(how = How.XPATH, using = "//i[@title='Collapse']")
	public static WebElement collapse;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	public static WebElement selectDocument;

	@FindBy(how = How.ID, using = "ibtAccept")
	public static WebElement approve;

	@FindBy(how = How.ID, using = "ibtReject")
	public static WebElement reject;

	@FindBy(how = How.TAG_NAME, using = "textarea")
	public static WebElement approverConfirmationMessage;

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement yes;

	@FindBy(how = How.XPATH, using = "(//label[@class='mat-checkbox-layout']//div)[1]")
	public static WebElement selectDocToApprove;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Remarks']")
	public static WebElement approverRemarks;

	@FindBy(how = How.XPATH, using = "//eipconfirmationlistmessagebox//p")
	public static WebElement confirmation;

	@FindBy(how = How.XPATH, using = "//h1")
	public static WebElement confirmationHeader;

	@FindBy(how = How.XPATH, using = "//eipconfirmationlistmessagebox//h1")
	public static WebElement confirmationHeaderApprover;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static WebElement successTitle;

	@FindBy(how = How.XPATH, using = "//eipconfirmationlistmessagebox//p")
	public static WebElement confirmationHeaderBodyrText;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//p")
	public static WebElement successBody;

	@FindBy(how = How.CLASS_NAME, using = "modulemenu")
	public static WebElement moduleMenu;

	@FindBy(how = How.XPATH, using = "//span[@title='Supply Chain Mgmt']")
	public static WebElement supplyChainMgmt;

	@FindBy(how = How.XPATH, using = "//span[@title='Logistics']")
	public static WebElement logistics;

	@FindBy(how = How.XPATH, using = "//span[@title='Transport Request']")
	public static WebElement transportRequest;

	@FindBy(how = How.XPATH, using = "//span[@title='Transport Receipt']")
	public static WebElement transportReceipt;

	@FindBy(how = How.XPATH, using = "//span[@title='Transport Invoice']")
	public static WebElement transportInvoice;

	@FindBy(how = How.XPATH, using = "//span[@title='Masters']")
	public static WebElement masters;

	@FindBy(how = How.XPATH, using = "//span[@title='Rate Contract']")
	public static WebElement rateContract;

	@FindBy(how = How.XPATH, using = "//div[text()='Transport Request']")
	public static WebElement transportRequestPage;

	@FindBy(how = How.ID, id = "GribtAttachmentViewer")
	public static WebElement attachmentView;

	@FindBy(how = How.XPATH, using = "(//i[@title='Document View'])[2]")
	public static WebElement attachmentViewDownload;

	@FindBy(how = How.XPATH, xpath = "//div[@id='eip-document-viewer']//div[@class='mat-dialog-title']")
	public static WebElement attachmentWindowTitle;

	@FindBy(how = How.XPATH, xpath = "//*[@class='document-viewer-name']")
	public static WebElement attachedDocumentName;

	@FindBy(how = How.XPATH, using = "//strong[text()='Transport Rate Contract - Create']")
	private WebElement transportRateContract;
	
	
//********************************* 13.12.2022 **************************
	
	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
	public static WebElement Document_No_AdvanceSearch;  //pk
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Loading']")
	public static List<WebElement> Spinner;
	
	@FindBy(how = How.XPATH, using = "//mat-option")
	public static List<WebElement> optionList;
	
	@FindBy(how = How.XPATH, using = "//div/mat-option")
	public static List<WebElement> ListOption;
	
	@FindBy(how = How.TAG_NAME, using = "mat-option")
	public static WebElement ListOptionElement;
	// 14.03.2023
	
	@FindBy(how = How.XPATH, using = "//mat-list-option")
	public static List<WebElement> cart_List;
	

	@FindBy(how = How.XPATH, using = "//span[@title='clear']")
	public static WebElement Document_Type_clear;  //pk\

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public static List<WebElement> Document_Type_List;  //pk

//	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
//	public static WebElement Document_No_AdvanceSearch;  //pk
//
//	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
//	public static WebElement Document_No_AdvanceSearch;  //pk
//
//	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
//	public static WebElement Document_No_AdvanceSearch;  //pk
//
//	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
//	public static WebElement Document_No_AdvanceSearch;  //pk
//
//	@FindBy(how = How.XPATH, using = "//label[text()='Document No']")
//	public static WebElement Document_No_AdvanceSearch;  //pk
	
	
//	Attachment 
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-paperclip']")
	public static WebElement Attachment;
	
	
	@FindBy(how = How.XPATH, using = "(//kendo-upload/div/div[1]/input)[2]")
	public static WebElement Upload_File;
	
	@FindBy(how = How.XPATH, using = "(//span[text()='--Select--'])[1]")
	public static WebElement attachFileType;
	
	
	@FindBy(how = How.XPATH, using = "//tr/td[3]/input")
	public static WebElement attachDescription;
	
	@FindBy(how = How.XPATH, using = "//td[4]/mat-checkbox/label/span[1]")
	public static WebElement attachExternal_Toggle;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Remove']")
	public static WebElement attachRemove;
	
	@FindBy(how = How.XPATH, using = "//button[@title='Upload Documents']")
	public static WebElement upload_DocAttach;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Cancel']")
	public static WebElement attach_Cancel;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement OkBtn;
	
	@FindBy(how = How.XPATH, using = "//p[@class='toastMessageLength']")
	public static WebElement popup_insideText;
	
	@FindBy(how = How.XPATH, using = "//eipmessagebox/div/div[2]/p")
	public static WebElement popUp_Text;
	
	@FindBy(how = How.ID, using = "imgDownload")
	public static WebElement excelDownload;
	
	@FindBy(how = How.ID, using = "imgUpload")
	public static WebElement excelUpload;
	
	@FindBy(how = How.XPATH, using= "//app-documentupload/div/div[1]/div/div/i")
	public static WebElement AttachPopUpClose;
	
	//**Popup**		
	
		@FindBy(how = How.XPATH, using = "//eipmessagebox")
		public static WebElement popup;

		@FindBy(how = How.XPATH, using = "//eipmessagebox//div//p")
		public static WebElement popup_text;
		
		@FindBy(how = How.XPATH, using = "(//app-fsi-success-alert//div//div)[3]")
		public static WebElement Confirmation_Popup_Text;
		
		@FindBy(how = How.XPATH, using = "(//app-fsi-success-alert//div)[3]")
		public static WebElement Confirmation_Popup_Text_Full;

		@FindBy(how = How.XPATH, using = "(//lib-group-messagebox//mat-tab-body//div//li)")
		public static WebElement popup_text_Attachment;

		@FindBy(how = How.XPATH, using = "//h1")
		public static WebElement popup_head;
		
		@FindBy(how = How.XPATH, using = "(//app-fsi-success-alert//div)[1]")
		public static WebElement Confirmation_Popup_head;

		@FindBy(how = How.XPATH, using = "(//lib-group-messagebox//div//div)[2]")
		public static WebElement popup_head_Attachment;

		@FindBy(how = How.XPATH, using = "//*[@title='close']")
		public static WebElement Popup_Close;

		@FindBy(how = How.XPATH, using = "//div[@id='mat-dialog-title-0']//h1[1]")
		public static List<WebElement> basic_popup_validation;

		@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
		public static List<WebElement> Popup_dashboardtips;

		@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
		public static WebElement Popup_dashboardtips_Head;

		@FindBy(how = How.XPATH, using = "//div[@class='introjs-tooltiptext']")
		public static WebElement Popup_dashboardtips_Message;

		@FindBy(how = How.XPATH, using = "//a[text()='Next']")
		public static WebElement Popup_dashboardtips_Next;

		@FindBy(how = How.XPATH, using = "//a[text()='Back']")
		public static WebElement Popup_dashboardtips_Back;

		@FindBy(how = How.XPATH, using = "//a[text()='Done']")
		public static WebElement Popup_dashboardtips_Done;

		@FindBy(how = How.CLASS_NAME, using = "introjs-skipbutton")
		public static WebElement Popup_dashboardtips_Skip;

		@FindBy(how = How.XPATH, using = "//input[@value='Yes']")
		public static WebElement Popup_dashboardtips_Showtips_again_Yes;

		@FindBy(how = How.XPATH, using = "//input[@value='No']")
		public static WebElement Popup_dashboardtips_Showtips_again_No;

		@FindBy(how = How.XPATH, using = "//p[text()=' Do not show the Tips again ? ']")
		public static List<WebElement> Popup_dashboardtips_Showtips_again;
		
		
		@FindBy(how = How.XPATH, using = "(//kendo-combobox/span/span/span)[2]")
		public static WebElement dropDown;
		
		@FindBy(how = How.XPATH, using = "(//kendo-combobox/span/span/span)[3]")
		public static WebElement dropDown1;
		
		
//		@FindBy(how = How.XPATH, using = "(//span[@class='k-select'])")
//		public static List<WebElement> daysOfRecord;
		
		@FindBy(how = How.XPATH, using= "//kendo-combobox/span/span[2]")
		public static WebElement ListDaysRecord;
		
		@FindBy(how = How.XPATH, using="//div[2]/kendo-pager-page-sizes")
		public static WebElement showItems;
		
		@FindBy(how = How.XPATH, using= "//kendo-list/div/ul/li[7]")
		public static WebElement text40;
		
		@FindBy(how = How.XPATH, using= "//kendo-list/div/ul/li")
		public static List<WebElement> chooseShowItems;

}
