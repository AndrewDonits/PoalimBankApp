package LoginActions.Login;

import Utilities.CommonOps;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import static Utilities.BankUi.*;

public class LoginTests extends CommonOps {

    public void insertCredentials(String username, String password) {
        update.sendKeys(username, loginObjects.usernameField, "login", "usernameField");
        update.sendKeys(password, loginObjects.passwordField, "login", "passwordField");
    }

    public void clickOnLogin() throws IOException {
        click.onElement(loginObjects.loginBtn, "login", "loginBtn", true);
    }

    public void acceptLegalTerms() {
        try {
            verify.textInElement(postLoginObjects.legalTermsDialogTitle, "תנאים משפטיים","postLogin", "legalTermsDialogTitle");
            click.onElement(postLoginObjects.legalTermsAgreementBtn, "postLogin", "legalTermsAgreementBtn", true);
        } catch (Exception e) {
            test.log(LogStatus.INFO, "Not first login, totally fine");
        }
    }

    public void verifyHomePageData() {
        verify.textInElement(
                homePageObjects.welcomeText,
                homePageSharedMethods.getHomePageTitleByTime(getCurrentHour()),
                "homePage",
                "welcomeText"
        );
        verify.textInElement(homePageObjects.clientName, "איתן אריאל", "homePage","clientName");
    }
}
