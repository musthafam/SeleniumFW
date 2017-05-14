package com.practise.selenium.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected WebDriver driver;
	
	@BeforeMethod
	public void testsetup(){
		System.setProperty("webdriver.chrome.driver", "D:\\javaprac\\Practise\\selenium\\SeleniumFW\\SeleniumProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
