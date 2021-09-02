package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_009 {

    public US_009() {
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "account-menu")
    public WebElement accountIcon;

    @FindBy(id = "login-item")
    public WebElement signinButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement submitButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperationsButton;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomersButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomerbutton;

    @FindBy(id = "search-ssn")
    public WebElement ssnSearchBox;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertMessage;

    @FindBy(xpath = "//input[@id='tp-customer-firstName']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public  WebElement middleNameBox;

    @FindBy(xpath = "//input[@id='tp-customer-lastName']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneBox;

    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@id='tp-customer-zipCode']")
    public  WebElement zipCodeBox;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public  WebElement adressBox;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@id='tp-customer-ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement createDateBox;

    @FindBy(xpath = "//select[@id='tp-customer-user']")
    public WebElement userSelectBox;

    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement countrySelectBox;

    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement stateBox;

    @FindBy(xpath = "//select[@id='tp-customer-account']")
    public WebElement accountSelectBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public  WebElement saveButton;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//option[@value='24542']")
    public WebElement fisrtAcc;

    @FindBy(xpath = "//option[@value='28767']")
    public WebElement secAcc;

    @FindBy(xpath = "//tbody")
    public WebElement accountDet;


}
