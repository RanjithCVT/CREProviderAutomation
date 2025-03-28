package POM_Pages.JanitorialPIN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CheckinScreenPOM {
	
	public AndroidDriver driver;

	public CheckinScreenPOM(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*	@FindBy(id="")
	public WebElement a;	*/
	
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
	public WebElement BacktoJanitorialHomeButton;
	
	@FindBy(id="com.psb.ivr:id/txtToolbarTitle")
	public WebElement LocationNameInToolbar;
	
	@FindBy(id="com.psb.ivr:id/frameLayout")
	public WebElement ImageCaptureIcon;
	
	@FindBy(id="com.psb.ivr:id/take_picture")
	public WebElement PictureShutterbutton;
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/compose_view_image_list\"]/android.view.View/android.view.View")
	public WebElement TakenImageList;
	
	@FindBy(id="com.psb.ivr:id/radioButtonYes")
	public WebElement Manager_YesButton;
	
	@FindBy(id="com.psb.ivr:id/radioButtonNo")
	public WebElement Manager_NoButton;
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.psb.ivr:id/btnSubmit\"]")
	public WebElement CHECK_IN_Button;
	

	
	
	
	
	

}
