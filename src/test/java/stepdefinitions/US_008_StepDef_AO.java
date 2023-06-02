package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage_AO;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

import static utilities.BrowserUtilities.scrollToElement;
import static utilities.BrowserUtilities.waitFor;

public class US_008_StepDef_AO {
    HomePage_AO homePage_ao = new HomePage_AO();

    @Then("AO verifies Hypnotes Practice Management Software & EHR Features is visible")
    public void aoVerifiesHypnotesPracticeManagementSoftwareEHRFeaturesIsVisible() {
        waitFor(3);
        scrollToElement(homePage_ao.text_hPMS_EHR);
        Assert.assertTrue(homePage_ao.text_hPMS_EHR.isDisplayed());
        System.out.println("homePage_ao = " + homePage_ao.text_hPMS_EHR.getText());

    }

    @Then("AO verifies all headings are visible and clickable in the relevant section")
    public void aoVerifiesAllHeadingsAreVisibleAndClickableInTheRelevantSection() {
        for (int i = 0; i < homePage_ao.links_allHeadingsAbout_hPMS.size(); i++) {

            Assert.assertTrue(homePage_ao.links_allHeadingsAbout_hPMS.get(i).isDisplayed());
            Assert.assertTrue(homePage_ao.links_allHeadingsAbout_hPMS.get(i).isEnabled());
            System.out.println("homePage_ao = " + homePage_ao.links_allHeadingsAbout_hPMS.get(i).getText());
            waitFor(1);

        }
    }

    @Then("AO verifies all relevant pages are accessible")
    public void aoVerifiesAllRelevantPagesAreAccessible(DataTable dataTable) {

        for (int i = 0; i < homePage_ao.links_allHeadingsAbout_hPMS.size(); i++) {
            String expectedTitle = dataTable.column(0).get(i);

            //  homePage_ao.links_allHeadingsAbout_hPMS.get(i).click();
            JSUtils.clickElementByJS(homePage_ao.links_allHeadingsAbout_hPMS.get(i));
            waitFor(2);
            String actualTitle = Driver.getDriver().getTitle();
            System.out.println(Driver.getDriver().getTitle());

            Assert.assertEquals(expectedTitle, actualTitle);

            Driver.getDriver().navigate().back();
            waitFor(2);
            // BrowserUtilities.scrollToElement(homePage_ao.links_allHeadingsAbout_hPMS.get(i));
            // waitFor(2);
        }
    }

    @Then("AO verifies testimonials is visible")
    public void aoVerifiesTestimonialsIsVisible() {
        waitFor(2);
        JSUtils.scrollIntoViewJS(homePage_ao.text_testimonials);
        waitFor(2);
        Assert.assertTrue(homePage_ao.text_testimonials.isDisplayed());

    }

    @Then("AO verifies the accounts of the relevant persons are visible")
    public void aoVerifiesTheAccountsOfTheRelevantPersonsAreVisible() {
        waitFor(2);
        for (int i = 0; i < homePage_ao.text_testimonialsPerson.size(); i++) {

            homePage_ao.button_dots.get(i).click();
            waitFor(1);
            // System.out.println("i = " + homePage_ao.text_testimonialsPerson.get(i));
            Assert.assertTrue(homePage_ao.text_testimonialsPerson.get(i).isDisplayed());
            Assert.assertTrue(homePage_ao.text_testimonialsPerson.get(i).isEnabled());
            System.out.println(homePage_ao.text_testimonialsPerson.get(i).getText());
            waitFor(2);
        }
    }

    @Then("AO verifies < > buttons are visible and clickable")
    public void aoVerifiesButtonsAreVisibleAndClickable() {
        homePage_ao.button_dots.get(0).click();
        waitFor(1);
        Assert.assertFalse("Sol ok calismamasi lazim", homePage_ao.button_previous.isEnabled());
        Assert.assertTrue("Sag ok calismali", homePage_ao.button_next.isEnabled());

        homePage_ao.button_dots.get(homePage_ao.button_dots.size() - 1).click();
        waitFor(1);
        Assert.assertTrue("Sol ok calismali", homePage_ao.button_previous.isEnabled());
        Assert.assertFalse("Sag ok calismamasi lazim", homePage_ao.button_next.isEnabled());

    }

    @Then("AO verifies Everything you need for your practice management wrapped up in one solution is visible")
    public void aoVerifiesEverythingYouNeedForYourPracticeManagementWrappedUpInOneSolutionIsVisible() {

        waitFor(3);
        BrowserUtilities.scrollToElement(homePage_ao.text_everythingWrapped);
        Assert.assertTrue(homePage_ao.text_everythingWrapped.isDisplayed());
    }

    @Then("AO verifies Subtitles below this title is visible")
    public void aoVerifiesSubtitlesBelowThisTitleIsVisible() {
        waitFor(3);

        for (int i = 0; i < homePage_ao.text_subTitle.size(); i++) {
            Assert.assertTrue(homePage_ao.text_subTitle.get(i).isDisplayed());

            System.out.println(homePage_ao.text_subTitle.get(i).getText());

        }
    }

    @Then("AO verifies all headings are visible and clickable on the footer")
    public void aoVerifiesAllHeadingsAreVisibleAndClickableOnTheFooter() {
        waitFor(2);
        BrowserUtilities.scrollToElement(homePage_ao.link_footerAllHeadings.get(0));
        for (int i = 0; i < homePage_ao.link_footerAllHeadings.size(); i++) {

            Assert.assertTrue(homePage_ao.link_footerAllHeadings.get(i).isDisplayed());
            Assert.assertTrue(homePage_ao.link_footerAllHeadings.get(i).isEnabled());

            System.out.println("heading " + (i + 1) + " = " + homePage_ao.link_footerAllHeadings.get(i).getText());
        }
    }

    @Then("AO clicks on each headings on the footer and verifies related pages have the following URLs")
    public void aoClicksOnEachHeadingsOnTheFooterAndVerifiesRelatedPagesHaveTheFollowingURLs(DataTable dataTable) {
        waitFor(1);
        JSUtils.scrollDownByJS();

        for (int i = 0; i < homePage_ao.link_footerAllHeadings.size() - 2; i++) {
            waitFor(1);

            homePage_ao.link_footerAllHeadings.get(i).click();
            waitFor(1);

            System.out.println("URL " + (i + 1) + " = " + Driver.getDriver().getCurrentUrl());
            // System.out.println("TITLE "+(i+1)+" = " +Driver.getDriver().getTitle());

            String expectedUrl = dataTable.column(0).get(i);
            String actualUrl = Driver.getDriver().getCurrentUrl();

            Assert.assertEquals("Expected and actual URLs are not same", expectedUrl, actualUrl);

            Driver.getDriver().navigate().back();
            waitFor(1);

            JSUtils.scrollDownByJS();

        }

    }

    @Then("AO verifies Sign Up button is clickable")
    public void aoVerifiesSignUpButtonIsClickable() {
        waitFor(2);
        Assert.assertTrue(homePage_ao.button_signUp.isEnabled());
    }

    @When("AO clicks on Sign Up button")
    public void aoClicksOnSignUpButton() {
        // BrowserUtilities.waitForPageToLoad(5);
        waitFor(3);
        homePage_ao.button_signUp.click();
    }

    @Then("AO verifies Client and Therapist options should appear after clicking on Sign Up button")
    public void aoVerifiesClientAndTherapistOptionsShouldAppearAfterClickingOnSignUpButton() {
waitFor(2);
Assert.assertTrue(homePage_ao.link_registerAsTherapist.isDisplayed());
    }

    @Then("AO verifies The client is clickable")
    public void aoVerifiesTheClientIsClickable() {
        waitFor(2);
        Assert.assertTrue(homePage_ao.link_iAmClient.isEnabled());
    }

    @When("AO clicks on the Client button")
    public void aoClicksOnTheClientButton() {
        waitFor(1);
        homePage_ao.link_iAmClient.click();
    }

    @When("AO verifies the relevant page url is {string} after clicking on the Client button")
    public void aoVerifiesTheRelevantPageUrlIsAfterClickingOnTheClientButton(String expectedUrl) {
        waitFor(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("AO verifies Therapist button is clickable")
    public void aoVerifiesTherapistButtonIsClickable() {
        Assert.assertTrue(homePage_ao.link_iAmTherapist.isEnabled());

    }

    @Then("AO verifies the relevant page url is {string} after clicking on the Therapist button")
    public void aoVerifiesTheRelevantPageUrlIsAfterClickingOnTheTherapistButton(String expectedUrl) {
        homePage_ao.link_iAmTherapist.click();
        waitFor(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("AO verifies Name, Surname, Email, Password fields are visible")
    public void aoVerifiesNameSurnameEmailPasswordFieldsAreVisible() {
    }
}