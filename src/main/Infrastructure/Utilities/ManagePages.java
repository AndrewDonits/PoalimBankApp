package Utilities;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public ManagePages(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}