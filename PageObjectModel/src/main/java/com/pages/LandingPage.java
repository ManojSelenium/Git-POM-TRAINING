package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.LandingPageProperties;
import com.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	
	WebDriver driver;  //Instance Varaible
	
	public LandingPage(WebDriver driver) { //Local Varaible
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignIn() {
		click(SIGNIN_LOCATOR);
	}
	
	public void clickContactUs() {
		click(SIGNIN_LOCATOR);
	}
}
