package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
			
		features	= "src\\test\\java\\Cucumber" ,
		glue		= {"Cucumber"},
		plugin		= {"pretty","html:CucumberReports",
						   "json:reports/result.json",
						   "junit:reports/result.xml"
					  },
		dryRun		= false,
		monochrome	= true,
		tags 		= "@MAKERTWO"
		
		// Feature Level 	// tags 		= "@MAKERLOGIN"
		// Scenario Level 	// tags 		= "@MAKERONE"
		// OR Level			// tags 		= "@CHECKERONE or @CHECKERTHREE"
		// ~ Level			// tags 		= "~@CHECKERONE or @CHECKERTWO"
		// AND Level		// tags 		= "@ADMINONE and @ADMINFIRST"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	

}
