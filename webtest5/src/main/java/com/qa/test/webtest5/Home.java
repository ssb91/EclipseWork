package com.qa.test.webtest5;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Home {
	
		@FindBy (xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
		private WebElement clickMenu;
		
		public void home () {
						
			clickMenu.click();			
			
		}
	
}
