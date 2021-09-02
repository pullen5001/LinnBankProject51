package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_016 {
    public US_016() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "account-menu")
    public WebElement accountIcon;

    @FindBy(id = "login-item")
    public WebElement signinButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[@class= 'dropdown-item'])[1]")
    public WebElement myAccounts;

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]")
    public WebElement transferMoney;

    @FindBy(xpath = "//*[@id=\"fromAccountId\"]")
    public WebElement fromDropdown;

    @FindBy(xpath = "//*[@id=\"toAccountId\"]")
    public WebElement toDropdown;

    @FindBy(xpath = "//*[@id=\"balance\"]")
    public WebElement balanceTextbox;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@id=\"make-transfer\"]")
    public WebElement makeTransferButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successMessage;


}
