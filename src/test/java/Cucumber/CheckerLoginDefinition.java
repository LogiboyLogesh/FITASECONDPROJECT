package Cucumber;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckerLoginDefinition {
	
	public static WebDriver driver;
	
	@Given("the first checker user enters login url")
	public void the_first_checker_user_enters_login_url() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the first checker user enters username and password")
	public void the_first_checker_user_enters_username_and_password(DataTable dataTable) {
		
		List<String> list = dataTable.transpose().asList(String.class);
		driver.findElement(By.id("username")).sendKeys(list.get(0));
		driver.findElement(By.id("password")).sendKeys(list.get(1));
	    
	}
	
	@When("the first checker user clicks login button")
	public void the_first_checker_user_clicks_login_button() {
		
		driver.findElement(By.id("submit")).click();
	   
	}
	
	@Then("the first checker user should validate the home page")
	public void the_first_checker_user_should_validate_the_home_page() throws Throwable {
		
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("First Checker User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
	    
	}
	
	
	@Given("the second checker user enters login url")
	public void the_second_checker_user_enters_login_url() {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	
	@When("the second checker user enters username and password")
	public void the_second_checker_user_enters_username_and_password(DataTable dataTable) {
	    
		Map<String, String> map = dataTable.transpose().asMap(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(map.get("username"));
		driver.findElement(By.id("password")).sendKeys(map.get("password")); 
		
	}
	
	@When("the second checker user clicks login button")
	public void the_second_checker_user_clicks_login_button() {
	    
		
		driver.findElement(By.id("submit")).click();
	}
	
	@Then("the second checker user should validate the home page")
	public void the_second_checker_user_should_validate_the_home_page() throws Throwable {
	    
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("Second Checker User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
		
	}
	
	
	

}
