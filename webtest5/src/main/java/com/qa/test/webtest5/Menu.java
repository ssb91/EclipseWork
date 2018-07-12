package com.qa.test.webtest5;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Menu {

		@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
		private WebElement menuTitle;

		@FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
		private WebElement clickCheckOutGreen;


		public String menu () {
						
			return menuTitle.getText();
					
		}
	
		public void menu2 () {
			
			clickCheckOutGreen.click();
		
		}

		
}
