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
        introductionPagesTests.skipIntroPages();
        loginTests.insertCredentials(props.getProperty("UserProd"), props.getProperty("PasswordProd"));
        loginTests.clickOnLogin();
        loginTests.acceptLegalTerms();
        loginTests.verifyHomePageData();
    }

    @Test
    @Description("This test is for sign up for TouchID process, before login")
    public void Test02_SignUpToTouchIDBeforeLogin() throws IOException, ParserConfigurationException, SAXException {
        introductionPagesTests.skipIntroPages();
        touchIDSignUpProcessTests.enterTouchIDSignUpProcess(true);
        touchIDSignUpProcessTests.verifyIntroPageHeader();
        touchIDSignUpProcessTests.verifyIntroPageSubHeader();
        touchIDSignUpProcessTests.verifyIntroPageDescription();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionTitle();
        touchIDSignUpProcessTests.verifyIntroPageAttentionSectionBullets();
        touchIDSignUpProcessTests.clickOnCloseBtn();
    }
}
