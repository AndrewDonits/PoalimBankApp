package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class PostLoginPageObjects extends ManagePages {

    public PostLoginPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "view_explanation_dialog_title")
    public AndroidElement legalTermsDialogTitle;

    @AndroidFindBy(id = "leftTV")
    public AndroidElement legalTermsAgreementBtn;

    @AndroidFindBy(id = "last_entry")
    public AndroidElement lastEntryText;

    @AndroidFindBy(id = "loader_login")
    public AndroidElement loaderLoginIcon;






}
