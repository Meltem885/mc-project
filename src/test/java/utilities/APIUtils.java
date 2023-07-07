package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

public class APIUtils {
    public static Response response;


    public static RequestSpecification spec = new RequestSpecBuilder().
            addCookie(new Cookie.Builder("PHPSESSID", "00palvcvuhl726h29cct6589km").build()).
            setBaseUri(ConfigurationReader.getProperty("baseURI")).setRelaxedHTTPSValidation().build();


}
