package TestNG;

import org.testng.annotations.Test;

public class TestngGroupLevel {
	
	
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
	  <groups>
		  <run>
			  <include name="Req"></include>
		  </run>
	  </groups>
    <classes>
      <class name="TestNG.TestngGroupLevel"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->



<suite name="Suite">
  <test thread-count="5" name="Test">
	  <groups>
		  <run>
			  <exclude name="Req"></exclude>
		  </run>
		  </groups>
    <classes>
      <class name="TestNG.TestngGroupLevel"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->



	 */

}
