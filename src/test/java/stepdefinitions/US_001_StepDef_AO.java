package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage_AO;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import static utilities.BrowserUtilities.clickWithJS;
import static utilities.BrowserUtilities.waitFor;


public class US_001_StepDef_AO {

    HomePage_AO homePage_ao = new HomePage_AO();
    Actions actions = new Actions(Driver.getDriver());


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
        waitFor(3);

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

        waitFor(3);
        Assert.assertTrue(homePage_ao.button_tryItForFree.isDisplayed());
        Assert.assertTrue(homePage_ao.button_tryItForFree.isEnabled());
    }

    @Then("AO verifies Sign In headers is visible and clickable")
    public void aoVerifiesSignInHeadersIsVisibleAndClickable() {

        Assert.assertTrue(homePage_ao.link_signIn.isDisplayed());
        Assert.assertTrue(homePage_ao.link_signIn.isEnabled());

        homePage_ao.link_signIn.click();
        waitFor(2);

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
        waitFor(2);
    }

    @Then("AO verifies Go ahead, give it a try! text is visible")
    public void aoVerifiesGoAheadGiveItATryTextIsVisible() {
        Assert.assertTrue(homePage_ao.text_goAhead.isDisplayed());
        System.out.println("homePage_ao = " + homePage_ao.text_goAhead.getText());
    }

    @Then("AO verifies Try it for Free button is visible and clickable.")
    public void aoVerifiesTryItForFreeButtonIsVisibleAndClickable() {
        Assert.assertTrue(homePage_ao.button_tryItForFreeBottom.isDisplayed());
        Assert.assertTrue(homePage_ao.button_tryItForFreeBottom.isEnabled());

    }


    @And("AO clicks the Try it for Free button")
    public void aoClicksTheTryItForFreeButton() {
        JSUtils.scrollIntoViewJS(homePage_ao.button_tryItForFreeBottom);
        waitFor(2);
        clickWithJS(homePage_ao.button_tryItForFreeBottom);
        waitFor(2);
    }

    @Then("AO verifies Therapist Register section is visible.")
    public void aoVerifiesTherapistRegisterSectionIsVisible() {
        Assert.assertTrue(homePage_ao.text_registerAsaTerapist.isDisplayed());
    }

    @Then("AO verifies Related page url is {string}")
    public void aoVerifiesRelatedPageUrlIs(String arg0) {
        String expectedUrl = "https://test.hypnotes.net/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }


    @Then("AO verifies Facebook, LinkedIn, Twitter, Instagram icons is visible and clickable.")
    public void aoVerifiesFacebookLinkedInTwitterInstagramIconsIsVisibleAndClickable() {
        // JSUtils.scrollIntoViewJS(homePage_ao.button_socialIcons.get(1));
        waitFor(2);
        JSUtils.scrollDownByJS();
        waitFor(2);

        for (int i = 0; i < homePage_ao.button_socialIcons.size(); i++) {

            Assert.assertTrue(homePage_ao.button_socialIcons.get(i).isDisplayed());
            Assert.assertTrue(homePage_ao.button_socialIcons.get(i).isEnabled());

        }
    }

    @Then("AO clicks on Facebook and verifies the company-related pages is visible")
    public void aoClicksOnFacebookAndVerifiesTheCompanyRelatedPagesIsVisible() {
        socialIconsAssertion(0, "facebook");
    }

    @Then("AO clicks on LinkedIn and verifies the company-related pages is visible")
    public void aoClicksOnLinkedInAndVerifiesTheCompanyRelatedPagesIsVisible() {
        socialIconsAssertion(3, "linkedin");
    }

    @Then("AO clicks on Twitter and verifies the company-related pages is visible")
    public void aoClicksOnTwitterAndVerifiesTheCompanyRelatedPagesIsVisible() {
        socialIconsAssertion(1, "twitter");
    }

    @Then("AO clicks on Instagram and verifies the company-related pages is visible")
    public void aoClicksOnInstagramAndVerifiesTheCompanyRelatedPagesIsVisible() {
        socialIconsAssertion(2, "instagram");
    }

    public void socialIconsAssertion(int socialIconIndex, String socialIconName) {

        homePage_ao.button_socialIcons.get(socialIconIndex).click();
        waitFor(2);
        BrowserUtilities.switchToWindowWithIndex(1);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(socialIconName));
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getTitle());

        BrowserUtilities.switchToWindowWithIndex(0);
        waitFor(2);
    }


    @Then("AO verifies {string} section is visible")
    public void aoVerifiesAllInOnePlaceForPracticeManagementSectionIsVisible(String expectedText) {
        waitFor(3);
        // String expectedText = "All in One Place for Practice Management";
        String actualText = homePage_ao.text_allInOnePlace.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(expectedText, actualText);

    }

    @Then("AO verifies {string} section is visible.")
    public void aoVerifiesWhyYouLoveHypnotesSectionIsVisible(String expectedText) {
        waitFor(2);
        // String expectedText = "Why You Love Hypnotes?";
        String actualText = homePage_ao.text_whyYouLoveHypnotese.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(expectedText, actualText);

    }

    @Then("AO verifies About Hypnotes header is visible and clickable")
    public void aoVerifiesAboutHypnotesHeaderIsVisibleAndClickable() {
        waitFor(5);
        String expectedText = "About Hypnotes";
        String actualText = homePage_ao.text_aboutHypnotesHeader.getText();

        Assert.assertEquals(expectedText, actualText);
        Assert.assertTrue(homePage_ao.text_aboutHypnotesHeader.isDisplayed());
        Assert.assertTrue(homePage_ao.text_aboutHypnotesHeader.isEnabled());
    }

    @Then("AO clicks on About Hypnotes link and verifies relevant page has url {string}")
    public void aoClicksOnAboutHypnotesLinkAndVerifiesRelevantPageHasUrl(String arg0) {

        waitFor(3);
        clickWithJS(homePage_ao.text_aboutHypnotesHeader);


        waitFor(3);
        String expectedUrl = "https://test.hypnotes.net/about-us";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("AO verifies Who is Hypnotes? and other titles are visible")
    public void aoVerifiesWhoIsHypnotesAndOtherTitlesAreVisible() {

        for (int i = 0; i < homePage_ao.text_allHeadersInAboutUs.size(); i++) {

            Assert.assertTrue(homePage_ao.text_allHeadersInAboutUs.get(i).isDisplayed());
            System.out.println(homePage_ao.text_allHeadersInAboutUs.get(i).getText());

        }

    }

    @Then("AO verifies Youtube video under About Hypnotes section on homepage is clickable")
    public void aoVerifiesYoutubeVideoUnderAboutHypnotesSectionOnHomepageIsClickable() {
        waitFor(3);
        BrowserUtilities.scrollToElement(homePage_ao.text_aboutHypnotesHeader);
        waitFor(2);
        Driver.getDriver().switchTo().frame(homePage_ao.iframe);
        waitFor(2);
        System.out.println("homePage_ao.text_hypnotesPrMnSf = " + homePage_ao.text_hypnotesPrMnSf.getText());

        Assert.assertTrue(homePage_ao.button_aboutHypnotesYouTube.isDisplayed());
        Assert.assertTrue(homePage_ao.button_aboutHypnotesYouTube.isEnabled());

    }

    @Then("AO verifies Youtube video starts to play.")
    public void aoVerifiesYoutubeVideoStartsToPlay() {

        waitFor(3);
        homePage_ao.button_youTubePlay.click();
        waitFor(10);
        actions.sendKeys(Keys.SPACE).perform();

    }

    @Then("AO verifies More about Hypnotes section is visible")
    public void aoVerifiesMoreAboutHypnotesSectionIsVisible() {

        Driver.getDriver().switchTo().defaultContent();
        waitFor(3);
        Assert.assertTrue(homePage_ao.button_moreAboutHypnote.isDisplayed());
        Assert.assertTrue(homePage_ao.button_moreAboutHypnote.isEnabled());
    }


}






















