package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09_NewCustomerPage {
    public US09_NewCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstname;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastname;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssn;

    @FindBy(id = "entity-menu")
    public WebElement myOperationsMenuBtn;

    @FindBy(xpath = " //span[text()='Manage Customers']")
    public WebElement manageCustomersBtn;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomerBtn;

    @FindBy(id = "search-ssn")
    public WebElement ssnSearchbox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;
}
