package RunnableClass;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.HomeScreenPOM;
import POM_Pages.JanitorialPIN.JanitorialPIN_HomescreenPOM;
import io.appium.java_client.android.AndroidDriver;

public class ExtraFunctions {

	public AndroidDriver driver;
	public JanitorialPIN_HomescreenPOM janhome;
	public WebDriverWait wait;
	public HomeScreenPOM home;

	public ExtraFunctions(AndroidDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait =wait;
		janhome=new JanitorialPIN_HomescreenPOM(driver);
		home=new HomeScreenPOM(driver);
	}

	public String GetScreenshot(String testName) throws Exception {

		try {
			String srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String fileName = "screenshots/" + testName + "_" + timestamp + ".png";
			fileName=srcFile;
			return fileName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return testName;
	}
	
	public void Logout() {
		janhome.MenuBar.click();
		wait.until(ExpectedConditions.visibilityOf(janhome.LogoutButton));
		janhome.LogoutButton.click();
		wait.until(ExpectedConditions.visibilityOf(janhome.LogoutYESButton));
		janhome.LogoutYESButton.click();
		wait.until(ExpectedConditions.visibilityOf(home.LoginButton));
	}

}
