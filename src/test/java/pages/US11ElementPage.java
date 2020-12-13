package pages;

import org.omg.CORBA.DATA_CONVERSION;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DateUtil;
import utilities.Driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class US11ElementPage {
   public US11ElementPage(){PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(id = "entity-menu")
    public WebElement myOperationSegment;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement manageCustomer;
    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;
    @FindBy (tagName = "h2")
    public WebElement customerCreationPageText;
    @FindBy(id = "search-ssn")
    public WebElement ssnBox;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;
    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitialBox;
    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumberBox;
    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCodeBox;
    @FindBy(id = "tp-customer-city")
    public WebElement cityBox;
    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateBox;
    @FindBy(id = "tp-customer-country")
    public WebElement countryBox;
    @FindBy(id = "tp-customer-state")
    public WebElement stateBox;
    @FindBy(id = "tp-customer-user")
    public WebElement userBox;
    @FindBy(id = "tp-customer-account")
    public WebElement accountBox;
    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledCheckBox;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameBox;
    @FindBy(id = "tp-customer-lastName")
    public WebElement lastNameBox;
    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneBox;
    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement verifyCustomerInfoRetrieved;



}
