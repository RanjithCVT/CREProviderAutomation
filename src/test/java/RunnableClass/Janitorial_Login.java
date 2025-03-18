
package RunnableClass;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestClasses.JanitorialLoginClass;
import TestClasses.PermissionScreenClass;

public class Janitorial_Login extends BaseClass {

	@Test()
	public void TC0001() throws Exception {
		PermissionScreenClass permission = new PermissionScreenClass(driver, wait, extent);
		permission.PermissionScreenAutomation();
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver, wait, extent);
//		janitorial.JanitorialPINLogin();
		

	}
	
	@Test(dependsOnMethods = "TC0001",enabled = false)
	public void TC0002()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver, wait, extent);
		janitorial.JanitorialPIN_CICO();
	}
	
	
	@Test(dependsOnMethods = "TC0001")
	public void TC0003() throws Exception
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JanitorialLoginClass janitorial = new JanitorialLoginClass(driver, wait, extent);
		janitorial.TwoWayLoginWOCompletion();
		
	}
	
	
	
	
	

}
