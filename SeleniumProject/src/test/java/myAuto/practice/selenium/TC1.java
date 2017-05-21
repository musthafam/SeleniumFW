package myAuto.practice.selenium;

import org.testng.annotations.Test;
import com.practise.selenium.framework.BaseClass;
import com.practise.selenium.framework.Excelutility;

public class TC1 extends BaseClass{
	/*WebDriver driver;
	@BeforeTest
	public void BrowserInitite()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Me\\SeleniumProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}*/
	@Test
	public void FirstTestCase() throws InterruptedException
	{
	    System.out.print("++++++++++++++++++++Start++++++++++++++++++++++++");
	    Thread.sleep(5000);
		driver.get("https://www.twitter.com/");	
		System.out.print("++++++++++++++++++++Excel++++++++++++++++++++++++");
	    String output = Excelutility.getCellData(1, 1);
	    System.out.print(output);	
	}
	
	
}
