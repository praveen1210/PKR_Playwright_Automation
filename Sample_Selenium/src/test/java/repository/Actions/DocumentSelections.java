package repository.Actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DocumentSelections {
	static Statement stmt,stmtHr;
	static String DB_Url,DB_User,DB_Pwd;
	static Connection con;
	static String docNumber;
	public static  void dataBaseConnectionSCM() throws SQLException {
		   DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
		   DB_User = "SCM4login";
		   DB_Pwd = "SCM4LOGIN@@qa";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static  void dataBaseConnectionAwm() throws SQLException {
		  DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40AWM;";
		   DB_User = "AWM4LOGIN";
		   DB_Pwd = "AWM4LOGIN@@qa";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static  void dataBaseConnectionHR() throws SQLException {
		  DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40HR;encrypt=true;trustServerCertificate=true";
		   DB_User = "EIP20LOGIN";
		   DB_Pwd = "QA@#eip20Login";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmtHr = con.createStatement();
		   System.out.println("Connected");
	}
		
	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}
	public static void resultSet() throws SQLException, InterruptedException {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ResultSet results = stmt.executeQuery("SELECT TOP 1 * FROM EIP40SCM.TLM.FRT_H_Freight_Request ORDER BY HFR_Inserted_On DESC");
		
		while(results.next()) {
			docNumber=results.getString("HFR_Request_Number");
			System.out.println(docNumber);
		}		
	}	

// public static void main(String args[]) throws SQLException, InterruptedException {
//	/*dataBaseConnectionSCM();
//	resultSet();
//	databaseConnectionClose();*/
//	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//	
//    Date date = new Date();
//    String todate = dateFormat.format(date);
//    System.out.println("Todays Date = "+todate);
//    Calendar cal = Calendar.getInstance();
//    cal.add(Calendar.DATE, -65);
//    Date todate1 = cal.getTime();    
//    
//    int month = todate1.getMonth();
//    int year = todate1.getYear();
//    int day = todate1.getDate();
//    
//    
//    String fromdate = dateFormat.format(todate1);
//    System.out.println("Back dated = "+fromdate);
//}


	public static void main(String[] args) throws SQLException {
		dataBaseConnectionHR();
	}
	
	public static void searchDocument() throws SQLException, InterruptedException {
		dataBaseConnectionSCM();
		resultSet();
		databaseConnectionClose();
//		TransportRequestCreationPageActions.searchDocument(docNumber);
		 }	
		
	public static void searchDocuments() throws SQLException, InterruptedException {
		dataBaseConnectionSCM();
		resultSet();
		databaseConnectionClose();
//		TransporterShipmentDetails.searchDocument(docNumber);
		 }	
}
