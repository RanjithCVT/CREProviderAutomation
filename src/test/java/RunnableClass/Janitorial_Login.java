
package RunnableClass;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestClasses.JanitorialLoginClass;
import TestClasses.PermissionScreenClass;

public class Janitorial_Login extends BaseClass {

	@Test
	public void PermissionScren() {
		PermissionScreenClass permission= new PermissionScreenClass(driver,wait);
		permission.PermissionScreenAutomation();
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver,wait);
		janitorial.JanitorialPINLogin();
		
		
		

	}

}
