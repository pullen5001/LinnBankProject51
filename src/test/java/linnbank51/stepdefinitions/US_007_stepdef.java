package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_007;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_007_stepdef {

    US_007 us_007=new US_007();

    @Given("user is on linnbank home page")
    public void user_is_on_linnbank_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
        us_007.accountIcon.click();
        us_007.signinButton.click();
    }

    @Then("user provides valid customer username {string}")
    public void user_provides_valid_customer_username(String string) {
        us_007.userName.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }
    @Then("user provides valid password {string}")
    public void user_provides_valid_password(String string) {
        us_007.password.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }
    @Then("user navigates on sign in button and click")
    public void user_navigates_on_sign_in_button_and_click() {
        us_007.submitButton.click();
    }

    @Then("user clicks on customer account button")
    public void user_clicks_on_customer_account_button() {
        us_007.customerAccount.click();
    }

    @Then("user clicks on userInfoButton")
    public void user_clicks_on_user_info_button()  {
        us_007.userInfoButton.click();
    }

    @Given("user should see User settings for [user] page")
    public void user_should_see_user_settings_for_user_page() {
    }

    @Then("user click on email textbox")
    public void user_click_on_email_textbox() { us_007.emailTextbox.click();
    }
    @Then("clear everything inside email textbox")
    public void clear_everything_inside_email_textbox() {
        us_007.emailTextbox.clear();
    }

    @And("user enters invalid email{int} address {string}")
    public void userEntersInvalidEmailAddress(int arg0, String arg1) {
        us_007.emailTextbox.sendKeys(ConfigurationReader.getProperty("invalid_email1"));
    }

    @Then("verify the message has {string}")
    public void verifyTheMessageHas(String arg0) {
        String message = us_007.invalidMessage.getText();
        Assert.assertTrue(us_007.invalidMessage.isDisplayed());
    }

    @Then("sign out from the application")
    public void signOutFromTheApplication() {
        us_007.accountIcon.click();
        us_007.signOut.click();
    }
    @Then("user navigates to language dropdown")
    public void user_navigates_to_language_dropdown() {
        us_007.languageDropdown.click();
    }

    @Then("user enters the language")
    public void user_enters_the_language() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(us_007.languageDropdown);
        select.selectByVisibleText("English");
    }
    @Then("user verifies only English and Turkish languages")
    public void user_verifies_only_english_and_turkish_languages() {
        Assert.assertTrue(us_007.languageDropdown.isEnabled());
    }

    @And("user enters invalid email address {string}")
    public void userEntersInvalidEmailAddress(String invalidEmail) throws InterruptedException {
        Thread.sleep(3000);
        us_007.emailTextbox.sendKeys(invalidEmail);
    }

    @Then("user verifies the message has {string}")
    public void userVerifiesTheMessageHas(String message) {
        Assert.assertTrue(us_007.invalidMessage.isDisplayed());
    }


    @Then("user provide valid password {string}")
    public void userProvideValidPassword(String arg0) {
    }
}

