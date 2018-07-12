package com.qa.test.webtest2;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SiteTest {
	
	ChromeDriver driver;
	
	ExtentReports extent;
	ExtentTest test;

	Actions action;
	
	@Before
	public void setup() {

		// initialize ExtentReports with a file path
		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true);

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();

		action = new Actions(driver);
		
	}
	
	@After 
	public void teardown() {
		
		
	}
	
	
	@Test

	public void testDemo() {
			
		driver.get("http://automationpractice.com/index.php");

		test = extent.startTest("verify item is found");
		
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home("Printed Summer Dress", action);
				
		SummerDresses summerDresses = PageFactory.initElements(driver, SummerDresses.class);
		summerDresses.summerdresses();
				
		test.log(LogStatus.PASS, "item clicked successfully");
				
		assertEquals("Printed Summer Dress", summerDresses.summerdresses2());
		
		extent.endTest(test);
		extent.flush();
		
	}

}