package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class HomePageObjects extends ManagePages {

    public HomePageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "home_page_header_info_container")
    public AndroidElement headerInfo;

    @AndroidFindBy(id = "welcome_text")
    public AndroidElement welcomeText;

    @AndroidFindBy(id = "party_first_name")
    public AndroidElement clientName;
}
