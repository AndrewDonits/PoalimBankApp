package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;

public class SetupTouchIDIndicationPageObjects extends ManagePages {

    public SetupTouchIDIndicationPageObjects(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "fp_intro_header_text")
    public AndroidElement setupTouchIDIntroHeader;

    @AndroidFindBy(id = "fp_intro_header_sub_text")
    public AndroidElement setupTouchIDIntroSubHeader;

    @AndroidFindBy(id = "fp_intro_desc_text")
    public AndroidElement setupTouchIDIntroDescription;

    @AndroidFindBy(id = "fp_intro_general_attention_text")
    public AndroidElement setupTouchIDIntroAttentionText;

    @AndroidFindBy(id = "intro_list_bullet_1")
    public AndroidElement setupTouchIDIntroAttentionFirstBullet;

    @AndroidFindBy(id = "intro_list_bullet_2")
    public AndroidElement setupTouchIDIntroAttentionSecondBullet;

    @AndroidFindBy(id = "intro_list_bullet_3")
    public AndroidElement setupTouchIDIntroAttentionThirdBullet;

    @AndroidFindBy(id = "proceedBtn")
    public AndroidElement setupTouchIDIntroProceedBtn;

    @AndroidFindBy(id = "fp_intro_header_close_button")
    public AndroidElement setupTouchIDIntroCloseBtn;

    @AndroidFindBy(id = "title_wizard_toolbar")
    public AndroidElement redHeaderTitle;

    @AndroidFindBy(id = "toolbar_wizard_close")
    public AndroidElement redHeaderCloseBtn;

    @AndroidFindBy(id = "wizards_step_progress")
    public AndroidElement redHeaderStepProgressBar;

    @AndroidFindBy(id = "upperGreyHeaderTitle")
    public AndroidElement upperGreyHeaderTitle;

    @AndroidFindBy(id = "//*[@id='base_edit_text' and @text='סיסמה']")
    public AndroidElement passwordField;


//    @AndroidFindBy(css = "li.ui-menu-item:nth-of-type(2) > a[id^='ui-id-']")

    @AndroidFindBy(xpath = "//*[@id='base_edit_text' and @text='קוד משתמש']")
    public AndroidElement usernameField;

    @AndroidFindBy(id = "finger_login_view_forgot_user_name")
    public AndroidElement forgotUsernameBtn;

    @AndroidFindBy(id = "finger_login_view_forgot_password")
    public AndroidElement forgotPasswordBtn;

    @Value(value = "helpHintsUsernameField")
    @AndroidFindBy(id = "base_edit_text_help")
    public AndroidElement helpHintsUsernameField;

}
