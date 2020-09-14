package Extensions;

import Utilities.CommonOps;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;

public class Click extends CommonOps {

    public void onElement(AndroidElement elem, String className, String name, boolean fail) throws IOException {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem)).click();
            test.log(LogStatus.PASS,
                        "Successfully managed to click on element: "
                                + Variables.getName(className, name),
                        test.addScreenCapture(SSReport(getDriver(), name)));
        } catch (Exception e) {
            if (fail) {
                test.log(LogStatus.FAIL,
                        "Couldn't manage to click on element: "
                                + Variables.getName(className, name),
                        test.addScreenCapture(SSReport(getDriver(), name)));
                Assert.fail();
            } else {
                test.log(LogStatus.INFO,
                        "Couldn't manage to click on element: "
                                + Variables.getName(className, name),
                        test.addScreenCapture(SSReport(getDriver(), name)));
            }
        }
    }
}
