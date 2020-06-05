package MyTests;

import Utilities.CommonOps;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static Utilities.BankUi.*;

public class Sanity extends CommonOps {

    @Test
    @Description("This test verifies simple login")
    public void Test01_SimpleLogin() throws IOException {
        loginTests.getToLoginPage();
        loginTests.insertCredentials();
        loginTests.clickOnLogin();
        loginTests.acceptLegalTerms();
        loginTests.verifyHomePageData();
    }

    @Test
    @Description("This test verifies TouchId login, it's pre-condition is touchID sign up process")
    public void Test02_SignUpToTouchID() throws IOException, ParserConfigurationException, SAXException {
        loginTests.getToLoginPage();
        touchIDSignUpProcessTests.verifyIntroPageHeader();
        touchIDSignUpProcessTests.verifyIntroPageSubHeader();
        touchIDSignUpProcessTests.verifyIntroPageDescription();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionTitle();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionBullets();
        touchIDSignUpProcessTests.clickOnProceedBtn();
    }
}
