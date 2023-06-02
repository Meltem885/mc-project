package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

import pages.HomePage_MC;


import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_02_03_04_StepDef_MC {

    HomePage_MC homePage_mc = new HomePage_MC();
    @Given("MC goes to home page")
    public void mc_goes_to_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hypnotesUrl"));
    }

        @Given("MC verifies the url")
    public void mc_verifies_the_url() {
        String expectedUrl ="https://test.hypnotes.net/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);


    }



    @Given("MC headings are visible in the home page")
    public void mc_headings_are_visible_in_the_home_page() {
        BrowserUtilities.waitFor(3);

        for (int i = 0; i < homePage_mc.allTitles.size(); i++) {

            System.out.println(homePage_mc.allTitles.get(i).getText());
            Assert.assertTrue(homePage_mc.allTitles.get(i).isDisplayed());

        }

    }


    @Then("MC verifies headings are clickable in the home page")
    public void mc_verifies_headings_are_clickable_in_the_home_page() {
        for (int i=0;i<homePage_mc.allTitles.size();i++){
            Assert.assertTrue(homePage_mc.allTitles.get(i).isEnabled());

        }

    }



    @Given("MC verifies try it for Free is visible and clickable")
    public void mc_verifies_try_it_for_free_is_visible_and_clickable() {

    }

    @Then("MC verifies Sign In headers is visible and clickable")
    public void mc_verifies_sign_in_headers_is_visible_and_clickable() {

    }

}