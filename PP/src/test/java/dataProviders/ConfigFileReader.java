package dataProviders;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import Constants.GlobalConstants;
import net.bytebuddy.utility.RandomString;
import object_repository.PartnerPortal_Menu;
import utils.DriverFactory;

public class ConfigFileReader {

	protected InputStream input = null;
	protected static Properties properties = null;

	public ConfigFileReader() {
		try {
			input = Files.newInputStream(Paths.get(GlobalConstants.Config_Properties_Loc));
			properties = new Properties();
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDriverPath_Chrome() {
		properties.getProperty("DriverPath_Chrome");
		if (properties.getProperty("DriverPath_Chrome") != null)
			return "";
		else
			return properties.getProperty("DriverPath_Chrome");
	}

	public static String getBrowser() {
		if (properties.getProperty("browserName") == null)
			return "";
		else
			return properties.getProperty("browserName");
	}

	public static String getDriverPath_Firefox() {
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath_Firefox not specified in the Configuration.properties file.");
	}

	public static String getDriverPath_Edge() {
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if (DriverPath_Edge != null)
			return DriverPath_Edge;
		else
			throw new RuntimeException("DriverPath_Edge not specified in the Configuration.properties file.");
	}

	public static String getEnvironment() {
		String Environment = properties.getProperty("Environment");
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

	public static String getBrowserCompatipility() {
		String BrowserCompatipility = properties.getProperty("BrowserCompatipility");
		if (BrowserCompatipility != null)
			return BrowserCompatipility;
		else
			throw new RuntimeException("BrowserCompatipility not specified in the Configuration.properties file.");
	}

	public static void get_Page_Title() throws InterruptedException {

		String pageTitle = DriverFactory.driver.getTitle();
		System.err.println("Page Title: " + pageTitle);
	}

	public static void get_Header_Title() throws InterruptedException {

		String headerTitle = PartnerPortal_Menu.Parnter_Registration_Header_Title.getText();
		System.err.println("Header : " + headerTitle);
	}

	public static String getLanding_Page() {
		String Landing_Page = properties.getProperty("Landing_Page");
		if (Landing_Page != null)
			return Landing_Page;
		else
			throw new RuntimeException("Landing_Page not specified in the Configuration.properties file.");
	}

	public static String getUsername() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}
	public static String getGrievanceUsername() {
		String Username = properties.getProperty("GrievanceUsername");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

	public static String getPassword() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

	public static long getImplicitWaitTime() {
		String ImplicitWaitTime = properties.getProperty("ImplicitWaitTime");
		if (ImplicitWaitTime != null)
			return Long.parseLong(ImplicitWaitTime);
		else
			throw new RuntimeException("ImplicitWaitTime not specified in the Configuration.properties file.");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public static String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static String getScreenshotPath_Pass() {
		String ScreenshotPath_Pass = properties.getProperty("ScreenshotPath_Pass");
		if (ScreenshotPath_Pass != null)
			return ScreenshotPath_Pass;
		else
			throw new RuntimeException("ScreenshotPath_Pass not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Fail() {
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if (ScreenshotPath_Fail != null)
			return ScreenshotPath_Fail;
		else
			throw new RuntimeException("ScreenshotPath_Fail not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Scenario() {
		String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
		if (ScreenshotPath_Scenario != null)
			return ScreenshotPath_Scenario;
		else
			throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");
	}

	public static String getReportPath() {
		String ReportPath = properties.getProperty("ReportPath");
		if (ReportPath != null)
			return ReportPath;
		else
			throw new RuntimeException("ReportPath not specified in the Configuration.properties file.");
	}

	public static String getDB_Url() {
		String DB_Url = properties.getProperty("DB_Url");
		if (DB_Url != null)
			return DB_Url;
		else
			throw new RuntimeException("DB_Url not specified in the Configuration.properties file.");
	}

	public static String getDB_User() {
		String DB_User = properties.getProperty("DB_User");
		if (DB_User != null)
			return DB_User;
		else
			throw new RuntimeException("DB_User not specified in the Configuration.properties file.");
	}

	public static String getDB_Pwd() {
		String DB_Pwd = properties.getProperty("DB_Pwd");
		if (DB_Pwd != null)
			return DB_Pwd;
		else
			throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");
	}

	public static String getDB_Loading_Class() {
		String DB_Loading_Class = properties.getProperty("DB_Loading_Class");
		if (DB_Loading_Class != null)
			return DB_Loading_Class;
		else
			throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");
	}

	public static String getEnableHeadless() {
		String EnableHeadless = properties.getProperty("EnableHeadless");
		if (EnableHeadless != null)
			return EnableHeadless;
		else
			throw new RuntimeException("EnableHeadless not specified in the Configuration.properties file.");
	}

	public static String getPartner_password() {
		String Partner_password = properties.getProperty("Partner_password");
		if (Partner_password != null)
			return Partner_password;
		else
			throw new RuntimeException("Partner_password not specified in the Configuration.properties file.");
	}

	public static String getPartner_username() {
		String Partner_username = properties.getProperty("Partner_username");
		if (Partner_username != null)
			return Partner_username;
		else
			throw new RuntimeException("Partner_username not specified in the Configuration.properties file.");
	}

	public static String getEmployee_username() {
		String Employee_username = properties.getProperty("Employee_username");
		if (Employee_username != null)
			return Employee_username;
		else
			throw new RuntimeException("Employee_username not specified in the Configuration.properties file.");
	}

	public static String getEmployee_password() {
		String Employee_password = properties.getProperty("Employee_password");
		if (Employee_password != null)
			return Employee_password;
		else
			throw new RuntimeException("Employee_password not specified in the Configuration.properties file.");
	}

	public static String getLogin_Landing() {
		String Login_Landing = properties.getProperty("Login_Landing");
		if (Login_Landing != null)
			return Login_Landing;
		else
			throw new RuntimeException("Login_Landing not specified in the Configuration.properties file.");
	}

	public static String getEIP_User_username() {
		String EIP_User_username = properties.getProperty("EIP_User_username");
		if (EIP_User_username != null)
			return EIP_User_username;
		else
			throw new RuntimeException("EIP_User_username not specified in the Configuration.properties file.");
	}

	public static String getEIP_User_password() {
		String EIP_User_password = properties.getProperty("EIP_User_password");
		if (EIP_User_password != null)
			return EIP_User_password;
		else
			throw new RuntimeException("EIP_User_password not specified in the Configuration.properties file.");
	}

	// Date : 29-09-2023

	// ***********************************************************************************************************************//

	public static String getGSTUpdateUsername() {
		String GSTUpdate_Username = properties.getProperty("GSTUpdate_Username");
		if (GSTUpdate_Username != null)
			return GSTUpdate_Username;
		else
			throw new RuntimeException("GST Update Username not specified in the Configuration.properties file.");
	}

	public static String getPP_UserName() {
		String PP_UserName = properties.getProperty("PP_UserName");
		if (PP_UserName != null)
			return PP_UserName;
		else
			throw new RuntimeException("PP UserName not specified in the Configuration.properties file.");
	}

	public static String getUS_UserName() {
		String US_UserName = properties.getProperty("US_UserName");
		if (US_UserName != null)
			return US_UserName;
		else
			throw new RuntimeException("US_UserName not specified in the Configuration.properties file.");
	}
	public static String getAdmin_UserName() {
		String Admin_UserName = properties.getProperty("AdminLogin_username");
		if (Admin_UserName != null)
			return Admin_UserName;
		else
			throw new RuntimeException("Admin_UserName not specified in the Configuration.properties file.");
	}
	public static String getCHeck_GST() {
		String CHeck_GST = properties.getProperty("CHeck_GST");
		if (CHeck_GST != null)
			return CHeck_GST;
		else
			throw new RuntimeException("CHeck_GST not specified in the Configuration.properties file.");
	}

	public static String getCheck_NormalUser() {
		String Check_NormalUser = properties.getProperty("Check_NormalUser");
		if (Check_NormalUser != null)
			return Check_NormalUser;
		else
			throw new RuntimeException("Check_NormalUser not specified in the Configuration.properties file.");
	}

	public static String getCheck_US_Partner() {
		String Check_US_Partner = properties.getProperty("Check_US_Partner");
		if (Check_US_Partner != null)
			return Check_US_Partner;
		else
			throw new RuntimeException("Check_US_Partner not specified in the Configuration.properties file.");
	}

	public static String getEIPQAPassword() {
		String EIPQA_Password = properties.getProperty("EIPQA_Password");
		if (EIPQA_Password != null)
			return EIPQA_Password;
		else
			throw new RuntimeException("EIP4QA Password not specified in the Configuration.properties file.");
	}

	// Partner Workbench menu in EIP Portal
	public static String partnerworkbench_Menu() {
		String partner_menu = properties.getProperty("MenuName");
		if (partner_menu != null)
			return partner_menu;
		else
			throw new RuntimeException("Menu is not able to click");
	}

	/* Empanelment START */
	public static String partnerSearchInEmpanelment() {
		String Search_Partner = properties.getProperty("Search_Partner");
		if (Search_Partner != null)
			return Search_Partner;
		else
			throw new RuntimeException("Partner is not available");
	}

	// Greievance Creation Start
	public static String grievanceCreation_Jobcode() {
		String griecreation_jobcode = properties.getProperty("griecreation_jobcode");
		if (griecreation_jobcode != null)
			return griecreation_jobcode;
		else
			throw new RuntimeException("Grievance Creation Jobcode is not available");
	}

	public static String grievanceCreation_PO() {
		String griecreation_PO = properties.getProperty("griecreation_PO");
		if (griecreation_PO != null)
			return griecreation_PO;
		else
			throw new RuntimeException("Grievance Creation PO is not available");
	}

	public static String grievanceCreation_ReferenceDocumentnumber() {
		String ReferenceDocumentnumber = properties.getProperty("ReferenceDocumentnumber");
		if (ReferenceDocumentnumber != null)
			return ReferenceDocumentnumber;
		else
			throw new RuntimeException("Grievance Creation Reference Document number is not available");
	}

	public static String grievanceCreation_EmployeeName() {
		String EmployeeName = properties.getProperty("EmployeeName");
		if (EmployeeName != null)
			return EmployeeName;
		else
			throw new RuntimeException("Grievance Creation Employee Name is not available");
	}

	// Greievance Creation End

	// Grievance Description in Creation
	public static String grievance_description() {
		String grie_description = properties.getProperty("grie_description");
		if (grie_description != null)
			return grie_description;
		else
			throw new RuntimeException("Description is not available");
	}

	// Grievance Description in Creation
	public static String grie_description_draft() {
		String grie_desc_draft = properties.getProperty("grie_desc_draft");
		if (grie_desc_draft != null)
			return grie_desc_draft;
		else
			throw new RuntimeException("Description for grievance draft is not available");
	}

	// Grievance Description in Creation
	public static String grie_nameofattachment_draft() {
		String grie_nameofattachment_draft = properties.getProperty("grie_nameofattachment_draft");
		if (grie_nameofattachment_draft != null)
			return grie_nameofattachment_draft;
		else
			throw new RuntimeException("Name of attachment for grievance draft is not available");
	}

	// Grievance Description in Creation
	public static String grie_referencedocno_draft() {
		String grie_referencedocno_draft = properties.getProperty("grie_referencedocno_draft");
		if (grie_referencedocno_draft != null)
			return grie_referencedocno_draft;
		else
			throw new RuntimeException("Reference documnet number is not available");
	}

	// Grievance Description in Creation
	public static String grie_siteperson_draft() {
		String grie_siteperson_draft = properties.getProperty("grie_siteperson_draft");
		if (grie_siteperson_draft != null)
			return grie_siteperson_draft;
		else
			throw new RuntimeException("Description is not available");
	}

	// Grievance Attachment Name
	public static String grievance_Nameofattachment() {
		String grie_nameofattachment = properties.getProperty("grie_attachmentname");
		if (grie_nameofattachment != null)
			return grie_nameofattachment;
		else
			throw new RuntimeException("Name of the Attachment is not avsilable");
	}

	// Remarks for SendBack Grievance Request
	public static String forward_user() {
		String forward_user = properties.getProperty("Forward_User");
		if (forward_user != null)
			return forward_user;
		else
			throw new RuntimeException("Forward user is not available");
	}

	// Remarks for Approve Grievance Request
	public static String approve_grievance_request() {
		String approve_grievance = properties.getProperty("Grievance_approve_remarks");
		if (approve_grievance != null)
			return approve_grievance;
		else
			throw new RuntimeException("Approver Remarks for Grievance request is not given");
	}

	// Remarks for SendBack Grievance Request
	public static String sendback_grievance_request() {
		String sendback_grievance = properties.getProperty("Grievance_sendback_remarks");
		if (sendback_grievance != null)
			return sendback_grievance;
		else
			throw new RuntimeException("Send Back Remarks for Grievance request is not given");
	}

	// Remarks for SendBack Grievance Request
	public static String forward_grievance_request() {
		String forward_grievance = properties.getProperty("Grievance_forward_remarks");
		if (forward_grievance != null)
			return forward_grievance;
		else
			throw new RuntimeException("Forward Remarks for Grievance request is not given");
	}

	// Testimonial Comments
	public static String testimonial_remarks() {
		String testimonial_comments = properties.getProperty("Testimonial_Comments");
		if (testimonial_comments != null)
			return testimonial_comments;
		else
			throw new RuntimeException("Comments for Testimonial is not given");
	}

	// ***********************************************************************************************************************//

	public static String eipQA_Environment() {
		String EIPQA_Url = properties.getProperty("EIPQA_Env");
		if (EIPQA_Url != null)
			return EIPQA_Url;
		else
			throw new RuntimeException("EIPQA Url is not given");
	}

	public static String pmQAHome_Environment() {
		String PMQAHome_Url = properties.getProperty("EIPQA_ENV_HOME");
		if (PMQAHome_Url != null)
			return PMQAHome_Url;
		else
			throw new RuntimeException("PMQA Home Url is not given");
	}

	// Partner Performance Request Start
	public static String getEvaluationReq_UN() {
		String EvaluationReq_username = properties.getProperty("EvaluationReq_username");
		if (EvaluationReq_username != null)
			return EvaluationReq_username;
		else
			throw new RuntimeException("Evaluation Requestor Username is not given");
	}

	public static String getEvaluationReq_Pwd() {
		String EvaluationReq_password = properties.getProperty("EIPQAEvaluationReq_pwd");
		if (EvaluationReq_password != null)
			return EvaluationReq_password;
		else
			throw new RuntimeException("Evaluation Requestor Password is not given");
	}

	public static String partnerPerformanceRequest() {
		String PartnerPerformanceReq_menu = properties.getProperty("PartnerRequest");
		if (PartnerPerformanceReq_menu != null)
			return PartnerPerformanceReq_menu;
		else
			throw new RuntimeException("Partner Performance Request Menu is not given");
	}

	public static String getEvaluationReq_Jobcode() {
		String EvaluationReq_jobcode = properties.getProperty("EvaluationReq_Jobcode");
		if (EvaluationReq_jobcode != null)
			return EvaluationReq_jobcode;
		else
			throw new RuntimeException("Evaluation Requestor Jobcode is not given");
	}

	public static String getEvaluationReq_Date() {
		String EvaluationReq_Date = properties.getProperty("EvaluationReq_Date");
		if (EvaluationReq_Date != null)
			return EvaluationReq_Date;
		else
			throw new RuntimeException("Evaluation Requestor Date is not given");
	}

	// Partner Performance Request End

	// Partner Evaluation Request Start
	public static String getEvaluator_uname() {
		String Evaluator_uname = properties.getProperty("EvaluationApprover_username");
		if (Evaluator_uname != null)
			return Evaluator_uname;
		else
			throw new RuntimeException("Evaluator Username is not given");
	}

	public static String partnerPerformanceEvaluation() {
		String PartnerPerformanceEvaluation_menu = properties.getProperty("PartnerEvaluation");
		if (PartnerPerformanceEvaluation_menu != null)
			return PartnerPerformanceEvaluation_menu;
		else
			throw new RuntimeException("Partner Performance Evaluation Menu is not given");
	}
	public static String getEvaluator_JobCode() {
		String EvaluationJobcode = properties.getProperty("EvaluationJobcode");
		if (EvaluationJobcode != null)
			return EvaluationJobcode;
		else
			throw new RuntimeException("Evaluation Jobcode is not given");
	}

	public static String getEvaluator_Date() {
		String Evaluation_Date = properties.getProperty("Evaluator_Date");
		if (Evaluation_Date != null)
			return Evaluation_Date;
		else
			throw new RuntimeException("Evaluation Date is not given");
	}

	public static String evaluation_remarks() {
		String evaluation_comments = properties.getProperty("Evaluation_remarks");
		if (evaluation_comments != null)
			return evaluation_comments;
		else
			throw new RuntimeException("Comments for Evaluation is not given");
	}

	public static String getEmpanelmentUsername() {
		String Empanement_Username = properties.getProperty("Empanelment_Username");
		if (Empanement_Username != null)
			return Empanement_Username;
		else
			throw new RuntimeException("Empanement Username not specified in the Configuration.properties file.");
	}

	// Partner Evaluation Request End

	// Partner GST Details START

	public static String getGSTNumberApprove() {
		String GST_number_Approve = properties.getProperty("GST_number_Approve");
		if (GST_number_Approve != null)
			return GST_number_Approve;
		else
			throw new RuntimeException("GST number not specified in the Configuration.properties file.");
	}
	public static String getGSTNumberReject() {
		String GST_number_Reject = properties.getProperty("GST_number_Reject");
		if (GST_number_Reject != null)
			return GST_number_Reject;
		else
			throw new RuntimeException("GST number not specified in the Configuration.properties file.");
	}
	public static String getGSTNumberSendback() {
		String GST_number_Sendback = properties.getProperty("GST_number_Sendback");
		if (GST_number_Sendback != null)
			return GST_number_Sendback;
		else
			throw new RuntimeException("GST number not specified in the Configuration.properties file.");
	}

	// ***********************************************************************************************************************//

	// ***********************************************************************************************************************//

	// ***********************************************************************************************************************//

	// DB_Query
	public static String getSQL_Query1_Table() {
		String SQL_Query1_Table = properties.getProperty("SQL_Query1_Table");
		if (SQL_Query1_Table != null)
			return SQL_Query1_Table;
		else
			throw new RuntimeException("SQL_Query1_Table not specified in the Configuration.properties file.");
	}

	public static String getSQL_Query1_Column() {
		String SQL_Query1_Column = properties.getProperty("SQL_Query1_Column");
		if (SQL_Query1_Column != null)
			return SQL_Query1_Column;
		else
			throw new RuntimeException("SQL_Query1_Column not specified in the Configuration.properties file.");
	}

	// ***********************************************************************************************************************//

	// Login Test-Data
	public static String getApprover_username() {
		String Approver_username = properties.getProperty("Approver_username");
		if (Approver_username != null)
			return Approver_username;
		else
			throw new RuntimeException("Approver_username not specified in the Configuration.properties file.");
	}

	public static String getApprover_password() {
		String Approver_password = properties.getProperty("Approver_password");
		if (Approver_password != null)
			return Approver_password;
		else
			throw new RuntimeException("Approver_password not specified in the Configuration.properties file.");
	}

	public static String getCreator_username() {
		String Creator_username = properties.getProperty("Creator_username");
		if (Creator_username != null)
			return Creator_username;
		else
			throw new RuntimeException("Creator_username not specified in the Configuration.properties file.");
	}

	public static String getCreator_password() {
		String Creator_password = properties.getProperty("Creator_password");
		if (Creator_password != null)
			return Creator_password;
		else
			throw new RuntimeException("Creator_password not specified in the Configuration.properties file.");
	}

	public static String getConfiguration_username() {
		String Configuration_username = properties.getProperty("Configuration_username");
		if (Configuration_username != null)
			return Configuration_username;
		else
			throw new RuntimeException("Configuration_username not specified in the Configuration.properties file.");
	}

	public static String getConfiguration_password() {
		String Configuration_password = properties.getProperty("Configuration_password");
		if (Configuration_password != null)
			return Configuration_password;
		else
			throw new RuntimeException("Configuration_password not specified in the Configuration.properties file.");
	}

	public static String getskip_session() {
		String skip_session = properties.getProperty("skip_session");
		if (skip_session != null)
			return skip_session;
		else
			throw new RuntimeException("skip_session not specified in the Configuration.properties file.");
	}
	/* Partner Registration Starts here */
	public static String getRegCountry() {
		String Reg_Country = properties.getProperty("Reg_Country");
		if (Reg_Country != null)
			return Reg_Country;
		else
			throw new RuntimeException("Country not specified in the Configuration.properties file.");
	}
	public static String getRegNationality() {
		String Reg_Nationality = properties.getProperty("Reg_Nationality");
		if (Reg_Nationality != null)
			return Reg_Nationality;
		else
			throw new RuntimeException("Nationality not specified in the Configuration.properties file.");
	}
	public static String getRegWebsite() {
		String Registration_Email = properties.getProperty("Reg_Website");
		if (Registration_Email != null)
			return Registration_Email;
		else
			throw new RuntimeException("Website not specified in the Configuration.properties file.");
	}
	public static String getRegEmailOTPFPath() {
		String Reg_Email_OTP_Fpath = properties.getProperty("Reg_Email_OTP_Fpath");
		if (Reg_Email_OTP_Fpath != null)
			return Reg_Email_OTP_Fpath;
		else
			throw new RuntimeException("Email No not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerFor() {
		String Reg_PartnerFor = properties.getProperty("Reg_PartnerFor");
		if (Reg_PartnerFor != null)
			return Reg_PartnerFor;
		else
			throw new RuntimeException("Partner For No not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerPriBus() {
		String Reg_PartnerPriBus = properties.getProperty("Reg_PartnerPriBus");
		if (Reg_PartnerPriBus != null)
			return Reg_PartnerPriBus;
		else
			throw new RuntimeException("Primary Business not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerPriBusType() {
		String Reg_PartnerPriBusType = properties.getProperty("Reg_PartnerPriBusType");
		if (Reg_PartnerPriBusType != null)
			return Reg_PartnerPriBusType;
		else
			throw new RuntimeException("Business Type not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerPriBusCat() {
		String Reg_PartnerPriBusType = properties.getProperty("Reg_PartnerPriBusType");
		if (Reg_PartnerPriBusType != null)
			return Reg_PartnerPriBusType;
		else
			throw new RuntimeException("Business Type not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerPriBusSubCat() {
		String Reg_PartnerPriBusType = properties.getProperty("Reg_PartnerPriBusType");
		if (Reg_PartnerPriBusType != null)
			return Reg_PartnerPriBusType;
		else
			throw new RuntimeException("Business Type not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerKeyMat() {
		String Reg_PartnerKeyMat = properties.getProperty("Reg_PartnerKeyMat");
		if (Reg_PartnerKeyMat != null)
			return Reg_PartnerKeyMat;
		else
			throw new RuntimeException("Key Material not specified in the Configuration.properties file.");
	}
	public static String getRegSecBusiness() {
		String Reg_PartnerSecBus = properties.getProperty("Reg_PartnerSecBus");
		if (Reg_PartnerSecBus != null)
			return Reg_PartnerSecBus;
		else
			throw new RuntimeException("Secondary Business not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerSecBusType() {
		String Reg_PartnerBusType = properties.getProperty("Reg_PartnerBusType");
		if (Reg_PartnerBusType != null)
			return Reg_PartnerBusType;
		else
			throw new RuntimeException("Secondary Business Type not specified in the Configuration.properties file.");
	}

	public static String getRegPartnerPassword() {
		String Reg_PartnerPassword = properties.getProperty("Reg_PartnerPassword");
		if (Reg_PartnerPassword != null)
			return Reg_PartnerPassword;
		else
			throw new RuntimeException("Password not specified in the Configuration.properties file.");
	}
	public static String getRegPartnerTermsandConditions() {
		String Reg_PartnerRenenterPassword = properties.getProperty("Reg_PartnerRenenterPassword");
		if (Reg_PartnerRenenterPassword != null)
			return Reg_PartnerRenenterPassword;
		else
			throw new RuntimeException("Reenter Password not specified in the Configuration.properties file.");
	}
	/*Partner Registration Ends here */
	/* Partner OnBoarding Starts Here */
	public static String getWareHouseName() {
		String WareHouse_Name = properties.getProperty("Reg_Test")+RandomString.make(5);
		if (WareHouse_Name != null)
			return WareHouse_Name;
		else
			throw new RuntimeException("WareHouse Name not specified in the Configuration.properties file.");
	}
	public static String getWareHouseStock() {
		String WareHouse_Stock = properties.getProperty("WareHouse_Stock");
		if (WareHouse_Stock != null)
			return WareHouse_Stock;
		else
			throw new RuntimeException("WareHouse Stock not specified in the Configuration.properties file.");
	}
	public static String getWareHouseTotalAre() {
		String WareHouse_TotalAre = properties.getProperty("WareHouse_TotalAre");
		if (WareHouse_TotalAre != null)
			return WareHouse_TotalAre;
		else
			throw new RuntimeException("WareHouse Total Area not specified in the Configuration.properties file.");
	}
	public static String getWareHouseAddress() {
		String WareHouse_Address = properties.getProperty("WareHouse_Address");
		if (WareHouse_Address != null)
			return WareHouse_Address;
		else
			throw new RuntimeException("WareHouse Address not specified in the Configuration.properties file.");
	}
	public static String getWareHouseCountry() {
		String WareHouse_Country = properties.getProperty("WareHouse_Country");
		if (WareHouse_Country != null)
			return WareHouse_Country;
		else
			throw new RuntimeException("WareHouse Country not specified in the Configuration.properties file.");
	}
	public static String getWareHouseState() {
		String WareHouse_State = properties.getProperty("WareHouse_State");
		if (WareHouse_State != null)
			return WareHouse_State;
		else
			throw new RuntimeException("WareHouse State not specified in the Configuration.properties file.");
	}
	public static String getWareHouseDistrict() {
		String WareHouse_District = properties.getProperty("WareHouse_District");
		if (WareHouse_District != null)
			return WareHouse_District;
		else
			throw new RuntimeException("WareHouse District not specified in the Configuration.properties file.");
	}
	public static String getWareHouseZipcode() {
		String WareHouse_Pincode = properties.getProperty("WareHouse_Pincode");
		if (WareHouse_Pincode != null)
			return WareHouse_Pincode;
		else
			throw new RuntimeException("WareHouse Zipcode not specified in the Configuration.properties file.");
	}
	public static String getPrimarCategory() {
		String Primary_Category = properties.getProperty("Primary_Category");
		if (Primary_Category != null)
			return Primary_Category;
		else
			throw new RuntimeException("Account Category not specified in the Configuration.properties file.");
	}
	public static String getSecondaryCategory() {
		String Secondary_Category = properties.getProperty("Secondary_Category");
		if (Secondary_Category != null)
			return Secondary_Category;
		else
			throw new RuntimeException("Account Category not specified in the Configuration.properties file.");
	}
	public static String getPaymentMode() {
		String Payment_Mode = properties.getProperty("Payment_Mode");
		if (Payment_Mode != null)
			return Payment_Mode;
		else
			throw new RuntimeException("Payment Mode not specified in the Configuration.properties file.");
	}
	public static String getPaymentInfavourof() {
		String Bank_Paymentinfavourof = properties.getProperty("Bank_Paymentinfavourof");
		if (Bank_Paymentinfavourof != null)
			return Bank_Paymentinfavourof;
		else
			throw new RuntimeException("Payment in favour of not specified in the Configuration.properties file.");
	}
	public static String getAccountType() {
		String Account_Type = properties.getProperty("Account_Type");
		if (Account_Type != null)
			return Account_Type;
		else
			throw new RuntimeException("Account Type not specified in the Configuration.properties file.");
	}
	public static String getBankName() {
		String Bank_Name = properties.getProperty("Bank_Name");
		if (Bank_Name != null)
			return Bank_Name;
		else
			throw new RuntimeException("Bank Name not specified in the Configuration.properties file.");
	}
	public static String getRatingAgency() {
		String Rating_Agency = properties.getProperty("Rating_Agency");
		if (Rating_Agency != null)
			return Rating_Agency;
		else
			throw new RuntimeException("Bank Name not specified in the Configuration.properties file.");
	}
	public static String getSecondaryBankName() {
		String Secondary_Bank = properties.getProperty("Secondary_Bank");
		if (Secondary_Bank != null)
			return Secondary_Bank;
		else
			throw new RuntimeException("Bank Name not specified in the Configuration.properties file.");
	}
	public static String getIFSCCode() {
		String Bank_IFSC_Code = properties.getProperty("Bank_IFSC_Code");
		if (Bank_IFSC_Code != null)
			return Bank_IFSC_Code;
		else
			throw new RuntimeException("IFSC Code not specified in the Configuration.properties file.");
	}
	public static String getAccountNumber() {
		String Account_Number = properties.getProperty("Account_Number");
		if (Account_Number != null)
			return Account_Number;
		else
			throw new RuntimeException("Account Number not specified in the Configuration.properties file.");
	}
	public static String getPaymentConfirmationMailid() {
		String Payment_Confirmation_Mailid = properties.getProperty("Payment_Confirmation_Mailid");
		if (Payment_Confirmation_Mailid != null)
			return Payment_Confirmation_Mailid;
		else
			throw new RuntimeException("Payment Confirmation Mail id not specified in the Configuration.properties file.");
	}
	public static String getCrdCustomerName() {
		String Customer_Name = properties.getProperty("Customer_Name");
		if (Customer_Name != null)
			return Customer_Name;
		else
			throw new RuntimeException("Customer Name not specified in the Configuration.properties file.");
	}
	public static String getYearsinPartnerShip() {
		String Years_in_PartnerShip = properties.getProperty("Years_in_PartnerShip");
		if (Years_in_PartnerShip != null)
			return Years_in_PartnerShip;
		else
			throw new RuntimeException("Years in Partnership not specified in the Configuration.properties file.");
	}
	public static String getCrdRevenueINRLakhs() {
		String Revenue_INR_lakhs = properties.getProperty("Revenue_INR_lakhs");
		if (Revenue_INR_lakhs != null)
			return Revenue_INR_lakhs;
		else
			throw new RuntimeException("Revenue INR Lakhs not specified in the Configuration.properties file.");
	}
	public static String getCrdReferenceRemarks() {
		String Reference_Remarsk = properties.getProperty("Reference_Remarsk");
		if (Reference_Remarsk != null)
			return Reference_Remarsk;
		else
			throw new RuntimeException("Reference Remarks id not specified in the Configuration.properties file.");
	}
	public static String getBusinessType_BV() {
		String Business_Type_BV = properties.getProperty("Business_Type_BV");
		if (Business_Type_BV != null)
			return Business_Type_BV;
		else
			throw new RuntimeException("Reference Remarks id not specified in the Configuration.properties file.");
	}
	public static String getBusinessVerticals() {
		String Business_Verticals = properties.getProperty("Business_Verticals");
		if (Business_Verticals != null)
			return Business_Verticals;
		else
			throw new RuntimeException("Reference Remarks id not specified in the Configuration.properties file.");
	}
	public static String getBusinessRegion() {
		String Reference_Remarsk = properties.getProperty("Reference_Remarsk");
		if (Reference_Remarsk != null)
			return Reference_Remarsk;
		else
			throw new RuntimeException("Reference Remarks id not specified in the Configuration.properties file.");
	}
	public static String getPrimaryBusiness_BV() {
		String Primary_Business_BV = properties.getProperty("Primary_Business_BV");
		if (Primary_Business_BV != null)
			return Primary_Business_BV;
		else
			throw new RuntimeException("Reference Remarks id not specified in the Configuration.properties file.");
	}
	public static String getKnow_Partner_Portal() {
		String Know_Partner_Portal = properties.getProperty("Know_Partner_Portal");
		if (Know_Partner_Portal != null)
			return Know_Partner_Portal;
		else
			throw new RuntimeException("Know Partner Portal not specified in the Configuration.properties file.");
	}
	public static String getPA_OD_Details() {
		String PA_OD_Details = properties.getProperty("PA_OD_Details");
		if (PA_OD_Details != null)
			return PA_OD_Details;
		else
			throw new RuntimeException("OD Details not specified in the Configuration.properties file.");
	}
	public static String getPA_Partner_Code() {
		String PA_Partner_Code = properties.getProperty("PA_Partner_Code");
		if (PA_Partner_Code != null)
			return PA_Partner_Code;
		else
			throw new RuntimeException("Partner Code not specified in the Configuration.properties file.");
	}
	public static String getPA_Reason_Not_Active() {
		String PA_Reason_Not_Active = properties.getProperty("PA_Reason_Not_Active");
		if (PA_Reason_Not_Active != null)
			return PA_Reason_Not_Active;
		else
			throw new RuntimeException("Reason for not Active not specified in the Configuration.properties file.");
	}
	public static String getPA_ContactName() {
		String PA_Contact_Name = properties.getProperty("PA_Contact_Name");
		if (PA_Contact_Name != null)
			return PA_Contact_Name;
		else
			throw new RuntimeException("Name not specified in the Configuration.properties file.");
	}
	public static String getPA_ContactDesignation() {
		String PA_Contact_Designation = properties.getProperty("PA_Contact_Designation");
		if (PA_Contact_Designation != null)
			return PA_Contact_Designation;
		else
			throw new RuntimeException("Designation not specified in the Configuration.properties file.");
	}
	public static String getPA_ContactEmail() {
		String PA_Contact_Email = properties.getProperty("PA_Contact_Email");
		if (PA_Contact_Email != null)
			return PA_Contact_Email;
		else
			throw new RuntimeException("Email not specified in the Configuration.properties file.");
	}
	public static String getPA_ContactMobileNo() {
		String PA_Contact_MobileNo = properties.getProperty("PA_Contact_MobileNo");
		if (PA_Contact_MobileNo != null)
			return PA_Contact_MobileNo;
		else
			throw new RuntimeException("Mobile No not specified in the Configuration.properties file.");
	}
	public static String getReference_Pname() {
		String Reference_PName = properties.getProperty("Reference_PName");
		if (Reference_PName != null)
			return Reference_PName;
		else
			throw new RuntimeException("Name not specified in the Configuration.properties file.");
	}
	public static String getReference_PCompanyName() {
		String Reference_PCompanyName = properties.getProperty("Reference_PCompanyName");
		if (Reference_PCompanyName != null)
			return Reference_PCompanyName;
		else
			throw new RuntimeException("Company Name not specified in the Configuration.properties file.");
	}
	public static String getReference_PDesignation() {
		String Reference_PDesignation = properties.getProperty("Reference_PDesignation");
		if (Reference_PDesignation != null)
			return Reference_PDesignation;
		else
			throw new RuntimeException("Designation not specified in the Configuration.properties file.");
	}
	public static String getReference_PEmail() {
		String Reference_PEmail = properties.getProperty("Reference_PEmail");
		if (Reference_PEmail != null)
			return Reference_PEmail;
		else
			throw new RuntimeException("Eamil not specified in the Configuration.properties file.");
	}
	public static String getReference_PMobileNo() {
		String Reference_PMobileNo = properties.getProperty("Reference_PMobileNo");
		if (Reference_PMobileNo != null)
			return Reference_PMobileNo;
		else
			throw new RuntimeException("Mobile No not specified in the Configuration.properties file.");
	}
	public static String getAss_Select_RelationShip() {
		String Ass_RelationShip = properties.getProperty("Ass_RelationShip");
		if (Ass_RelationShip != null)
			return Ass_RelationShip;
		else
			throw new RuntimeException("RelationShip not specified in the Configuration.properties file.");
	}
	public static String getAss_Employee_Name() {
		String Employee_Name_ASS = properties.getProperty("Employee_Name_ASS");
		if (Employee_Name_ASS != null)
			return Employee_Name_ASS;
		else
			throw new RuntimeException("Mobile No not specified in the Configuration.properties file.");
	}
	public static String getBranch_Name() {
		String Branch_Name = properties.getProperty("Branch_Name");
		if (Branch_Name != null)
			return Branch_Name;
		else
			throw new RuntimeException("Name not specified in the Configuration.properties file.");
	}
	public static String getBranch_Street_Address() {
		String Branch_Street_Address = properties.getProperty("Branch_Street_Address");
		if (Branch_Street_Address != null)
			return Branch_Street_Address;
		else
			throw new RuntimeException("Street Address not specified in the Configuration.properties file.");
	}
	public static String getBranch_State() {
		String Branch_State = properties.getProperty("Branch_State");
		if (Branch_State != null)
			return Branch_State;
		else
			throw new RuntimeException("State not specified in the Configuration.properties file.");
	}
	public static String getBranch_District() {
		String Branch_District = properties.getProperty("Branch_District");
		if (Branch_District != null)
			return Branch_District;
		else
			throw new RuntimeException("District not specified in the Configuration.properties file.");
	}
	public static String getBranch_Zipcode() {
		String Branch_Zipcode = properties.getProperty("Branch_Zipcode");
		if (Branch_Zipcode != null)
			return Branch_Zipcode;
		else
			throw new RuntimeException("Mobile No not specified in the Configuration.properties file.");
	}
	public static String getBranch_CoordName() {
		String Branch_CoordName = properties.getProperty("Branch_CoordName");
		if (Branch_CoordName != null)
			return Branch_CoordName;
		else
			throw new RuntimeException("Coordination Name not specified in the Configuration.properties file.");
	}
	public static String getBranch_Designation() {
		String Branch_Designation = properties.getProperty("Branch_Designation");
		if (Branch_Designation != null)
			return Branch_Designation;
		else
			throw new RuntimeException("Designation not specified in the Configuration.properties file.");
	}
	public static String getBranch_Email() {
		String Branch_Email = properties.getProperty("Branch_Email");
		if (Branch_Email != null)
			return Branch_Email;
		else
			throw new RuntimeException("Email not specified in the Configuration.properties file.");
	}
	public static String getBranch_MobileNo() {
		String Branch_MobileNo = properties.getProperty("Branch_MobileNo");
		if (Branch_MobileNo != null)
			return Branch_MobileNo;
		else
			throw new RuntimeException("Mobile No not specified in the Configuration.properties file.");
	}
	public static String getAss_Employee_PSNo() {
		String Employee_PSNo = properties.getProperty("Employee_PSNo");
		if (Employee_PSNo != null)
			return Employee_PSNo;
		else
			throw new RuntimeException("PSNo not specified in the Configuration.properties file.");
	}
	public static String randomString(int length) {
		String randomString = "Automation "+RandomStringUtils.randomAlphabetic(length);
		return randomString;
		
	}
	public static String RandomPANNO() {
		String PAN_No = RandomStringUtils.randomAlphabetic(3)+"P"+RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomNumeric(4)+RandomStringUtils.randomAlphabetic(1);
		return PAN_No;	
	}
	public static String RandomInvalidPANNO() {
		String PAN_No = RandomStringUtils.randomAlphabetic(3)+"D"+RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomNumeric(4)+RandomStringUtils.randomAlphabetic(1);
		return PAN_No;	
	}
	public static String RandomTANNO() {
		String TAN_No = RandomStringUtils.randomAlphabetic(4)+RandomStringUtils.randomNumeric(5)+RandomStringUtils.randomAlphabetic(1);
		return TAN_No;	
	}
	public static String RandomMSMENO() {
		String MSME_No = "UDYAM-"+RandomStringUtils.randomAlphabetic(2)+"-"+RandomStringUtils.randomNumeric(2)+"-"+RandomStringUtils.randomNumeric(7);
		return MSME_No;	
	}
	public static String RandomCINNO() {
		String MSME_No = "U"+RandomStringUtils.randomNumeric(5)+RandomStringUtils.randomAlphabetic(2)+RandomStringUtils.randomNumeric(4)+RandomStringUtils.randomAlphabetic(3)+RandomStringUtils.randomNumeric(6);
		return MSME_No;	
	}
	public static String RandomEmail() {
		String randomEmail = RandomStringUtils.randomAlphanumeric(5)+"@test.com";
		return randomEmail;	
	}
	public static String RandomNumbers(int length) {
		String randomNumber = RandomStringUtils.randomNumeric(length);
		return randomNumber;
		
	}
	public static String RandomAlphaNumeric(int length) {
		String randomAlphaNumeric = RandomStringUtils.randomAlphanumeric(length);
		return randomAlphaNumeric;
	}
	public static String DropDownRandomSelect(int a,int b) {
		String randomAlphaNumeric = RandomStringUtils.randomNumeric(a, b);
		return null;
		
	}
	/* Partner OnBoarding Ends Here */

}