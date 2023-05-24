package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//a[text()=' Solutions ']")
    public WebElement link_Solutions;

    @FindBy(xpath = "//a[text()='Pricing']")
    public WebElement link_Pricing;

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement link_ContactUs;

    @FindBy(xpath = "//a[text()='About us']")
    public WebElement link_AboutUs;

    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement link_log;

    @FindBy(xpath = "(//a[@class='BaseNavbar_navButton__1Pd6f'])[5]")
    public WebElement link_QuestionMark;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement Button_Login;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement Button_SignUp;

    @FindBy(xpath = "//a[text()='Try it for Free']")
    public WebElement link_TryItForFree;

    @FindBy(xpath = "//h2[text()='Go ahead, give it a try!']")
    public WebElement title_GoAheadGiveItATry;

    @FindBy(xpath = "//a/span[text()='Try it for free']")
    public WebElement Button_TryItForFreeDown;

    @FindBy(xpath = "(//img[@decoding='async'])[1]")
    public WebElement icon_SignInWithGoogle;

    @FindBy(xpath = "(//img[@decoding='async'])[2]")
    public WebElement icon_SignInWithFacebook;

    @FindBy(xpath = "(//img[@decoding='async'])[3]")
    public WebElement icon_SignInWithLinkedin;

   // @FindBy(xpath = "(//img[@decoding='async'])[4]")//çalışmıyor
   // public WebElement icon_SignInWithFacebook;











}
