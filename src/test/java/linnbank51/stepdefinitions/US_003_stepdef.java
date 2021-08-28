package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_003;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import org.junit.Assert;

public class US_003_stepdef {
    US_003 us_003 = new US_003();

    @Given("Goto {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));

    }

    @Then("Click the login button from the login page")
    public void click_the_login_button_from_the_login_page() {
        us_003.accountMenu.click();
    }

    @Then("Click the register button from the popup window")
    public void click_the_register_button_from_the_popup_window() {
        us_003.registerButton.click();
    }

    @Then("scroll down the page")
    public void scroll_down_the_page() {
        us_003.scroolPage();
    }


    @Then("Enter a password in lower case in the new password")
    public void enter_a_password_in_lower_case_in_the_new_password() {
        us_003.firstPassword.sendKeys(ConfigurationReader.getProperty("lower_Case"));
    }

    @Then("see change in Password strength")
    public void see_change_in_password_strength() {
        Assert.assertTrue(us_003.redPoint.isDisplayed());

    }


    @And("Enter a password in upper case in the new password")
    public void enterAPasswordInUpperCaseInTheNewPassword() {
        us_003.firstPassword.sendKeys(ConfigurationReader.getProperty("a_Upper_Case"));
    }

    @And("see change in Password strength \\(orange)")
    public void seeChangeInPasswordStrengthOrange() {
        Assert.assertTrue(us_003.orangePoint.isDisplayed());
    }


    @And("Enter a password in digit in the new password")
    public void enterAPasswordInDigitInTheNewPassword() {
        us_003.firstPassword.sendKeys(ConfigurationReader.getProperty("a_Digit"));
    }

    @And("see change in Password strength \\(green)")
    public void seeChangeInPasswordStrengthGreen() {
        Assert.assertTrue(us_003.greenPoint.isDisplayed());
    }


    @And("enter a special character as password in new password")
    public void enterASpecialCharacterAsPasswordInNewPassword() {
        us_003.firstPassword.sendKeys(ConfigurationReader.getProperty("spacial_Character"));
    }

    @And("see change in Password strength \\(darkgreen)")
    public void seeChangeInPasswordStrengthDarkgreen() {
        Assert.assertTrue(us_003.darkGreenPoint.isDisplayed());
    }


    @And("enter the password in seven characters for all desired properties")
    public void enterThePasswordInSevenCharactersForAllDesiredProperties() {
        us_003.firstPassword.sendKeys(ConfigurationReader.getProperty("sevenCharacter"));
    }

    @And("see change in Password strength \\(againdarkgreen)")
    public void seeChangeInPasswordStrengthAgaindarkgreen() {
        Assert.assertTrue(us_003.darkGreenPoint.isDisplayed());
    }

    @And("user closes the page")
    public void userClosesThePage() {
        Driver.closeDriver();
    }

}

