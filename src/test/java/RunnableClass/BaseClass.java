package RunnableClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public AndroidDriver driver;
	public WebDriverWait wait;
	public ExtentReports extent;
	public ExtentSparkReporter htmlreporter;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		//Setting Capabilities
		String appiumURL = "http://127.0.0.1:4723";
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:app", System.getProperty("user.dir")+"\\APK\\Provider.apk");

		//TestReport generation 
		extent=new ExtentReports();
		String Date=new SimpleDateFormat("yyyy-MM-dd__(HH.mm.ss)").format(new Date());
		String Reportname = "Report-"+Date+".html";
		htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReports//"+Reportname);
		extent.attachReporter(htmlreporter);
		
		//DriverLaunch
		driver = new AndroidDriver(new URL(appiumURL), dc);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
		extent.flush();
	}

}
