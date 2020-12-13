package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage {

    public AccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locator from homepage
    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    // Locator from homepage
    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    //Locator from login page
    @FindBy(id = "username")
    public WebElement username;

    //Locator from login page
    @FindBy(id = "password")
    public WebElement password;

    // Locator from login page
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    // Locator from user own page
    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperations;

    // Locator from user own page
    @FindBy(xpath = "//span[text()='Manage Accounts']")
    public WebElement manageAccounts;

    // Locator from user own page
    @FindBy(xpath = "//span[text()='Create a new Account']")
    public WebElement newAccount;

    @FindBy(id = "tp-account-description")
    public WebElement description;

    /* There are 2 types Feedback Messages
        --> This field should be a number.
        --> This field is required.
     */
    @FindBy(xpath = "(//div[@class = 'invalid-feedback'])[1]")
    public WebElement descriptionFeedbackMessage;

    @FindBy(xpath = "(//div[@class = 'invalid-feedback'])[2]")
    public WebElement balanceFeedbackMessage;

    @FindBy(xpath = "(//div[@class='justify-content-center row'])[2]")
    public WebElement blankPageArea;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    /*
     * Attribute name : option - values : CHECKING, SAVING, CREDIT_CARD and INVESTING
     */
    @FindBy(xpath = "//select[@id = 'tp-account-accountType']/option")
    public List<WebElement> accountTypeDropdown;

    /*
     * Attribute name : option - values : ACTIVE, SUSPENDED and CLOSED
     */
    @FindBy(xpath = "//select[@id = 'tp-account-accountStatusType']/option")
    public List<WebElement> accountStatusTypeDropdown;

    @FindBy(xpath = "//select[@id = 'tp-account-employee']/option")
    public List<WebElement> accountEmployee;
}
   