package dataProviders;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
import object_repository.PartnerPortal_Menu;
import utils.DriverFactory;

public class DataBaseConnection {

	static Statement stmt, stmtPP;
	static Statement stmt2;
	static Statement stmt3;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	public static String finalResult, username, requestNumber, psNumber, partner_id_forDB, grie_DBjobcode, grie_DBreqno,
			grie_DBorderno, grie_DBupdateddate, grie_DBremarks, grie_DBattachment, grie_DBdesc,PAN_no;
	public static String RequestOrderNo, Evaluation_RequestNo, EvaluationOrderNumber, EvaluationHEDocNumber,
			Evaluation_HEDocNumber, approverUsername, Receiver_UserID, EmailOTPVerification, getGSTReceiver_ID,
			getGSTEIPUser_ID, getGSTEIPApprover_Loginname,getGSTDocument_RefNo,User_Login_Name,EIPUserid,receiverUserid,documentNumber,MSTQA_DocumentNumber,GST_Number,partner_Number,partner_Id;
	// static finalResult;

	public DataBaseConnection() {
		PageFactory.initElements(DriverFactory.driver, PartnerPortal_Menu.class);
	}

	public static void dataBaseConnectionPP() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=PPInterface;encrypt=true;trustServerCertificate=true;";
		DB_User = "PPMgmTLogin";
		DB_Pwd = "PPMgmTLogin!!qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmtPP = con.createStatement();
		System.out.println("Connection success");
	}

	public static void dataBaseConnectioneipAwm() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40AWM;encrypt=true;trustServerCertificate=true;";
		DB_User = "AWM4LOGIN";
		DB_Pwd = "AWM4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Connection success");
	}

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

	public static void resultSet() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TVCR_Request_Number FROM PTR.PTR_T_Variation_Claim_Request order by TVCR_Inserted_On desc");
		while (results.next()) {
			requestNumber = results.getString(1);
			System.out.println("Recent Request Number = " + requestNumber);
		}
		ResultSet results1 = stmtPP.executeQuery(
				"SELECT top 1 MEMP_Psno FROM PTR.PTR_T_Document_Workflow INNER JOIN PPinterface.MAS.GEN_M_Users ON (MU_User_Id=TDW_Receiver_User_Id) inner join MAS.GEN_M_Employees on (MEMP_Psno =MU_Login_Name)WHERE TDW_Reference_Id = '"
						+ requestNumber + "'");
		while (results1.next()) {
			psNumber = results1.getString(1);
			System.out.println("Ps Number from PP database = " + psNumber);
		}
	}
	
	public static String getStatusDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'PES%'  AND TDW_Action_Status=4 order by TDW_Inserted_On DESC");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static String getCountryDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'PTD%' order by TDW_Inserted_On DESC");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static String getBusinessCategoryDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'PBC%' order by TDW_Inserted_On DESC");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static String getAddressDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"select top 1 MABQ_Document_Number from ppinterface.PTR.PTR_M_Address_Book_QL order by MABQ_Updated_On desc");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	
	public static String getGSTDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"select top 1 MGSTQ_Document_Number from ppinterface.PTR.PTR_M_GSTIN_QL order by MGSTQ_Inserted_On desc");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	
	public static void deleteGSTNumber() throws Throwable {
		
		ResultSet resultsGST = stmtPP.executeQuery(
				"select COUNT(*) from ppinterface.PTR.PTR_M_GSTIN where MGST_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"'");
		resultsGST.next();
		int count_GST = resultsGST.getInt(1);
		if(count_GST>0) {
			System.out.println("Total Records in GSTIN table = " + count_GST);
			stmtPP.executeUpdate("delete from ppinterface.PTR.PTR_M_GSTIN where MGST_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"'");
		}
		ResultSet resultsGST_QL = stmtPP.executeQuery(
				"select COUNT(*) from ppinterface.PTR.PTR_M_GSTIN_QL where MGSTQ_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"'");
		resultsGST_QL.next();
		int count_GST_QL = resultsGST_QL.getInt(1);
		if(count_GST_QL>0) {
			System.out.println("Total Records in GSTIN_QL table = " + count_GST_QL);
			stmtPP.executeUpdate("delete from ppinterface.PTR.PTR_M_GSTIN_QL where MGSTQ_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"'");
		}	
		System.out.println("delete from ppinterface.PTR.PTR_M_GSTIN_QL where MGSTQ_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"';");
		System.out.println("delete from ppinterface.PTR.PTR_M_GSTIN where MGST_GST_Number = '"+ConfigFileReader.getGSTNumberApprove()+"';");
	}
	public static String getContactDocumentRefNo() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'PQL%' order by TDW_Inserted_On DESC");
		while (results.next()) {
			documentNumber = results.getString(1);
			System.out.println("Recent Request Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static void getReceiverUserID() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 MEMP_Psno FROM PTR.PTR_T_Document_Workflow INNER JOIN PPinterface.MAS.GEN_M_Users ON (MU_User_Id=TDW_Receiver_User_Id) inner join MAS.GEN_M_Employees on (MEMP_Psno =MU_Login_Name)WHERE TDW_Reference_Id = '"+documentNumber+"'");
		while (results.next()) {
			psNumber = results.getString(1);
			System.out.println("Receiver User ID = " + psNumber);
		}
	}
	public static void getUserLoginName() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT MU_Login_Name FROM PTR.PTR_T_Document_Workflow INNER JOIN PPinterface.MAS.GEN_M_Users ON (MU_User_Id=TDW_Receiver_User_Id) inner join MAS.GEN_M_Employees on (MEMP_Psno =MU_Login_Name)WHERE TDW_Reference_Id = '"+documentNumber+"'");
		while (results.next()) {
			psNumber = results.getString(1);
			System.out.println("Receiver User ID = " + psNumber);
		}
	}
	public static void getEvaluationLoginName() throws Throwable {
		ResultSet results = stmtPP.executeQuery(
				"SELECT top 1 TDW_Receiver_User_Id FROM PPMgmt.PPE.PPE_T_Document_Workflow order by TDW_Inserted_On DESC");
		while (results.next()) {
			psNumber = results.getString(1);
			System.out.println("Receiver User ID = " + psNumber);
		}
	}
	public static void loginAction() throws Throwable {
		PartnerPortal_Menu.Otheruser_Tab.click();
		dataBaseConnectionPP();
		getReceiverUserID();
		databaseConnectionClose();	
		dataBaseConnectioneipAwm();
		getUserName();
		databaseConnectionClose();	
		Thread.sleep(2000);
		PartnerPortal_Menu.approverUsername_TB.sendKeys(username);
		PartnerPortal_Menu.approverPassword_TB.sendKeys(ConfigFileReader.getApprover_password());
		PartnerPortal_Menu.approverLogin_Btn.click();
	}
	public static void getPartnerId() throws Throwable{
		ResultSet partnerId = stmtPP.executeQuery(
				"select HOA_Partner_Id from PPInterface.ptr.PTR_H_Onboard_Answer where HOA_Answer_Number ='"+documentNumber+ "' order by MB_Inserted_On desc");
		while (partnerId.next()) {
			partner_Id = partnerId.getString(1);
		}
	}
	public static void getLoginName() throws Throwable{
		ResultSet LoginName = stmtPP.executeQuery(
				"select MU_Login_Name from PPInterface.MAS.GEN_M_Users where MU_Reference_Id='"+partner_Id+ "''");
		while (LoginName.next()) {
			username = LoginName.getString(1);
			System.out.println("Login Name = " + username);
		}
	}
	public static void OnboardingBranch() throws Throwable {
		PartnerPortal_Menu.Otheruser_Tab.click();
		dataBaseConnectionPP();
		getPartnerId();
		getLoginName();
		databaseConnectionClose();	
		PartnerPortal_Menu.approverUsername_TB.sendKeys(username);
		//PartnerPortal_Menu.approverPassword_TB.sendKeys(ConfigFileReader.getApprover_password());
		//PartnerPortal_Menu.approverLogin_Btn.click();
	}
	public static void approverLogin() throws Throwable {
		dataBaseConnectionPP();
		resultSet();
		databaseConnectionClose();
		dataBaseConnectioneipAwm();
		getUserName();
		login();
		databaseConnectionClose();
	}
	public static void approverMyProfileLogin() throws Throwable {
		PartnerPortal_Menu.Otheruser_Tab.click();
		dataBaseConnectionPP();
		getUserLoginName();
		databaseConnectionClose();
		dataBaseConnectioneipAwm();
		getUserName();
		databaseConnectionClose();
		Thread.sleep(2000);
		PartnerPortal_Menu.approverUsername_TB.sendKeys(username);
		//PartnerPortal_Menu.approverPassword_TB.sendKeys(ConfigFileReader.getApprover_password());
		//PartnerPortal_Menu.approverLogin_Btn.click();
	}
	public static void EvaluationApprovalLogin() throws Throwable {
		PartnerPortal_Menu.Otheruser_Tab.click();
		dataBaseConnectionPP();
		getEvaluationLoginName();
		databaseConnectionClose();
		dataBaseConnectioneipAwm();
		getEvaluationUserName();
		databaseConnectionClose();
		Thread.sleep(2000);
		PartnerPortal_Menu.approverUsername_TB.sendKeys(username);
		PartnerPortal_Menu.approverPassword_TB.sendKeys(ConfigFileReader.getApprover_password());
		PartnerPortal_Menu.approverLogin_Btn.click();
	}

	public static String getEvaluationUserName() throws SQLException {
		ResultSet userName = stmt
				.executeQuery("select top 1 MUSER_Login_Name from EIP40AWM. acs.ACS_M_Users where MUSER_User_ID='"
						+ psNumber + "'");
		while (userName.next()) {
			username = userName.getString(1);
			System.out.println("Approver User Name = " + username);
		}
		return username;
	}
	
	public static String getUserName() throws SQLException {
		ResultSet userName = stmt
				.executeQuery("select top 1 MUSER_Login_Name from EIP40AWM. acs.ACS_M_Users where MUSER_Reference_ID='"
						+ psNumber + "'");
		while (userName.next()) {
			username = userName.getString(1);
			System.out.println("Approver User Name = " + username);
		}
		return username;
	}
	
	public static String getPANNO() throws SQLException {
		ResultSet PANno = stmtPP
				.executeQuery("SELECT TOP 1 MG_Id_Card_Value, COUNT(*) FROM PPInterface.PTR.PTR_M_General WHERE MG_Partner_Tag = 'V' AND MG_Status_Code = 1 GROUP BY MG_Id_Card_Value HAVING COUNT(*) > 1");
		while (PANno.next()) {
			PAN_no = PANno.getString(1);
			System.out.println("PAN NO = " + PAN_no);
		}
		return PAN_no;
	}

	/* Partner Onboarding Start */
	public static String getOnboardingUserName() throws SQLException {
		System.err.println("getOnboardingUserName DB Method START");
		ResultSet userName = stmtPP
				.executeQuery("SELECT top 1 MU_Login_Name, HOA_Company_Code, HOA_Category_Code,HOA_Partner_Id,* FROM PPInterface.PTR.PTR_H_Onboard_Answer\r\n"
						+ "INNER JOIN PPInterface.MAS.GEN_M_Users\r\n"
						+ "    ON CAST(MU_Reference_Id AS VARCHAR(200)) = CAST(HOA_Partner_Id AS VARCHAR(200))\r\n"
						+ "WHERE HOA_Document_For = 'POB' AND HOA_Status = 'N' AND HOA_Category_Code=2 AND HOA_Company_Code=1 \r\n"
						+ "order by HOA_Inserted_On DESC");
		while (userName.next()) {
			username = userName.getString(1);
			//username = "1LDnVv6";
		}
		System.err.println("getOnboardingUserName DB Method END");
		return username;
	}

	/* Partner Onboarding End */

	/* Partner Testimonaial Count check Start */
	public static String getTestimonailCountforPartner() throws SQLException {
		System.err.println("getTestimonailCountforPartner DB Method START");
		ResultSet testimonialcount = stmtPP
				.executeQuery("select COUNT(*) from PPInterface.PTR.PTR_D_Testimonials_Details where TD_Partner_Id=''");
		System.err.println("getTestimonailCountforPartner DB Method END");
		return username;
	}
	/* Partner Testimonaial Count check End */

	public static void grievancehistory() throws SQLException {
		dataBaseConnectionPP();
		// PPM_Grievance_Request.sendpartneridtoDB(partner_id_forDB);
		get_grievance_history();
		databaseConnectionClose();
		// PPM_Grievance_Request.verifyHistory(grie_DBjobcode, grie_DBreqno,
		// grie_DBorderno, grie_DBupdateddate);
	}

	public static String get_grievance_history() throws SQLException {
		// ResultSet history_details = stmt.executeQuery("SELECT TOP 1 b.TVCR_Job_code,
		// a.TDM_Document_No, b.TVCR_Order_Number, b.TVCR_Updated_On,
		// a.TDM_User_Remarks,a.TDM_Inserted_On,
		// b.TVCR_Attachment_Doc_Ids,b.TVCR_Variation_Desc FROM
		// PTR.PTR_T_Document_Message as a INNER JOIN PTR.PTR_T_Variation_Claim_Request
		// as b ON TDM_Document_No = TVCR_Request_Number order by TVCR_Updated_On
		// desc");
		ResultSet rs_partnerid = stmtPP.executeQuery(
				"SELECT MG_Partner_Id FROM PTR.PTR_M_General WHERE MG_Partner_Number = '" + partner_id_forDB + "'");
		while (rs_partnerid.next()) {
			System.out.println("Partner Id : " + rs_partnerid.getString(1));
		}

		ResultSet history_details = stmtPP.executeQuery(
				"SELECT TOP 1 b.TVCR_Job_code, a.TDM_Document_No, b.TVCR_Order_Number, b.TVCR_Updated_On,c.MG_partner_id, \r\n"
						+ "	a.TDM_User_Remarks,a.TDM_Inserted_On, b.TVCR_Attachment_Doc_Ids,b.TVCR_Variation_Desc \r\n"
						+ "	FROM ((PTR.PTR_T_Document_Message as a INNER JOIN PTR.PTR_T_Variation_Claim_Request as b \r\n"
						+ "	ON a.TDM_Document_No = TVCR_Request_Number) \r\n"
						+ "	INNER JOIN PTR.PTR_M_General as c ON a.TDM_Partner_Id = c.MG_Partner_Id)");
		while (history_details.next()) {
			grie_DBjobcode = history_details.getString(1);
			grie_DBreqno = history_details.getString(2);
			grie_DBorderno = history_details.getString(3);
			grie_DBupdateddate = history_details.getString(4);
			/*
			 * System.out.println("Jobcode : "
			 * +grie_DBjobcode+"\nGrievance Request Number : "+grie_DBreqno+
			 * "\nOrder No : "+grie_DBorderno);
			 */

		}
		return grie_DBorderno;
	}

	public static void login() throws Throwable {
		// System.out.println("First approval name : "+username);
		PartnerPortal_Menu.Otheruser_Tab.click();

		dataBaseConnectionPP();
		resultSet();
		databaseConnectionClose();

		dataBaseConnectioneipAwm();
		getUserName();
		databaseConnectionClose();

		PartnerPortal_Menu.approverUsername_TB.sendKeys(username);
		PartnerPortal_Menu.approverPassword_TB.sendKeys(ConfigFileReader.getApprover_password());
		PartnerPortal_Menu.approverLogin_Btn.click();
	}

	/*
	 * public static void main(String args[]) throws Throwable {
	 * dataBaseConnectionPP(); get_grievance_history(); databaseConnectionClose();
	 * // PPM_Grievance_Request.verifyHistory(grie_jobcode,grie_docno);
	 * 
	 * }
	 */

// Partner Evaluation Request Start
	public static void partnerRequestWO() throws SQLException, InterruptedException {
		//
		ResultSet Evaluation_ReqNo = stmtPP.executeQuery(
				"select top 1 HER_Order_Number, HER_Evaluation_Request_Number from ppmgmt.ppe.PPE_H_Evaluation_Request WHERE HER_Job_Code IS NOT NULL AND HER_Job_Code <> '' AND HER_Order_Type_Code=2 ORDER BY HER_Inserted_On DESC");
		while (Evaluation_ReqNo.next()) {
			Evaluation_RequestNo = Evaluation_ReqNo.getString(2);
			System.out.println("Evaluation Request Order No = " + Evaluation_RequestNo);
		}
		// Update the Legacy data to change Rating End Date for Next 90 days
		stmtPP.executeUpdate(
				"UPDATE ppmgmt.PPE.PPE_H_Evaluation_Request SET HER_Rating_End_Date = GETDATE()+90 where HER_Evaluation_Request_Number='"
						+ Evaluation_RequestNo + "'");
		// Run Scheduler
		// stmt.executeUpdate("EXEC ppmgmt.PPE.PPE_SP_Evaluation_Initiation
		// @intFrequencyCode = 1");

	}
	public static void partnerRequestPO() throws SQLException, InterruptedException {
		//
		ResultSet Evaluation_ReqNo = stmtPP.executeQuery(
				"select top 1 HER_Order_Number, HER_Evaluation_Request_Number from ppmgmt.ppe.PPE_H_Evaluation_Request WHERE HER_Job_Code IS NOT NULL AND HER_Job_Code <> '' AND HER_Order_Type_Code=1 ORDER BY HER_Inserted_On DESC");
		while (Evaluation_ReqNo.next()) {
			Evaluation_RequestNo = Evaluation_ReqNo.getString(2);
			System.out.println("Evaluation Request Order No = " + Evaluation_RequestNo);
		}
		// Update the Legacy data to change Rating End Date for Next 90 days
		stmtPP.executeUpdate(
				"UPDATE ppmgmt.PPE.PPE_H_Evaluation_Request SET HER_Rating_End_Date = GETDATE()+90 where HER_Evaluation_Request_Number='"
						+ Evaluation_RequestNo + "'");
	}
	public static String getMSTQA_Document_Number() throws SQLException, InterruptedException {
		ResultSet MSTQA_Document_Number = stmtPP.executeQuery(
				"select top 1 MSTAQ_Document_Number from PPInterface.PTR.PTR_M_Statutory_Ql ORDER BY MSTAQ_Inserted_On DESC");
		while (MSTQA_Document_Number.next()) {
			documentNumber = MSTQA_Document_Number.getString(1);
			System.out.println("MSTAQ Document Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static String getBranch_Document_Number() throws SQLException, InterruptedException {
		ResultSet Branch_Document_Number = stmtPP.executeQuery(
				"select top 1 MG_Partner_Id from PPInterface.ptr.PTR_M_Branches where MB_Document_Number like 'POB%' order by MB_Inserted_On desc");
		while (Branch_Document_Number.next()) {
			documentNumber = Branch_Document_Number.getString(1);
			System.out.println("Branch Document Number = " + documentNumber);
		}
		
		return documentNumber;
	}
	public static String getCustomer_Document_Number() throws SQLException, InterruptedException {
		ResultSet Customer_Document_Number = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'COB%' order by TDW_Inserted_On DESC");
		while (Customer_Document_Number.next()) {
			documentNumber = Customer_Document_Number.getString(1);
			System.out.println("Customer Document Number = " + documentNumber);
		}
		return documentNumber;
	}
	
	public static String getCompany_Document_Number() throws SQLException, InterruptedException {
		ResultSet Company_Document_Number = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'POB%' OR TDW_Reference_Id like 'COB%' order by TDW_Inserted_On DESC");
		while (Company_Document_Number.next()) {
			documentNumber = Company_Document_Number.getString(1);
			System.out.println("Company Document Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static void getCustomerName() throws Throwable {
		String CustomerName=null;
		ResultSet MG_Long_Desc = stmtPP.executeQuery(
				"select top 1 MG_Long_Desc from PPInterface.PTR.PTR_M_General where MG_Partner_Tag='C' order by MG_Inserted_On DESC");
		while (MG_Long_Desc.next()) {
			CustomerName = MG_Long_Desc.getString(1);
			System.out.println("Customer Name = " + CustomerName);
		}
		BaseClass.sendKeysDocumentNo(PartnerPortal_Menu.SearchCustomerTB, CustomerName);
	}
	public static void getGSTNumber() throws Throwable {
		String StateCode=null,PANNo=null;
		ResultSet MS_State_Code = stmtPP.executeQuery(
				"select MS_State_Code from PPInterface.MAS.GEN_M_State where MS_Name like 'Tamilnadu'");
		while (MS_State_Code.next()) {
			StateCode = MS_State_Code.getString(1);
			System.out.println("State Code = " + StateCode);
		}
		ResultSet MG_Id_Card_Value = stmtPP.executeQuery(
				"select top 1 MG_Id_Card_Value from PPInterface.PTR.PTR_M_General where MG_Partner_Tag='C' order by MG_Inserted_On DESC");
		while (MG_Id_Card_Value.next()) {
			PANNo = MG_Id_Card_Value.getString(1);
			System.out.println("PAN No = " + PANNo);
		}
		String GSTNumber = StateCode+PANNo+BaseClass.RandomAlphaNumeric(3);
		BaseClass.Input(PartnerPortal_Menu.GSTNumberTB, GSTNumber);
	}
	public static String getBank_Document_Number() throws SQLException, InterruptedException {
		ResultSet Company_Document_Number = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPInterface.PTR.PTR_T_Document_Workflow where TDW_Reference_Id like 'PBD%' AND TDW_Action_Status=4 order by TDW_Inserted_On DESC");
		while (Company_Document_Number.next()) {
			documentNumber = Company_Document_Number.getString(1);
			System.out.println("Bank Document Number = " + documentNumber);
		}
		return documentNumber;
	}
	public static String getEvaluation_Document_Number() throws SQLException, InterruptedException {
		ResultSet Evaluation_Document_Number = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPMgmt.PPE.PPE_T_Document_Workflow order by TDW_Inserted_On DESC");
		while (Evaluation_Document_Number.next()) {
			documentNumber = Evaluation_Document_Number.getString(1);
			System.out.println("Evaluation Approval Document Number = " + documentNumber);
		}
		return documentNumber;
	}
	
	public static void partnerEvaluatorNoWO() throws SQLException, InterruptedException {
		ResultSet Evaluation_OrderNo = stmtPP.executeQuery(
				"select top 1 HER_Order_Number,Her_Evaluation_Request_Number from ppmgmt.ppe.PPE_H_Evaluation_Request WHERE HER_Job_Code IS NOT NULL AND HER_Job_Code <> '' AND HER_Order_Type_Code=1 AND HER_IS_Rating_Required='Y' AND HER_Job_Code='LE160555' ORDER BY HER_Inserted_On DESC"
				+ "");
		System.out.println(Evaluation_OrderNo);
		while (Evaluation_OrderNo.next()) {
			EvaluationOrderNumber = Evaluation_OrderNo.getString(1);
			System.out.println("Evaluation Number = " + EvaluationOrderNumber);
		}
		//PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys(EvaluationOrderNumber);
		PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys("LE/LE180045/WOD/24/000001");
	}
	public static void partnerEvaluatorNoPO() throws SQLException, InterruptedException {
		ResultSet Evaluation_OrderNo = stmtPP.executeQuery(
				"select top 1 HER_Order_Number,Her_Evaluation_Request_Number from ppmgmt.ppe.PPE_H_Evaluation_Request WHERE HER_Job_Code IS NOT NULL AND HER_Job_Code <> '' AND HER_Order_Type_Code=2 AND HER_IS_Rating_Required='Y' AND HER_Job_Code='LE180540' ORDER BY HER_Inserted_On DESC"
				+ "");
		System.out.println(Evaluation_OrderNo);
		while (Evaluation_OrderNo.next()) {
			EvaluationOrderNumber = Evaluation_OrderNo.getString(1);
			System.out.println("Evaluation Number = " + EvaluationOrderNumber);
		}
		//PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys(EvaluationOrderNumber);
		PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys("LE/LE160645/POD/24/000005");
	}
	public static void partnerEvaluatorNoSenback() throws SQLException, InterruptedException {
		ResultSet Evaluation_DocNo = stmtPP.executeQuery(
				"SELECT top 1 TDW_Reference_Id FROM PPMgmt.PPE.PPE_T_Document_Workflow where TDW_Reference_Id like 'LE%' AND TDW_Action_Status=2 order by TDW_Inserted_On DESC");
		System.out.println(Evaluation_DocNo);
		while (Evaluation_DocNo.next()) {
			Evaluation_HEDocNumber = Evaluation_DocNo.getString(1);
			System.out.println("Evaluation Document Number = " + Evaluation_HEDocNumber);
		}
		ResultSet Evaluation_OrderNo = stmtPP.executeQuery(
				"select top 1 HE_Order_Number from PPMgmt.PPE.PPE_H_Evaluation where HE_Document_Number='"+Evaluation_HEDocNumber+"'");
		System.out.println(Evaluation_OrderNo);
		while (Evaluation_OrderNo.next()) {
			EvaluationOrderNumber = Evaluation_OrderNo.getString(1);
			System.out.println("Evaluation Number = " + EvaluationOrderNumber);
		}
		//PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys(EvaluationOrderNumber);
		PartnerPortal_Menu.PartnerEvalFilterOrderNo_TB.sendKeys("EF296PO6000003");
	}
	public static String getEvaluateOrderNumber() throws SQLException, InterruptedException {
		ResultSet Evaluation_OrderNo = stmtPP.executeQuery(
				"select top 1 HER_Order_Number from ppmgmt.ppe.PPE_H_Evaluation_Request where HER_Order_Type_Code=2 AND HER_Job_Code='LE160555' ORDER BY HER_Inserted_On DESC");
		System.out.println(Evaluation_OrderNo);
		while (Evaluation_OrderNo.next()) {
			EvaluationOrderNumber = Evaluation_OrderNo.getString(1);
			System.out.println("Evaluation Number = " + EvaluationOrderNumber);
		}
		return EvaluationOrderNumber;
	}

	/*
	 * public static void partnerEvaluator() throws SQLException,
	 * InterruptedException { ResultSet Evaluation_OrderNo = stmt.executeQuery(
	 * "select top 1 HER_Order_Number from ppmgmt.ppe.PPE_H_Evaluation_Request ORDER BY HER_Inserted_On DESC"
	 * ); while (Evaluation_OrderNo.next()) { EvaluationOrderNoNumber =
	 * Evaluation_OrderNo.getString(1); System.out.println("Evaluation Number = " +
	 * EvaluationOrderNoNumber); } // To get HE_Document_Number which is waiting for
	 * Evaluation ResultSet EvaluationHEDocNumber = stmt.executeQuery(
	 * "SELECT * FROM PPMgmt.PPE.PPE_H_Evaluation WHERE HE_Order_Number = '" +
	 * EvaluationOrderNoNumber + "'"); while (EvaluationHEDocNumber.next()) {
	 * Evaluation_HEDocNumber = EvaluationHEDocNumber.getString(1);
	 * System.out.println("Evaluation HE_Doc_Number = " + Evaluation_HEDocNumber); }
	 * 
	 * // To get particular user Dashboard for approve Evaluation ResultSet
	 * ReceiverUserID = stmt.executeQuery(
	 * "select top 1 TDW_Receiver_User_Id,* from PPMgmt.ppe.PPE_T_Document_Workflow WHERE TDW_Reference_Id ='"
	 * + Evaluation_HEDocNumber + "'"); // To Get 1st Receiver User ID while
	 * (ReceiverUserID.next()) { Receiver_UserID = ReceiverUserID.getString(1);
	 * System.out.println("Receiver User ID: "+Receiver_UserID); } }
	 */

	/*public static String partner_Evaluator() throws SQLException, InterruptedException {
		partnerRequest();

		// To get Document Request Number for Evaluation
		ResultSet Evaluation_Document_Number = stmtPP.executeQuery(
				"select top 1 HER_Order_Number from ppmgmt.ppe.PPE_H_Evaluation_Request where HER_Order_Type_Code=2 AND HER_Job_Code='LE160555' ORDER BY HER_Inserted_On DESC");
		// To Get 1st Receiver User ID
		while (Evaluation_Document_Number.next()) {
			EvaluationOrderNumber = Evaluation_Document_Number.getString(1);
			System.out.println("Evaluation Order Number: " + EvaluationOrderNumber);
		}
		return EvaluationOrderNumber;
	}*/

	public static void partnerEvaluatorLoginName() throws SQLException, InterruptedException {
		ResultSet Receiver_Username = stmt.executeQuery(
				"select  top 1 HER_Order_Number from PPE.PPE_H_Evaluation_Request where HER_IS_Rating_Required='Y' order by HER_Inserted_On DESC");

		while (Receiver_Username.next()) {
			approverUsername = Receiver_Username.getString(1);
		}
		System.out.println("Approver Name: " + approverUsername);
		Thread.sleep(5000);
		// Pass Username in EIP Login Page
		PartnerPortal_Menu.EIPUsername_TB.sendKeys(approverUsername);
	}
	public static void partnerEvaluatorLoginNamePurchaseOrder() throws SQLException, InterruptedException {
		ResultSet Receiver_Username = stmt.executeQuery(
				"SELECT top 1 MUSER_Login_Name  FROM PPMgmt.PPE.PPE_L_Page_Workflow_Config "
				+" INNER JOIN EIP40AWM.ACS.ACS_M_Functional_Roles ON MFR_FR_Code = LPWC_ERP_FR_Code AND MFR_Company_Code = 1"
					+"	AND MFR_ISActive = 'Y' INNER JOIN EIP40AWM.ACS.ACS_L_User_Job_Functional_Roles ON LUJFR_FR_Code = LPWC_ERP_FR_Code AND LUJFR_ISActive = 'Y' INNER JOIN EIP40AWM.ACS.ACS_M_Users"
				+ " ON MUSER_User_ID = LUJFR_User_ID AND MUSER_ISActive = 'Y'"
				+ "	INNER JOIN PPMgmt.PPE.PPE_L_Question_Configuration "
				+ "		ON LQC_CED_Code = LPWC_CED_Code AND LQC_Order_Type_Code = LPWC_Order_Type_Code "
				+ "		AND LQC_Job_Type_Code = LPWC_Job_Type_Code AND LPWC_Hierarchy = LQC_Level_Code"
				+ "	INNER JOIN PPMgmt.PPE.PPE_M_Headings"
				+ " ON MH_Heading_Code = LQC_Heading_Code "
				+ "	WHERE LPWC_Order_Type_Code IN( 1,2) "
				+ "	AND LPWC_Job_Type_Code = 4 AND LUJFR_Job_Code IN ('LE160555') " 
				+ " order by LPWC_Inserted_On DESC ");

		// To Get Login Name
		// ResultSet ReceiverLogin_name = stmt.executeQuery(
		// "select MUSER_Login_Name from eip40awm.acs.acs_m_users where MUSER_Login_Name
		// ='" + Receiver_Username + "'");
		// + "MUSER_User_ID = '"
		// + Receiver_UserID + "'");

		while (Receiver_Username.next()) {
			approverUsername = Receiver_Username.getString(1);
		}
		System.out.println("Approver Name: " + approverUsername);
		Thread.sleep(5000);
		// Pass Username in EIP Login Page
		PartnerPortal_Menu.EIPUsername_TB.sendKeys(approverUsername);
	}

	/* Partner Registration Starts here */
	public static String partnerOTPVerification() throws SQLException, InterruptedException, IOException {
		ResultSet EmailOTPVerify = stmtPP
				.executeQuery("select top 1 TS_Reference_Number from ppinterface.mas.MAS_T_SMS order by TS_Inserted_On desc");
		while (EmailOTPVerify.next()) {
			EmailOTPVerification = EmailOTPVerify.getString(1);
		}
		return EmailOTPVerification;
	}
	public static void partnerEmailVerification() throws SQLException, InterruptedException, IOException {
		ResultSet EmailOTPVerify = stmtPP
				.executeQuery("select top 1 TAM_Mail_Message from PPinterface.[MAS].[MAS_T_Auto_Mail]  order by TAM_Mail_Request_On DESC");
		while (EmailOTPVerify.next()) {
			EmailOTPVerification = EmailOTPVerify.getString(1);
		}
		// Define the path where the HTML file will be created
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\EmailOTP\\EmailOTP.html";

        // Create the HTML file and write content to it
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(EmailOTPVerification);
            System.out.println("HTML file created successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing the file: " + e.getMessage());
        }
		//return EmailOTPVerification;
	}
	
	public static int PPEHeadingCount() throws SQLException, InterruptedException, IOException {
		ResultSet resPPEHeadingCount = stmtPP
				.executeQuery("SELECT COUNT(*),LPWC_Hierarchy FROM PPMgmt.PPE.PPE_L_page_workflow_config WHERE LPWC_CED_Code = 1 AND LPWC_Order_Type_Code = 2 AND LPWC_Job_Type_Code = 4 GROUP BY LPWC_Hierarchy");
		resPPEHeadingCount.next();
		int PPEHeadingCount = resPPEHeadingCount.getInt(1);
		return PPEHeadingCount;
	}
	public static int getEvaluatedHeadingCount(String EvaluateOrderNumber) throws SQLException, InterruptedException, IOException {
		ResultSet resEvaluatedPPEHeadingCount = stmtPP
				.executeQuery("SELECT * FROM PPMgmt.PPE.PPE_D_Evaluation WHERE DE_Document_Number ='"+EvaluateOrderNumber+"'");
		resEvaluatedPPEHeadingCount.next();
		int EvaluatedPPEHeadingCount = resEvaluatedPPEHeadingCount.getInt(1);
		return EvaluatedPPEHeadingCount;
	}

	/* Partner Registration Ends here */
	public static String getGSTNumberSearch(String partnerNumnber) throws Throwable {
		
		ResultSet partnerNumber = stmtPP.executeQuery("select top 1 MG_Partner_Id from ppinterface.PTR.PTR_M_General where MG_Partner_Number = '"+partnerNumnber+"'");
		while (partnerNumber.next()) {
			partner_Number = partnerNumber.getString(1);
		}
		
		ResultSet GSTNumber = stmtPP.executeQuery("select top 1 MGST_GST_Number from ppinterface.PTR.PTR_M_GSTIN where MGST_Partner_Id='"+partner_Number+"'");
		while (GSTNumber.next()) {
			GST_Number = GSTNumber.getString(1);
		}
		return GST_Number;
	}



}
