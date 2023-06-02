package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage_IF;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

import java.time.Duration;

import static org.junit.Assert.*;

public class US_001_StepDef_IF {
    HomePage_IF homePageIf = new HomePage_IF();
    Actions actions = new Actions(Driver.getDriver());

    //US001
    @Given("IF goes to home page")
    public void if_goes_to_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hypnotesUrl"));

    }
    @Then("IF verifies the url")
    public void if_verifies_the_url() {
        String expectedUrl="https://test.hypnotes.net/";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        assertEquals("Home page title verification failed!!!",expectedUrl,actualUrl);


    }
    //US002

    @Then("IF verifies headings are visible in the home page")
    public void if_verifies_headings_are_visible_in_the_home_page() {
        for (int i = 0; i < homePageIf.allHeadings.size(); i++) {
            System.out.println(homePageIf.allHeadings.get(i).getText());
            assertTrue(homePageIf.allHeadings.get(i).isDisplayed());

        }

    }
    @Then("IF verifies headings are clickable in the home page")
    public void if_verifies_headings_are_clickable_in_the_home_page() {
        for (int i = 0; i < homePageIf.allHeadings.size(); i++) {
            assertTrue(homePageIf.allHeadings.get(i).isEnabled());

        }

    }
    //US003-001
    @Then("IF verifies try it for Free is visible and clickable")
    public void if_verifies_try_it_for_free_is_visible_and_clickable() {
        assertTrue(homePageIf.link_TryItForFree.isDisplayed());
        assertTrue(homePageIf.link_TryItForFree.isEnabled());
    }
    @Then("IF verifies Sign In headers is visible and clickable")
    public void if_verifies_sign_in_headers_is_visible_and_clickable() {
        assertTrue(homePageIf.link_SignIn.isDisplayed());
        assertTrue(homePageIf.link_SignIn.isEnabled());

        homePageIf.link_SignIn.click();
        BrowserUtilities.waitFor(2);
        String expectedUrl="https://test.hypnotes.net/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        assertEquals("SignIn url verification failed",expectedUrl,actualUrl);

        String expectedTitle="Login";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals("SignIn title verification failed!!!",expectedTitle,actualTitle);
    }
    //US003-002
    @Given("IF goes bottom of page")
    public void if_goes_bottom_of_page() {
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitForVisibility(homePageIf.button_TryItForFreeDown,5);
       // actions.scrollToElement(homePageIf.button_TryItForFreeDown).perform();
    }
    @Then("IF verifies Go ahead, give it a try! text is visible")
    public void if_verifies_go_ahead_give_it_a_try_text_is_visible() {
        assertTrue(homePageIf.title_GoAheadGiveItATry.isDisplayed());

    }
    @Then("IF verifies Try it for Free button is visible and clickable.")
    public void if_verifies_try_it_for_free_button_is_visible_and_clickable() {
        assertTrue(homePageIf.button_TryItForFreeDown.isDisplayed());
        assertTrue(homePageIf.button_TryItForFreeDown.isEnabled());


    }
    @Then("IF clicks the Try it free button")
    public void if_clicks_the_try_it_free_button() {
        JSUtils.scrollIntoViewJS(homePageIf.button_TryItForFreeDown);
        JSUtils.clickElementByJS(homePageIf.button_TryItForFreeDown);

    }
    @Then("IF verifies Terapist register section is visible")
    public void if_verifies_terapist_register_section_is_visible() {
        assertTrue(homePageIf.header_RegisterAsATerapist.isDisplayed());

    }
    @Then("IF verifies Related page url is {string}")
    public void if_verifies_related_page_url_is(String arg0) {
        String expectedUrl="https://test.hypnotes.net/register";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        assertEquals("Register page URL is failed!!!",expectedUrl,actualUrl);

    }
    //US004-001

    @Then("IF verifies Facebook, LinkedIn, Twitter, Instagram icons is visible and clickable.")
    public void if_verifies_facebook_linked_in_twitter_instagram_icons_is_visible_and_clickable() {
        BrowserUtilities.waitForPresenceOfElement(By.xpath("//div[@class='BaseFooter_socialLinks__b2Eyv']/a"), Duration.ofSeconds(15));
        JSUtils.scrollDownByJS();
        System.out.println("social media icons");
        for (int i = 0; i < homePageIf.links_SocialMediaIcons.size(); i++) {
            BrowserUtilities.waitFor(2);
            System.out.println("social media icons 2.time");
            assertTrue(homePageIf.links_SocialMediaIcons.get(i).isDisplayed());
            assertTrue(homePageIf.links_SocialMediaIcons.get(i).isEnabled());
            System.out.println("social media icons 3.time");
            BrowserUtilities.waitFor(2);

        }

    }
    public void socialIconsAssertions(int socialIndex,String socialMediaName){
        homePageIf.links_SocialMediaIcons.get(socialIndex).click();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.switchToWindowWithIndex(1);
        assertTrue(Driver.getDriver().getCurrentUrl().contains(socialMediaName));
        BrowserUtilities.switchToWindowWithIndex(0);
        BrowserUtilities.waitFor(2);
        System.out.println("in line 133");
    }
    @Then("IF clicks on Facebook and verifies the company-related pages is visible")
    public void if_clicks_on_facebook_and_verifies_the_company_related_pages_is_visible() {
        socialIconsAssertions(0,"facebook");


    }
    @Then("IF clicks on LinkedIn and verifies the company-related pages is visible")
    public void if_clicks_on_linked_in_and_verifies_the_company_related_pages_is_visible() {
        socialIconsAssertions(1,"linkedin");

    }
    @Then("IF clicks on Twitter and verifies the company-related pages is visible")
    public void if_clicks_on_twitter_and_verifies_the_company_related_pages_is_visible() {
       socialIconsAssertions(2,"twitter");


    }
    @Then("IF clicks on Instagram and verifies the company-related pages is visible")
    public void if_clicks_on_instagram_and_verifies_the_company_related_pages_is_visible() {
        socialIconsAssertions(3,"instagram");

    }










































































































}
