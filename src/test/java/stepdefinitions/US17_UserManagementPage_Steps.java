package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.UserManagementPage;
import utilities.Driver;

import javax.swing.*;
import java.util.List;

public class US17_UserManagementPage_Steps {

    UserManagementPage userManagementPage = new UserManagementPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();;

    @Given("user click admin dropdown menu and click user management button")
    public void user_click_admin_dropdown_menu_and_click_user_management_button() {
        userManagementPage.adminDropdownMenu.click();
        userManagementPage.userManagementButton.click();
    }

    @Given("user click button to activate or deactivate a role as {string}")
    public void user_click_button_to_activate_or_deactivate_a_role_as_user(String roleOfUser) {

        List<WebElement> listOfElements = userManagementPage.findAllRowElements(roleOfUser,5);
        WebElement activateDeactivateButton = listOfElements.get(3);
        String processedRowId = listOfElements.get(1).getText();
        String previousButtonStatus = activateDeactivateButton.getText();

        // Highlight selected row
        WebElement selectedRow = userManagementPage.getWholeRowAsWebElement(processedRowId);
        jse.executeScript("arguments[0].style.background='yellow'", selectedRow);
        Driver.wait(5);

        activateDeactivateButton.click();
        Driver.getDriver().navigate().refresh();
        String currentButtonStatus = userManagementPage.allRowElements(processedRowId).get(3).getText();

        // After the button is clicked if button text is different than previous one, it means passed
        Assert.assertNotEquals(previousButtonStatus, currentButtonStatus);

    }

    @Given("user click view button to see {string} info")
    public void user_click_view_button_to_see_all_user_info(String roleOfUser) {
        String processedRowId = userManagementPage.findRowId(roleOfUser,5);
        WebElement view = userManagementPage.getViewWebElement(processedRowId);
        view.click();
        Assert.assertTrue(userManagementPage.backButton.isDisplayed());
        Driver.wait(2);
        userManagementPage.backButton.click();
        Driver.getDriver().navigate().refresh();
    }

    @When("user click edit button to be able to edit one of {string} info")
    public void user_click_edit_button_to_be_able_to_edit_all_user_info(String roleOfUser) {
        String processedRowId = userManagementPage.findRowId(roleOfUser,5);
        WebElement editButton = userManagementPage.getEditWebElement(processedRowId);
        editButton.click();
        String previousCheckboxStatus = userManagementPage.activateCheckbox.getAttribute("value");
        userManagementPage.activateCheckbox.click();
        String currentCheckboxStatus = userManagementPage.activateCheckbox.getAttribute("value");
        Assert.assertNotEquals(previousCheckboxStatus, currentCheckboxStatus);
        Driver.wait(2);
        userManagementPage.saveButton.click();
        Driver.getDriver().navigate().refresh();
    }


    @When("user click delete button to be able to delete one of {string}")
    public void user_click_delete_button_to_be_able_to_delete_one_of(String roleOfUser) {
        String processedRowId = userManagementPage.findRowId(roleOfUser,5);
        WebElement deleteButton = userManagementPage.getDeleteWebElement(processedRowId);
        deleteButton.click();
        Driver.wait(7);
        userManagementPage.deleteConfirmationButton.click();
        Driver.wait(2);
        JOptionPane.showMessageDialog(null, userManagementPage.toastMessage.getText());
        Assert.assertTrue(userManagementPage.toastMessage.getText().contains("user is deleted"));
    }

}
