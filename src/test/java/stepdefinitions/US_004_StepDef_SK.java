package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

        BrowserUtilities.waitFor(15);
        //BrowserUtilities.scrollToElement(homePageSk.title_features);
        homePageSk.button_signup.click();
        BrowserUtilities.waitFor(15);


        //actions.scrollToElement(homePageSk.title_features);
    }

    @Then("SK verifies Facebook, LinkedIn, Twitter, Instagram icons are visible and clickable.")
    public void skVerifiesFacebookLinkedInTwitterInstagramIconsAreVisibleAndClickable() {
    }
}
