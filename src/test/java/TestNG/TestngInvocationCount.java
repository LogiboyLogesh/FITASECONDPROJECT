package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngInvocationCount {
	
	@Test
	public void test1()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 1");
		
	}
	
	@Test(invocationCount = 2)
	public void test2()  {
	
		Assert.assertTrue(true);
		System.out.println("Test 2");
		
	}
	
	

}
