package RunnableClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String fileName = "screenshots/" + testName + "_" + timestamp + ".png";
			FileUtils.copyFile(srcFile, new File(fileName));
			return fileName;
		} catch (Exception e) {
			System.out.println(e);
		}
		return testName;
	}

}
