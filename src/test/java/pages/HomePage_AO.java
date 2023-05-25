package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_AO extends BasePage {

    @FindBy(xpath = "//div[@class='BaseNavbar_pr30__jkM4F BaseNavbar_mainMenubar__ojVYr  d-flex align-items-center']//a")
    public List<WebElement> allHeadings;

    @FindBy(xpath = "//a[contains(text(),'Try it for Free')]")
    public WebElement button_tryItForFree;


}