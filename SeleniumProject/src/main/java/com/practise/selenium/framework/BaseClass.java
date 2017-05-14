package com.practise.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setupDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\javaprac\\Practise\\selenium\\SeleniumFW\\SeleniumProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@BeforeTest
	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterMethod(alwaysRun = true)
	public void postTestCase(ITestResult _result) {
		if (driver != null) {
			driver.quit();
		}
	}

}
