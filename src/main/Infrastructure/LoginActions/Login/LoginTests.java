package LoginActions.Login;

import Utilities.CommonOps;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utilities.BankUi.*;
import static Utilities.BankUi.homePage;

@Test
public class LoginTests extends CommonOps {

    public LoginTests() {
        super();
    }

    @Test
    public void getToLoginPage() throws IOException {
        introPagesSharedMethods.nextTimeButton(false);
    }

    @Test
    public void insertCredentials() {
        update.sendKeys(props.getProperty("UserProd"), login.usernameField, "login", "usernameField");
        update.sendKeys(props.getProperty("PasswordProd"), login.passwordField, "login", "passwordField");
    }

    @Test
    public void clickOnLogin() throws IOException {
        click.on(login.loginBtn, "login", "loginBtn", true);
    }

    @Test
    public void acceptLegalTerms() {
        try {
            verify.textInElement(postLogin.legalTermsDialogTitle, "תנאים משפטיים","postLogin", "legalTermsDialogTitle");
            click.on(postLogin.legalTermsAgreementBtn, "postLogin", "legalTermsAgreementBtn", true);
        } catch (Exception e) {
            test.log(LogStatus.INFO, "Not first login, totally fine");
        }
    }

    @Test
    public void verifyHomePageData() {
        verify.textInElement(
                homePage.welcomeText,
                homePageCommonMethods.getHomePageTitleByTime(getCurrentHour()),
                "homePage",
                "welcomeText"
        );
        verify.textInElement(homePage.clientName, "איתן אריאל", "homePage","clientName");
    }
}
