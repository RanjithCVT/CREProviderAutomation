package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreenPOM {

public AndroidDriver driver;
	
	public HomeScreenPOM(AndroidDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.psb.ivr:id/rdBtnIvr")
	public WebElement JanitorialRadioButton;
	
	@FindBy(id="com.psb.ivr:id/radLocation")
	public WebElement VendorRadioButton;
	
	@FindBy(id="com.psb.ivr:id/edtPinNumber")
	public WebElement EnterPINTextBox;
	
	@FindBy(id="com.psb.ivr:id/edtEmail")
	public WebElement EmailIDProvider ;
	
	@FindBy(id="com.psb.ivr:id/edtPassword")
	public WebElement Password ;
	
	@FindBy(id="com.psb.ivr:id/btnLogin")
	public WebElement LoginButton ;
	
	@FindBy(id="com.psb.ivr:id/txtToolbarTitle")
	public WebElement PINLoginLandingTitle ;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
