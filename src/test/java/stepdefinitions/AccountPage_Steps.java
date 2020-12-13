package stepdefinitions;

import GMI_BANK_13.pages.AccountPage;
import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class AccountPage_Steps {
    AccountPage accountPage = new AccountPage();

    @Given("Go to homepage and click user icon")
    public void go_to_homepage_and_click_user_icon() {
        Driver.getDriver().get("http://gmibank.com/");
        accountPage.accountMenu.click();
    }

    @Given("Click sign in selection")
    public void click_sign_in_selection() {
        accountPage.signIn.click();
    }

    @Given("Type username {string} and password {string}")
    public void type_username_and_password(String username, String password) {
        accountPage.username.sendKeys(username);
        accountPage.password.sendKeys(password);
    }

    @Given("Click on sign in button")
    public void click_on_sign_in_button() {
        accountPage.signInButton.click();
    }

    @Given("Click on My Operations button")
    public void click_on_My_Operations_button() {
        accountPage.myOperations.click();
    }

    @Given("Click on Manage Accounts button")
    public void click_on_Manage_Accounts_button() {
        accountPage.manageAccounts.click();
    }

    @Given("Click on Create New Account button")
    public void click_on_Create_New_Account_button() {
        accountPage.newAccount.click();
    }

    @When("Edit description field and check if it is editable")
    public void edit_description_field_and_check_if_it_is_editable(List<String> data) {
        data.stream().forEach(i-> {
            accountPage.description.sendKeys(i);
            Assert.assertTrue(accountPage.description.getAttribute("value").length()>0);
            Driver.wait(1);
            accountPage.description.clear();
        });
    }

    @Then("if description field is blank get feedback message")
    public void if_description_field_is_blank_get_feedback_message() {
        accountPage.description.click();
        accountPage.description.sendKeys("a");
        accountPage.description.sendKeys(Keys.BACK_SPACE);
        accountPage.description.sendKeys(Keys.TAB);
        if(accountPage.description.getAttribute("value").isEmpty()){
            Assert.assertEquals(ConfigurationReader.getProperty("requiredFieldFeedback"),
                                accountPage.descriptionFeedbackMessage.getText());
        }
    }

    @When("Edit balance field and check if it is editable and non char")
    public void edit_balance_field_and_check_if_it_is_editable(List<String> data) {
        data.stream().forEach(i-> {
            accountPage.balance.sendKeys(i);
            Driver.wait(1);
            accountPage.description.click();
            Assert.assertTrue(accountPage.balance.getAttribute("value").length()>0);
            if(accountPage.balance.getAttribute("value").matches("\\D*")){
                Assert.assertEquals(ConfigurationReader.getProperty("numberFieldFeedback"),
                        accountPage.balanceFeedbackMessage.getText());
            }
            Driver.wait(1);
            accountPage.balance.clear();
        });
    }

    @Then("if balance field is blank get feedback message")
    public void if_balance_field_is_blank_get_feedback_message() {
        accountPage.balance.click();
        accountPage.balance.sendKeys("a");
        accountPage.balance.sendKeys(Keys.BACK_SPACE);
        accountPage.balance.sendKeys(Keys.TAB);
        if(accountPage.balance.getAttribute("value").isEmpty()){
            Assert.assertEquals(ConfigurationReader.getProperty("requiredFieldFeedback"),
                    accountPage.balanceFeedbackMessage.getText());
        }
    }

    @When("{string} dropdown clicked")
    public void dropdown_clicked(String string, List<String> data) {
        if(string.equals("Account type")) {
            accountPage.accountTypeDropdown.stream()
                       .forEach(i -> Assert.assertTrue(data.contains(i.getAttribute("value"))));
        }else if(string.equals("Account status type")) {
            accountPage.accountStatusTypeDropdown.stream()
                       .forEach(i -> Assert.assertTrue(data.contains(i.getAttribute("value"))));
        }else if(string.equals("Employee")){
            accountPage.accountEmployee.stream()
                       .forEach(i-> Assert.assertFalse(i.getAttribute("value").isEmpty()));
        }

    }

    @Then("Select and check {string}")
    public void select_and_check(String string) {
        if(string.equals("Account type")) {
            accountPage.accountTypeDropdown.stream().forEach(i -> {i.click();
                                                                   Assert.assertTrue(i.isSelected());
                                                                  });
        }else if(string.equals("Account status type")) {
            accountPage.accountStatusTypeDropdown.stream().forEach(i -> {i.click();
                                                                   Assert.assertTrue(i.isSelected());
                                                                  });
        }else if(string.equals("Employee")){
            accountPage.accountEmployee.stream().forEach(i-> {i.click();
                                                              Assert.assertTrue(i.isSelected());
                                                             });
        }
    }

    @Then("close my browser")
    public void closeMyBrowser() {
        Driver.closeDriver();
    }
}