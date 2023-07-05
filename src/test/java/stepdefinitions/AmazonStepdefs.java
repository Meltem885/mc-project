package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonHomePage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

public class AmazonStepdefs {

    AmazonHomePage ahp = new AmazonHomePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);

        BrowserUtilities.waitFor(2);
        //ahp.acceptCookies.click();
        JSUtils.clickElementByJS(ahp.acceptCookies);

    }

    @When("user hover-overs on the Hello, sign in module")
    public void userHoverOversOnTheHelloSignInModule() {
        BrowserUtilities.waitFor(2);
        actions.moveToElement(ahp.helloSignIn_Mod);


    }

    @And("user sees Start here. link and clicks on it")
    public void userSeesStartHereLinkAndClicksOnIt() {
        BrowserUtilities.waitFor(2);
        ahp.startHere_link.click();
    }

    @And("user enters First and last name")
    public void userEntersFirstAndLastName() {
    }

    @And("user enters phone number or email")
    public void userEntersPhoneNumberOrEmail() {
    }

    @And("user enters password")
    public void userEntersPassword() {
    }

    @And("user reenters password")
    public void userReentersPassword() {
    }

    @And("user clicks continue button")
    public void userClicksContinueButton() {
    }
}
