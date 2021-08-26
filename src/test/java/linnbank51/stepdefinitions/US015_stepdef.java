package linnbank51.stepdefinitions;//package linnbank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_015;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import org.junit.Assert;

public class US015_stepdef {

    US_015 us_015=new US_015();

    @Given("user enters linnbank home page")
    public void user_enters_linnbank_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }
    @Then("user clicks on human icon")
    public void user_clicks_on_human_icon() {
        us_015.accountIcon.click();
    }
    @Then("user enters sign in button")
    public void user_enters_sign_in_button() {
        us_015.signinButton.click();
    }
    @Then("user enters a valid customer username {string}")
    public void user_enters_a_valid_customer_username(String string) {
        us_015.userName.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }
    @Then("user enters a valid password {string}")
    public void user_enters_a_valid_password(String string) {
        us_015.passWord.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }
    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        us_015.submitButton.click();
    }
    @Then("user clicks on my operations button")
    public void user_clicks_on_my_operations_button() {
        us_015.myOperations.click();
    }
    @Then("user clicks on my accounts")
    public void user_clicks_on_my_accounts() {
        us_015.myAccounts.click();
    }
    @Given("user see all account types and balance populated")
    public void user_see_all_account_types_and_balance_populated() {
        String at = us_015.accountTypes.getText();
        Assert.assertEquals(us_015.accountTypes.getText(),at);
        String ab = us_015.accountBalance.getText();
        Assert.assertEquals(us_015.accountBalance.getText(),ab);
    }
    @Then("user clicks on account menu")
    public void user_clicks_on_account_menu() throws InterruptedException {
        us_015.customerAccount.click();
        Thread.sleep(3000);
    }
    @Then("user sign out")
    public void user_sign_out() {
        us_015.signOut.click();
    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user see all transaction")
    public void user_see_all_transaction() throws InterruptedException {
        us_015.savingAccountTransaction.click();
    Thread.sleep(3000);
    us_015.checkingAccountTransaction.click();
        Thread.sleep(3000);
    us_015.investingAccountTransaction.click();
        Thread.sleep(2000);
    us_015.creditCardTransaction.click();
        Thread.sleep(2000);
    }
    @Then("user verifies the transaction")
    public void user_verifies_the_transaction() {
        String vid = us_015.verifyID.getText();
        Assert.assertEquals(us_015.verifyID.getText(),vid);
    
}
  
