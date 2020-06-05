package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class IntroPagesPageObjects extends ManagePages {

    public IntroPagesPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "next_time")
    public AndroidElement nextTimeBtn;


}
