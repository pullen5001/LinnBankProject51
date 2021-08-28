package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_017;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;

public class US_017_stepdef {
    US_017 us_17 = new US_017();

    @Given("Admin clicks on human icon")
    public void admin_clicks_on_human_icon() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
        {us_17.accountIcon.click(); }
    }

    @Then("Admin clicks sign in button")
    public void admin_clicks_sign_in_button() {
        us_17.signinButton.click();
    }

    @Then("Admin enters valid admin username")
    public void admin_enters_valid_admin_username() {
        us_17.userName.sendKeys(ConfigurationReader.getProperty("admin_username"));
    }

    @Then("Admin enters valid admin password")
    public void admin_enters_valid_admin_password() {
        us_17.passWord.sendKeys(ConfigurationReader.getProperty("admin_password"));
    }

    @Then("Admin clicks on sign in button")
    public void admin_clicks_on_sign_in_button() {
        us_17.submitButton.click();
    }

    @Then("Admin clicks on Administration Dropdown")
    public void admin_clicks_on_administration_dropdown() {
        us_17.administrationButton.click();
    }

    @Then("Admin clicks on User management from dropdown")
    public void admin_clicks_on_user_management_from_dropdown() {
        us_17.userManagement.click();

    }
/*

    @Then("Admin clicks on User")
    public void admin_clicks_on_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("finds user by using ID")
    public void finds_user_by_using_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin clicks on Activated button")
    public void admin_clicks_on_activated_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("finds userID")
    public void finds_user_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Clicks on employees Edit button")
    public void clicks_on_employees_edit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin Selects Role_Employee")
    public void admin_selects_role_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin clicks save")
    public void admin_clicks_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin Clicks on edit button")
    public void admin_clicks_on_edit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin selects Role_Manager")
    public void admin_selects_role_manager() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin Clicks on employees Edit button")
    public void admin_clicks_on_employees_edit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin Selects Role_Admin")
    public void admin_selects_role_admin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("clicks userID")
    public void clicks_user_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify admin can view all info")
    public void verify_admin_can_view_all_info() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("clicks edit button on user")
    public void clicks_edit_button_on_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify Create or edit a user is displayed for user")
    public void verify_create_or_edit_a_user_is_displayed_for_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("clicks delete button on user")
    public void clicks_delete_button_on_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin clicks delete from alert")
    public void admin_clicks_delete_from_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify user is deleted alert")
    public void verify_user_is_deleted_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/

}
