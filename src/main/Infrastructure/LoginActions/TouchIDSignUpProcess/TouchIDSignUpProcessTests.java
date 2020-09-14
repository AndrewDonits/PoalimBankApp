package LoginActions.TouchIDSignUpProcess;

import Utilities.CommonOps;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static Utilities.BankUi.loginObjects;
import static Utilities.BankUi.setupTouchIDIndicationPageObjects;

public class TouchIDSignUpProcessTests extends CommonOps {

    public void enterTouchIDSignUpProcess(boolean preLogin) throws IOException {
        if (preLogin)
            click.onElement(loginObjects.loginWithFingerPrintBtn, "login", "loginWithFingerPrintBtn", true);

        //TODO Need to add sign up with finger print button after login here
    }

    public void verifyIntroPageHeader() throws IOException, ParserConfigurationException, SAXException {
        verify.textInElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroHeader,
                getData("TouchIDIntroHeader"),
                "setupTouchIDIndication",
                "setupTouchIDIntroHeader"
        );
    }

    public void verifyIntroPageSubHeader() throws IOException, ParserConfigurationException, SAXException {
        String[] subHeaderSplit = setupTouchIDIndicationPageObjects.setupTouchIDIntroSubHeader.getText().split(",");
        verify.text(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroSubHeader,
                subHeaderSplit[0].trim() + ",",
                getData("TouchIDIntroSubHeaderFirstRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroSubHeader"
        );
        verify.text(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroSubHeader,
                subHeaderSplit[1].trim(),
                getData("TouchIDIntroSubHeaderSecondRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroSubHeader"
        );
    }

    public void verifyIntroPageDescription() throws IOException, ParserConfigurationException, SAXException {
        String[] descriptionSplit = setupTouchIDIndicationPageObjects.setupTouchIDIntroDescription.getText().split(",");
        verify.text(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroDescription,
                descriptionSplit[0].trim() + ",",
                getData("TouchIDIntroDescriptionFirstRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroDescription"
        );
        verify.text(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroDescription,
                descriptionSplit[1].trim(),
                getData("TouchIDIntroDescriptionSecondRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroDescription"
        );
    }

    public void verifyIntroPageAttentionSectionTitle() throws IOException, SAXException, ParserConfigurationException {
        verify.textInElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroAttentionText,
                getData("TouchIDIntroAttention"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionText"
        );
    }

    public void verifyIntroPageAttentionSectionBullets() throws IOException, SAXException, ParserConfigurationException {
        verify.textInElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroAttentionFirstBullet,
                getData("TouchIDIntroFirstBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionFirstBullet"
        );
        verify.textInElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroAttentionSecondBullet,
                getData("TouchIDIntroSecondBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionSecondBullet"
        );
        verify.textInElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroAttentionThirdBullet,
                getData("TouchIDIntroThirdBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionThirdBullet"
        );
    }

    public void clickOnProceedBtn() throws IOException {
        click.onElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroProceedBtn,
                "setupTouchIDIndication",
                "setupTouchIDIntroProceedBtn",
                true
        );
    }

    public void clickOnCloseBtn() throws IOException {
        click.onElement(
                setupTouchIDIndicationPageObjects.setupTouchIDIntroCloseBtn,
                "setupTouchIDIndication",
                "setupTouchIDIntroCloseBtn",
                true
        );
    }
}
