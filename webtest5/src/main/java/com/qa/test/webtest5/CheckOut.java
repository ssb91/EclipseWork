package com.qa.test.webtest5;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class CheckOut {

	
		@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")
		private WebElement checkOutStatement;
		
		public String checkout () {

			return checkOutStatement.getText();
			
		}
	
}
