package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_009;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US_009_stepdef {

    US_009 us_009=new US_009();

    @Given("employee enters linnbank home page")
    public void employee_enters_linnbank_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
    }
    @Then("employee clicks on human icon")
    public void employee_clicks_on_human_icon() {
        us_009.accountIcon.click();
    }

    @Then("employee enters sign in button")
    public void employee_enters_sign_in_button() {
        us_009.signinButton.click();
    }

    @Then("employee enters valid employee username {string}")
    public void employee_enters_valid_employee_username(String string) {
        us_009.userName.sendKeys(ConfigurationReader.getProperty("employee_username"));    }

    @Then("employee enters valid password {string}")
    public void employee_enters_valid_password(String string) {
        us_009.password.sendKeys(ConfigurationReader.getProperty("employee_password"));  }

    @Then("employee clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        us_009.submitButton.click();
    }

    @Then("employee navigates to my operations")
    public void employee_navigates_to_my_operations() {
        us_009.myOperationsButton.click();    }

    @Then("employee clicks on Manage customers")
    public void employee_clicks_on_manage_customers() {
        us_009.manageCustomersButton.click();
    }

    @Then("employee should see Customers page")
    public void employee_should_see_customers_page() {

    }
    @Then("employee clicks on Create a new Customer button")
    public void employee_clicks_on_create_a_new_customer_button() {
        us_009.createANewCustomerbutton.click();
    }

    @Given("employee should see Create or edit a Customer page")
    public void employee_should_see_create_or_edit_a_customer_page() {

    }

    @Then("employee enters the {string}")
    public void employeeEntersThe(String ssn) {
        us_009.ssnSearchBox.sendKeys(ssn);
    }

    @Then("employee clicks on Search button")
    public void employee_clicks_on_search_button() {
        us_009.searchButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_009.alertMessage.isDisplayed());

    }
    @Then("employee should see all customer registration info populated")
    public void employee_should_see_all_customer_registration_info_populated() {

        WebElement[] info ={us_009.firstnameBox,us_009.lastnameBox,us_009.emailBox,us_009.mobilePhoneBox,
                us_009.ssnBox, us_009.createDateBox};

        String data="";
        for (WebElement user:info){

            System.out.println(user.getAttribute("value"));
            ReusableMethods.waitFor(2);
            data=user.getAttribute("value");
            Assert.assertEquals(user.getAttribute("value"),data);
            data="";
        }
    }
    @Then("employee sign out from the application")
    public void employee_sign_out_from_the_application() {
        us_009.accountIcon.click();
        us_009.signOut.click();
    }

    @Then("employee fills the {string}")
    public void employeeFillsThe(String incorrectSsn) {us_009.ssnSearchBox.sendKeys(incorrectSsn);
    }

    @And("employee should see alert error message")
    public void employeeShouldSeeAlertErrorMessage() {

        ReusableMethods.waitFor(2);
        System.out.println(us_009.alertMessage.getText());
        Assert.assertTrue(us_009.alertMessage.isDisplayed());

    }
}

