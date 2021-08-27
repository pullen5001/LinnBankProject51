package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_002 {
    public US_002() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='#']")
    public WebElement humanIconButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerLink;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;


    @FindBy(id = "firstname")
    public WebElement firstnameTextBox;

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


    @FindBy(xpath="//div[@class='invalid-feedback']")
    public List<WebElement> errorMessageList;

    @FindBy (xpath= "//div[(text() ='Your SSN is invalid')]")
    public WebElement ssnErrMsg;

    @FindBy (xpath= "//div[(text() ='Your mobile phone number is invalid')]")
    public WebElement mobileErrMsg;

    @FindBy (xpath= "//div[(text() ='This field is invalid')]")
    public WebElement emailErrTxt;

}
