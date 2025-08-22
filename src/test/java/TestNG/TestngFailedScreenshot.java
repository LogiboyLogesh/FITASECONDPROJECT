package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngFailedScreenshot {
	
	public static WebDriver driver;
	
	@Test
	public void browserLaunch() throws Throwable  {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
		Assert.assertTrue(false);
		System.out.println("Browser Launch Failed");
		
		
	}
	
	/*
	 
	<suite name="Suite">
	<listeners>
		<listener class-name="TestNG.TestngListeners"></listener>
	</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestNG.TestngFailedScreenshot"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 
	 */
	
	
	
	
	
	

}
