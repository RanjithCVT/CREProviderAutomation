package TestClasses;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM_Pages.Permission_ScreenPOM;
import RunnableClass.ExtraFunctions;
import io.appium.java_client.android.AndroidDriver;

public class PermissionScreenClass {

	public WebDriverWait wait;
	public AndroidDriver driver;
	public Permission_ScreenPOM permission;
	public ExtentReports extent;
	public ExtentTest test;
	public ExtraFunctions extra;

	public PermissionScreenClass(AndroidDriver Driver, WebDriverWait wait, ExtentReports extent) {
		this.driver = Driver;
		this.wait = wait;
		this.extent = extent;
		permission = new Permission_ScreenPOM(Driver);
		extra = new ExtraFunctions(driver, wait);

	}

	public void PermissionScreenAutomation() {
		test = extent.createTest("Permission Giving Screen");
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Permission_ScreenPOM permission = new Permission_ScreenPOM(driver);

			wait.until(ExpectedConditions.visibilityOf(permission.LocationRadioButton));
			test.log(Status.INFO, "Location Permission Radio button is visible");

			permission.LocationRadioButton.click();
			wait.until(ExpectedConditions.visibilityOf(permission.LocationOneTime));
			permission.LocationOneTime.click();
			test.log(Status.INFO, "Location Permission is given for One time ");

			wait.until(ExpectedConditions.visibilityOf(permission.CameraRadioButton));
			test.log(Status.INFO, "Camera Permission Radio button is visible");
			permission.CameraRadioButton.click();
			wait.until(ExpectedConditions.visibilityOf(permission.CameraOneTime));
			permission.CameraOneTime.click();
			test.log(Status.INFO, "Camera Permission is given for One Time");

			wait.until(ExpectedConditions.visibilityOf(permission.StorageRadioButton));
			test.log(Status.INFO, "Storage Permission Radio button is Visible");
			permission.StorageRadioButton.click();
			wait.until(ExpectedConditions.visibilityOf(permission.StorageAllowAll));
			permission.StorageAllowAll.click();
			test.log(Status.INFO, "Storage permission is given as Allow");

			wait.until(ExpectedConditions.visibilityOf(permission.NextButton));
			test.log(Status.INFO, "Next button is visibled");
			permission.NextButton.click();
			test.log(Status.INFO, "Next buton is clicked");
			test.log(Status.PASS, "Permission is granted");
		} catch (Exception e) {
			test.log(Status.FAIL, "Permission Granting is failed because  " + e.getMessage());
		}
	}

}
