package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_button {
	@Test(priority = 12)
	public void add_button() {

		Config.test = Config.extent.createTest("Add_button","clicks on the add button");

		// clicks on the Add button
		WebElement add_button = Config.driver.findElement(By.id(Locators.add_button));
		add_button.click();


	}// end add_button method

	//Validation

	@Test(priority = 13)
	public void saveSystemUsers() {
		Config.test = Config.extent.createTest("saveSystemUsers","checks if url contains keyword saveSystemUsers");
		// validate URL contains dashboard
		String actualTitle = Config.driver.getCurrentUrl();
		Assert.assertTrue(actualTitle.contains("saveSystemUsers"));
		Config.test.pass("Test Passed url contains keyword saveSystemUsers");
		

	}// end viewSystemUser method


	//test
	@Test(priority = 14)
	//validating add user h1
	public void AddUserH1() {
		//test case and description
		Config.test = Config.extent.createTest("Add User H1 should display", "validate that user H1 should display");
		//calling web element by id
		WebElement user_header = Config.driver.findElement(By.id(Locators.Add_User));
		//checking if user header is displayed
		if(user_header.isDisplayed()) {
			Config.test.pass("Test Passed User H1 should is displayed");
			
		}// end if
	}// end AddUserH1


}// end class Add_button
