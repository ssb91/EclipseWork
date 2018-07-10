package com.qa.test.webtest2;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class SummerDresses {

	
		@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
		private WebElement clickDress1Tab;

		public void summerdresses () {
				
			clickDress1Tab.click();

			
		}
	
}



