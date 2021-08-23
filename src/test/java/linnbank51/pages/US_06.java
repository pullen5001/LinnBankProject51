package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_06 {
    public US_06() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//span[contains(text(),'ayse Fatma')]")
    public WebElement customerName;

    @FindBy(xpath = "//span[contains(text(),'User Info')]")
    public WebElement userInfoButton;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "langKey")
    public WebElement languageField;






}
