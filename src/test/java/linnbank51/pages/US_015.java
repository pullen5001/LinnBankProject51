package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class US_015 {

    public US_015() {
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "account-menu")
    public WebElement accountIcon;

    @FindBy(id = "login-item")
    public WebElement signinButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement submitButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath = "(//a[@class= 'dropdown-item'])[1]")
    public WebElement myAccounts;

    @FindBy(xpath = "//h2")
    public WebElement customerAccounts;




}