package com.bankingproject.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.loginPagePom;

public class LoginPageTest extends BaseClass {
	
	loginPagePom LoginPagePom;
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void testTitle() {
		String pageTitle = driver.getTitle();
		if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page")) {
			System.out.println("we are on correct page");
		}
		else {
			System.out.println("wrong page");
		}
	}
	@Test
	public void currentUrl() {
		String pageTitle = driver.getCurrentUrl();
		if(pageTitle.equalsIgnoreCase("https://demo.guru99.com/V1/index.php")) {
			System.out.println("we are on correct page");
		}
		else {
			System.out.println("wrong page");
		}
	}
	
	@Test
	public void clickOnGetCredential() throws InterruptedException {
		LoginPagePom = new loginPagePom();
		LoginPagePom.clickOnGetCredential();
		Thread.sleep(5000);
	}
	
	@Test
	public void clickOnLoginButton() {
		LoginPagePom = new loginPagePom();
		LoginPagePom.clickOnLoginButton();
	}
}
