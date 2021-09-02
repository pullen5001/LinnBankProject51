package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_017 {
    public US_017() { PageFactory.initElements(Driver.getDriver(),this);}

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


    @FindBy(xpath = "//*[@id=\"admin-menu\"]/a/span")
    public WebElement administrationButton;

    @FindBy(xpath = "//*[@id=\"admin-menu\"]/div/a[1]/span")
    public WebElement userManagement;

    @FindBy(xpath = "//*[text()='Created date']")
    public WebElement createdDateSort;

    @FindBy(xpath = "(//*[text()='Deactivated'])[1]")
    public WebElement deactivatedButton;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOutButton;





}
