package POM_Pages.JanitorialPIN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class TwoWayWOScreen { 
	
	public AndroidDriver driver;

	public TwoWayWOScreen(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* 	@FindBy(id="")
	 public WebElement 2;  	*/
	
	
	
	@FindBy(id="com.psb.ivr:id/btn_tab_janitorial")
	 public WebElement JanitorialTab; 
	
	@FindBy(id="com.psb.ivr:id/btn_tab_work_order")
	 public WebElement WorkorderTab;
	
	@FindBy(id="com.psb.ivr:id/attendanceHeaderCompose")
	 public WebElement StatusMenus;
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[1]")
	 public WebElement Scheduled; 
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[2]")
	 public WebElement InPrgress; 
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[3]")
	 public WebElement Completed; 

	@FindBy(xpath="//android.view.ViewGroup[@resource-id=\"com.psb.ivr:id/parentLayout\"]")
	 public WebElement WOListingFirstWO; 
	
	@FindBy(xpath="com.psb.ivr:id/txtStatus")
	 public WebElement WODetailPageStatus;
	
	@FindBy(id="com.psb.ivr:id/btnConfirm")
	 public WebElement WOConformButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@resource-id=\"com.psb.ivr:id/parentLayout\"]/android.widget.LinearLayout")
	 public WebElement ConformationboxWOConform; 
	
	@FindBy(id="com.psb.ivr:id/btnYes")
	 public WebElement Confirmation_YesButotn;
	
	@FindBy(id="com.psb.ivr:id/btnNo")
	 public WebElement Confirmation_NoButotn; 
	
	@FindBy(id="com.psb.ivr:id/btnConfirm")
	 public WebElement CheckinButton; 
	
	@FindBy(id="com.psb.ivr:id/recyclerViewAreas")
	 public WebElement ServiceAreaListing;
	
	@FindBy(id="com.psb.ivr:id/buttonProceed")
	 public WebElement ProceedButton; 
	
	@FindBy(id="com.psb.ivr:id/txtToolbarTitle")
	 public WebElement ToolbarTitle;
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id=\"com.psb.ivr:id/textViewCamera\"])[1]")
	 public WebElement AreaiconForTakingImage1;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.psb.ivr:id/textViewCamera\"]")
	 public WebElement AreaiconForTakingImage2;
	
	@FindBy(id="com.psb.ivr:id/take_picture")
	 public WebElement ImageCaptureButton;
	
	@FindBy(id="com.psb.ivr:id/imageCount")
	 public WebElement ImageCount;
	
	@FindBy(id="com.psb.ivr:id/txtDone")
	 public WebElement CaptureDonebutton; 
	
	@FindBy(id="android:id/button1")
	 public WebElement AllimageDoneAlertYesButton;
	
	@FindBy(id="android:id/contentPanel")
	 public WebElement WOCheckinSuccessfullyCOntentLabel;
	
	@FindBy(id="android:id/button1")
	 public WebElement CheckinSuccessOKButton;
	
	@FindBy(id="com.psb.ivr:id/btnHold")
	 public WebElement HoldButton; 
	
	
	@FindBy(id="com.psb.ivr:id/btnConfirm")
	 public WebElement ConfirmButton_CI; 
	
	@FindBy(id="com.psb.ivr:id/buttonProceed")
	 public WebElement AtferPhotosCheckOutButton; 
	
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Get Signoff Signature\"]")
	 public WebElement GetSignatureScreenTitle; 
	
	@FindBy(id="com.psb.ivr:id/edtFullName")
	 public WebElement Firstname; 
	
	@FindBy(id="com.psb.ivr:id/edtLastname")
	 public WebElement Lastname; 
	
	@FindBy(id="com.psb.ivr:id/spnTitleType")
	 public WebElement TitleDropdown; 
	
	@FindBy(id="android.widget.ListView")
	 public WebElement Titlelisingmenu; 
	
	@FindBy(xpath="//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Store Manager\"]")
	 public WebElement StoreManagerTitle;
	
	@FindBy(id="com.psb.ivr:id/edtComments")
	 public WebElement CommentsBox;
	
	@FindBy(id="com.psb.ivr:id/linearSignature")
	 public WebElement SignatureBox;
	
	@FindBy(id="com.psb.ivr:id/edtSignOff")
	 public WebElement SignatureDrawingBox;
	
	@FindBy(id="com.psb.ivr:id/btnClear	")
	 public WebElement SignatureClearButton;
	
	@FindBy(id="com.psb.ivr:id/btnApprove")
	 public WebElement SignatureApproveButton;
	
	@FindBy(id="com.psb.ivr:id/btnProceed")
	 public WebElement CompleteWOSignaturePage;
	
	@FindBy(id="com.psb.ivr:id/btnAllBookings")
	 public WebElement VIewWOButton;
	
	@FindBy(id="om.psb.ivr:id/txWorkorderCompleted")
	 public WebElement WOCompletedSuccessMSG; 
	

}
