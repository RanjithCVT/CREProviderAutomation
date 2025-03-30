package RunnableClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public AndroidDriver driver;
    public WebDriverWait wait;
    public ExtentReports extent;
    public ExtentSparkReporter htmlreporter;

    @BeforeSuite
    public void setup() throws MalformedURLException {
        //Setting Capabilities
        String appiumURL = "http://127.0.0.1:4723";
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setNewCommandTimeout(Duration.ofMinutes(10))
                .setAutomationName("uiautomator2")
                .setApp(System.getProperty("user.dir") + "\\APK\\Provider.apk")
                .setAllowTestPackages(true)
                .setDisableWindowAnimation(false)
                .setIgnoreHiddenApiPolicyError(true);


        // Initialize ExtentReports
        //Manikandan
        extent = new ExtentReports();
        String Date = new SimpleDateFormat("yyyy-MM-dd__(HH.mm.ss)").format(new Date());
        String Reportname = "Report-" + Date + ".html";
        htmlreporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//TestReports//" + Reportname);
        extent.attachReporter(htmlreporter);

        // Initialize AndroidDriver with UiAutomator2Options
        driver = new AndroidDriver(new URL(appiumURL), options);

    }

    @AfterSuite
    public void teardown() {
        driver.quit();
        //Testing for Intellij
        extent.flush();
    }

}
