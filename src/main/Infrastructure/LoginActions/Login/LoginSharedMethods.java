package LoginActions.Login;

import Utilities.CommonOps;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class LoginSharedMethods extends CommonOps {

    public LoginSharedMethods() {
        super();
    }

    public String FetchCookieFromRestLogin(String Username, String Password) {
        List<Header> requestHeaders = RestLoginBankZeroWithHeaders(Username, Password);
        String myCookie = requestHeaders.get(4).toString().substring(11);
        return myCookie;
    }

    public List<Header> RestLoginBankZeroWithHeaders(String Username, String Password) {
        Response login = given()
                .baseUri("https://iphone.bankhapoalim.co.il")
                .basePath("/authenticate/verify")
                .config(RestAssured.config()
                        .encoderConfig(EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("x-www-form-urlencoded",
                                        ContentType.URLENC)))
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("organization", "0")
                .formParam("identifier", Username)
                .formParam("credentials", Password)
                .formParam("authType", "0")
                .formParam("state", "authenticate")
                .formParam("organization", "logon")
                .formParam("appId", "bankApp3Generation")
                .post();
        List<Header> requestHeaders = login.getHeaders().asList();
        return requestHeaders;
    }


}
