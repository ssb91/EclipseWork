package com.qa.test.webtest3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Widgets {

	@FindBy(xpath = "//*[@id=\"menu-item-144\"]/a")
	private WebElement clickAccordion;
	
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	private WebElement clickSection1;

	@FindBy(xpath = "//*[@id=\"ui-id-6\"]")
	private WebElement clickSection2;
	
	@FindBy(xpath = "//*[@id=\"ui-id-8\"]")
	private WebElement clickSection3;
	
	@FindBy(xpath = "//*[@id=\"ui-id-10\"]")
	private WebElement clickSection4;
	
	@FindBy(xpath = "//*[@id=\"ui-id-2\"]")
	private WebElement clickCustomizeIcons;
		
	@FindBy(xpath = "//*[@id=\"ui-id-3\"]")
	private WebElement clickFillSpace;
	
	public void selectable() {

		clickAccordion.click();
		clickSection1.click();
		clickSection2.click();
		clickSection3.click();
		clickSection4.click();
		clickCustomizeIcons.click();
		clickFillSpace.click();
				

}
}
