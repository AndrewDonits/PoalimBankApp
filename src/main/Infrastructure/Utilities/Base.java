package Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Properties;

public class Base {
    public static BankUi bankUi;
    public static AndroidDriver<AndroidElement> driver = null;
    public static WebDriverWait driverWait;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static Actions action;
    public static Properties props = new Properties();
    public static ExtentReports extent;
    public static ExtentTest test;
//    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static LocalDateTime now = LocalDateTime.now();
    public static String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());


}