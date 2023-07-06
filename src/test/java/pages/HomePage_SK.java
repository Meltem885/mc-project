package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_SK extends BasePage{

    @FindBy (css = "img[alt='logo']")
    public List<WebElement> link_socialIcons;

    @FindBy (css = "img[href='https://www.facebook.com/hypnotesinc']")
    public WebElement facebook_icon;

    @FindBy (css = "img[href='https://www.linkedin.com/company/hypnotes/']")
    public WebElement linkedin_icon;

    @FindBy (css = "img[href='https://twitter.com/HypnotesInc']")
    public WebElement twitter_icon;

    @FindBy (css = "img[href='https://www.instagram.com/hypnotesinc']")
    public WebElement instagram_icon;
     @FindBy (xpath = "//div[.='Features']")
    public WebElement title_features;

@FindBy (css = ".ant-typography.style_signUpBtn__JTRJm.css-15rg2km")
    public WebElement button_signup;


}
