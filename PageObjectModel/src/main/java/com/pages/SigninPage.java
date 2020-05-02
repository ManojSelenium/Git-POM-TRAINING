package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dao.CreateUserBean;
import com.objrepo.SigninPageProperties;
import com.utils.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
									
	public void enterEmailAddress(CreateUserBean createUserBean) {
		 new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
		enterText(EMAILID_LOCATOR, createUserBean.getEmailAddress());
	}
	
	
	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNTBUTTON_LOCATOR);
		return new CreateAccountPage(driver);
	}
}
