package Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

public class CommonOps extends Base{

    /***************************** Main Methods *******************************/



    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        instanceReports();
        loadPropertiesFile();
        initDriver(
                props.getProperty("BankDeviceUUID"),
                props.getProperty("BankDeviceAppPackage"),
                props.getProperty("BankDeviceAppActivity")
        );
//        dc.setCapability(MobileCapabilityType.UDID, props.getProperty("BankDeviceUUID"));
//        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, props.getProperty("BankDeviceAppPackage"));
//        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, props.getProperty("BankDeviceAppActivity"));
//        driver = getDriver();
        driverWait = new WebDriverWait(driver, 15);
        action = new Actions(driver);
        bankUi = new BankUi(driver);
    }

    @BeforeMethod
    public void beforeMethod(Method method) throws IOException {
        initReportsTest(method.getName().split("_")[1], method.getName().split("_")[0]);
//        driver.resetApp();
    }

    @AfterMethod
    public void afterMethod() {
        finalizeReportsTest();
        driver.quit();
    }

    @AfterClass
    public void afterClass() {
        finalizeReport();
    }

    /******************************** Initiation ********************************/

    public void initDriver(String UDID, String AppPackage, String AppActivity) throws MalformedURLException {
        dc.setCapability(MobileCapabilityType.UDID, UDID);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AppPackage);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppActivity);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
//        driver.resetApp();
        dc.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, true);
//        driver.installApp(prop.getProperty("EmulatorAppPath"));
    }

    public AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    /******************************** Reports ***********************************/

    public void instanceReports() {
        extent = new ExtentReports(
                "E:/InteliJ/BankApp/Reports/"
                + "Execution_"
                + timeStamp
                + "/" + "bankSanity"
                + ".html");
    }

    public static void initReportsTest(String testName, String testDescription) {
        test = extent.startTest(testName, testDescription);
    }

    public static void finalizeReport() {
        extent.flush();
        extent.close();
    }

    public static void finalizeReportsTest() {
        extent.endTest(test);
    }


    public static String SSReport(RemoteWebDriver driver, String imageName) throws IOException {
        String SSPath =  imageName +".png";
        File scrFile = driver.getScreenshotAs(OutputType.FILE);
        File targetFile = new File("E:/InteliJ/BankApp/Images/", SSPath);
        try {
            FileUtils.copyFile(scrFile, targetFile);
        } catch (IOException e) {
            test.log(LogStatus.INFO, "Unable to log screenshot");
        }
        return targetFile.getAbsolutePath();
    }


    /*********************************Other**************************************/

    public static void loadPropertiesFile() {

        File file = new File("E:/InteliJ/BankApp/src/main/configuration/.properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
            props.load(fileInput);
        } catch (FileNotFoundException e) {
            test.log(LogStatus.FAIL, "Couldn't load properties file, see exception ==> " + e.getMessage());
        } catch (IOException e) {
            test.log(LogStatus.FAIL, "Couldn't load properties file, see exception ==> " + e.getMessage());
        }
    }

    public static int getCurrentHour() {
        now = LocalDateTime.now();
        return(now.getHour());
    }

    public static String getData(String nodeName) throws ParserConfigurationException, IOException, SAXException, SAXException {
        File fXmlFile = new File("E:/InteliJ/BankApp/src/main/configuration/Static_Texts.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }


}
