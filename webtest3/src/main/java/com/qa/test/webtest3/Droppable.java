package com.qa.test.webtest3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Droppable {

	@FindBy(xpath = "//*[@id=\"draggableview\"]/p")
	private WebElement clickDropbox;

//	@FindBy(xpath = "//*[@id=\"draggableview\"])")
//	private WebElement clickDropbox2;

	
	@FindBy(xpath = "//*[@id=\"menu-item-142\"]/a")
	private WebElement clickSelectable;
	
	


	public void droppable(Actions action) {

		clickDropbox.click();
		
		action.dragAndDropBy(clickDropbox, 150, 35).perform();
		
		clickSelectable.click();

/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/

	}

}
