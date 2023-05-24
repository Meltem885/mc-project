package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_StepDef_AO {
    @Given("AO goes to home page")
    public void AOGoesToHomePage() {

      // Driver.getDriver().get("https://test.hypnotes.net/");
       Driver.getDriver().get(ConfigurationReader.getProperty("hypnotesUrl"));

    }

    @Then("AO verifies the url")
    public void AOVerifiesTheUrl() {

        String expectedUrl = "https://test.hypnotes.net/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);



    }
}
