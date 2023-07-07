package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage{

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    public WebElement helloSignIn_Mod;

    @FindBy(xpath = "(//a[@class='nav-action-signin-button'])[1]")
    public WebElement startHere_link;

    @FindBy(css = "#ap_customer_name")
    public WebElement fullName_input;

    @FindBy(css = "#ap_email")
    public WebElement email_input;

    @FindBy(css = "#ap_password")
    public WebElement password_input;

    @FindBy(css = "#ap_password_check")
    public WebElement passwordCheck_input;

    @FindBy(css = "#continue")
    public WebElement continue_Button;

    @FindBy(css = "#sp-cc-accept")
    public WebElement acceptCookies;

    //selma
}
