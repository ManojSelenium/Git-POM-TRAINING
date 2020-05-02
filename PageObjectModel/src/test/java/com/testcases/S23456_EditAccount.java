package com.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.TestBase;

public class S23456_EditAccount extends TestBase{
WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver=initilizeDriver();
		enterURL("http://automationpractice.com/index.php");
	}
	
	
	@Test(description = "Edit Account test case")
	public void tc_1() throws IOException {
		System.out.println("First Test Case");
		driver.findElement(By.id("search_query_top")).sendKeys("FirstTest");
	
	}
	
	@Test
	public void tc_2() {
		System.out.println("Second Test Case");
		driver.findElement(By.id("search_query_top")).sendKeys("test");
	}
	
	@Test
	public void tc_3() {
		System.out.println("Third Test Case");
		driver.findElement(By.id("search_query_top")).sendKeys("Tshirt");
		driver.findElement(By.xpath("//a[@class='login1']")).click();
		
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult iTestResult) throws IOException {
		System.out.println("After Method :::::::::::::: ");
		
		System.out.println("Get TestCase Method Name :::: "+iTestResult.getMethod().getMethodName());
		
		System.out.println("Get the status ::::: "+iTestResult.getStatus());
		
		if(iTestResult.getStatus()==ITestResult.FAILURE) {
			
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//  now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\PageObjectModel\\target\\screenshots\\"+iTestResult.getMethod().getMethodName()+".png"));
			
		}
		driver.quit();
	}
}
