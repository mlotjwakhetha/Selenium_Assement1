package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Admin_tab {
	@Test(priority = 6)
	public void admintab() {
		Config.test = Config.extent.createTest("Admin_tab","clicks on the admin tab");

		//clicks on the Admin_tab
		WebElement admin_tab = Config.driver.findElement(By.id(Locators.admin_tab));
		admin_tab.click(); 


	}// end admintab method


	//Validation
	
	@Test(priority = 7)
	public void viewSystemUsers() {
		Config.test = Config.extent.createTest("viewSystemUsers","checks if url contains keyword viewSystemUsers");
		// validate URL contains dashboard
		String actualTitle = Config.driver.getCurrentUrl();
		Assert.assertTrue(actualTitle.contains("viewSystemUsers"));
		Config.test.pass("Test Passed url contains keyword viewSystemUsers");
		

	}// end viewSystemUser method

	@Test(priority = 8)
	public void Delete() {
		Config.test = Config.extent.createTest("delete validation", "validate that delete button is displayed");
		WebElement delete_btn = Config.driver.findElement(By.name(Locators.delete_button));


		if(delete_btn.isDisplayed()) {
			Config.test.pass("Test Passed delete button is displayed");
			
		}// end if
	} // end Delete method
	

	@Test(priority = 9)
	public void Search() {
		Config.test = Config.extent.createTest("search validation", "validate that search button is displayed");
		WebElement search_btn = Config.driver.findElement(By.name(Locators.search_button));

		if(search_btn.isDisplayed()) {
			Config.test.pass(" Test Passed search button is displayed");
			
		}// end if
	}// end Search method


	@Test(priority = 10)
	public void Reset() {
		Config.test = Config.extent.createTest("reset validation", "validate that reset button is displayed");
		WebElement reset_btn = Config.driver.findElement(By.name(Locators.reset_button));

		if(reset_btn.isDisplayed()) {
			Config.test.pass("Test Passed reset button is displayed");
			
		}//end if
	}// end Reset method

	@Test(priority = 11)
	public void Add () {
		Config.test = Config.extent.createTest("Add validation", "validate that add button is displayed");
		WebElement save_btn = Config.driver.findElement(By.name(Locators.save_button));

		if(save_btn.isDisplayed()) {
			Config.test.pass(" Test Passed save button is displayed");
			
		}// end if
	}// end Add method



}
