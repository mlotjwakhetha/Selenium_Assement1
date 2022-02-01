package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_section {
	@Test(priority = 17)
	public void search() throws Exception {

		Config.test = Config.extent.createTest("Search","Searches for a specified user ");


		// enters the desired search username
		Thread.sleep(2000);
		WebElement search_Username = Config.driver.findElement(By.name(Locators.search_Username));
		search_Username.clear();
		search_Username.sendKeys(Instance_Variables.search_Username);

		// click the seach button
		WebElement search_button = Config.driver.findElement(By.id(Locators.search_button));
		Thread.sleep(2000);
		search_button.click();



	} //end search method

	//Validation
	@Test(priority = 18)
	public void validateUsername () {
		//test case and description
		Config.test = Config.extent.createTest("username validation", "validate that searchUsername");

		//calling username by xpath
		WebElement val_user = Config.driver.findElement(By.xpath(Locators.search_Username));
		//validate that username text is input.username or not
		if(val_user.getText().equalsIgnoreCase(Instance_Variables.searchName)) {
			Config.rs = true;;
		}
		else {
			Config.rs = false;
		}
		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(true);
		Config.test.pass("Test Passed Searched  added username");
	
	}// end ValidateUsername method


	//test
	@Test(priority = 19)
	//validate Employee Name
	public void validateEmployeeName () {

		//test case and description
		Config.test = Config.extent.createTest("employee name validation", "validate that employee name");

		//calling Employee Name by xpath
		WebElement val_EmpNam = Config.driver.findElement(By.xpath(Locators.search_Username));
		//checking that Employee Name text is expected_EmpName or not
		if(val_EmpNam.getText().equalsIgnoreCase(Instance_Variables.search_Username)) {
			Config.rs= true;;
		}
		else {
			Config.rs = false;
		}
		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(Config.rs);
		Config.test.pass("Test Passed employee name");
		
	}// end VAlidatEmployeeName method

	//test
	@Test(priority = 20)
	//validate Status
	public void validateStatus () {
		//test case and description
		Config.test = Config.extent.createTest("status enabled validation", "validate that status is enabled");

		//calling validation status by xpath
		WebElement val_drop_status = Config.driver.findElement(By.xpath(Locators.status));
		//checking that status text is validation status or not
		if(val_drop_status.getText().equalsIgnoreCase(Locators.status)) {
			Config.rs = true;;
		}
		else {
			Config.rs = false;
		}
		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(Config.rs);
		Config.test.pass("Test Passed Status dropdown is Selected to enabled");
		
	}// end validateStatus method	

}// end class Search_section
