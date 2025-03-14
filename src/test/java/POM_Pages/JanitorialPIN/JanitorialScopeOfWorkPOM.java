package POM_Pages.JanitorialPIN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class JanitorialScopeOfWorkPOM {
	
	public AndroidDriver driver;

	public JanitorialScopeOfWorkPOM(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*	@FindBy(id="")
	public WebElement a;	*/
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
	public WebElement BacktoJanitorialHomeButton;
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/compose_view_scope_item\"]/android.view.View")
	public WebElement ScopeOfWorkList;
	
	@FindBy(id="com.psb.ivr:id/btnProceed")
	public WebElement CHECK_OUT_Button;    
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Have the Fitting Room partitions, benches, floors, and mirrors been cleaned? (Area : Fitting Rooms)\"]")
	public WebElement Question;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
