package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage_AO;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

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
        Assert.assertEquals(expectedUrl, actualUrl);

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

        Assert.assertTrue(homePage_ao.link_signIn.isDisplayed());
        Assert.assertTrue(homePage_ao.link_signIn.isEnabled());

        homePage_ao.link_signIn.click();
        BrowserUtilities.waitFor(2);

        String expectedUrl = "https://test.hypnotes.net/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        String expectedTitle = "Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

    }

    @And("AO goes to at the button of home page")
    public void aoGoesToAtTheButtonOfHomePage() {
        //JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(2);
    }

    @Then("AO verifies Go ahead, give it a try! text is visible")
    public void aoVerifiesGoAheadGiveItATryTextIsVisible() {
        Assert.assertTrue(homePage_ao.text_goAhead.isDisplayed());
        System.out.println("homePage_ao = " + homePage_ao.text_goAhead.getText());
    }

    @Then("Try it for Free button should be visible and clickable.")
    public void tryItForFreeButtonShouldBeVisibleAndClickable() {
        Assert.assertTrue(homePage_ao.button_tryItForFreeBottom.isDisplayed());
        Assert.assertTrue(homePage_ao.button_tryItForFreeBottom.isEnabled());
    }

    @And("AO clicks the Try it for Free button")
    public void aoClicksTheTryItForFreeButton() {
        JSUtils.scrollIntoViewJS(homePage_ao.button_tryItForFreeBottom);
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJS(homePage_ao.button_tryItForFreeBottom);
        BrowserUtilities.waitFor(2);
    }

    @Then("Therapist Register section should be visible.")
    public void therapistRegisterSectionShouldBeVisible() {
        Assert.assertTrue(homePage_ao.text_registerAsaTerapist.isDisplayed());
    }

    @Then("AO verifies Related page url is {string}")
    public void aoVerifiesRelatedPageUrlIs(String arg0) {
        String expectedUrl = "https://test.hypnotes.net/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }
}
