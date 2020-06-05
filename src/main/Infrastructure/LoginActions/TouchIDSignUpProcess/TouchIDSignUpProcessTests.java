package LoginActions.TouchIDSignUpProcess;

import Utilities.CommonOps;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static Utilities.BankUi.*;
import static Utilities.BankUi.setupTouchIDIndication;

public class TouchIDSignUpProcessTests extends CommonOps {

    public TouchIDSignUpProcessTests() { super();}

    @Test
    public void verifyIntroPageHeader() throws IOException, ParserConfigurationException, SAXException {
        click.on(login.loginWithFingerPrintBtn, "login", "loginWithFingerPrintBtn", true);
        verify.textInElement(
                setupTouchIDIndication.setupTouchIDIntroHeader,
                getData("TouchIDIntroHeader"),
                "setupTouchIDIndication",
                "setupTouchIDIntroHeader"
        );
    }

    @Test
    public void verifyIntroPageSubHeader() throws IOException, ParserConfigurationException, SAXException {
        String[] subHeaderSplit = setupTouchIDIndication.setupTouchIDIntroSubHeader.getText().split(",");
        verify.text(
                setupTouchIDIndication.setupTouchIDIntroSubHeader,
                subHeaderSplit[0].trim() + ",",
                getData("TouchIDIntroSubHeaderFirstRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroSubHeader"
        );
        verify.text(
                setupTouchIDIndication.setupTouchIDIntroSubHeader,
                subHeaderSplit[1].trim(),
                getData("TouchIDIntroSubHeaderSecondRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroSubHeader"
        );
    }

    @Test
    public void verifyIntroPageDescription() throws IOException, ParserConfigurationException, SAXException {
        String[] descriptionSplit = setupTouchIDIndication.setupTouchIDIntroDescription.getText().split(",");
        verify.text(
                setupTouchIDIndication.setupTouchIDIntroDescription,
                descriptionSplit[0].trim() + ",",
                getData("TouchIDIntroDescriptionFirstRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroDescription"
        );
        verify.text(
                setupTouchIDIndication.setupTouchIDIntroDescription,
                descriptionSplit[1].trim(),
                getData("TouchIDIntroDescriptionSecondRow"),
                "setupTouchIDIndication",
                "setupTouchIDIntroDescription"
        );
    }

    @Test
    public void verifyIntroPageAttentionSectionTitle() throws IOException, SAXException, ParserConfigurationException {
        verify.textInElement(
                setupTouchIDIndication.setupTouchIDIntroAttentionText,
                getData("TouchIDIntroAttention"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionText"
        );
    }

    @Test
    public void verifyIntroPageAttentionSectionBullets() throws IOException, SAXException, ParserConfigurationException {
        verify.textInElement(
                setupTouchIDIndication.setupTouchIDIntroAttentionFirstBullet,
                getData("TouchIDIntroFirstBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionFirstBullet"
        );
        verify.textInElement(
                setupTouchIDIndication.setupTouchIDIntroAttentionSecondBullet,
                getData("TouchIDIntroSecondBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionSecondBullet"
        );
        verify.textInElement(
                setupTouchIDIndication.setupTouchIDIntroAttentionThirdBullet,
                getData("TouchIDIntroThirdBullet"),
                "setupTouchIDIndication",
                "setupTouchIDIntroAttentionThirdBullet"
        );
    }

    @Test
    public void clickOnProceedBtn() throws IOException, SAXException, ParserConfigurationException {
        click.on(
                setupTouchIDIndication.setupTouchIDIntroProceedBtn,
                "setupTouchIDIndication",
                "setupTouchIDIntroProceedBtn",
                true
        );
    }
}
