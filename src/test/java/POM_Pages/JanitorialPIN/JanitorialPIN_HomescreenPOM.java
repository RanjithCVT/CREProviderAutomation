package POM_Pages.JanitorialPIN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class JanitorialPIN_HomescreenPOM {
	public AndroidDriver driver;

	public JanitorialPIN_HomescreenPOM(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* 	@FindBy(id="")
	 public WebElement 2;  	*/
	
	@FindBy(id="com.psb.ivr:id/layout_navigation_tab")
	 public WebElement Two_WayLoginTabs; 
	
	@FindBy(id="com.psb.ivr:id/btn_tab_janitorial")
	 public WebElement JanitorialTab; 
	
	@FindBy(id="com.psb.ivr:id/btn_tab_work_order")
	 public WebElement WorkOrderTab; 
	
	@FindBy(id="com.psb.ivr:id/txtStoreId")
	public WebElement StoreID; 
	
	@FindBy(id="com.psb.ivr:id/txtStoreName")
	public WebElement StoreName; 
	
	@FindBy(id="com.psb.ivr:id/txtCheckIn")
	public WebElement CheckinButton; 
	
	@FindBy(id="com.psb.ivr:id/ic_menu")
	public WebElement MenuBar; 
	
	@FindBy(id="com.psb.ivr:id/ic_menu_action_serach")
	public WebElement SearchBar; 
	
	@FindBy(id="com.psb.ivr:id/search_src_text")
	public WebElement SearchTextbar; 
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‏‏‏‏‏‏‏‎‎‏‎‏‎‎‏‎‏‎‎‏‏‎‏‏‏‎‏‏‏‏‏‏‏‏‎‎‎‎‏‏‎‎‎‎‏‎‎‎‏‏‎‏‎‎‏‎‎Collapse‎‏‎‎‏‎\"]")
	public WebElement BackButtonSearchBar; 
	
	@FindBy(id="com.psb.ivr:id/txtLogout")
	 public WebElement LogoutButton; 
	
 	@FindBy(id="com.psb.ivr:id/btnYes")
	 public WebElement LogoutYESButton;  
 	
 	@FindBy(id="com.psb.ivr:id/btnNo")
	 public WebElement LogoutNoButton;  
	
	
	
	
	
	

}
