package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_MC extends BasePage {
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='BaseNavbar_pr30__jkM4F BaseNavbar_mainMenubar__ojVYr  d-flex align-items-center']//a")
    public List<WebElement> allTitles;
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement signUp;
    @FindBy(xpath = "//a[text()='Try it for Free']")
    public WebElement tryItForFree;

}
