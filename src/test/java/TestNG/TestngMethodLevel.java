package TestNG;

import org.testng.annotations.Test;

public class TestngMethodLevel {
	
	
	@Test(groups = {"Req"})
	public void Req() {
	
		System.out.println("Regression");
		
	}
	
	@Test(groups = {"Smo"})
	public void Smo() {
	
		System.out.println("Smoke");
		
	}
	
	@Test(groups = {"San"})
	public void San() {
	
		System.out.println("Sanity");
		
	}
	
	
	/*
	 
	 <suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestNG.TestngMethodLevel">
		  <methods>
			  <include name="Req"></include>
		  </methods>
	  </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestNG.TestngMethodLevel">
		  <methods>
			  <exclude name="Req"></exclude>
		  </methods>
	  </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

	 
	 
	 */

}
