package Utilities;

import Extensions.Click;
import Extensions.Update;
import Extensions.Verify;
import LoginActions.Login.LoginTests;
import LoginActions.PreLoginIntroductionPages.IntroductionPagesTests;
import PageObjects.*;
import SharedMethods.HomePageCommonMethods;
import SharedMethods.IntroPagesSharedMethods;
import LoginActions.Login.LoginSharedMethods;
import LoginActions.TouchIDSignUpProcess.TouchIDSignUpProcessSharedMethods;
import LoginActions.TouchIDSignUpProcess.TouchIDSignUpProcessTests;
import org.openqa.selenium.WebDriver;

public class BankUi {

    public static LoginPageObjects login;
    public static PostLoginPageObjects postLogin;
    public static HomePageObjects homePage;
    public static IntroPagesPageObjects introPages;
    public static HomePageCommonMethods homePageCommonMethods;
    public static Update update;
    public static Click click;
    public static Verify verify;
    public static LoginSharedMethods loginSharedMethods;
    public static LoginTests loginTests;
    public static SetupTouchIDIndicationPageObjects setupTouchIDIndication;
    public static IntroPagesSharedMethods introPagesSharedMethods;
    public static TouchIDSignUpProcessTests touchIDSignUpProcessTests;
    public static TouchIDSignUpProcessSharedMethods touchIDSignUpProcessSharedMethods;
    public static IntroductionPagesTests introductionPagesTests;

    BankUi(WebDriver driver) {
        login = new LoginPageObjects(driver);
        postLogin = new PostLoginPageObjects(driver);
        homePage = new HomePageObjects(driver);
        update = new Update();
        click = new Click();
        verify = new Verify();
        homePageCommonMethods = new HomePageCommonMethods();
        loginSharedMethods = new LoginSharedMethods();
        setupTouchIDIndication = new SetupTouchIDIndicationPageObjects(driver);
        introPagesSharedMethods = new IntroPagesSharedMethods();
        introPages = new IntroPagesPageObjects(driver);
        loginTests = new LoginTests();
        touchIDSignUpProcessTests = new TouchIDSignUpProcessTests();
        touchIDSignUpProcessSharedMethods = new TouchIDSignUpProcessSharedMethods();
        introductionPagesTests = new IntroductionPagesTests();
    }
}
