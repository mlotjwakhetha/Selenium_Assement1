package com.ilab.selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Delete {
	@Test(priority = 21)
	public void delete() throws Exception {
		
		Config.test = Config.extent.createTest("Delete","Deletes a selected user");

		// checkbox of recently added
		Thread.sleep(2000);
		WebElement recently_added = Config.driver.findElement(By.name(Locators.recently_added_radio));
		recently_added.click();

		//
		Thread.sleep(2000);
		WebElement delete = Config.driver.findElement(By.id(Locators.delete_button));
		delete.click();


		// clicks on the ohk button
		Thread.sleep(2000);
		WebElement ok_button = Config.driver.findElement(By.id(Locators.ok_button));
		ok_button.click();

		// searches the username again
		Thread.sleep(2000);
		WebElement search_Username = Config.driver.findElement(By.name(Locators.search_Username));
		search_Username.clear();
		search_Username.sendKeys(Instance_Variables.search_Username);

		// click the seach button
		WebElement search_button = Config.driver.findElement(By.id(Locators.search_button));
		Thread.sleep(2000);
		search_button.click();


	}// end delete method
}// end class delete
