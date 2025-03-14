package TestClasses;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.Permission_ScreenPOM;
import io.appium.java_client.android.AndroidDriver;

public class PermissionScreenClass {
	
	public WebDriverWait wait;
	public AndroidDriver driver;
	public Permission_ScreenPOM permission;
	 
	 public PermissionScreenClass(AndroidDriver Driver, WebDriverWait wait) {
		 this.driver=Driver;
		 this.wait=wait;
		 permission = new Permission_ScreenPOM(Driver);
		 
	}
	
	
	
	public void PermissionScreenAutomation()
	{
		wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		Permission_ScreenPOM permission=new Permission_ScreenPOM(driver);
			
		wait.until(ExpectedConditions.visibilityOf(permission.LocationRadioButton));
		permission.LocationRadioButton.click();
		wait.until(ExpectedConditions.visibilityOf(permission.LocationOneTime));
		permission.LocationOneTime.click();
		
		wait.until(ExpectedConditions.visibilityOf(permission.CameraRadioButton));
		permission.CameraRadioButton.click();
		wait.until(ExpectedConditions.visibilityOf(permission.CameraOneTime));
		permission.CameraOneTime.click();
		
		wait.until(ExpectedConditions.visibilityOf(permission.StorageRadioButton));
		permission.StorageRadioButton.click();
		wait.until(ExpectedConditions.visibilityOf(permission.StorageAllowAll));
		permission.StorageAllowAll.click();
		
		wait.until(ExpectedConditions.visibilityOf(permission.NextButton));
		permission.NextButton.click();
		
	}

}
