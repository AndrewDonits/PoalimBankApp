package Utilities;

import Extensions.Click;
import Extensions.Update;
import Extensions.Verify;
import LoginActions.Login.LoginSharedMethods;
import LoginActions.Login.LoginTests;
import LoginActions.PreLoginIntroductionPages.IntroPagesTests;
import LoginActions.TouchIDSignUpProcess.TouchIDSignUpProcessSharedMethods;
import LoginActions.TouchIDSignUpProcess.TouchIDSignUpProcessTests;
import PageObjects.*;
import SharedMethods.HomePageSharedMethods;
import SharedMethods.IntroPagesSharedMethods;
import org.openqa.selenium.WebDriver;

public class BankUi extends Base {

    public static LoginPageObjects loginObjects;
    public static PostLoginPageObjects postLoginObjects;
    public static IntroPagesPageObjects introPagesObjects;
    public static HomePageObjects homePageObjects;
    public static LoginSharedMethods loginSharedMethods;
    public static HomePageSharedMethods homePageSharedMethods;
    public static LoginTests loginTests;
    public static IntroPagesSharedMethods introPagesSharedMethods;
    public static TouchIDSignUpProcessTests touchIDSignUpProcessTests;
    public static TouchIDSignUpProcessSharedMethods touchIDSignUpProcessSharedMethods;
    public static SetupTouchIDIndicationPageObjects setupTouchIDIndicationPageObjects;
    public static IntroPagesTests introPagesTests;

    BankUi(WebDriver driver) {
        loginObjects = new LoginPageObjects(driver);
        postLoginObjects = new PostLoginPageObjects(driver);
        loginSharedMethods = new LoginSharedMethods();
        introPagesSharedMethods = new IntroPagesSharedMethods();
        introPagesObjects = new IntroPagesPageObjects(driver);
        loginTests = new LoginTests();
        touchIDSignUpProcessTests = new TouchIDSignUpProcessTests();
        touchIDSignUpProcessSharedMethods = new TouchIDSignUpProcessSharedMethods();
        introPagesTests = new IntroPagesTests();
        homePageSharedMethods = new HomePageSharedMethods();
        update = new Update();
        click = new Click();
        verify = new Verify();
        homePageObjects = new HomePageObjects(driver);
        setupTouchIDIndicationPageObjects = new SetupTouchIDIndicationPageObjects(driver);
    }
}
