package Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	/*
	 
	// Before Hook and After Hook
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario Hook");
		
	}
	
	@After
	public void afterScenario() {
		
		
		System.out.println("After Scenario Hook");

	}
	
	*/
	
	
	/*
	
	// Before Step and After Step
	
	@BeforeStep
	public void beforeScenarioStep() {
		
		System.out.println("Before Step Hook");
		
	}
	
	@AfterStep
	public void afterScenarioStep() {
		
		System.out.println("After Step Hook");
		
	}	
	
	*/
	
	
	/*
	
	// Order Hook
	
	@Before(order = 1)
	public void beforeScenario() {
		
		System.out.println("Before Scenario First Hook");
		
	}
	
	
	@Before(order = 2)
	public void before() {
		
		System.out.println("Before Scenario Second Hook");
		
	}
	
	@After(order = 2)
	public void after() {
		
		
		System.out.println("After Scenario First Hook");

	}
	
	@After(order = 1)
	public void afterScenario() {
		
		
		System.out.println("After Scenario Second Hook");

	}
	
	*/
	
	
	/*
	
	// Tagged Hook
	
	@Before("@MAKERONE")
	public void beforeMakerOneScenario() {
		
		System.out.println("Before Scenario First Maker Hook");
		
	}	
		
	@After("@MAKERONE")
	public void afterMakerOneScenario() {
		
		
		System.out.println("After Scenario First Maker Hook");

	}
	
	@Before("@MAKERTWO")
	public void beforeMakerTwoScenario() {
		
		System.out.println("Before Scenario Second Maker Hook");
		
	}	
		
	@After("@MAKERTWO")
	public void afterMakerTwoScenario() {
		
		
		System.out.println("After Scenario Second Maker Hook");

	}
	
	
	*/
	
	
	/*
	
	// Order Hook and Tagged Hook
	
	@Before(value ="@MAKERONE" ,order = 1)
	public void beforeScenario() {
		
		System.out.println("Before Scenario First Hook");
		
	}
	
	
	@Before(value ="@MAKERONE" ,order = 2)
	public void before() {
		
		System.out.println("Before Scenario Second Hook");
		
	}
	
	@After(value ="@MAKERONE" ,order = 2)
	public void after() {
		
		
		System.out.println("After Scenario First Hook");

	}
	
	@After(value ="@MAKERONE" ,order = 1)
	public void afterScenario() {
		
		
		System.out.println("After Scenario Second Hook");

	}
	
	*/
	

	

}
