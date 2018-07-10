package com.qa.test.webtest2;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Home {

	
		@FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement clickDressesTab;
		
		public void home () {
				
			clickDressesTab.click();			
//			clickSummerDressesTab.click();			
			
			
		}
	
}
