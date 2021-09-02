package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_019;

public class US_019_stepdef {
    US_019 us_019 = new US_019();

    @Given("user can create a description for the new account")
    public void userCanCreateADescriptionForTheNewAccount() {
        us_019.description.sendKeys("sample account");
    }

    @Given("user should provide a balance for the first-time account creation as Dollar")
    public void userShouldProvideABalanceForTheFirstTimeAccountCreationAsDollar() {
        us_019.balance.sendKeys("65295000");
    }


    @Given("user clicks account type")
    public void userClicksAccountType() {

    }

    @Then("user select account as checking saving credit-card investing")
    public void userSelectAccountAsCheckingSavingCreditCardInvesting() {
        us_019.saving.click();
    }

    @Given("user clicks account status type")
    public void userClicksAccountStatusType() {
        us_019.accountStatusType.click();
    }

    @Then("user define account status as active suspended or closed")
    public void userDefineAccountStatusAsActiveSuspendedOrClosed() {
        us_019.activeAccount.click();
    }

    @Given("user can select an employee from the drop-down")
    public void userCanSelectAnEmployeeFromTheDropDown() {
        us_019.employee.click();
    }
}