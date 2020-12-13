package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14ElementPage {
    public US14ElementPage (){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccountSegment;
    @FindBy(id = "jh-create-entity")
    public WebElement createAccountButton;
    @FindBy(id = "tp-account-createDate")
    public WebElement createDateBox;


}
