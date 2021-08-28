package linnbank51.pages;

import linnbank51.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_003 {

    public US_003(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public  WebElement redPoint;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public  WebElement orangePoint;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public  WebElement greenPoint;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public  WebElement darkGreenPoint;





    public void scroolPage(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }


}
