package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_019 {

    public US_019(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balance;

    @FindBy(xpath = "//select[@name='accountType']")
    public WebElement accountType;

    @FindBy(xpath = "//option[@value='SAVING']")
    public WebElement saving;

    @FindBy(xpath = "//select[@name='accountStatusType']")
    public WebElement accountStatusType;

    @FindBy(xpath = "//option[@value='ACTIVE']")
    public WebElement activeAccount;

    @FindBy(xpath = "//select[@name='employee.id']")
    public WebElement employee;

}