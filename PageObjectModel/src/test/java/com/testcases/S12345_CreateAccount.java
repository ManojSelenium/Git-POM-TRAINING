package com.testcases;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dao.CreateUserBean;
import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.SigninPage;
import com.utils.TestBase;

import net.bytebuddy.utility.RandomString;

public class S12345_CreateAccount extends TestBase {

	WebDriver driver=null;
	

	@BeforeMethod
	public void beforeMethod() {
		driver=initilizeDriver(); //Instance Driver
		System.out.println("Driver From Test Case ::: "+driver);
		enterURL("http://automationpractice.com/index.php");
	}


	@Test(description = "Create Account Test Case")
	public void tc_1() {	
		//Click Signin Link
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickSignIn();

		//Entre Email Address
		SigninPage signinPage=new SigninPage(driver);
		
		CreateUserBean createUserBean=new CreateUserBean();
		
		createUserBean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		createUserBean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setLastName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setPassword("Test@123");
		createUserBean.setAddress("address");
		createUserBean.setCity("city");
		createUserBean.setState("5");
				
		signinPage.enterEmailAddress(createUserBean);
		
		CreateAccountPage createAccountPage=signinPage.clickCreateAccountButton();
		//Click Create An Account

		//Enter FirstName
		//CreateAccountPage createAccountPage=new CreateAccountPage(driver);
		createAccountPage.enterFirstName(createUserBean);
		createAccountPage.enterLastName(createUserBean);
		createAccountPage.enterPassword(createUserBean);
		createAccountPage.enterAddress(createUserBean);
		createAccountPage.enterCity(createUserBean);
	
		//Enter LastName
		
		Assert.assertEquals("", createUserBean.getFirstName()+" "+createUserBean.getLastName());
	}


	//@Test
	public void tc_2() {

	}
	
	@Test
	public void tc_3() {
		
	}
}
