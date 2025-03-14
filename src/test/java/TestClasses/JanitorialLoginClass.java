package TestClasses;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.HomeScreenPOM;
import io.appium.java_client.android.AndroidDriver;

public class JanitorialLoginClass {
	public WebDriverWait wait;
	public AndroidDriver driver;
	public HomeScreenPOM home;
	
	 public JanitorialLoginClass(AndroidDriver Driver, WebDriverWait Wait) {
		 this.driver=Driver;
		 this.wait=Wait;
		 home = new HomeScreenPOM(Driver);
	}
	 
	 public void JanitorialPINLogin()
	 {
		 wait.until(ExpectedConditions.visibilityOf(home.JanitorialRadioButton));
		 if(home.JanitorialRadioButton.isSelected())
		 {
			 System.out.println("Janitorial Pin is Selected");
		 }else {
			 home.JanitorialRadioButton.click();
		 }
		 wait.until(ExpectedConditions.visibilityOf(home.EnterPINTextBox));
		 home.EnterPINTextBox.sendKeys("745416");
		 wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
		 home.LoginButton.click();
		 wait.until(ExpectedConditions.visibilityOf(home.PINLoginLandingTitle));
		 System.out.println("Janitorial PIN Logged in");
		 
		 
	 }
	
	
	
	
}
