package com.ilab.selenium_Assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Open_Application {

	@Test(priority = 1)
	public void openURL() {

		// website URL
		Config.test = Config.extent.createTest("OpenURL", "opens the url");
		Config.driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		// validating the Title
		String actualTitle = Config.driver.getTitle();
		String expectedTitle = "OrangeHRM";

		Assert.assertEquals(actualTitle, expectedTitle);

		Config.test.pass("Test Passed Title matches");
		
	} // end openURL method
	
	
	

	
}
