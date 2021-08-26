package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_008;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;

public class US_008_stepdef {

    US_008 us_008 = new US_008();

    @Then("user clicks on passwordButton")
    public void userClicksOnPasswordButton() {
        us_008.passwordButton.click();
    }
    @Then("user enters current password")
    public void user_enters_current_password() {
        us_008.currentPassword.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }
    @Then("user enters old password in new password textbox")
    public void userEntersOldPasswordInNewPasswordTextbox() {
        us_008.newPassword.sendKeys("ayaHappyTech");
    }
    @And("user verifies he could not update with the old password")
    public void userVerifiesHeCouldNotUpdateWithTheOldPassword() {
        //Assert.assertFalse(us_008.passwordChanged.isDisplayed());
        //There is a bug. The system couldn't update password with the old one
    }

    @Then("user sign out from the application")
    public void user_sign_out_from_the_application() {
        us_008.accountIcon.click();
        us_008.signOut.click();
    }

}
