package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_007 {

    public US_007() {
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

    @FindBy(xpath = "//span[.='User Info']")
    public WebElement userInfoButton;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(className = "invalid-feedback")
    public WebElement invalidMessage;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(id = "langKey")
    public WebElement languageDropdown;

}
