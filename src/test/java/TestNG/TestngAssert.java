package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssert {
	
	
	@Test
	public void test1()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 1");
		
		
	}
	
	
	@Test
	public void test2()  {
	
		Assert.assertTrue(false);
		System.out.println("Test 2");
		
		
	}
	
	
	@Test
	public void test3()  {
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		System.out.println("Test 3");
		
	}
	
	
	@Test
	public void test4()  {
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		System.out.println("Test 4");
		softAssert.assertAll();
		
	}
	
	

}
