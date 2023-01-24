package com.bankingproject.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class loginPagePom extends BaseClass {
		
	public loginPagePom() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@name='uid']")
		WebElement userId;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath="//input[@name='btnLogin']")
		WebElement loginButton;
		
		@FindBy(xpath="//input[@name='btnReset']")
		WebElement resetButton;
		
		@FindBy(xpath="//a[text()='here']")
		WebElement getCredentialLink;
		
		
		public BankHomePagePom clickOnGetCredential()  {
			getCredentialLink.click();
			return new BankHomePagePom();
		}

		public void clickOnLoginButton() {
			loginButton.click();
			
		}	
}
