package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
}
