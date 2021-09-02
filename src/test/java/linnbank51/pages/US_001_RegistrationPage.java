package linnbank51.pages;


import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_001_RegistrationPage  {

    public US_001_RegistrationPage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='#']")
    public WebElement humanIconButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerLink;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//*[.='Your SSN is invalid']")
    public WebElement ssnHataMesaji;

    @FindBy(id = "firstname")
    public WebElement firstnameTextBox;

    @FindBy(xpath = "//div[.='Your First Name is required']")
    public WebElement firstnameHataMesaji;

    @FindBy(id = "lastname")
    public WebElement lastnameTextBox;

    @FindBy(xpath = "//div[.='Your Last Name is required']")
    public WebElement lastnameHataMesaji;

    @FindBy(id = "address")
    public WebElement addressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneTextBox;

    @FindBy(xpath = "//div[.='Your mobile phone number is invalid']")
    public WebElement mobilePhoneHataMesaji;

    @FindBy(id = "username")
    public WebElement usernameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement newPassTextBox;

    @FindBy(id = "secondPassword")
    public WebElement newPassConfTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    // @FindBy(xpath = "//strong[.='Registration saved!']")
    @FindBy(xpath="//div[@class='Toastify']")
    public WebElement registrationSuccessMessage;

    @FindBy(xpath="//*[.='Your SSN is invalid']")
    public WebElement ssnErrorText;



}
