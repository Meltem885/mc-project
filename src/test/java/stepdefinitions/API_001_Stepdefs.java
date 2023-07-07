package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static utilities.APIUtils.response;
import static utilities.APIUtils.spec;


public class API_001_Stepdefs {

    @Given("user connects to the {string} without payload")
    public void userConnectsToTheWithoutPayload(String pathParam) {
        response=given().contentType(ContentType.JSON).spec(spec).when().post(pathParam);
        response.prettyPrint();
    }

    @Then("user verifies the status code is {int}")
    public void userVerifiesTheStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }
}
