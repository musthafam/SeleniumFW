package com.practise.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	protected WebDriver driver;
	
	String Chromprop = "webdriver.chrome.driver";
	String ChromeDriverPath=".\\src\\main\\resources\\ChromeDriver\\chromedriver.exe";
	String Geckoprop = "webdriver.gecko.driver";
	String GeckoDriverPath=".\\src\\main\\resources\\geckodriver\\geckodriver.exe";
	
	@BeforeMethod
	@Parameters("browser")
	public void setupBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty(Chromprop, ChromeDriverPath);
		driver = new ChromeDriver();
		}
		else
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty(Geckoprop, GeckoDriverPath);
			driver = new FirefoxDriver();
			}
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
