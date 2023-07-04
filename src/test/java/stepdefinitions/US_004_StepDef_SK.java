package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage_AO;
import pages.HomePage_SK;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

public class US_004_StepDef_SK {
    HomePage_SK homePageSk = new HomePage_SK();
    Actions actions = new Actions(Driver.getDriver());
    @Given("SK navigates to home page")
    public void skNavigatesToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hypnotesUrl"));

    }

    @When("SK goes to bottom of the page")
    public void skGoesToBottomOfThePage() {

        BrowserUtilities.waitFor(5);
        JSUtils.scrollIntoViewJS(homePageSk.title_features);

        //BrowserUtilities.waitFor(15);
        //actions.scrollToElement(homePageSk.title_features);
    }

    @Then("SK verifies Facebook, LinkedIn, Twitter, Instagram icons are visible and clickable.")
    public void skVerifiesFacebookLinkedInTwitterInstagramIconsAreVisibleAndClickable() {

        for (int i = 0; i < homePageSk.link_socialIcons.size(); i++) {
            BrowserUtilities.waitFor(2);
            Assert.assertTrue(homePageSk.link_socialIcons.get(i).isDisplayed());
            Assert.assertTrue(homePageSk.link_socialIcons.get(i).isEnabled());


        }
    }

//    public void socialIconAssertions(int sIndex, String sName ){
//
//        BrowserUtilities.waitFor(20);
//        homePageSk.link_socialIcons.get(sIndex).click();
//        BrowserUtilities.waitFor(10);
//
//        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(sName));
//
//       Driver.getDriver().navigate().back();
//        BrowserUtilities.waitFor(10);
//
//    }

    @Then("SK clicks on Facebook and verifies the company-related pages is visible")
    public void skClicksOnFacebookAndVerifiesTheCompanyRelatedPagesIsVisible() {

        BrowserUtilities.waitFor(10);
        homePageSk.facebook_icon.click();
        BrowserUtilities.waitFor(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.facebook.com/"));
        BrowserUtilities.waitFor(10);
        Driver.getDriver().navigate().back();
        //socialIconAssertions(0, "facebook");

    }

    @Then("SK clicks on LinkedIn and verifies the company-related pages is visible")
    public void skClicksOnLinkedInAndVerifiesTheCompanyRelatedPagesIsVisible() {

        BrowserUtilities.waitFor(20);
        homePageSk.linkedin_icon.click();
        BrowserUtilities.waitFor(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.linkedin.com/"));
        BrowserUtilities.waitFor(10);
        Driver.getDriver().navigate().back();

        //socialIconAssertions(1, "linkedin");
    }

    @Then("SK clicks on Twitter and verifies the company-related pages is visible")
    public void skClicksOnTwitterAndVerifiesTheCompanyRelatedPagesIsVisible() {

        BrowserUtilities.waitFor(10);
        homePageSk.twitter_icon.click();
        BrowserUtilities.waitFor(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://twitter.com/"));
        BrowserUtilities.waitFor(10);
        Driver.getDriver().navigate().back();
        //socialIconAssertions(2,"twitter");
    }

    @Then("SK clicks on Instagram and verifies the company-related pages is visible")
    public void skClicksOnInstagramAndVerifiesTheCompanyRelatedPagesIsVisible() {

        BrowserUtilities.waitFor(10);
        homePageSk.instagram_icon.click();
        BrowserUtilities.waitFor(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.instagram.com/"));
        BrowserUtilities.waitFor(10);
        Driver.getDriver().navigate().back();
       // socialIconAssertions(3,"instagram");
    }
}
