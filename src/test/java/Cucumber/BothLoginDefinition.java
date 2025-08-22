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

public class BothLoginDefinition {
	
	public static WebDriver driver;
	
	
	@Given("the first both user enters login url")
	public void the_first_both_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the first both user enters username and password")
	public void the_first_both_user_enters_username_and_password(DataTable dataTable) {
	    
		List<List<String>> list = dataTable.transpose().asLists(String.class);
		driver.findElement(By.id("username")).sendKeys(list.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(list.get(1).get(0));
		
	}
	
	@When("the first both user clicks login button")
	public void the_first_both_user_clicks_login_button() {
	    
		driver.findElement(By.id("submit")).click();
	}
	
	@Then("the first both user should validate the home page")
	public void the_first_both_user_should_validate_the_home_page() throws Throwable {
	    
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("First Both User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
	}
	
	
	@Given("the second both user enters login url")
	public void the_second_both_user_enters_login_url() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Projects\\CGIProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("the second both user enters username and password")
	public void the_second_both_user_enters_username_and_password(DataTable dataTable) {
	    
		List<Map<String, String>> map = dataTable.transpose().asMaps(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(map.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(map.get(0).get("password")); 
		
	}
	
	@When("the second both user clicks login button")
	public void the_second_both_user_clicks_login_button() {
	    
		driver.findElement(By.id("submit")).click();
	}
	
	@Then("the second both user should validate the home page")
	public void the_second_both_user_should_validate_the_home_page() throws Throwable {
	    
		WebElement homePageElement = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		String homePageActual = homePageElement.getText();
		String homePageExpected = "Logged In Successfully";
		Assert.assertEquals(homePageActual, homePageExpected);
		System.out.println("Second Both User Home Page Validation Successfully");
		Thread.sleep(1000);
		driver.close();
	}


}
