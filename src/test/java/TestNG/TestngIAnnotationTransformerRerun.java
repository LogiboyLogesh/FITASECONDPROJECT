package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngIAnnotationTransformerRerun {
	
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
	
		Assert.assertTrue(false);
		System.out.println("Test 3");
		
	}
	
	
	/*
	 <suite name="Suite">
	<listeners>
		
		<listener class-name="TestNG.TestngIAnnotationTransformer"></listener>
		
	</listeners>
  <test thread-count="5" name="Test">
	
	
	 */

}
