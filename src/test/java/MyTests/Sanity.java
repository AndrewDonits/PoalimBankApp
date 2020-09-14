package MyTests;

import Utilities.CommonOps;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static Utilities.BankUi.*;

public class Sanity extends CommonOps {


    public String getUsername() {
        return props.getProperty("UserProd");
    }

    public String getPassword() {
        return props.getProperty("PasswordProd");
    }

    @Test
    @Description("This test verifies simple login")
    public void Test01_SimpleLogin() throws IOException {
        introPagesTests.skipIntroPages(false);
        loginTests.insertCredentials(getUsername(), getPassword());
        loginTests.clickOnLogin();
        loginTests.acceptLegalTerms();
        loginTests.verifyHomePageData();
    }

    @Test
    @Description("This test is for sign up for TouchID process, before login")
    public void Test02_SignUpToTouchIDBeforeLogin() throws IOException, ParserConfigurationException, SAXException {
        introPagesTests.skipIntroPages(false);
        touchIDSignUpProcessTests.enterTouchIDSignUpProcess(true);
        touchIDSignUpProcessTests.verifyIntroPageHeader();
        touchIDSignUpProcessTests.verifyIntroPageSubHeader();
        touchIDSignUpProcessTests.verifyIntroPageDescription();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionTitle();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionBullets();
        touchIDSignUpProcessTests.clickOnCloseBtn();
        touchIDSignUpProcessTests.enterTouchIDSignUpProcess(true);
        touchIDSignUpProcessTests.clickOnProceedBtn();
        verify.textInElement(setupTouchIDIndicationPageObjects.redHeaderTitle,"זיהוי בטביעת אצבע" , "setupTouchIDIndication", "redHeaderTitle");
        verify.textInElement(setupTouchIDIndicationPageObjects.upperGreyHeaderTitle, "יש להקליד באופן חד פעמי את פרטי הזיהוי", "setupTouchIDIndication", "upperGreyHeaderTitle");
        update.sendKeys(getUsername(), setupTouchIDIndicationPageObjects.usernameField, "setupTouchID", "usernameField");
        update.sendKeys(getPassword(), setupTouchIDIndicationPageObjects.passwordField, "setupTouchID", "passwordField");
        touchIDSignUpProcessTests.clickOnProceedBtn();
    }
}
