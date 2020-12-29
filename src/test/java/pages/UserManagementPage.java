package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagementPage {
    WebDriver driver;
    public UserManagementPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    /*
        //tr[@id='example2ek']    --> table row id
        //tr[@id='example2ek']//td[5]
        //td[4]/button/span    --> table row active-deactive button
        //td[6]//span[text()='ROLE_ADMIN']
        //td[6]//span[text()='ROLE_USER']
        //td[6]//span[text()='ROLE_EMPLOYEE']
        //td[6]//span[text()='ROLE_MANAGER']
        //td[6]//span[text()='ROLE_CUSTOMER']
        //a[@href='/admin/user-management/example2ek']             --> table row view button
        //a[@href='/admin/user-management/example2ek/edit']        --> table row edit button
        //a[@href='/admin/user-management/example2ek/delete']      --> table row delete button
    */
    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement adminDropdownMenu;

    @FindBy(xpath = "//a[@href='/admin/user-management']")
    public WebElement userManagementButton;

    @FindBy(xpath = "//td[2]")
    public List<WebElement> rowIds;

    @FindBy(xpath = "//td[6]//span")
    public List<WebElement> userRoles;

    @FindBy(xpath = "//a[@aria-label = 'Next']")
    public WebElement nextPage;

    @FindBy(xpath = "//a[@aria-label = 'Previous']")
    public WebElement previousPage;

    @FindBy(xpath = "//a[text() = '««']")
    public WebElement firstPage;

    @FindBy(xpath = "//a[text() = '»»']")
    public WebElement lastPage;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement backButton;

    @FindBy(xpath = "//input[@name='activated']")
    public WebElement activateCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-danger']")
    public WebElement deleteConfirmationButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement toastMessage;

    public WebElement getWholeRowAsWebElement(String processedRowId){
        return Driver.getDriver().findElement(By.xpath("//tr[@id='" + processedRowId + "']"));
    }

    public WebElement getViewWebElement(String processedRowId){
        return Driver.getDriver().findElement(By.xpath("//a[@href='/admin/user-management/" + processedRowId + "']"));
    }

    public WebElement getEditWebElement(String processedRowId){
        return Driver.getDriver().findElement(By.xpath("//a[@href='/admin/user-management/" + processedRowId + "/edit']"));
    }

    public WebElement getDeleteWebElement(String processedRowId){
        return Driver.getDriver().findElement(By.xpath("//a[@href='/admin/user-management/" + processedRowId + "/delete']//span/span"));
    }



    /*
    This method collects all rows elements in map and return one element depending on column index
    Key   : rowId as String
    Value : all web elements in rows corresponding rowId

    //tr[@id='example2ek']/td --> list of web elements in a row which ids' is 'example2ek'
    */
    public WebElement oneOfRowElements(String rowId, int indexOfElementInRow){
        Map<String, List<WebElement>> elementsMap = new HashMap<>();

        for (WebElement webItem: rowIds) {
            List<WebElement> elementsList = new ArrayList<>();
            elementsList.addAll(Driver.getDriver().findElements(By.xpath("//tr[@id='" + webItem.getText() + "']/td")));
            elementsMap.put(webItem.getText(), elementsList);
        }

        return elementsMap.get(rowId).get(indexOfElementInRow);
    }

    /*
        This method collects all rows elements in map and return all web elements in a selected row
        Key   : rowId as String
        Value : all web elements in rows corresponding rowId

        //tr[@id='example2ek']/td --> list of web elements in a row which ids' is 'example2ek'
    */
    public List<WebElement> allRowElements(String rowId){
        Map<String, List<WebElement>> elementsMap = new HashMap<>();


        for (WebElement webItem: rowIds) {
            List<WebElement> elementsList = new ArrayList<>();
            elementsList.addAll(Driver.getDriver().findElements(By.xpath("//tr[@id='" + webItem.getText() + "']/td")));
            elementsMap.put(webItem.getText(), elementsList);
        }

        return elementsMap.get(rowId);
    }

    /*
    Search a text in a table column and return first founded text corresponding rowId
    If it can not be founded than go through next page and search in
     */
    public String findRowId(String searchSomeText, int elementIndexInRow){
        String output = "";
        for (WebElement webItem: rowIds) {
            WebElement webElm = oneOfRowElements(webItem.getText(), elementIndexInRow);
            if(webElm.getText().toLowerCase().contains(searchSomeText.toLowerCase())){
                output = webItem.getText();
                break;
            };
        }
        if(output.isEmpty()){
            nextPage.click();
            return findRowId(searchSomeText,elementIndexInRow);
        } else {
            return output;
        }
    }

    /*
 Search a text in a table column and return first founded web element corresponding column id
 If it can not be founded than go through next page and search in
  */
    public WebElement findRowElement(String searchSomeText, int searchingColumnIndex, int requestedElementColumnIndex){
        WebElement output = null;
        for (WebElement webItem: rowIds) {
            WebElement webElm = oneOfRowElements(webItem.getText(), searchingColumnIndex);
            if(webElm.getText().toLowerCase().contains(searchSomeText.toLowerCase())){
                output = oneOfRowElements(webItem.getText(), requestedElementColumnIndex);;
                break;
            };
        }
        if(output == null){
            nextPage.click();
            return findRowElement(searchSomeText, searchingColumnIndex, requestedElementColumnIndex);
        } else {
            return output;
        }
    }

    /*
 Search a text in a table column and return first founded web element corresponding column id
 If it can not be founded than go through next page and search in
  */
    public List<WebElement> findAllRowElements(String searchSomeText, int searchingColumnIndex){
        List<WebElement> output = null;
        for (WebElement webItem: rowIds) {
            List<WebElement> rowWebElements = allRowElements(webItem.getText());
            if(rowWebElements.get(searchingColumnIndex).getText().toUpperCase().contains(searchSomeText.toUpperCase())){
                output = rowWebElements;;
                break;
            };
        }
        if(output == null){
            nextPage.click();
            return findAllRowElements(searchSomeText, searchingColumnIndex);
        } else {
            return output;
        }
    }

    public String getLocatorFromWebElement(WebElement element) {

        return element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "");
    }
}
