package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLoginDefinition {
	
	public static WebDriver driver;
	
	@Given("the admin users verify background steps")
	public void the_admin_users_verify_background_steps() {
	    
		System.out.println("Verified Background Steps By Admin Users");
	}
	
	@Given("the first admin user enters login url")
	public void the_first_admin_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the first admin user enters {string} username and {string} password")
	public void the_first_admin_user_enters_username_and_password(String username, String password) {
	    
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("the first admin user clicks login button")
	public void the_first_admin_user_clicks_login_button() {

		driver.findElement(By.id("submit")).click();
		
	}
	
	@Then("the first admin user should validate the home page")
	public void the_first_admin_user_should_validate_the_home_page() throws Throwable {

		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("First Admin User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
		
	}

	
	
	@Given("the second admin user enters login url")
	public void the_second_admin_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the second admin user enters {string} username and {string} password")
	public void the_second_admin_user_enters_username_and_password(String username, String password) {
	    
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("the second admin user clicks login button")
	public void the_second_admin_user_clicks_login_button() {

		driver.findElement(By.id("submit")).click();
		
	}
	
	@Then("the second admin user should validate the home page")
	public void the_second_admin_user_should_validate_the_home_page() throws Throwable {

		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("Second Admin User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
		
	}
	
	
	
}
