package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_008 {

    public US_008() {
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

    @FindBy(id = "account-menu")
    public WebElement customerAccount;

    @FindBy(xpath = "//span[.='Password']")
    public WebElement passwordButton;

    @FindBy(id = "currentPassword")
    public WebElement currentPassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword;

    @FindBy(id = "confirmPassword")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//li[@class='point']")
    public List<WebElement> passwordStrengthScala;

    @FindBy(className = "btn btn-success")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[.='Password Changed']")
    public WebElement passwordChanged;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

}
