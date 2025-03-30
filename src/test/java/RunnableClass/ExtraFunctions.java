package RunnableClass;

import POM_Pages.HomeScreenPOM;
import POM_Pages.JanitorialPIN.JanitorialPIN_HomescreenPOM;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;

public class ExtraFunctions {

	public AndroidDriver driver;
	public JanitorialPIN_HomescreenPOM janhome;
	public WebDriverWait wait;
	public HomeScreenPOM home;
	private static final String RECYCLER_VIEW_ID = "com.psb.ivr:id/recyclerView";
	private static final int MAX_SCROLL_ATTEMPTS = 10;

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




	public void manualScrollBottomToTop() {
		// Get screen size
		Dimension size = driver.manage().window().getSize();

		int startX = size.width / 2; // Middle of the screen

		int startY = (int) (size.height * 0.8); // Start near the bottom (80% of screen height)
		int endY = (int) (size.height * 0.02); // End near the top (20% of screen height)
		System.out.println(startX);	System.out.println(startY);	System.out.println(endY);

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scroll = new Sequence(finger, 0);

		// Move finger to start position (bottom of the screen)
		scroll.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));

		// Press down on screen
		scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

		// Move finger up to scroll
		scroll.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));

		// Release finger
		scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		// Perform the scrolling action
		driver.perform(Collections.singletonList(scroll));
		driver.perform(Collections.singletonList(scroll));
	}









//	public void scrollToElement(String elementText) {
//		// Use UiScrollable and UiSelector to scroll to the element
//		System.out.println(elementText);
//		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + elementText + "\"))";
//
//		// Execute the scroll command
//		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.psb.ivr:id/txtTitle' and " + "@text='" + elementText + "']"));
//	}
//
//
//	public void Scroll(WebElement Element) {
//		try {
//			// Scroll to the element
//			scrollToElement("" + Element.getText() + "");
//
//			// Verify the element is visible
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOf(Element));
//
//
//			if (Element.isDisplayed()) {
//				System.out.println("Element is visible after scrolling.");
//			} else {
//				System.out.println("Element is not visible.");
//			}
//		} catch (Exception e) {
//			System.err.println("Error during scrolling: " + e.getMessage());
//		}
//	}



}
