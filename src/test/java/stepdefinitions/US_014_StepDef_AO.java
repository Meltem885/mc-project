package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage_AO;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.List;

public class US_014_StepDef_AO {

    RegisterPage_AO registerPage = new RegisterPage_AO();

    @Then("AO verifies Name, Surname, Email, Password fields are visible and functional")
    public void aoVerifiesNameSurnameEmailPasswordFieldsAreVisibleAndFunctional() {
        BrowserUtilities.waitFor(2);
        for (int i = 0; i < registerPage.textBox_allCredentials.size(); i++) {

            Assert.assertTrue(registerPage.textBox_allCredentials.get(i).isDisplayed());
            Assert.assertTrue(registerPage.textBox_allCredentials.get(i).isEnabled());

        }

    }

    @When("AO enters {string} in the name field")
    public void aoEntersInTheNameField(String name) {

        registerPage.textBox_name.sendKeys(name);
    }

    @When("AO enters {string} in the surname field")
    public void aoEntersInTheSurnameField(String surname) {

        registerPage.textBox_surname.sendKeys(surname);
    }

    @When("AO enters {string} in the email field")
    public void aoEntersInTheEmailField(String email) {

        registerPage.textBox_email.sendKeys(email);
    }

    @When("AO enters {string} in the password field")
    public void aoEntersInThePasswordField(String password) {

        registerPage.textBox_password.sendKeys(password);
    }

    @And("AO clicks on Sign Up button in register Page")
    public void aoClicksOnSignUpButtonInRegisterPage() {

        registerPage.button_signUp.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("AO gets {string} warning message")
    public void aoGetsWarningMessage(String warningMessage) {

        String expectedWarningMessage = warningMessage;
        String actualNameWarningMessage = registerPage.textBox_name.getDomProperty("validationMessage");
        String actualSurnameWarningMessage = registerPage.textBox_surname.getDomProperty("validationMessage");
        String actualEmailWarningMessage = registerPage.textBox_email.getDomProperty("validationMessage");

        List<String > allWarningMessages = new ArrayList<>();
        allWarningMessages.add(actualNameWarningMessage);
        allWarningMessages.add(actualSurnameWarningMessage);
        allWarningMessages.add(actualEmailWarningMessage);

        System.out.println("allWarningMessages = " + allWarningMessages);
        for (String eachwarning:allWarningMessages) {
            Assert.assertTrue(warningMessage.contains(eachwarning));

        }

      //  Assert.assertTrue(allWarningMessages.contains(expectedWarningMessage));
//        Assert.assertEquals(expectedWarningMessage,actualNameWarningMessage);
//        Assert.assertEquals(expectedWarningMessage,actualSurnameWarningMessage);
//        Assert.assertEquals(expectedWarningMessage,actualEmailWarningMessage);
    }
}
