package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EIP_Menu {
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']")	static  WebElement SearchMenu;
	public @FindBy(xpath = "//span[text()=' RFQ ']")	static  WebElement SelectRFQ;
	public @FindBy(xpath = "//*[contains(@title, 'Add RFQ')]")	static  WebElement SelectAddIcon;
	public @FindBy(xpath = "//*[contains(@title, 'Search PR')]")	static  WebElement SearchPR;
	public @FindBy(xpath = "//*[contains(@id, 'icon-rightrfqDateRange')]")	static  WebElement AllocationDate;
	public @FindBy(xpath = "//*[contains(@id, 'icon-rightrfqDateRange')]")	static  WebElement EnterAllocationDate;
	public @FindBy(xpath = "//*[contains(@id, 'btn_Search')]")	static  WebElement SelectSearchIcon;
	public @FindBy(xpath = "(//*[@class='mat-checkbox-inner-container'])[1]")	static  WebElement SelectPR;
	public @FindBy(xpath = "(//*[@type='button'])[7]")	static  WebElement SelectNextIcon;
	public @FindBy(xpath = "//*[@id='remarks']")	static  WebElement EnterScopeOfRFQ;
	public @FindBy(xpath = "(//*[@id='mat-input-72'])")	static  WebElement EnterQuantity;
	public @FindBy(xpath = "(//*[@id='gibtexpandlist'])[2]") static WebElement ExpandList;
	public @FindBy(xpath = "(//*[@style='cursor: pointer;'])") static WebElement DelSchedule;
	public @FindBy(xpath = "//*[@id='dprS_Delivery_Qty']") static WebElement DeliveryQty;
	public @FindBy(xpath = "(//*[@type='submit'])[2]") static WebElement SaveandClose;	 
	public @FindBy(xpath = "//input[@placeholder='HSN']")	static  WebElement EnterHSN;
	public @FindBy(xpath = "(//*[@type='button'])[9]")	static  WebElement SelectNextIconRFQCreate;
	public @FindBy(xpath = "(//button[text()='Ok'])")	static  WebElement AcceptAlert;
	public @FindBy(xpath = "//*[@id='lstVendor']")	static  WebElement EnterVendor;
	public @FindBy(xpath = "//span[text()= 'V0072321']")	static  WebElement SelectVendor;
	public @FindBy(xpath = "(//button[text()='Add'])")	static  WebElement SelectAddVendorIcon;
	public @FindBy(xpath = "(//*[@type='button'])[14]")	static  WebElement SelectNextIconVendor;
	public @FindBy(xpath = "//*[contains(@id,'Percent0')]")	static  WebElement EnterReleasePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'Event0')]")	static  WebElement SelectEventPaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'RefValue0')]")	static  WebElement SelectReferenceValuePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'creditDays0')]")	static  WebElement SelectCreditDaysPaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'PaymentMode0')]")	static  WebElement SelectPaymentModePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'RefDateValue0')]")	static  WebElement SelectReferenceDatePaymentTerms;
	public @FindBy(xpath = "//span[text() = ' Select All']")	static  WebElement SelectDocumentPaymentTerms;
	public @FindBy(xpath = "//mat-panel-title[text() = ' Preview ']")	static  WebElement ClickAndConform;
	public @FindBy(xpath = "(//button[text()='Next'])")	static  WebElement SelectNextIconPaymentTerms;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-tab-label-content')])[9]")	static  WebElement SelectAdditionalDetails;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-expansion-panel-header-title')])[2]")	static  WebElement SelectShipmentDetails;
	public @FindBy(xpath = "//*[@id='billingto0']")	static  WebElement SelectBillingToShipmentDetails;
	public @FindBy(xpath = "//*[@id='shippingto0']") static  WebElement SelectShippingToShipmentDetails;
	public @FindBy(xpath = "//strong[text() = ' Trade Details']") static  WebElement  TradeDetails;
	public @FindBy(xpath = "//input[@placeholder='Trade Terms']") static  WebElement TradeTerms;
	public @FindBy(xpath = "//span[text()='11 - F.O.R. YOUR GODOWN']") static  WebElement SelectTradeTerms;
	public @FindBy(xpath = "//strong[text()=' Request Essentials']") static  WebElement RequestEssentialsMenu;
	public @FindBy(xpath = "(//*[contains(@id, 'iDtTAGOrdrExpDate')])") static  WebElement OrderExpiryDate;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-calendar-body-cell-content mat-calendar-body-today')])") static  WebElement RFQOrderExpiryDate;
	public @FindBy(xpath = "//button[text()='Save']") static  WebElement OTSave;
	public @FindBy(xpath = "//a[text() ='Attach General Terms & Conditions']") static  WebElement AttachGeneralTerms;
	public @FindBy(xpath = "(//button[text()='Save'])[2]") static  WebElement TCSave;
	public @FindBy(xpath = "//button[text()='Save Draft']") static  WebElement Submit;
	public @FindBy(xpath = "//span[text()=' RFQ Bidders Quote ']") static  WebElement SelectRFQBQ;
	public @FindBy(xpath = "(//input[@value='Acknowledge'])") static  WebElement Acknowledge;
	public @FindBy(xpath = "(//input[@value='Place Bid'])") static  WebElement BQPlaceBid;
	
	public @FindBy(xpath = "//b[text()='I agree to the terms and conditions']") static  WebElement agreeterms;
	public @FindBy(xpath = "//*[@id='btnTCSubmit']") static  WebElement BQSubmit;
	public @FindBy(xpath = "/html/body/app-root/div/div[2]/app-bqcreationcontainer/lib-eip-bqedit/div/div[2]/app-bqcreatematcardview/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/div/mat-form-field/div/div[1]/div/input[1]") static  WebElement Rate;
	public @FindBy(xpath = "//button[text() ='Save Draft']") static  WebElement SaveDraft;
	
	public @FindBy(xpath = "//input[@value='Techno Commercials']") static  WebElement TechnoCommercials;
	public @FindBy(xpath = "//div[text()='Additional Details']") static  WebElement AdditionalDetails;
	public @FindBy(xpath = "//*[@id= 'vendorAdress0']") static  WebElement BillFrom;
	public @FindBy(xpath = "//*[@placeholder= 'GST Register No']") static  WebElement GSTRegisterNo;
	public @FindBy(xpath = "(//*[@title='Close'])[1]") static  WebElement Close;
	public @FindBy(xpath = "//div[text()=' In Progress ']") static  WebElement InProgress;
	public @FindBy(xpath = "//p[text() = 'Request Essentials']") static  WebElement RequestEssentials;
	public @FindBy(xpath = "(//input[@placeholder='TAN'])") static  WebElement TAN;
	public @FindBy(xpath = "(//button[text()='Save'])[3]") static  WebElement RESave;
	public @FindBy(xpath = "//p[text() = 'Trade Details']") static  WebElement  TCTradeDetails;
	public @FindBy(xpath = "//input[@placeholder='Trade Terms']") static  WebElement TCTradeTerms;
	public @FindBy(xpath = "((//i[@title='Close'])[3])") static  WebElement TCClose;
	public @FindBy(xpath = "//button[text()='Submit']") static  WebElement RFQSubmit;
	public @FindBy(xpath = "(//*[contains(@class, 'ng-star-inserted')])[90]") static  WebElement RFQ;
	public @FindBy(xpath = "(//i[@title = 'Comparison'])[1]") static  WebElement Comparison;
	public @FindBy(xpath = "//button[text()='Close TCC']") static  WebElement TCCClose;
	

	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
