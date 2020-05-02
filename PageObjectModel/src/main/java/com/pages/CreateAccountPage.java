package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dao.CreateUserBean;
import com.objrepo.CreateAccountPageProperties;
import com.utils.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(CreateUserBean createUserBean) {
		System.out.println("FIRST NAME ENTERED");
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
		enterText(FIRSTNAME_LOCATOR, createUserBean.getFirstName());
		
	}
	
	public void enterLastName(CreateUserBean createUserBean) {
		enterText(LASTNAME_LOCATOR,createUserBean.getLastName());
	}
	public void enterPassword(CreateUserBean createUserBean) {
		enterText(PASSWORD_LOCATOR, createUserBean.getPassword());
	}
	public void enterAddress(CreateUserBean createUserBean) {
		enterText(ADDRESS_LOCATOR, createUserBean.getAddress());
	}
	public void enterCity(CreateUserBean createUserBean) {
		enterText(CITY_LOCATOR, createUserBean.getCity());
	}
}
