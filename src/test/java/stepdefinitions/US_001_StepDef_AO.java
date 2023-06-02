package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage_AO;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_StepDef_AO {

    HomePage_AO homePage_ao = new HomePage_AO();


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
    @Then("AO verifies headings are visible in the home page")
    public void aoVerifiesHeadingsAreVisibleInTheHomePage() {
        BrowserUtilities.waitFor(3);

        for (int i = 0; i < homePage_ao.allHeadings.size(); i++) {

            System.out.println(homePage_ao.allHeadings.get(i).getText());
            Assert.assertTrue(homePage_ao.allHeadings.get(i).isDisplayed());
        }
    }
    @Then("AO verifies headings are clickable in the home page")
    public void aoVerifiesHeadingsAreClickableInTheHomePage() {
        for (int i = 0; i < homePage_ao.allHeadings.size(); i++) {

            Assert.assertTrue(homePage_ao.allHeadings.get(i).isEnabled());
        }
    }
    @Then("AO verifies try it for Free is visible and clickable")
    public void aoVerifiesTryItForFreeIsVisibleAndClickable() {

        BrowserUtilities.waitFor(3);
        Assert.assertTrue(homePage_ao.button_tryItForFree.isDisplayed());
        Assert.assertTrue(homePage_ao.button_tryItForFree.isEnabled());
    }
    @Then("AO verifies Sign In headers is visible and clickable")
    public void aoVerifiesSignInHeadersIsVisibleAndClickable() {


    }




}
