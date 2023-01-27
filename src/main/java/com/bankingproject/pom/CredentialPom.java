package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class CredentialPom extends BaseClass {
	
	public void CredentialPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@border='1']/tbody/tr[4]/td[2]")	
	WebElement UserId;
	
	@FindBy(xpath="//table[@border='1']/tbody/tr[5]/td[2]")
	WebElement password;
	//table[@border='1']/tbody/tr[4]/td[2]
	 public void saveCredential() {
		String userId= UserId.getText();
		String Password= password.getText();
		System.out.println(userId+" ,"+Password);
	 }
	
	}
