package RunnableClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class ScreenshotClass {

	public AndroidDriver driver;

	public ScreenshotClass(AndroidDriver driver) {
		this.driver = driver;
	}

	public String GetScreenshot(String testName) throws Exception {

		try {
			String srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String fileName = "screenshots/" + testName + "_" + timestamp + ".png";
			fileName=srcFile;
			return fileName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return testName;
	}

}
