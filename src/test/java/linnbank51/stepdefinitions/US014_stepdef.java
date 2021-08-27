package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_014;
import linnbank51.pages.US_015;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US014_stepdef {

    US_014 us_014=new US_014();
    US_015 us_015 = new US_015();
    Actions actions=new Actions(Driver.getDriver());

    @And("user enters a valid employee username {string}")
    public void user_enters_a_valid_customer_username(String string) {
        us_015.userName.sendKeys(ConfigurationReader.getProperty("employee_user"));
    }
    @And("user enters a valid employee password {string}")
    public void user_enters_a_valid_password(String string) {
        us_015.passWord.sendKeys(ConfigurationReader.getProperty("employee_password"));
    }
    @Then("user clicks on my operations")
    public void user_clicks_on_my_operations() {
        us_015.myOperations.click();
    }
    @Then("user clicks on manage accounts")
    public void user_clicks_on_manage_accounts() {
        us_014.manageAccounts.click();
    }
    @And("user clicks on create a new account")
    public void user_clicks_on_create_a_new_account() {
        us_014.createNewAccount.click();
    }
    @And("user send a date and time")
    public void user_send_a_date_and_time() throws InterruptedException {
        us_014.createDateAndTime.clear();
        us_014.createDateAndTime.sendKeys("21/08/2021 23:00 PM" +Keys.ENTER);
        Thread.sleep(3000);
    }
    @And("user verifies that create created date successfully")
    public void user_verifies_that_create_created_date_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(us_014.createDateAndTime.isDisplayed());
    }
    @Given("user clicks on manage customer")
    public void user_clicks_on_manage_customer() {
        us_014.manageCustomers.click();
    }
    @Then("user clicks on create a new customer")
    public void user_clicks_on_create_a_new_customer() {
        us_014.createNewCustomer.click();
    }
    @And("user selects a user")
    public void user_selects_a_user() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select options = new Select(us_014.selectUser);
        options.selectByIndex(5);
        Thread.sleep(3000);
    }

    @And("user selects a created account from account box")
    public void user_selects_a_created_account_from_account_box() throws InterruptedException {
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select options = new Select(us_014.selectAccount);
        options.selectByValue("2349");
        Thread.sleep(2000);
    }

    @And("user clicks Zelle Enrolled")
    public void user_clicks_zelle_enrolled() throws InterruptedException {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        us_014.zelleCheckBox.click();
        Thread.sleep(3000);
    }
}
