
package RunnableClass;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestClasses.JanitorialLoginClass;
import TestClasses.PermissionScreenClass;

public class Janitorial_Login extends BaseClass {

	@Test(priority = 0)
	public void PermissionScren() {
		PermissionScreenClass permission = new PermissionScreenClass(driver, wait, extent);
		permission.PermissionScreenAutomation();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver, wait, extent);
		janitorial.JanitorialPINLogin();

	}
	
	@Test(priority = 1)
	public void JanitorialCheckInCheckOut()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver, wait, extent);
		janitorial.JanitorialPIN_CICO();
	}

}
