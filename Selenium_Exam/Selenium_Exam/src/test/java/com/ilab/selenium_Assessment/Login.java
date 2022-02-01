package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test(priority = 2)
	public void logging_in() throws Exception{

		Config.test = Config.extent.createTest("Login","logs into the application  ");
		// enters log in details
		Config.driver.findElement(By.name(Locators.login_user_name)).sendKeys(Instance_Variables.login_user_name);
		Config.driver.findElement(By.name(Locators.login_password)).sendKeys(Instance_Variables.login_password);	 
		Thread.sleep(2000);
		Config.driver.findElement(By.id(Locators.login_button)).click();

	}// end logging in method

	
	// validation
	@Test(priority = 3)
	public void dashboard() {
		Config.test = Config.extent.createTest("dashboard","checks if url contains keyword dashboard");
		// validate URL contains dashboard
		String actualTitle = Config.driver.getCurrentUrl();
		Assert.assertTrue(actualTitle.contains("dashboard"));
		Config.test.pass("Test Passed");
		Config.log.info("Test Passed url contains keyword dashboard ");

	}// end dashboard method
	
	@Test(priority = 4)
	public void AdminTab() {
		//test case and description
		Config.test = Config.extent.createTest(" Admin tab should display ", "Validate that  Admin tab is displayed");

		//calling web element by linkText
		WebElement adminTab = Config.driver.findElement(By.id(Locators.admin_tab));

		//checking if welcome admin tab is displayed at right panel or not
		if(adminTab.isDisplayed()) {
		Config.test.pass("Test Passed. AdminTab is displayed");
		Config.log.info("Test Passed  Admin tab is displayed");
		}
		}// end AdminTab method
	
	@Test(priority = 5)
	public void validateWelcomeAdmin() {
		//test case and description
		Config.test = Config.extent.createTest("Welcome Admin should display at right panel", "Validate that welcome Admin should display at right panel");

		//calling web element by linkText
		WebElement welcome_admin = Config.driver.findElement(By.id(Locators.welcome_admin));

		//checking if welcome admin tab is displayed at right panel or not
		if(welcome_admin.isDisplayed()) {
		Config.test.pass("Test Passed. welcome Admin is displayed");
		Config.log.info("Test Passed  Welcome Admin display at right panel");
		}
		} //end validateWelcomeAdmin method   
		
	
}// end class login
