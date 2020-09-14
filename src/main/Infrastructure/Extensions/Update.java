package Extensions;

import Utilities.CommonOps;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Update extends CommonOps {

    public void sendKeys(String value, AndroidElement elem, String className, String name) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem)).sendKeys(value);
            test.log(
                    LogStatus.PASS,
                    "Element: "
                            + Variables.getName(className, name)
                            + " updated successfully with the following value: "
                            + value
            );
        } catch(Exception e) {
            test.log(
                    LogStatus.FAIL, "Failed to update the following element: ["
                            + Variables.getName(className, name)
                            + "] ,with this value: "
                            + value);
            Assert.fail();
        }
    }

}
