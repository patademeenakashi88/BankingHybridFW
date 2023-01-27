package com.bankingproject.loginPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.BankHomePagePom;
import com.bankingproject.pom.CredentialPom;
import com.bankingproject.pom.loginPagePom;
import com.bankingproject.utility.Utility;

public class HomePageTest extends BaseClass {
		
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	@Test
	public void testGetCredentials() throws InterruptedException, EncryptedDocumentException, IOException {
	loginPagePom LoginPagePom =new loginPagePom();
	BankHomePagePom bankHomePagePom =LoginPagePom.clickOnGetCredential();
	Thread.sleep(2000);
	Utility utility=new Utility();
	String email=(String) utility.getStringCellDataFromExcel(1,0,"Sheet1");
	bankHomePagePom.setEmailId(email);
	Thread.sleep(2000);
	CredentialPom credentialPom= bankHomePagePom.clickSubmit();
	Thread.sleep(2000);
	credentialPom.saveCredential();
	Thread.sleep(3000);
	
	}
	
	
	
}
