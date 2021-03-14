package pageObjectFiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void takeScreenshot(WebDriver driver, String ScreenshorName)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenShotName = new File ("//Users//yuvensharma//git//SeleniumJava1//SpringD//test-output"+ ScreenshorName + ".png");
		try {
			FileUtils.copyFile(scrFile, screenShotName);
			System.out.println("Screen =shot taken");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("exceptions while taking SS");
		}

	}

}
