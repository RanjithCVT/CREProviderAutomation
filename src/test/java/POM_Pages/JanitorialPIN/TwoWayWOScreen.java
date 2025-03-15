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
	
	@FindBy(id="com.psb.ivr:id/attendanceHeaderCompose")
	 public WebElement StatusMenus;
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[1]")
	 public WebElement Scheduled; 
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[2]")
	 public WebElement InPrgress; 
	
	@FindBy(xpath="//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.psb.ivr:id/attendanceHeaderCompose\"]/android.view.View/android.view.View/android.view.View[3]")
	 public WebElement Completed; 
	
	/*
	
	//android.view.ViewGroup[@resource-id="com.psb.ivr:id/parentLayout"] 	Janitorial List
	//android.widget.TextView[@text="WO00091735"]							Workorder detail page - Workorder number
	com.psb.ivr:id/btnConfirm												Checkin button
	com.psb.ivr:id/recyclerViewAreas										Service Area List
	com.psb.ivr:id/buttonProceed											Proceed button
	com.psb.ivr:id/txtToolbarTitle											Toolbar title
	
	(//android.widget.TextView[@resource-id="com.psb.ivr:id/textViewCamera"])[1]		Area image icon to capture (We can add the limit  like [2])
	com.psb.ivr:id/take_picture												Image capture button
	com.psb.ivr:id/imageCount												Image Count
	com.psb.ivr:id/txtDone													Images Done button
	android:id/button1														Alert box for All images done(Ok Button)
	android:id/contentPanel													Workorder chek in successfully alerbox content 
	android:id/button1														Workorder chek in successfully alerbox content OK Button
	com.psb.ivr:id/btnHold													Workorder details Hold button
	com.psb.ivr:id/btnConfirm												Check out button
	com.psb.ivr:id/buttonProceed											Afterphotos Checkout button
	//android.widget.TextView[@text="Get Signoff Signature"]				Get Signature Screen title
	com.psb.ivr:id/edtFullName												Firstname
	com.psb.ivr:id/edtLastname												Lastname
	com.psb.ivr:id/spnTitleType												Title Dropdown
	android.widget.ListView													TitleList
	//android.widget.CheckedTextView[@resource-id="android:id/text1" and @text="Store Manager"]			Store Manager Title
	com.psb.ivr:id/edtComments											Comments box
	com.psb.ivr:id/linearSignature										Signaturebox
	com.psb.ivr:id/edtSignOff											Signature Drawing box
	com.psb.ivr:id/btnClear												Clear button
	com.psb.ivr:id/btnApprove											Approve button
	com.psb.ivr:id/btnProceed											Complete button Workorder Signoff page
	com.psb.ivr:id/btnProceed											View Workorder button
	com.psb.ivr:id/txWorkorderCompleted									Workorder completed Successfully message
	
	




*/
}
