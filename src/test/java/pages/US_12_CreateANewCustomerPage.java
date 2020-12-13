package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_12_CreateANewCustomerPage {

    public WebElement successMessage;

    public US_12_CreateANewCustomerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search-ssn']")
    public WebElement searchSSNBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='tp-customer-firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='tp-customer-lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id='tp-customer-middleInitial']")
    public WebElement middleInitialBox;

    @FindBy(xpath = "//*[@id='tp-customer-email']")
    public WebElement emailbox;

    @FindBy(xpath = "//*[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneBox;

    @FindBy(xpath = "//*[@id='tp-customer-phoneNumber']")
    public WebElement phoneBox;

    @FindBy(xpath = "//*[@id='tp-customer-zipCode']")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//*[@id='tp-customer-address']")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@id='tp-customer-city']")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@id='tp-customer-ssn']")
    public WebElement SSNbox;

    @FindBy(xpath = "//*[@id='tp-customer-createDate']")
    public WebElement createDateBox;

    @FindBy(xpath = "//*[@id='tp-customer-country']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//*[@id='tp-customer-state']")
    public WebElement stateBox;

    @FindBy(xpath = "//*[@id='tp-customer-user']")
    public WebElement userDropDown;

    @FindBy(xpath = "//*[@id='tp-customer-account']")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[@id='tp-customer-zelleEnrolled']")
    public WebElement zelleCheckBox;

    @FindBy(xpath = "//*[@id='cancel-save']")
    public WebElement backButton;

    @FindBy(xpath = "//*[@id='save-entity']/span")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/form/div[9]/div/div")
    public WebElement feedBackAdress;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/form/div[10]/div/div")
    public WebElement feedBackCity;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div[2]/div[1]")
    public WebElement errorMessage;

    @FindBy(xpath ="//div[@role='alert']")




    public WebElement successAlert;



}
