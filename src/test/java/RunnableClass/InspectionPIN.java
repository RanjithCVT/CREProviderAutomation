package RunnableClass;

import TestClasses.InspectionClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class InspectionPIN extends BaseClass {


    @Test()
    public void TC0005() {
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        InspectionClass ins= new InspectionClass(driver,wait,extent);
        ins.InspectionCompletion();


    }


}
