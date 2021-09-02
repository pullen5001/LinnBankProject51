package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_018;
import org.junit.Assert;

public class US_018_stepdef {
    US_018 us_018 = new US_018();

    @Given("user verifies first name last name middle initial email mobile phone number phone number address create date columns")
    public void userVerifiesFirstNameLastNameMiddleInitialEmailMobilePhoneNumberPhoneNumberAddressCreateDateColumns() {
        Assert.assertTrue(us_018.accountDetails.isDisplayed());
    }
    @Given("user verifies view option")
    public void userVerifiesViewOption() {
        Assert.assertTrue(us_018.viewOption.isDisplayed());
    }
    @Given("user verifies edit option")
    public void userVerifiesEditOption() {
        Assert.assertTrue(us_018.editOption.isDisplayed());
    }
    @Given("user clicks edit option")
    public void userClicksEditOption() {
        us_018.editOption.click();
    }
    @Then("user can create or update user info from edit portal")
    public void userCanCreateOrUpdateUserInfoFromEditPortal() {
        Assert.assertTrue(us_018.createEditPortal.isDisplayed());
    }
    @Given("user can delete a customer, but seeing a message if the user is sure about deletion")
    public void userCanDeleteACustomerButSeeingAMessageIfTheUserIsSureAboutDeletion() {
        Assert.assertTrue(us_018.deleteOption.isDisplayed());
    }

}


