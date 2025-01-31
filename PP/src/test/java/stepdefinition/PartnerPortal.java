package stepdefinition;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsRepository;
import utils.DriverFactory;

public class PartnerPortal{

	// Read Configuration
	public static ConfigFileReader configFileReader;
		
	public PartnerPortal() {
		PageFactory.initElements(DriverFactory.driver, ObjectsRepository.class);
	}

	 // Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);
	
	
	
	// **************** Start import methods for step definition
	// ********************

	

	

	
	
}
