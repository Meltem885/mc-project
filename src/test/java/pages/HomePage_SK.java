package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage_SK extends BasePage{

    @FindBy (css = ".ant-col.ant-col-order-6.style_footerSocialMediaIconContainer__6P4ks.ant-col-xs-24.css-15rg2km > span")
    public List<WebElement> link_socialIcons;
     @FindBy (xpath = "//div[.='Features']")
    public WebElement title_features;

@FindBy (css = ".ant-typography.style_signUpBtn__JTRJm.css-15rg2km")
    public WebElement button_signup;


}
