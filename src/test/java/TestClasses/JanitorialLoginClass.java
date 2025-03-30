package TestClasses;

import org.openqa.selenium.interactions.Actions;
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
import POM_Pages.JanitorialPIN.TwoWayWOScreen;
import RunnableClass.ExtraFunctions;
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
    public ExtraFunctions extra;
    public TwoWayWOScreen twoway;

    public JanitorialLoginClass(AndroidDriver Driver, WebDriverWait Wait, ExtentReports extent) {
        this.driver = Driver;
        this.wait = Wait;
        this.extent = extent;
        home = new HomeScreenPOM(Driver);
        CI = new CheckinScreenPOM(Driver);
        CO = new CheckOutScreenPOM(Driver);
        janhome = new JanitorialPIN_HomescreenPOM(Driver);
        janscope = new JanitorialScopeOfWorkPOM(Driver);
        extra = new ExtraFunctions(Driver, wait);
        twoway = new TwoWayWOScreen(Driver);

    }

    public void JanitorialPINLogin() throws Exception {

        try {
            test = extent.createTest("Janitorial PIN login Function");
            wait.until(ExpectedConditions.visibilityOf(home.JanitorialRadioButton));
            test.log(Status.INFO, "Janitorial PIN Radio Button is Displayed");

            String isChecked = home.JanitorialRadioButton.getAttribute("checked");
            if (isChecked != null && isChecked.equals("true")) {
                test.log(Status.INFO, "Janitorial PIN Radio button is selected");
            } else {
                home.JanitorialRadioButton.click();
                test.log(Status.INFO, "Janitorial PIN Radio button is selected");
            }
            wait.until(ExpectedConditions.visibilityOf(home.EnterPINTextBox));
            home.EnterPINTextBox.sendKeys("935059");
            test.log(Status.INFO, "Janitorial PIN Number is Entered into the Textbox");
            wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
            home.LoginButton.click();
            test.log(Status.INFO, "Login Button is clicked");

            try {
                wait.until(ExpectedConditions.visibilityOf(home.PINLoginLandingTitle));
                String Screenshot = extra.GetScreenshot("Janitorial_Logged_IN");
                test.addScreenCaptureFromBase64String(Screenshot, "Janitorial login Successflly");
                test.log(Status.INFO, "Janitorial Homepage is Navigated");
                test.log(Status.PASS, "Janitorial Logged in Successfully");
                Assert.assertTrue(true);
            } catch (Exception e) {
                test.log(Status.FAIL, "Janitorial Logged in failed because " + e.getMessage());
                String Screenshot = extra.GetScreenshot("Janitorial_Failed_Logged_IN");
                test.addScreenCaptureFromBase64String(Screenshot, "Janitorial Login Failed");
                Assert.assertTrue(false);

            }

        } catch (Exception e) {
            test.log(Status.FAIL, "Janitorial Logged in failed because " + e.getMessage());
            String Screenshot = extra.GetScreenshot("Janitorial_Failed_Logged_IN");
            test.addScreenCaptureFromBase64String(Screenshot, "Janitorial Login Failed");
            Assert.assertTrue(false);
        }
    }

    public void JanitorialPIN_CICO() throws Exception {
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
            String Screenshot = extra.GetScreenshot("Janitorial CI_CO Passed");
            test.addScreenCaptureFromBase64String(Screenshot, "Janitorial CI_CO Passed");
            test.log(Status.PASS, "Check in Check out Completed and Janitorrial Landing page navigated");

            Assert.assertTrue(true);
        } catch (Exception e) {
            String Screenshot = extra.GetScreenshot("Janitorial CI_CO Failed");
            test.addScreenCaptureFromBase64String(Screenshot, "Janitorial CI_CO Failed");
            test.log(Status.FAIL, "Janitorial Check in Check out is Failed Because \n" + e.getMessage());
            Assert.assertTrue(false);
        }

    }

    public void JanitorialTwoWayLoginFlow() {
        test = extent.createTest(" Two way Login Janitorial Flow ");
        extra.Logout();
        try {
            wait.until(ExpectedConditions.visibilityOf(home.JanitorialRadioButton));
            test.log(Status.INFO, "Janitorial PIN Radio Button is Displayed");

            String isChecked = home.JanitorialRadioButton.getAttribute("checked");
            if (isChecked != null && isChecked.equals("true")) {
                test.log(Status.INFO, "Janitorial PIN Radio button is selected");
            } else {
                home.JanitorialRadioButton.click();
                test.log(Status.INFO, "Janitorial PIN Radio button is selected");
            }
            wait.until(ExpectedConditions.visibilityOf(home.EnterPINTextBox));
            home.EnterPINTextBox.sendKeys("745416");
            test.log(Status.INFO, "Two way PIN Number is Entered into the Textbox");
            wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
            home.LoginButton.click();
            test.log(Status.INFO, "Login Button is clicked");
            Assert.assertTrue(true);
        } catch (Exception e) {
            test.log(Status.INFO, "Janitorial Two Way login PIN Not Logged in   ");
            test.log(Status.FAIL, "Two Way login Janitorial Login Failed because  " + e.getMessage());
            Assert.assertTrue(false);
        }
        wait.until(ExpectedConditions.visibilityOf(twoway.JanitorialTab));
        boolean TabSelected = twoway.JanitorialTab.isSelected();
        if (TabSelected == false) {
            twoway.JanitorialTab.click();
            test.log(Status.INFO, "Janitorial Tab Clicked");
        }
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
            String Screenshot = extra.GetScreenshot("Two way Janitorial CI_CO Passed");
            test.addScreenCaptureFromBase64String(Screenshot, "Two way Janitorial CI_CO Passed");
            test.log(Status.PASS, "Two way Janitorial Check in Check out Completed and Landing page navigated");
            Assert.assertTrue(true);

        } catch (Exception e) {
            test.log(Status.INFO, "Janitorial Two Way login CI_CO Not Completed");
            test.log(Status.FAIL, "Two Way login Janitorial CI_CO  Failed because  " + e.getMessage());
            Assert.assertTrue(false);
        }

    }


    public void TwoWayLoginWOCompletion() throws Exception {
        test = extent.createTest("Workorder Fully Completion using Two Way PIN ");
        try {
            //Logout
            extra.Logout();
            wait.until(ExpectedConditions.visibilityOf(home.EnterPINTextBox));
            home.EnterPINTextBox.sendKeys("745416");
            test.log(Status.INFO, "Two way login PIN Entered");
            wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
            home.LoginButton.click();
            test.log(Status.INFO, "Login button Clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.WorkorderTab));
            twoway.WorkorderTab.click();
            test.log(Status.INFO, "Workorder Tab Clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.StatusMenus));
            twoway.Scheduled.click();
            test.log(Status.INFO, "Scheduled Tab Clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.WOListingFirstWO));
            twoway.WOListingFirstWO.click();
            test.log(Status.INFO, "Clicked the First Workorder in the Scheduled Listing");

            wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(twoway.WOConformButton),
                    (ExpectedConditions.visibilityOf(twoway.CheckinButton))));
            if (twoway.WOConformButton.getText().equalsIgnoreCase("CONFIRM")) {

                twoway.WOConformButton.click();
                test.log(Status.INFO, "Conform button is displayed and Clicked");
                wait.until(ExpectedConditions.visibilityOf(twoway.ConformationboxWOConform));
                twoway.Confirmation_YesButotn.click();
                test.log(Status.INFO, "Workorder Confirmed Successflly");
            }

            wait.until(ExpectedConditions.visibilityOf(twoway.CheckinButton));
            twoway.CheckinButton.click();
            test.log(Status.INFO, "Check In Button Clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.ServiceAreaListing));
            twoway.AreaiconForTakingImage1.click();
            test.log(Status.INFO, "Area Image button clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.CaptureDonebutton));
            twoway.CaptureDonebutton.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ServiceAreaListing));
            twoway.AreaiconForTakingImage2.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.CaptureDonebutton));
            twoway.CaptureDonebutton.click();
            test.log(Status.INFO, "Images of the Check in Area 1 is Captured Successfully");
            wait.until(ExpectedConditions.visibilityOf(twoway.AllimageDoneAlertYesButton));
            twoway.AllimageDoneAlertYesButton.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.CheckinSuccessOKButton));
            twoway.CheckinSuccessOKButton.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.HoldButton));
            twoway.ConfirmButton_CI.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ServiceAreaListing));
            twoway.AreaiconForTakingImage1.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.CaptureDonebutton));
            twoway.CaptureDonebutton.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ServiceAreaListing));
            twoway.AreaiconForTakingImage2.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.ImageCaptureButton));
            twoway.ImageCaptureButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(twoway.CaptureDonebutton));
            twoway.CaptureDonebutton.click();
            test.log(Status.INFO, "Images of the Check in Area 2 is Captured Successfully");
            wait.until(ExpectedConditions.visibilityOf(twoway.AtferPhotosCheckOutButton));
            twoway.AtferPhotosCheckOutButton.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.GetSignatureScreenTitle));
            test.log(Status.INFO, "Check out button clicked and navigated to the Signoff Page");
            twoway.Firstname.sendKeys("Afname");
            twoway.Lastname.sendKeys("ALname");
            test.log(Status.INFO, "Firstname and Lastnames are entered");
            twoway.TitleDropdown.click();
            wait.until(ExpectedConditions.visibilityOf(twoway.StoreManagerTitle));
            twoway.StoreManagerTitle.click();
            test.log(Status.INFO, "Store Manager Title is selected");
            twoway.CommentsBox.sendKeys("Testing Comments A");
            test.log(Status.INFO, "Comments are entered");
            twoway.SignatureBox.click();
            test.log(Status.INFO, "Signature box Clicked ");
            wait.until(ExpectedConditions.visibilityOf(twoway.SignatureDrawingBox));
            Actions action = new Actions(driver);
            action.clickAndHold(twoway.SignatureDrawingBox)
                    .moveByOffset(100, 0)  // Draw a horizontal line of 100 pixels
                    .release()
                    .perform();
            test.log(Status.INFO, "Signature was written");
            wait.until(ExpectedConditions.visibilityOf(twoway.SignatureApproveButton));
            twoway.SignatureApproveButton.click();
            test.log(Status.INFO, "Signature Approved button clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.CompleteWOSignaturePage));
            twoway.CompleteWOSignaturePage.click();
            test.log(Status.INFO, "Complete Workorder button Clicked");
            wait.until(ExpectedConditions.visibilityOf(twoway.VIewWOButton));
            String Screenshot = extra.GetScreenshot("Two Way Login WO Completed");
            test.addScreenCaptureFromBase64String(Screenshot, "Two Way login Workoder Completion done ");
            test.log(Status.PASS, "Work order completion for Two way login PIN is successfully done");
            Assert.assertTrue(true);
        } catch (Exception e) {
            String Screenshot = extra.GetScreenshot("Two Way Login WO Not Completed");
            test.addScreenCaptureFromBase64String(Screenshot, "Two Way login Workoder Not Completed  ");
            test.log(Status.FAIL,
                    "Work order completion for Two way login PIN is Not Done Completely because  \n" + e.getMessage());
            Assert.assertTrue(false);
        }

    }
}
