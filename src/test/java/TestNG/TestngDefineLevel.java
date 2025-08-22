package TestNG;

import org.testng.annotations.Test;

public class TestngDefineLevel {
	
	
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
		  <define name="1">
			  <include name="Req"></include>
		  </define>
		  
		  <define name="2">
			  <include name="Smo"></include>
		  </define>
		  
		  <define name="3">
			  <include name="San"></include>
		  </define>
		  
		  <run>
			  <include name="1"></include>
			  </run>
		  
		  </groups>
    <classes>
      <class name="TestNG.TestngDefineLevel"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->



<suite name="Suite">
  <test thread-count="5" name="Test">
	  
	  <groups>
		  <define name="1">
			  <include name="Req"></include>
		  </define>
		  
		  <define name="2">
			  <include name="Smo"></include>
		  </define>
		  
		  <define name="3">
			  <include name="San"></include>
		  </define>
		  
		  <run>
			  <exclude name="1"></exclude>
			  </run>
		  
		  </groups>
    <classes>
      <class name="TestNG.TestngDefineLevel"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->



	 */

}
