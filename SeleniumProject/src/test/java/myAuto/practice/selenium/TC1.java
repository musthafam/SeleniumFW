package myAuto.practice.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	WebDriver driver;

	@BeforeTest
	public void BrowserInitite()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Me\\SeleniumProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void init()
	{
	   driver.get("https://mail.google.com");	
	}
}
