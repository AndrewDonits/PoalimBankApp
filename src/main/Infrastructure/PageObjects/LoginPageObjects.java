package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.springframework.context.annotation.Lazy;

@Lazy
public class LoginPageObjects extends ManagePages {

    public LoginPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "login_user_name_view_automation")
    public AndroidElement usernameField;

    @AndroidFindBy(id = "login_password_view_automation")
    public AndroidElement passwordField;

    @AndroidFindBy(id = "proceedBtn")
    public AndroidElement loginBtn;

    @AndroidFindBy(id = "login_view_forgot_my_username")
    public AndroidElement forgotUserNameBtn;

    @AndroidFindBy(id = "login_view_forgot_password")
    public AndroidElement forgotPasswordBtn;

    @AndroidFindBy(id = "login_view_only_finger")
    public AndroidElement loginWithFingerPrintBtn;

    @AndroidFindBy(id = "login_view_only_finger_image")
    public AndroidElement loginWithFingerPrintBtnImg;



}
