package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04 {
    public US_04() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "account-menu")
    public WebElement accountIcon;

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public WebElement signinButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement HomeLink;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;


}
