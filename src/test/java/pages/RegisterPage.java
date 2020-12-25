package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locator from homepage
    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    // Locator from homepage
    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    // Locator from homepage
    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement invalidFeedback;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement Ssn;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//*[@id='mobilephone']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement strengthBar;

    @FindBy(xpath = "//li[@class='point']") // 5 cell with same xpath
    public List<WebElement> strengthBarCells;

    @FindBy(xpath = "//ul[@id='secondPassword']")
    public WebElement secondPassword;

}
