package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransferMoneyPage {
    public TransferMoneyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "fromAccountId")
    public WebElement from;

    @FindBy(className = "toAccountId")
    public WebElement to;

    @FindBy(xpath = "//input[@id='balance']")
    public WebElement balance;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement make_Transfer;

    @FindBy(xpath = ("//div[@class='invalid-feedback'])[1]"))
    public WebElement alert_balance;

    @FindBy(xpath = ("//div[@class='invalid-feedback'])[2]"))
    public WebElement alert_description;

    @FindBy(className = ("Toastify__toast-body"))
    public WebElement alert_verify;



}