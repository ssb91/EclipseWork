package com.qa.test.webtest2;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Cart {

	
		@FindBy (xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
		private WebElement clickCartTab;
		
		@FindBy (xpath = "//*[@id=\"search_query_top\"]")
		private WebElement searchBar;
		
		@FindBy (xpath = "//*[@id=\"searchbox\"]/button")
		private WebElement searchButton;
				
		public void cart () {
			
			clickCartTab.click();
			searchBar.sendKeys("Printed Summer Dress");
			searchButton.click();
			
		}
	
}



