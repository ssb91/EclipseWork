package com.qa.test.mercury;
	
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;

	public class Register {

		
			@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
			private WebElement enterfirstname;
			
			@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
			private WebElement enterlastname;
			
			@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")
			private WebElement phone;
			
			@FindBy (xpath = "//*[@id=\"userName\"]")
			private WebElement enteremail;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
			private WebElement enteraddress;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
			private WebElement entercity;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")
			private WebElement enterstate;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")
			private WebElement enterpostcode;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")
			private WebElement entercountry;
			
			@FindBy (xpath = "//*[@id=\"email\"]")
			private WebElement enterusername;
			
			@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
			private WebElement enterpassword;
			
			@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
			private WebElement enterconfirmpassword;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
			private WebElement clicksubmit;
			
			@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
			private WebElement signoff;
			
			
			
			public void register (String firstname, String lastname, String phone, String email, 
					String address, String city, String state, String postcode, String country, 
					String username, String password, String confirmpassword) {
			
			enterfirstname.sendKeys(firstname);
			
			enterlastname.sendKeys(lastname);
			
			enterpassword.sendKeys(phone);
			
			enteremail.sendKeys(email);
			
			enteraddress.sendKeys(address);
			
			entercity.sendKeys(city);
			
			enterstate.sendKeys(state);
			
			enterpostcode.sendKeys(postcode);
			
			entercountry.sendKeys(country);
			
			enterusername.sendKeys(username);
			
			enterpassword.sendKeys(password);
			
			enterconfirmpassword.sendKeys(confirmpassword);
			
			clicksubmit.click();
			
			signoff.click();
			
			
			

			}
			
			

			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}