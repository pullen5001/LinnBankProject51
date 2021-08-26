package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_014 {
    public US_014(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccounts;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewAccount;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDateAndTime;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement signOut;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;

    @FindBy(name = "user.id")
    public WebElement selectUser;

    @FindBy(name = "accounts")
    public WebElement selectAccount;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleCheckBox;




}
