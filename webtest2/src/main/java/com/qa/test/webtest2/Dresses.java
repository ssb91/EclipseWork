package com.qa.test.webtest2;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Dresses {

	
		@FindBy (xpath = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")
		private WebElement clickSummerDressesTab;

				
		public void dresses () {
				
			clickSummerDressesTab.click();
			
			
		}
	
}

