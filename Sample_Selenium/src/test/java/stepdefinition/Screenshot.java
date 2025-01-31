package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;
import dataProviders.ConfigFileReader;

public class Screenshot {

	public static ConfigFileReader configFileReader;

	public Screenshot() {
//		DriverFactory.driver();
		DriverFactory.getWebdriver();
	}

	public String getTestClassName(String testName) {
		String[] reqTestClassname = testName.split("\\.");
		int i = reqTestClassname.length - 1;
		System.out.println("Required Test Name : " + reqTestClassname[i]);
		return reqTestClassname[i];
	}

	public static void Screenshotforscenario() throws IOException {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		TakesScreenshot scrShot = ((TakesScreenshot) DriverFactory.driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Scenario() + "_"
				+ timestamp + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("------------------------------------");
		System.out.println("Screenshot for Scenario - captured");
		System.out.println("------------------------------------");

	}

}