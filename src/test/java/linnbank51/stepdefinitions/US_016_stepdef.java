package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnbank51.pages.US_016;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_016_stepdef {
    US_016 us_016 = new US_016();

    @Given("User clicks on human icon")
    public void user_clicks_on_human_icon() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
        {us_016.accountIcon.click(); }
    }

    @Then("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        us_016.signinButton.click();
    }

    @Then("User enters a valid customer username {string}")
    public void user_enters_a_valid_customer_username(String string) {
        us_016.userName.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }

    @Then("User enters a valid customer password {string}")
    public void user_enters_a_valid_customer_password(String string) {
        us_016.passWord.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }

    @Then("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        us_016.submitButton.click();
    }

    @Then("User clicks on My operations")
    public void user_clicks_on_my_operations() {
        us_016.myOperations.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user clicks on Transfer money from dropdown")
    public void user_clicks_on_transfer_money_from_dropdown() {
        us_016.transferMoney.click();
    }

    @Given("user clicks From dropdown")
    public void user_clicks_from_dropdown() {
        us_016.fromDropdown.click();
        ReusableMethods.waitFor(2);
    }

    @And("user selects first account")
    public void userSelectsFirstAccount() {
        Select select=new Select(us_016.fromDropdown);
        select.selectByValue("24542");
        ReusableMethods.waitFor(2);
    }

    @And("user selects second account")
    public void userSelectsSecondAccount() {
        Select select=new Select(us_016.toDropdown);
        select.selectByValue("28767");
        ReusableMethods.waitFor(2);
    }

    @And("user makes money transfer")
    public void userMakesMoneyTransfer() {
        us_016.balanceTextbox.sendKeys("5");
        ReusableMethods.waitFor(2);
        us_016.descriptionTextBox.sendKeys("Demo presentation");
        ReusableMethods.waitFor(2);
        us_016.makeTransferButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("user validates money transfer has been done successfully")
    public void userValidatesMoneyTransferHasBeenDoneSuccessfully() {
        Assert.assertTrue(us_016.successMessage.isDisplayed());
        ReusableMethods.waitFor(2);
    }
/*

    @Then("Verify there are two accounts")
    public void verify_there_are_accounts(Integer int1) {
        //String accountsDisplayed = (us_016.fromDropdown.getText());
        //Assert.);
    }

    @When("user clicks on To dropdown")
    public void user_clicks_on_to_dropdown() {
        us_016.toDropdown.click();
    }

    @Then("Verify there is an account")
    public void verify_there_is_an_account() {
        //String toAccountsDisplayed = (us_016.toDropdown.getText());
        //Assert.;
    }

    @When("user click on Balance text box")
    public void user_click_on_balance_text_box() {
        us_016.balanceTextbox.click();
    }

    @Then("Verify user can select balance")
    public void verify_user_can_select_balance(Integer integer) {
        us_016.balanceTextbox.sendKeys("integer");
    }

    @When("User click description text box")
    public void user_click_description_text_box() {
        us_016.descriptionTextBox.click();
    }

    @Then("User enters description {string}")
    public void user_enters_description(String string) {
        us_016.descriptionTextBox.sendKeys(string);
    }

    @When("User click Make Transfer")
    public void user_click_make_transfer() {
        us_016.makeTransferButton.click();
    }
*/

}
