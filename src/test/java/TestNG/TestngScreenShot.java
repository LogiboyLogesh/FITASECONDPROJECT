package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestngScreenShot extends TestngFailedScreenshot{
	
	
	
	public void getScreen() throws IOException {
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		//String screenshotfile = dateFormat.format(date);	
		String screenshotfile = date.toString().replace(" ", "_").replace(":", "_");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ExtentReport//Screenshots//"+screenshotfile+ ".png"));
	}
	

}
