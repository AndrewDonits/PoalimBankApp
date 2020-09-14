package Utilities;

import Extensions.Click;
import Extensions.Update;
import Extensions.Verify;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Properties;

public class Base {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    protected static BankUi bankUi;
    public static String myElementName;
    public static Field[] fld;
    public static LocalDateTime now = LocalDateTime.now();
    public static String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());

    public static AndroidDriver<AndroidElement> driver;
    public static WebDriverWait driverWait;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static Actions action;
    public static Properties props = new Properties();
    public static ExtentReports extent;
    public static ExtentTest test;
    public static Update update;
    public static Click click;
    public static Verify verify;



}