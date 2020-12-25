package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Omer_MyAccountsPage {
    public Omer_MyAccountsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//div[@class='table-responsive']/div/table/tbody/tr)[2]")
    public WebElement secondAccount;


}
