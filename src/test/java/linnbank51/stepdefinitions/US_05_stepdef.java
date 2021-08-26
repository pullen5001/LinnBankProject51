package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnbank51.pages.US_04;
import linnbank51.pages.US_05;

import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;

public class US_05_stepdef {

    US_05 us_05 = new US_05();
    US_04 us_04 = new US_04();

    @When("^user send invalid username (.*)$")
    public void userSendInvalidUsernameYeniUser(String uName) {

        us_04.userName.sendKeys(uName);
    }

    @And("^user send valid password (.*)$")
    public void userSendValidPasswordTest(String pass) {
        us_04.passWord.sendKeys(pass);
        us_04.submitButton.click();
    }

    @Then("^User verify error message contains (.*)$")
    public void userVerifyErrorMessage(String eMessage) {
        ReusableMethods.waitForVisibility(us_05.errorMessage,3);
        String message = us_05.errorMessage.getText();
        //System.out.println(message);
        Assert.assertEquals(eMessage, message);
    }

    @When("user click on Did you forget your password? link")
    public void userClickOnDidYouForgetYourPasswordLink() {
        ReusableMethods.waitForVisibility(us_05.reset,3);
        us_05.reset.click();
    }

    @Then("^user verify that page navigate to reset password page$")
    public void userVerifyThatPageNavigateToResetPasswordPage() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url,"https://gmibank-qa-environment.com/account/reset/request");
    }

    @When("user click on You don't have an account yet? Register a new account link")
    public void userClickOnYouDonTHaveAnAccountYetRegisterANewAccountLink() {
        ReusableMethods.waitForVisibility(us_05.registerNewAccount,3);
        us_05.registerNewAccount.click();
    }

    @Then("user verify that page navigate to registration page")
    public void userVerifyThatPageNavigateToRegistrationPage() {
        ReusableMethods.waitFor(2);
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url,"https://gmibank-qa-environment.com/account/register");
    }


}
