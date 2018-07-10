package com.qa.test;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy; 
import org.apache.poi.xssf.usermodel.XSSFCell; 
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 


public class AddUser {

		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
		private WebElement nameBox;
		
		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
		private WebElement passwordBox;

		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
		private WebElement saveButton;
		
		@FindBy (xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
		private WebElement toLogin;
		
		public void addUser (String username, String password) {
			
			nameBox.sendKeys(username);
			
			passwordBox.sendKeys(password);
		
			
			saveButton.click();			
			toLogin.click();			
			
		}
	
}
