package SharedMethods;

import Utilities.CommonOps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.restassured.response.Response;

import static Utilities.BankUi.loginSharedMethods;
import static io.restassured.RestAssured.given;

public class HomePageSharedMethods extends CommonOps {

    protected Response gender;


    public String getHomePageTitleByTime(int currentTime) {
        if (currentTime < 11 && currentTime >= 5)
            return "בוקר טוב";
        else if (currentTime < 17 && currentTime >= 11)
            return "צהריים טובים";
        else if (currentTime < 21 && currentTime >= 17)
            return "ערב טוב";
        else if ((currentTime <= 23 && currentTime >= 21) || (currentTime < 5 && currentTime >= 0)) {
            gender = GetBasicResponse(
                    props.getProperty("baseProdURI"),
                    props.getProperty("initiationPath"),
                    props.getProperty("AccountId")
            );
            if (gender.getBody().asString().split(",")[13].equals("\"genderCode\":2"))
                return "ברוכה הבאה";
            else
                return "ברוך הבא";
        }
        else
            return "Empty String, Automation Problem";
    }



    protected Response GetBasicResponse(String baseURI, String basePath, String AccountId) {
        String myCookie = loginSharedMethods
                .FetchCookieFromRestLogin(props.getProperty("UserProdRestOrWeb"), props.getProperty("PasswordProdRestOrWeb"));
        Response response = given()
                .baseUri(baseURI)
                .basePath(basePath)
                .param("accountId", AccountId)
                .header("variousChannelTypeCode", "6")
                .header("Cookie", myCookie)
                .get();
        return response;
    }
}
