package utils;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constants.BrowserConstants;
import dataProviders.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.Locators.*;

public class DriverFactory {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
// *************************************************************************************************
	
	public static LoginEipObjects LoginEip;
	
	public static LoginObjects Login; 
	public static CommonControlObject commonObjects;
	public static MenuObjects Menus;
	
	// *************************************************************************************************

	public static WebDriver getWebdriver() {
	    try {
	        ConfigFileReader file = new ConfigFileReader();
	        String browserName = file.getBrowser();

	        switch (browserName) {
	            case "chrome":
//	                WebDriverManager.chromedriver().setup();
	            	 System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, BrowserConstants.Chrome_Driver_Path);
	                ChromeOptions options = new ChromeOptions();
	                options.addArguments("--remote-allow-origins=*");
	                options.addArguments("use-fake-ui-for-media-stream");
	                if (ConfigFileReader.getEnableHeadless().equals("True")) {
	                    System.out.println("Automation execution will run in Headless Browser");
	                    options.addArguments("headless");
	                } else {
	                    System.out.println("Automation execution will run in " + browserName + " Head - Browser");
	                }
	                options.addArguments("start-maximized");
	                Map<String, Object> prefs = new HashMap<String, Object>();
	                prefs.put("credentials_enable_service", false);
	                prefs.put("profile.password_manager_enabled", false);
	                options.setExperimentalOption("prefs", prefs);
	                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	                driver = new ChromeDriver(options);
	                Dimension d = new Dimension(1920, 1080);
	                driver.manage().window().setSize(d);
	                break;
	            case "firefox":
	                System.out.println("Automation execution will run in " + browserName + "Browser");
	                WebDriverManager.firefoxdriver().setup();
	                driver = new FirefoxDriver();
	                break;
	        }
	    } catch (Exception e) {
	        System.out.println("Unable to launch browser due to: " + e.toString());
	    }
	    System.out.println("driver-=-=-=-=-=-==--=-=-: " + driver);
	    driver.manage().window().maximize();

	    return driver;
	}

	public WebDriverWait waitDriver() {
		return new WebDriverWait(driver, Duration.ZERO.withSeconds(30));
	}

}
