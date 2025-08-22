package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngEnabled {
	
	@Test
	public void test1()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 1");
		
	}
	
	@Test
	public void test2()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 2");
		
	}
	
	@Test(enabled = false)
	public void test3()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 3");
		
	}
	

}
