package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParallelBrowser {
	
	
public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void test1(String browser)  {
	
		
		if(browser.equals("ch"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			System.out.println("Chrome Browser Executed");
			
		}
		else if(browser.equals("op"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			System.out.println("Opera Browser Executed");
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			System.out.println("Firefox Browser Executed");
		}
		
		
		
		
	}
	
	
	/*
	 
	 <suite name="Suite" parallel ="tests">
	
  <test thread-count="5" name="TestChrome">
	  <parameter name="browser" value="ch"></parameter>
    <classes>
      <class name="TestNG.TestngParallelBrowser"/>
    </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="TestOpera">
	  <parameter name="browser" value="op"></parameter>
    <classes>
      <class name="TestNG.TestngParallelBrowser"/>
    </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="TestFirefox">
	  <parameter name="browser" value="ff"></parameter>
    <classes>
      <class name="TestNG.TestngParallelBrowser"/>
    </classes>
  </test> <!-- Test -->
  
</suite> <!-- Suite -->


	 */

}
