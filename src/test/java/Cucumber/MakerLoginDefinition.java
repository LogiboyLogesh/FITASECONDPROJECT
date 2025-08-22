package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakerLoginDefinition {
	
	public static WebDriver driver;
	
	
	 
	@Given("the first maker user enters login url")
	public void the_first_maker_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGISelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@When("the first maker user enters username and password")
	public void the_first_maker_user_enters_username_and_password() {
	    
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
	}
	@When("the first maker user clicks login button")
	public void the_first_maker_user_clicks_login_button() {
	    
		driver.findElement(By.id("submit")).click();
	}
	
	@Then("the first maker user should validate the home page")
	public void the_first_maker_user_should_validate_the_home_page() throws Throwable {
	    
		
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("First Maker User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
		
		
	}
	
	
	
	
	@Given("the second maker user enters login url")
	public void the_second_maker_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGISelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the second maker user enters {string} username and {string} password")
	public void the_second_maker_user_enters_username_and_password(String username, String password) {
	  
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("the second maker user clicks login button")
	public void the_second_maker_user_clicks_login_button() {
	    
		driver.findElement(By.id("submit")).click();
	}
	@Then("the second maker user should validate the home page")
	public void the_second_maker_user_should_validate_the_home_page() throws Throwable {
	    
		
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("Second Maker User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
