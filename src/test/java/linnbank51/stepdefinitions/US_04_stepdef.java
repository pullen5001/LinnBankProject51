package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnbank.pages.US_04;
import linnbank.utilities.ConfigurationReader;
import linnbank.utilities.Driver;
import org.junit.Assert;



public class US_04_stepdef{
    US_04 us_04 = new US_04();

    @Given("User is on homepage")
    public void user_is_on_homepage() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
        us_04.accountIcon.click();
        us_04.signinButton.click();
}
//    @When("user click on login icon")
//    public void user_click_on_login_icon() {
//     us_04.accountIcon.click();
//
//    }
//    @And("User click on sign in")
//    public void user_click_on_sign_in() {
//    us_04.signinButton.click();
//
//    }
    @When("^User send username (.*)$")
    public void user_send_username(String string) {
        us_04.userName.sendKeys(string);

    }
    @And("^User send password (.*)$")
    public void u_ser_send_password(String string) {
        us_04.passWord.sendKeys(string);
    }
    @And("User click on sign in button")
    public void user_click_on_sign_in_button() throws InterruptedException {
        Thread.sleep(2000);
        us_04.submitButton.click();
    }
    @Then("User verify that logged in successfully to the application")
    public void user_verify_that_logged_in_succesfully_to_the_application() {
        Assert.assertTrue(us_04.HomeLink.isEnabled());
    }

    @When("User click cancel button on Sign in pop-up window")
    public void userClickCancelButtonOnSignInPopUpWindow() {
        us_04.cancelButton.click();
    }

    @Then("User should navigate to Home Page")
    public void userShouldNavigateToHomePage() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url,"https://gmibank-qa-environment.com/");
    }
}
