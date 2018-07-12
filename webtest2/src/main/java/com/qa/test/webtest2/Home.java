package com.qa.test.webtest2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

public class Home {

	
		@FindBy (xpath = "//*[@id=\"search_query_top\"]")
		private WebElement enterSearchBar;
		
		public void home (String item, Actions action) {
				
			enterSearchBar.sendKeys(item);
			action.sendKeys(Keys.ENTER).perform();
			
		}
	
}
