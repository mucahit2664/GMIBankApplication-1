package pages;
import java.util.List;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
    public EditCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='header-tabs']/li[8]")
    public WebElement login_in;
    @FindBy(xpath = "(//div/a[@class='dropdown-item'])[1]")
    public WebElement sign_In;
     @FindBy(name = "username")
    public WebElement username;
    @FindBy(name="password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signinbutton;

    @FindBy(id = "entity-menu")
    public WebElement MyOperations;
   // @FindBy(linkText = "Manage Customers")
    @FindBy(xpath = "//a[@href='/tp-customer']")
    public WebElement ManageCustomers;
    @FindBy(xpath = "//a[@href='/customer/tp-customer-accounts/34941']")
    public WebElement MyAccounts;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement EditButton;
    @FindBy(id = "tp-customer-address")
    public WebElement AddressTextbox;
    @FindBy(id = "tp-customer-city")
    public WebElement CityTextbox;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement CountryDropdown;
    @FindBy(id = "tp-customer-state")
    public WebElement StateTextbox;
    @FindBy(id = "save-entity")
    public WebElement SaveButton;
    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement dogrulamaMesaji;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;

    @FindBy(id = "account-menu")
    public WebElement signOutbefore;
    @FindBy(xpath = "(//a[@href='/logout'])")
    public WebElement signOut;

    @FindBy(xpath=  "//thead/tr/th")
    public List<WebElement> basliklar;
    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> tableAccount;
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> tum_satirlar;

    @FindBy(xpath = "//tbody/tr/td/button[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//tbody/tr[3]/td[2]")
    public WebElement hucre;


}
