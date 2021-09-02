package linnbank51.stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import linnbank51.pages.US_001_RegistrationPage;
import linnbank51.pages.US_009;
import linnbank51.pages.US_017;
import linnbank51.pages.US_04;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_001_stepdef {

    US_001_RegistrationPage us_001_registrationPage = new US_001_RegistrationPage();
    Faker faker=new Faker();
    US_04 us_04 = new US_04();
    US_017 us_17 = new US_017();
    US_009 us_009 = new US_009();

    @Given("user goes to linnbank page")
    public void user_goes_to_linnbank_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("application_url"));
        ReusableMethods.waitFor(2);
    }

    @Given("user clicks on human icon on the page")
    public void user_clicks_on_human_icon_on_the_page() {
        us_001_registrationPage.humanIconButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("user clicks on register from dropdown")
    public void user_clicks_on_register_from_dropdown() {
        us_001_registrationPage.registerLink.click();
        ReusableMethods.waitFor(2);
    }

    @Given("user clicks on ssn box and enters {string}")
    public void user_clicks_on_ssn_box_and_enters(String string) {
        us_001_registrationPage.ssnTextBox.click();
        us_001_registrationPage.ssnTextBox.sendKeys(string);
    }

    @Given("user enters {string} in First Name text box")
    public void user_enters_in_first_name_text_box(String string) {
        us_001_registrationPage.firstnameTextBox.sendKeys(string + Keys.ENTER);
    }

    @Given("user enters {string} in Last Name text box")
    public void user_enters_in_last_name_text_box(String string) {
        us_001_registrationPage.lastnameTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("user enters {string}  in Address text box")
    public void user_enters_in_address_text_box(String string) {
        us_001_registrationPage.addressTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("user enters {string} in Mobile Phone text box")
    public void user_enters_in_mobile_phone_text_box(String string) {
        us_001_registrationPage.mobilePhoneTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("enters {string} in Username text box")
    public void enters_in_username_text_box(String string) {
        us_001_registrationPage.usernameTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("user enters {string} in Email text box")
    public void user_enters_in_email_text_box(String string) {
        us_001_registrationPage.emailTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("user enters {string} in New Password text box")
    public void user_enters_in_new_password_text_box(String string) {
        us_001_registrationPage.newPassTextBox.sendKeys(string+Keys.ENTER);
    }

    @Given("user enters {string} in new Password Confirmation text box and clicks on register button")
    public void user_enters_in_new_password_confirmation_text_box_and_clicks_on_register_button(String string) {

        us_001_registrationPage.newPassConfTextBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user verifies the success message of the registration {string}")
    public void user_verifies_the_success_message_of_the_registration(String string) {

        ReusableMethods.waitForClickablility(us_001_registrationPage.registrationSuccessMessage, 5);
        String actMsg = us_001_registrationPage.registrationSuccessMessage.getText();
        System.out.println("actMsg: " + actMsg);
        String expMsg = "Registration saved! Please check your email for confirmation.\n" +
                "✖︎";

        Assert.assertEquals(expMsg, actMsg);

    }

    @Then("user applies for registration")
    public void userAppliesForRegistration() {
        us_001_registrationPage.ssnTextBox.click();
        ReusableMethods.waitFor(2);
        us_001_registrationPage.ssnTextBox.sendKeys(ConfigurationReader.getProperty("demo_ssn"));
        ReusableMethods.waitFor(2);
        us_001_registrationPage.firstnameTextBox.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(2);
        us_001_registrationPage.lastnameTextBox.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(2);
        us_001_registrationPage.addressTextBox.sendKeys(faker.address().fullAddress());
        ReusableMethods.waitFor(2);
        us_001_registrationPage.mobilePhoneTextBox.sendKeys("254-986-6985");
        ReusableMethods.waitFor(2);
        us_001_registrationPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("demo_username"));
        ReusableMethods.waitFor(2);
        us_001_registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(2);
        us_001_registrationPage.newPassTextBox.sendKeys(ConfigurationReader.getProperty("demo_password"));
        ReusableMethods.waitFor(2);
        us_001_registrationPage.newPassConfTextBox.sendKeys(ConfigurationReader.getProperty("demo_password"));
        ReusableMethods.waitFor(2);
        us_001_registrationPage.registerButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("user logins to admin account {string} {string}")
    public void userLoginsToAdminAccount(String username, String password) {
        us_04.accountIcon.click();
        ReusableMethods.waitFor(2);
        us_04.signinButton.click();
        ReusableMethods.waitFor(2);
        us_04.userName.sendKeys(ConfigurationReader.getProperty(username));
        ReusableMethods.waitFor(2);
        us_04.passWord.sendKeys(ConfigurationReader.getProperty(password));
        ReusableMethods.waitFor(2);
        us_04.submitButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("user navigates to user management section")
    public void userNavigatesToUserManagementSection() {
        us_17.administrationButton.click();
        ReusableMethods.waitFor(2);
        us_17.userManagement.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user activates the applicant")
    public void userActivatesTheApplicant() {
        us_17.createdDateSort.click();
        ReusableMethods.waitFor(2);
        us_17.deactivatedButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("user logs out from admin account")
    public void userLogsOutFromAdminAccount() {
        us_17.accountMenu.click();
        ReusableMethods.waitFor(3);
        us_17.signOutButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user log in employee account {string} {string}")
    public void userLogInEmployeeAccount(String username, String password) {
        us_04.accountIcon.click();
        ReusableMethods.waitFor(2);
        us_04.signinButton.click();
        ReusableMethods.waitFor(2);
        us_04.userName.sendKeys(ConfigurationReader.getProperty(username));
        ReusableMethods.waitFor(2);
        us_04.passWord.sendKeys(ConfigurationReader.getProperty(password));
        ReusableMethods.waitFor(2);
        us_04.submitButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("user logs out from customer account")
    public void userLogsOutFromCustomerAccount() {
        us_17.accountMenu.click();
        ReusableMethods.waitFor(2);
        us_17.signOutButton.click();
        ReusableMethods.waitFor(2);
    }



    @And("user get account details")
    public void userGetAccountDetails() {
        String txt = us_009.accountDet.getText();
        System.out.println(txt);
        ReusableMethods.waitFor(2);
    }
}

