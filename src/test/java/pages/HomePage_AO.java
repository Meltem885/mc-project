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




}