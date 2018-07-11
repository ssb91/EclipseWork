/*
 
package com.qa.test.webtest3;
 

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

public class Registration {

	
		@FindBy (xpath = "//*[@id=\"name_3_firstname\"]")
		private WebElement enterFirstName;

		@FindBy (xpath = "//*[@id=\"name_3_lastname\"]")
		private WebElement enterLastName;
		
		
		@FindBy (xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")
		private WebElement clickMartial;
		
		@FindBy (xpath = "//*[@id=\"pie_register\"]/li[3]/div/div/input[2]")
		private WebElement clickHobby;

//insert dob
		
		@FindBy (xpath = "//*[@id=\"name_3_lastname\"]")
		private WebElement enterPhoneNumber;
		
		@FindBy (xpath = "//*[@id=\"username\"]")
		private WebElement enterUserName;
		
		@FindBy (xpath = "//*[@id=\"email_1\"]")
		private WebElement enterEmail;
		
		@FindBy (xpath = "//*[@id=\"description\"]")
		private WebElement enterAbout;
		
		@FindBy (xpath = "//*[@id=\"password_2\"]")
		private WebElement enterPassword;
		
		@FindBy (xpath = "//*[@id=\"confirm_password_password_2\"]")
		private WebElement enterConfirmPassword;
		
		@FindBy (xpath = "//*[@id=\"pie_register\"]/li[14]/div/input")
		private WebElement clickSubmit;		
		
						
		public void registration (String firstName, String lastName, String phoneNumber, 
		String userName, String email, String about, String password, String confirmPassword) {
							
			enterFirstName.sendKeys(firstName);			
			enterFirstName.sendKeys(lastName);			
			clickMartial.click();
			clickHobby.click();
//insert dob

			enterPhoneNumber.sendKeys(phoneNumber);
			enterUserName.sendKeys(userName);
			enterEmail.sendKeys(email);
			enterAbout.sendKeys(about);
			enterPassword.sendKeys(password);
			enterConfirmPassword.sendKeys(password);			
			clickSubmit.click();							
			
		}
	
}

*/