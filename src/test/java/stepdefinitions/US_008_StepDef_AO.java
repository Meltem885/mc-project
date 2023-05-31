package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
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
}