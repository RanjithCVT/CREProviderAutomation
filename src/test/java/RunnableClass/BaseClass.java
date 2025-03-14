package RunnableClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public AndroidDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void setup() throws MalformedURLException {
		String appiumURL = "http://127.0.0.1:4723";
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:app",
				"C:\\Users\\Ranji\\eclipse-workspace\\Android-Project\\AndroidTest_Eclipse\\APK\\CRE Provider DEBUG (Rewrite 3 ).apk");

		driver = new AndroidDriver(new URL(appiumURL), dc);
		//Test Comment 

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
