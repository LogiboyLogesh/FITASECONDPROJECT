package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestngIRetryAnalyzer implements IRetryAnalyzer{

	
	int a=1;
	int b=3;
	public boolean retry(ITestResult result) {
		
		while(a <= b)
		{
			a++;
			return true;
		}
		
		
		return false;
	}

}
