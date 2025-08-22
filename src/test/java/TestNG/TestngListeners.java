package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners extends TestngScreenShot implements ITestListener {
	
public void onStart(ITestContext context) {
		
		System.out.println("onStart");
	}
	
public void onTestStart(ITestResult result) {
		
		System.out.println("onTestStart");
	}


public void onTestSkipped(ITestResult result) {
	
	System.out.println("onTestSkipped");
}


	public void onTestSuccess(ITestResult result) {
		

		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailure");
		
		try
		{
			getScreen();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	

	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish");
	}

}
