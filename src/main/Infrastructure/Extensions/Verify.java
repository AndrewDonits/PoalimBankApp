package Extensions;

import Utilities.CommonOps;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class Verify extends CommonOps {

    public void textInElement(AndroidElement elem, String value, String className, String name) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(elem));
            assertEquals(elem.getText().trim(), value);
            test.log(
                    LogStatus.PASS,
                    "The following text: "
                            + value
                            + ", was found successfully in the following element: "
                            + Variables.getName(className, name)
            );
        } catch (Exception e) {
            test.log(
                    LogStatus.FAIL,
                            "Failed to find the following text: "
                            + value
                            + ", in the following element: "
                            + Variables.getName(className, name)
                    );
            Assert.fail();
        }

    }

    public void text(AndroidElement elem, String actualValue, String expectedValue , String className, String name) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(elem));
            assertEquals(actualValue, expectedValue);
            test.log(
                    LogStatus.PASS,
                    "The following text: "
                            + expectedValue
                            + ", found successfully in the following element: "
                            + Variables.getName(className, name)
            );
        } catch (Exception e) {
            test.log(
                    LogStatus.FAIL,
                    "Failed to find the following text: "
                            + expectedValue
                            + ", in the following element: "
                            + Variables.getName(className, name)
            );
            Assert.fail();
        }

    }

}
