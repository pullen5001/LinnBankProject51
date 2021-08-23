package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_05 {
    public US_05() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[1]/div[1]/div")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[contains(text(),'your password?')]")
    public WebElement reset;

    @FindBy(xpath = "//span[contains(text(),'Register a new account')]")
    public WebElement registerNewAccount;





}