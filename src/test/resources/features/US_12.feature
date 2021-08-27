package linnbank51.pages;
import linnbank51.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class US_12 {
public US_12(){
PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement SignInDropdown;


@FindBy(linkText = "Sign in")
public WebElement SignIn;


@FindBy(id = "username")
public  WebElement usernameTextBox;


@FindBy(id = "password")
public WebElement passwordTextBox;


@FindBy(xpath = "//button[@class='btn btn-primary']")
public WebElement SignInButton;


@FindBy(id="entity-menu")
public WebElement myOperations;


@FindBy(linkText = "Manage Customers")
public WebElement manageCustomers;


@FindBy(id = "jh-create-entity")
public WebElement createNewCustomer;


@FindBy(name = "firstName")
public WebElement firstnameTextBox;


@FindBy(name = "lastName")
public WebElement lastnameTextBox;


@FindBy(name = "middleInitial")
public WebElement middleinitialTextBox;


@FindBy(name = "email")
public WebElement emailTextBox;


@FindBy(name = "mobilePhoneNumber")
public WebElement mobilphonenumberTextBox;


@FindBy(name = "phoneNumber")
public WebElement phonenumberTextBox;


@FindBy(name = "zipCode")
public WebElement zipcodeTextBox;


@FindBy(name = "address")
public WebElement addressTextBox;


@FindBy(name = "city")
public WebElement cityTextBox;


@FindBy(name = "ssn")
public WebElement ssnTextBox;


@FindBy(name = "createDate")
public  WebElement createDate;


@FindBy(name = "country.id")
public WebElement countryDropdown;


@FindBy(name = "state")
public WebElement state;


@FindBy(name = "user.id")
public WebElement userDropdown;


@FindBy(id = "save-entity")
public WebElement saveButton;


@FindBy(xpath = "//div[@class='invalid-feedback']")
public WebElement requiredMessage;


@FindBy(xpath = "//div[@class='Toastify__toast-body']")
public WebElement createdMessage;


@FindBy(linkText = "2")
public WebElement page2;


@FindBy(linkText = "3")
public WebElement page3;


@FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
public WebElement viewButton;


@FindBy(xpath = "//a[@class='btn btn-primary']")
public WebElement editViewButton;


@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
public  WebElement editButton;


@FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
public WebElement deleteButton;


@FindBy(xpath = "//button[@class='btn btn-danger']")
public WebElement deleteConfirmButton;


@FindBy(xpath = "//div[@class='Toastify__toast-body']")
public  WebElement delete_message;


@FindBy(xpath = "//div[@class='Toastify__toast-body']")
public WebElement update_message;


@FindBy(xpath = "//tbody//tr[1]//td")
public List<WebElement> cells;


@FindBy(xpath = "//thead//th")
public List<WebElement> headers;


@FindBy(xpath = "//tbody//tr")
public List<WebElement> rows;


@FindBy(linkText = "»»")
public WebElement lastPage;


@FindBy(xpath = "//h5[@class='modal-title']")
public WebElement confirmPopUp;
}
