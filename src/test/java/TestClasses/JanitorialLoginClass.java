package TestClasses;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM_Pages.HomeScreenPOM;
import POM_Pages.JanitorialPIN.CheckOutScreenPOM;
import POM_Pages.JanitorialPIN.CheckinScreenPOM;
import POM_Pages.JanitorialPIN.JanitorialPIN_HomescreenPOM;
import POM_Pages.JanitorialPIN.JanitorialScopeOfWorkPOM;
import io.appium.java_client.android.AndroidDriver;

public class JanitorialLoginClass {
	public WebDriverWait wait;
	public AndroidDriver driver;
	public HomeScreenPOM home;
	public ExtentReports extent;
	public ExtentTest test;
	public CheckinScreenPOM CI;
	public CheckOutScreenPOM CO;
	public JanitorialPIN_HomescreenPOM janhome;
	public JanitorialScopeOfWorkPOM janscope;

	public JanitorialLoginClass(AndroidDriver Driver, WebDriverWait Wait, ExtentReports extent) {
		this.driver = Driver;
		this.wait = Wait;
		this.extent = extent;
		home = new HomeScreenPOM(Driver);
		CI = new CheckinScreenPOM(Driver);
		CO = new CheckOutScreenPOM(Driver);
		janhome = new JanitorialPIN_HomescreenPOM(Driver);
		janscope = new JanitorialScopeOfWorkPOM(Driver);

	}

	public void JanitorialPINLogin() {

		try {
			test = extent.createTest("Janitorial PIN login Function");
			wait.until(ExpectedConditions.visibilityOf(home.JanitorialRadioButton));
			test.log(Status.INFO, "Janitorial PIN Radio Button is Displayed");
			if (home.JanitorialRadioButton.isSelected()) {
				test.log(Status.INFO, "Janitorial PIN Radio button is selected");
			} else {
				home.JanitorialRadioButton.click();
				test.log(Status.INFO, "Janitorial PIN Radio button is selected");
			}
			wait.until(ExpectedConditions.visibilityOf(home.EnterPINTextBox));
			home.EnterPINTextBox.sendKeys("935059");
			test.log(Status.INFO, "Janitorial PIN Number is Enteren into the Textbox");
			wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
			home.LoginButton.click();
			test.log(Status.INFO, "Login Button is clicked");

			try {
				wait.until(ExpectedConditions.visibilityOf(home.PINLoginLandingTitle));
				test.log(Status.INFO, "Janitorial Homepage is Navigated");
				test.log(Status.PASS, "Janitorial Logged in Successfully");
				Assert.assertTrue(true);
			} catch (Exception e) {
				test.log(Status.FAIL, "Janitorial Logged in failed because " + e);
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			test.log(Status.FAIL, "Janitorial Logged in failed because " + e);
			Assert.assertTrue(false);
		}
	}

	public void JanitorialPIN_CICO() {
		test = extent.createTest("Janitorial PIN Checkin,Check Out flow");
		try {
			wait.until(ExpectedConditions.visibilityOf(janhome.CheckinButton));
			test.log(Status.INFO, "Janitorial Landing page navigated");
			janhome.CheckinButton.click();
			test.log(Status.INFO, "Checkin Button Clicked");
			wait.until(ExpectedConditions.visibilityOf(CI.Manager_YesButton));
			CI.ImageCaptureIcon.click();
			test.log(Status.INFO, "Image capturing clicked");
			wait.until(ExpectedConditions.visibilityOf(CI.PictureShutterbutton));
			CI.PictureShutterbutton.click();
			test.log(Status.INFO, "Check in Image Captured");
			wait.until(ExpectedConditions.visibilityOf(CI.Manager_YesButton));
			CI.Manager_YesButton.click();
			test.log(Status.INFO, "Manager Arrival selected");
			CI.CHECK_IN_Button.click();
			test.log(Status.INFO, "Checkin Button clicked");
			wait.until(ExpectedConditions.visibilityOf(janscope.ScopeOfWorkList));
			test.log(Status.INFO, "Scope of work listing page navigated");
			janscope.Question.click();
			test.log(Status.INFO, "Scope of work selected");
			janscope.CHECK_OUT_Button.click();
			test.log(Status.INFO, "Check out button clicked");
			wait.until(ExpectedConditions.visibilityOf(CO.ImageCaptureIcon));
			CO.ImageCaptureIcon.click();
			test.log(Status.INFO, "Image capturing clicked");
			wait.until(ExpectedConditions.visibilityOf(CO.PictureShutterbutton));
			CO.PictureShutterbutton.click();
			test.log(Status.INFO, "Check out Image Captured");
			wait.until(ExpectedConditions.visibilityOf(CO.TakenImageList));
			CO.CHECK_OUT_Button.click();
			test.log(Status.INFO, "Check out Button clicked");
			wait.until(ExpectedConditions.visibilityOf(janhome.StoreID));
			test.log(Status.PASS, "Check in Check out Completed and Janitorrial Landing page navigated");
			Assert.assertTrue(true);
		} catch (Exception e) {
			test.log(Status.FAIL, "Janitorial Check in Check out is Failed Because \n" + e);
			Assert.assertTrue(false);
		}

	}

}
