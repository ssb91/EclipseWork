package com.qa.test.mercury;

//import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MercuryTest {

	ChromeDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")
	private WebElement loginconfirm;
	
		

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

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		test = extent.startTest("Verify application Title");

		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home();

		test.log(LogStatus.INFO, "clicked tab successful");

		Register RegisterPage = PageFactory.initElements(driver, Register.class);
		RegisterPage.register("firstname", "lastname", "phone", "email", "address", "city", "state", "postcode",
				"country", "username", "password", "password");

		test.log(LogStatus.INFO, "details entered and buttons clicked successfully");
		
		Login loginPage = PageFactory.initElements(driver, Login.class);
		loginPage.login("username", "password");

		
		assertEquals ("Welcome back to Mercury Tours!", loginconfirm.getText());
		
//		assertEquals ("Find a Flight: Mercury Tours: ", driver.getTitle());

		test.log(LogStatus.PASS, "user logged in successfully");

		extent.endTest(test);
		extent.flush();

		

	}
		
		
		
			
}