package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class BankHomePagePom extends BaseClass{
	
	  public BankHomePagePom() {
		  PageFactory.initElements(driver, this);
	  }
		
	  @FindBy(xpath="//input[@name='emailid']")
	  WebElement emailId;
	  
	  @FindBy(xpath="//input[@name='btnLogin']")
	  WebElement submitButton;
	  
	  public void setEmailId(String email) {
		  emailId.sendKeys(email);
	  }
	  
	  public CredentialPom clickSubmit() {
		  submitButton.click();
		  return new CredentialPom();
	  }
}
