package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linnbank51.pages.US_002;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import linnbank51.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_002_stepdef {
    US_002 us_002 = new US_002();
    Actions actions=new Actions(Driver.getDriver());
    @Given("user leaves all text boxes blanks and clicks on register button")
    public void user_leaves_all_text_boxes_blanks_and_clicks_on_register_button() {
        actions.sendKeys(Keys.ARROW_UP).perform();
        actions.sendKeys(Keys.ARROW_UP).perform();
        us_002.registerButton.click();
        System.out.println(us_002.errorMessageList.size());
    }

    @Then("user verifies that all text boxes has error text")
    public void user_verifies_that_all_text_boxes_has_error_text() {
        for(WebElement w:us_002.errorMessageList){
            Assert.assertTrue(w.isDisplayed());
        }

    }

    @Given("user enters an unhyphenated ssn number in ssn text box")
    public void user_enters_an_unhyphenated_ssn_number_in_ssn_text_box() {
        us_002.ssnTextBox.sendKeys(ConfigurationReader.getProperty("invalidSsnNr")+Keys.ENTER);
    }

    @Then("user verifies error text {string}")
    public void user_verifies_error_text(String string) {
        ReusableMethods.waitFor(2);
        //  if i wanna text the border lines os ssn text box
//        String ssBorderColor=us_02_regisNegativeTestPage.ssnTextBox.getCssValue("border-color");
//        ReusableMethods.waitFor(2);
//        String hexColor= Color.fromString(ssBorderColor).asHex();
//        System.out.println("hexColor :"+hexColor);
//        Assert.assertEquals("#dc3545",hexColor);

        //       Another way of validating ssnErr msg
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
//        WebElement msg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[(text() ='Your SSN is invalid')]")));
//        String verify= msg.getText();
//        System.out.println("verify: "+verify);
//        boolean content=verify.contains("Your SSN is invalid");
//        Assert.assertTrue(content);
        System.out.println("ssnErrMsg :"+us_002.ssnErrMsg.getText());
        ReusableMethods.waitFor(2);
        String actErrMsg=us_002.ssnErrMsg.getText();
        String expErrMsg="Your SSN is invalid";
        Assert.assertEquals(actErrMsg,expErrMsg);
    }

    @Given("user enters an invalid Mobile nr in Mobile text box by without hyphenated between numbers")
    public void user_enters_an_invalid_mobile_nr_in_moble_text_box_by_without_hyphenated_between_numbers() {
        ReusableMethods.waitFor(2);
        us_002.mobilePhoneTextBox.sendKeys(ConfigurationReader.getProperty("invalidMobileNr")+Keys.ENTER);
    }
    @Then("user verifies err mobile txt")
    public void user_verifies_err_mobile_txt() {
        ReusableMethods.waitFor(2);
        System.out.println("mobileErrMsg :"+us_002.mobileErrMsg.getText());
        String actMobErrMsg=us_002.mobileErrMsg.getText();
        String expMobErrMsg="Your mobile phone number is invalid";
        Assert.assertEquals(actMobErrMsg,expMobErrMsg);
    }

    @Given("user entes an invalid email in Email box by without respecting hyphenated between numbers")
    public void user_entes_an_invalid_email_in_email_box_by_without_respecting_hyphenated_between_numbers() {
        us_002.emailTextBox.sendKeys(ConfigurationReader.getProperty("invalidEmail")+Keys.ENTER);

    }

    @Then("user verifies err email txt")
    public void user_verifies_err_email_txt() {
        ReusableMethods.waitFor(2);
        System.out.println("emailErrMsg :"+us_002.emailErrTxt.getText());
        String actMobErrMsg=us_002.emailErrTxt.getText();
        ReusableMethods.waitFor(2);
        String expMobErrMsg="This field is invalid";
        Assert.assertEquals(actMobErrMsg,expMobErrMsg);

    }

}
