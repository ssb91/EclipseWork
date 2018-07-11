package com.qa.test.webtest3;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

public class Home {

	
		@FindBy (xpath = "//*[@id=\"menu-item-141\"]/a")
		private WebElement clickDroppable;
			
//		@FindBy (xpath = "//*[@id=\"menu-item-374\"]/a")
//		private WebElement clickRegistration;

		


		
		public void home () {
				

			
			clickDroppable.click();			
			
//			action.dragAndDropBy(clickDropbox, 300, 200).perform();
			
//			clickRegistration.click();			
			
			
		}
	
}
