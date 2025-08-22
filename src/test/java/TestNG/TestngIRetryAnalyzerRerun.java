package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngIRetryAnalyzerRerun {
	
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
	
	@Test(retryAnalyzer = TestngIRetryAnalyzer.class)
	public void test3()  {
	
		Assert.assertTrue(false);
		System.out.println("Test 3");
		
	}

}
