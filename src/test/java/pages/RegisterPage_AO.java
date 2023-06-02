package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage_AO extends BasePage {

    @FindBy(css = ".RegisterForm_formGroup__03WXK input")
    public List<WebElement> textBox_allCredentials;

    @FindBy(css = "input[placeholder='Name']")
    public WebElement textBox_name;

    @FindBy(css = "input[placeholder='Surname']")
    public WebElement textBox_surname;

    @FindBy(css = "input[placeholder='Email']")
    public WebElement textBox_email;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement textBox_password;

    @FindBy(xpath = "//*[text()=' Sign Up ']")
    public WebElement button_signUp;


}
