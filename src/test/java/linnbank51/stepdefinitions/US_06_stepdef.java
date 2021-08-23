package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_06;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_06_stepdef {
    US_06 us_06 = new US_06();

    @And("User click on name of customer")
    public void userClickOnNameOfCustomer() {
        us_06.customerName.click();
    }

    @And("User click on user info subtab")
    public void userClickOnUserInfoSubtab() {
        us_06.userInfoButton.click();
    }
    @Then("user verify firstname field is visible")
    public void userVerifyFirstnameFieldIsVisible() {
        Assert.assertTrue(us_06.firstNameField.isDisplayed());
    }

    @And("user verify lastname field is visible")
    public void userVerifyLastnameFieldIsVisible() {
        Assert.assertTrue(us_06.lastNameField.isDisplayed());
    }

    @And("user verify email field is visible")
    public void userVerifyEmailFieldIsVisible() {
        Assert.assertTrue(us_06.emailField.isDisplayed());
    }

    @And("user verify language field is visible")
    public void userVerifyLanguageFieldIsVisible() {
        Assert.assertTrue(us_06.languageField.isEnabled());
    }

    @Then("user verify language dropdown menu has Turkish and English options")
    public void userVerifyLanguageDropdownMenuHasTurkishAndEnglishOptions() {


    }
}
