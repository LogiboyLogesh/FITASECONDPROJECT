package TestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		

	}
	
	@AfterClass
	public static void afterClass() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("Done");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		Date date = new Date();
		System.out.println("Before Method Date : " + date);
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		Date date = new Date();
		System.out.println("After Method Date : " + date);
	}
	
	
	
	@Parameters({"uName","pWord"})
	@Test
	public void test(String userName, String passWord)  {
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.id("submit")).click();
		
	}
	
	/*
	<suite name="Suite">
	<parameter name="uName" value="student"></parameter>
	<parameter name="pWord" value="Password123"></parameter>
  <test thread-count="5" name="Test">
	
	 */
	

}
