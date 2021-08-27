package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linnbank51.pages.US_12;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US_12_stepdef {


    public ReusableMethods ReusableMethods;
    US_12 employeeCustomerPage = new US_12();


    @And("user sees that the first customer's {string} is not empty")
    public void userSeesThatTheFirstCustomerSIsNotEmpty(String cellno) {


        WebElement header;
        header = employeeCustomerPage.headers.get(Integer.valueOf(ConfigurationReader.getProperty(cellno)));


        WebElement data = employeeCustomerPage.cells.get(Integer.valueOf(ConfigurationReader.getProperty(cellno)));
        System.out.println(header.getText() + " : " + data.getText());
        Assert.assertTrue(data.isDisplayed());


    }


    @And("user clicks on page {int}")
    public void userClicksOnPage(int arg0) {
        employeeCustomerPage.page2.click();
        ReusableMethods.waitFor(1);
    }


    @And("user clicks on page_{int}")
    public void userClicksOnPage_(int arg0) {
        employeeCustomerPage.page3.click();
        ReusableMethods.waitFor(1);
    }


    @And("user click on the first customer's View button")
    public void userClickOnTheFirstCustomerSViewButton() {
        employeeCustomerPage.viewButton.click();
    }


    @Then("there should be Edit button at the bottom and left")
    public void thereShouldBeEditButtonAtTheBottomAndLeft() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(employeeCustomerPage.editViewButton.isDisplayed());
    }


    @Then("there should be Edit button  of first customer on the page that opens")
    public void thereShouldBeEditButtonOfFirstCustomerOnThePageThatOpens() {
        Assert.assertTrue(employeeCustomerPage.editButton.isDisplayed());
        employeeCustomerPage.editButton.click();
    }


    @And("user clicks on first customer's Edit button")
    public void userClicksOnFirstCustomerSEditButton() {
        employeeCustomerPage.editButton.click();


    }


    @And("Then user should see {string}")
    public void thenUserShouldSee(String arg0) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(employeeCustomerPage.update_message.isDisplayed());


    }

    @When("user clicks on Delete button")
    public void user_clicks_on_delete_button() {
        employeeCustomerPage.lastPage.click();


        ReusableMethods.waitFor(1);


        int size = employeeCustomerPage.rows.size();


        WebElement lastDelete = Driver.getDriver().findElement(By.xpath("(//a[@class='btn btn-danger btn-sm'])[" + size + "]"));


        Actions actions = new Actions(Driver.getDriver());


        if (size < 17) {
            actions.sendKeys(Keys.PAGE_UP).perform();
        }


        ReusableMethods.waitFor(2);


        lastDelete.click();


    }


    @When("there is a Confirm Delete pop up")
    public void there_is_a_confirm_delete_pop_up() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(employeeCustomerPage.confirmPopUp.isDisplayed());


    }

    @Then("user should see {string} at the and")
    public void userShouldSeeAtTheAnd(String delete_message) {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(ConfigurationReader.getProperty(delete_message), employeeCustomerPage.delete_message.getText());
    }


    @And("user clicks on Delete-confirm button")
    public void userClicksOnDeleteConfirmButton() {
        ReusableMethods.waitFor(1);
        employeeCustomerPage.deleteConfirmButton.click();
    }
}


