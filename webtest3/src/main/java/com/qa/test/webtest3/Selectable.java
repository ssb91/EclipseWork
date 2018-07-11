package com.qa.test.webtest3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Selectable {

	@FindBy(xpath = "//*[@id=\"selectable\"]/li[1]")
	private WebElement clickSelectbox1;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[2]")
	private WebElement clickSelectbox2;
	
	
//	@FindBy(xpath = "//*[@id=\"draggableview\"])")
//	private WebElement clickScalebox2;


	public void selectable(Actions action2, Actions action3) {


		action2.keyDown(Keys.CONTROL).perform();
		clickSelectbox1.click();
		clickSelectbox2.click();
		action3.keyUp(Keys.CONTROL).perform();

		
/*
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/

	}

private void keyDown(Keys control) {
	// TODO Auto-generated method stub
	
}

}
