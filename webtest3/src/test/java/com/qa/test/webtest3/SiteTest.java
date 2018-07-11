package com.qa.test.webtest3;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
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
	
	Actions action = null;
	Actions action2;
	Actions action3;
	
	@Before
	public void setup() {

		// initialize ExtentReports with a file path
		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true);

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		action = new Actions(driver);
		action2 = new Actions(driver);
		action3 = new Actions(driver);

	}
	
	@After 
	public void teardown() {
		
		
	}
	
	
	@Test

	public void testDemo() {
			
		driver.get("http://demoqa.com/");


		test = extent.startTest("verify click sequence");
		
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home();

		test = extent.startTest("click droppable successful");
		
		Droppable clickMove = PageFactory.initElements(driver, Droppable.class);
		clickMove.droppable(action);
		
		test = extent.startTest("drag and drop of box into square successful, click selectable successful");
		
		Selectable clickSelect = PageFactory.initElements(driver, Selectable.class);
		clickSelect.selectable(action2, action3);

		test = extent.startTest("select squares successful");
		
		
		
		extent.endTest(test);
		extent.flush();

		
/*		
			
		test = extent.startTest("Verify click sequence for registration");
		
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.home();
		
		test.log(LogStatus.INFO, "registration tab clicked successfully");
		
		
		Registration regDetails = PageFactory.initElements(driver, Registration.class);
		regDetails.registration("firstName", "lastName", "phoneNumber", 
				"userName", "email", "about", "password", "confirmPassword");
		
//		if ("password".equals("confirmPassword")) { test.log(LogStatus.INFO, "passwords do not match"); }
		
		test.log(LogStatus.INFO, "registration details entered successfully");

//final action
		
		test.log(LogStatus.PASS, "cart tab clicked successfully");

*/		
		
		
		
	}

}