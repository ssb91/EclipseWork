package com.qa.test.webtest5;

import cucumber.api.java.Before;

import cucumber.api.java.After;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;



public class TeaTest {

	ChromeDriver driver;
//	ExtentReports extent;
//	ExtentTest test;

	@Before
	public void setup() {
//		extent = new ExtentReports("C:/Users/Admin/Documents/Reports.html", true);

		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
			
	}

	@After
	public void teardown() {

	}

//Scenario: Browse the items available on the website	
	
		@Given("^the correct web address$")
		public void the_correct_web_address() {
			
			driver.get("http://www.practiceselenium.com/welcome.html");				
		
		}
		
		
		@When("^I navigate to the 'Menu' page$") 
		
		public void navigate_to_the_menu_page() {
			
			Home homePage = PageFactory.initElements(driver, Home.class);
			homePage.home();
			
		}
				
		@Then("^I can browse a list of the available products.$") 
		public void browse_a_list_of_the_available_products() {

		Menu menuPage = PageFactory.initElements(driver, Menu.class);
		menuPage.menu();

		assertEquals("Menu" , menuPage.menu());
		
		}


//Scenario: Add an item to the checkout

	@When("^I click the checkout button$")

	public void click_the_checkout_button() {

		Menu menuPage = PageFactory.initElements(driver, Menu.class);
		menuPage.menu2();

	}

	@Then("^I am taken to the checkout page$")
	public void to_the_checkout_page() {

		CheckOut checkoutPage = PageFactory.initElements(driver, CheckOut.class);
		checkoutPage.checkout();

		assertEquals("Pay with Credit Card or Log In" , checkoutPage.checkout());

	}

}