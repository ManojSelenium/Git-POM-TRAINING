package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements SetUp {

	public WebDriver driver=null;
	/**
	 * This method is responsible for creating driver object and then returns same.
	 * @return
	 */
	public WebDriver initilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Driver From TestBase ::: "+driver);
		return driver;
		
	}
	
	
	public void enterURL(String url) {
		driver.get(url);
	}
	
	public void captureScreenshot() {
		
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}
}
