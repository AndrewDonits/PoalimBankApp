package Utilities;

import Extensions.Click;
import Extensions.Update;
import Extensions.Verify;
import LoginActions.Login.LoginTests;
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

    BankUi(WebDriver driver) {
        this.login = new LoginPageObjects(driver);
        this.postLogin = new PostLoginPageObjects(driver);
        this.homePage = new HomePageObjects(driver);
        this.update = new Update();
        this.click = new Click();
        this.verify = new Verify();
        this.homePageCommonMethods = new HomePageCommonMethods();
        this.loginSharedMethods = new LoginSharedMethods();
        this.setupTouchIDIndication = new SetupTouchIDIndicationPageObjects(driver);
        this.introPagesSharedMethods = new IntroPagesSharedMethods();
        this.introPages = new IntroPagesPageObjects(driver);
        this.loginTests = new LoginTests();
        this.touchIDSignUpProcessTests = new TouchIDSignUpProcessTests();
        this.touchIDSignUpProcessSharedMethods = new TouchIDSignUpProcessSharedMethods();
    }
}
