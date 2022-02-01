package com.ilab.selenium_Assessment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {
	// global initialization
	static ExtentReports extent;
	static WebDriver driver;
	static ExtentTest test;
	static Logger log;
	static boolean rs;

	@BeforeSuite
	public  void setup() {
		// lunch browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		ExtentSparkReporter reporter = new ExtentSparkReporter ("./src/test/resources/ReportFile.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		log = LogManager.getLogger(Config.class);
	}	// end class setup	

	@AfterSuite
	public void cleanup() {
		// writes everything to the log file
		extent.flush();

	}// class cleanup
	
	@AfterMethod
	public void checkresult(ITestResult rs) {
		if (rs.getStatus()==ITestResult.FAILURE) {
			Config.test.fail("Test Failed");
			Config.log.info("Test Failed");
		} // end if statement


	}//end class checkresult
} // end Class Config


