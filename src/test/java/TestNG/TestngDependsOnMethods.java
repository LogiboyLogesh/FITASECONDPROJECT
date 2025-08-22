package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDependsOnMethods {
	
	@Test
	public void test1()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 1");
		
	}
	
	
	@Test(dependsOnMethods = "test1")
	public void test2()  {
	
		Assert.assertTrue(false);
		System.out.println("Test 2");
		
	}
	
	
	@Test(dependsOnMethods = "test2")
	public void test3()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 3");
		
	}

}
