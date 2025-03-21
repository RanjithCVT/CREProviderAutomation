package RunnableClass;

import POM_Pages.HomeScreenPOM;
import POM_Pages.JanitorialPIN.JanitorialPIN_HomescreenPOM;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

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

	public void scrollToElementByElement(WebElement Element) {
		try {
			Actions a = new Actions(driver);
			a.clickAndHold(Element)
			.moveByOffset(0, 100)  // Draw a horizontal line of 100 pixels
					.release()
					.perform();

		} catch (Exception e) {
			System.out.println("Element not found: " + Element);
		}
	}







	public void scrollToElement(String elementText) {
		// Use UiScrollable and UiSelector to scroll to the element
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + elementText + "\"))";

		// Execute the scroll command
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.psb.ivr:id/txtTitle'' and "+"@text='" + elementText + "']"));
	}



	public void Scroll(WebElement Element) {
		try {
			// Scroll to the element
			scrollToElement(""+Element.getText()+"");

			// Verify the element is visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(Element));


			if (Element.isDisplayed()) {
				System.out.println("Element is visible after scrolling.");
			} else {
				System.out.println("Element is not visible.");
			}
		} catch (Exception e) {
			System.err.println("Error during scrolling: " + e.getMessage());
		}
	}



}
