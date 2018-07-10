package com.qa.test.webtest2;

//import static org.junit.Assert.*;

import org.junit.Before;


import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SelectItem {
	
	ChromeDriver driver;
	
	ExtentReports extent;
	ExtentTest test;

	@Before
	public void setup() {

		// initialize ExtentReports with a file path
		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true);

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@After 
	public void teardown() {
		
		
	}
	
	
	@Test

	public void testDemo() {
			
		driver.get("http://automationpractice.com/index.php");

		test = extent.startTest("Verify application Title");
		
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home();
		
		test.log(LogStatus.INFO, "dress tab clicked successfully");
		
		Dresses summerDresses = PageFactory.initElements(driver, Dresses.class);
		summerDresses.dresses();
		
		test.log(LogStatus.INFO, "summer dress tab clicked successfully");
		
		SummerDresses dress1 = PageFactory.initElements(driver, SummerDresses.class);
		dress1.summerdresses();
				
		test.log(LogStatus.INFO, "sample dress 1 tab clicked successfully");
		
		Cart loadcart = PageFactory.initElements(driver, Cart.class);
		loadcart.cart();		
		
		test.log(LogStatus.PASS, "cart tab clicked successfully");

		extent.endTest(test);
		extent.flush();
		
	}

}