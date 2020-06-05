package PageObjects;

import Utilities.ManagePages;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

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

}
