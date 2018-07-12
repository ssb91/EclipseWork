package com.qa.test.webtest2;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

public class SummerDresses {

	
		@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
		private WebElement clickSampleTab;

		@FindBy (xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
		private WebElement textSampleTab;
				
		public void summerdresses () {				
			clickSampleTab.click();			
		}
		
		public String summerdresses2 () {			
			return textSampleTab.getText();			
		}
	
}



