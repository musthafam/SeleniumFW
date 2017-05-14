package myAuto.practice.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practise.selenium.framework.BaseClass;

public class TC1 extends BaseClass{
	/*@BeforeTest
	public void BrowserInitite()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaprac\\Practise\\selenium\\SeleniumFW\\SeleniumProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}*/
	@Test
	public void init() throws InterruptedException
	{
	    System.out.print("++++++++++++++++++++Start++++++++++++++++++++++++");
	    Thread.sleep(5000);
		driver.get("https://www.facebook.com/");	
	}
}
