package com.qa.test.webtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webtest {
	
	ChromeDriver driver;
	WebElement searchBar;
	
	@Before
	public void setup () {
		
		System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After 
	public void teardown() {
		
//		driver.quit();		
		
	}
	
	@Test
	
	public void methodtest() {
		
		driver.manage().window().maximize();
//		driver.get("https://www.bbc.co.uk/weather");
//		driver.get("https://www.google.co.uk/maps");

//		<div id="fkbx-text">Search Google or type URL</div>
		
		driver.get("https://www.google.com");		
		
		driver.findElement(By.id("lst-ib")).sendKeys("search");
//		searchBar.submit();
		
//		driver.findElement(By.name("btnK")).click();

			
//		assertEquals("search", checkElement.getText());
		
		
}

}