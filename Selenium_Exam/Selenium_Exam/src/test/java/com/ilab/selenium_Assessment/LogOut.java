package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOut {
	@Test(priority = 22)
	public void logout() throws Exception {
		//Test case and description
		Config.test = Config.extent.createTest("LogOut", "log out of the application");
		
		// clicks on the welcome Admin tab
		Thread.sleep(2000);
		WebElement welcome_admin = Config.driver.findElement(By.id(Locators.welcome_admin));
		welcome_admin.click();
		
		// clicks on logout
		Thread.sleep(2000);
		WebElement logout = Config.driver.findElement(By.linkText(Locators.logout));
		logout.click();

	}// end logout method
	
	// Validation
	
	@Test(priority = 23)
	public void validateUserLogout () {
		//test case and description
		Config.test = Config.extent.createTest("User should contain logout", "validate if user contain logout");
		
		//checking if current url contains val_login or not
		if(Config.driver.getCurrentUrl().contains(Locators.login_button)) {
		Config.rs = true;
		}
		else {
		Config.rs = false;
		}

		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(Config.rs);
		Config.test.pass("url contain logout user contain logout");
		
		}

		//test
		@Test(priority = 24)
		public void validateTitle() throws Exception {
		//test case and description
		Config.test = Config.extent.createTest("Title should be OrangeHRM", "validate that Title should be OrangeHRM");
		// validating the Title
				String actualTitle = Config.driver.getTitle();
				String expectedTitle = "OrangeHRM";

				Assert.assertEquals(actualTitle, expectedTitle);
				Config.test.pass("Test Passed Title is OrangeHRM");
				
				
				
		}// end validateTitle  method
	
}// end logout class
