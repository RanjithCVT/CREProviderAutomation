package TestClasses;

import POM_Pages.HomeScreenPOM;
import POM_Pages.InspectionPIN_POM;
import POM_Pages.JanitorialPIN.*;
import RunnableClass.ExtraFunctions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.ExecutionException;

public class InspectionClass {

    public WebDriverWait wait;
    public AndroidDriver driver;
    public HomeScreenPOM home;
    public ExtentReports extent;
    public ExtentTest test;
    public ExtraFunctions extra;
    public InspectionPIN_POM ins;
    public PermissionScreenClass per;


    public InspectionClass(AndroidDriver Driver, WebDriverWait Wait, ExtentReports extent) {
        this.driver = Driver;
        this.wait = Wait;
        this.extent = extent;
        home = new HomeScreenPOM(Driver);
        extra = new ExtraFunctions(Driver, wait);
        ins = new InspectionPIN_POM(Driver);
        per =new PermissionScreenClass(driver,wait,extent);
    }

    public void InspectionCompletion() {
        test = extent.createTest("Inspection PIN Completion ");

        per.PermissionScreenAutomation();
        try {
//            extra.Logout();
//            test = extent.createTest("Janitorial PIN login Function");
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
            home.EnterPINTextBox.sendKeys("283733");
            test.log(Status.INFO, "Janitorial PIN Number is Entered into the Textbox");
            wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
            home.LoginButton.click();
            test.log(Status.INFO, "Login Button is clicked");


            wait.until(ExpectedConditions.visibilityOf(ins.SearchBar));
            ins.SearchBar.click();
            wait.until(ExpectedConditions.visibilityOf(ins.SearchBar_TextBox));
            ins.SearchBar_TextBox.sendKeys("0055");
            wait.until(ExpectedConditions.visibilityOf(ins.Check_In_Button_Searched_Store));
            ins.Check_In_Button_Searched_Store.click();
            wait.until(ExpectedConditions.visibilityOf(ins.FirstInspection_Listing));
            ins.FirstInspection_Listing.click();

            // Answering the Questions
            wait.until(ExpectedConditions.visibilityOf(ins.Question1));
//            driver.findElement(By.xpath(ins.YesButton+"[1]")).click();
//            driver.findElement(By.xpath(ins.YesButton+"[2]")).click();
//            driver.findElement(By.xpath(ins.NoButton+"[3]")).click();
//            wait.until(ExpectedConditions.visibilityOf(ins.NotesPopup));
//            ins.NotesTextbox.sendKeys("TestNotes A");
//            ins.NOtesSubmitButton.click();
//            wait.until(ExpectedConditions.visibilityOf(ins.CheckOutButton));
            driver.findElement(By.xpath(ins.YesButton+"[4]")).click();
            extra.manualScrollBottomToTop();

        } catch (Exception e) {

        }


    }


}
