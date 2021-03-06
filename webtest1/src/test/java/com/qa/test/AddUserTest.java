package com.qa.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddUserTest {

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

		driver.get("http://thedemosite.co.uk/");

		test = extent.startTest("verify login");

		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home();

		test.log(LogStatus.INFO, "clicked tab successful");

		AddUser addPage = PageFactory.initElements(driver, AddUser.class);
		addPage.addUser("usernumber1", "password123");

		test.log(LogStatus.INFO, "details entered and buttons clicked successfully");

		Login loginPage = PageFactory.initElements(driver, Login.class);
		loginPage.loginUser("usernumber1", "password123");

		assertEquals("Successful Login", loginPage.loginUser2());
		
		test.log(LogStatus.PASS, "user logged successfully");
		
		extent.endTest(test);
		extent.flush();

	}

}