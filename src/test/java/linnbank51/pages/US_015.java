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

    @FindBy(xpath = "(//th)[1]")
    public WebElement accountTypes;

    @FindBy(xpath = "(//th)[2]")
    public WebElement accountBalance;

    @FindBy(id = "account-menu")
    public WebElement customerAccount;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement savingAccountTransaction;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement checkingAccountTransaction;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement investingAccountTransaction;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement creditCardTransaction;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement verifyID;




}
