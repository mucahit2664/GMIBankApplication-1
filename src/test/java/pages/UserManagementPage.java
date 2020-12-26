package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserManagementPage {
    public UserManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
        //tbody/tr[@id='example2ek']    --> table row id
        //tr[@id='example2ek']//td[5]
        //tbody/tr/td[4]/button/span    --> table row active-deactive button
        //tbody/tr/td[6]//span[text()='ROLE_ADMIN']
        //tbody/tr/td[6]//span[text()='ROLE_USER']
        //tbody/tr/td[6]//span[text()='ROLE_EMPLOYEE']
        //tbody/tr/td[6]//span[text()='ROLE_MANAGER']
        //tbody/tr/td[6]//span[text()='ROLE_CUSTOMER']
        //tbody/tr/td[10]//a[@href='/admin/user-management/example2ek']             --> table row view button
        //tbody/tr/td[10]//a[@href='/admin/user-management/example2ek/edit']        --> table row edit button
        //tbody/tr/td[10]//a[@href='/admin/user-management/example2ek/delete']      --> table row delete button
    */
    @FindBy(xpath = "//tbody/tr")
    public WebElement userTable;

    @FindBy(xpath = "//a[@aria-label = 'Next']")
    public WebElement nextPage;

    @FindBy(xpath = "//a[@aria-label = 'Previous']")
    public WebElement previousPage;

    @FindBy(xpath = "//a[text() = '««']")
    public WebElement firstPage;

    @FindBy(xpath = "//a[text() = '»»']")
    public WebElement lastPage;
}
