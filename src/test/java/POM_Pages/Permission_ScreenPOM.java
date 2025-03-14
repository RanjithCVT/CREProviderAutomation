package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Permission_ScreenPOM {
	
	public AndroidDriver driver;
	
	public Permission_ScreenPOM(AndroidDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.psb.ivr:id/radLocation")
	public WebElement LocationRadioButton;
	
	@FindBy(id="com.psb.ivr:id/radCamera")
	public WebElement CameraRadioButton;
	
	@FindBy(id="com.psb.ivr:id/radStorage")
	public WebElement StorageRadioButton;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_one_time_button")
	public WebElement LocationOneTime;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_one_time_button")
	public WebElement CameraOneTime;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement StorageAllowAll;
	
	@FindBy(id="com.psb.ivr:id/btnNext")
	public WebElement NextButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
