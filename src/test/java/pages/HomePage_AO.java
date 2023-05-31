package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_AO extends BasePage {

    @FindBy(xpath = "//div[@class='BaseNavbar_pr30__jkM4F BaseNavbar_mainMenubar__ojVYr  d-flex align-items-center']//a")
    public List<WebElement> allHeadings;

    @FindBy(xpath = "//a[contains(text(),'Try it for Free')]")
    public WebElement button_tryItForFree;

    @FindBy(css = ".btn.btn-link>a")
    public WebElement link_signIn;

    @FindBy(css = ".text-white.text-center")
    public WebElement text_goAhead;

    @FindBy (xpath = "//span[text()='Try it for free']")
    public WebElement button_tryItForFreeBottom;

    @FindBy (xpath = "//h3[text()='Register As a Therapist']")
    public WebElement text_registerAsaTerapist;

    @FindBy (xpath = "//div[@class='BaseFooter_socialLinks__b2Eyv']/a")
    public List<WebElement> button_socialIcons;

    @FindBy (xpath = "//h1[text()='All in One Place for Practice Management']")
    public WebElement text_allInOnePlace;

    @FindBy (xpath = "//h2[text() ='Why You Love Hypnotes?']")
    public WebElement text_whyYouLoveHypnotese;

    @FindBy(css = "a.LandingPage_aboutHeader__iKi0w")
    public WebElement text_aboutHypnotesHeader;

    @FindBy (xpath = "//h2")
    public List<WebElement> text_allHeadersInAboutUs;

    @FindBy(css = "button[aria-label='Play']")
    public WebElement button_aboutHypnotesYouTube;

    @FindBy(css = "button[aria-label='Play']")
    public WebElement button_youTubePlay;

    @FindBy(css = ".ytp-title-link.yt-uix-sessionlink")
    public WebElement text_hypnotesPrMnSf;

    @FindBy(xpath= "//iframe[@loading='lazy']")
    public WebElement iframe;

    @FindBy (xpath = "//a[@class='LandingPage_moreInfo__Xksna']")
    public WebElement button_moreAboutHypnote;

    @FindBy (xpath = "//a[@class='LandingPage_moreInfo__Xksna']")
    public WebElement text_hPMS_EHR;

    @FindBy (xpath = "//h3[@class='LandingPage_link__uEre3']")
    public List<WebElement> links_allHeadingsAbout_hPMS;

    @FindBy (xpath = "//h2[contains(text(),'Testimonials')]")
    public WebElement text_testimonials;

    @FindBy (xpath = "//a[@class='LandingPage_colorBlack__8KCDi']")
    public List<WebElement> text_testimonialsPerson;

    @FindBy (xpath = "(//ol[@class='flickity-page-dots'])[1]/li")
    public List<WebElement> button_dots;

    @FindBy (css = "[aria-label='Previous']")
    public WebElement button_previous;

    @FindBy (css = "[aria-label='Next']")
    public WebElement button_next;




}