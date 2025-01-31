package dataProviders;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import Constants.GlobalConstants;

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

	public String getBrowser() {
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

	public static String getBrowserCompatipility() {
		String BrowserCompatipility = properties.getProperty("BrowserCompatipility");
		if (BrowserCompatipility != null)
			return BrowserCompatipility;
		else
			throw new RuntimeException("BrowserCompatipility not specified in the Configuration.properties file.");
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
	
	public static String getEnableHeadless() {
		String EnableHeadless = properties.getProperty("EnableHeadless");
		if (EnableHeadless != null)
			return EnableHeadless;
		else
			throw new RuntimeException("EnableHeadless not specified in the Configuration.properties file.");
	}
	
	public static String getSneha() {
		String Sneha = properties.getProperty("Sneha");
		if (Sneha != null)
			return Sneha;
		else
			throw new RuntimeException("Sneha not specified in the Configuration.properties file.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}