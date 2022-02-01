package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_User {
	@Test(priority = 15)
	public void add_user() throws Exception {
		
		Config.test = Config.extent.createTest("Add_User","adds a new user to the system");

		// selects the role
		Select role = new Select(Config.driver.findElement(By.id(Locators.role)));
		role.selectByVisibleText(Instance_Variables.role);

		//enters the employee name
		WebElement empName = Config.driver.findElement(By.id(Locators.employee_name));
		empName.clear();
		empName.sendKeys(Instance_Variables.employee_name);	

		// enters the username
		WebElement UserName = Config.driver.findElement(By.id(Locators.Username));
		UserName.clear();
		UserName.sendKeys(Instance_Variables.Username);

		// enters password
		WebElement password = Config.driver.findElement(By.id(Locators.Password));
		password.clear();
		password.sendKeys(Instance_Variables.Password);

		// enters confirm password
		WebElement confirmPass = Config.driver.findElement(By.id(Locators.Confirm_Password));
		confirmPass.clear();
		confirmPass.sendKeys(Instance_Variables.Confirm_Password);

		// clicks the save button
		Thread.sleep(2000);
		Config.driver.findElement(By.id(Locators.save_button)).click();

	}//add_user
	
	//Validation
	@Test(priority = 16)
	public void VerifyStatusDropdown() {
		//test case and description
		Config.test = Config.extent.createTest("status dropdown validation", "Verify Status dropdown is Selected to enabled");
		//selecting status using web element by id
		Select status = new Select(Config.driver.findElement(By.id(Locators.status)));

		//boolean result = driver.findElement(By.xpath("xpath")).isEnabled();
		//checking if first select option is enabled or not
		if(status.getFirstSelectedOption().getText().equalsIgnoreCase(Locators.status)) {
			Config.rs = true;
		}
		else {
			Config.rs = false;
		}		
		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(Config.rs);
		Config.test.pass("Test Passed stutus dropdown is enabled");
		
		}
	

}// end class Add_User
