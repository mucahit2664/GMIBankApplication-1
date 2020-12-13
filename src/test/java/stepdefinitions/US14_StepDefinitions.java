package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CustomerPage;
import pages.LoginPage;
import pages.Omer_MyAccountsPage;
import pages.TransferMoneyPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import static utilities.Driver.getDriver;

public class US14_StepDefinitions {
    CustomerPage customerPage = new CustomerPage();
    TransferMoneyPage transfer = new TransferMoneyPage();
    LoginPage loginPage = new LoginPage();
    Omer_MyAccountsPage accountsPage = new Omer_MyAccountsPage();

    @Then("Go to my operations")

    public void go_to_my_operations() {
        Driver.wait(2);
        customerPage.my_Operation.click();
    }

    @Then("Go to transfer money")
    public void go_to_transfer_money() {
        customerPage.transfer_Money.click();
        Driver.wait(2);
    }

    @Then("choose first account")
    public void choose_first_account() {

        Driver.wait(2);
        WebElement dropdownlist = getDriver().findElement(By.id("fromAccountId"));
        Select options = new Select(dropdownlist);
        options.selectByIndex(1);
        Driver.verifyElementDisplayed(By.id("fromAccountId"));
    }

    @Then("choose remain one")
    public void choose_remain_one() {
//        String path = String.valueOf(transfer.from);
//        Omer.Dropdown_selecetBy_classname(path, "30238");

        Driver.wait(2);
        WebElement dropdownlist = getDriver().findElement(By.id("toAccountId"));
        Select options = new Select(dropdownlist);
        options.selectByIndex(1);
    }

    @Then("enter balance")
    public void enter_balance() {
        transfer.balance.sendKeys("30");
    }

    @Then("click on transfer money")
    public void click_on_transfer_money() {
        transfer.make_Transfer.click();
        Driver.wait(1);
        Driver.hover(transfer.alert_verify);

    }

    @Then("receive alert description")
    public void receive_alert_description() {
        String expectedAlert = "Transfer is succesfull";
        String actualData = transfer.alert_verify.getText();
        Assert.assertEquals(expectedAlert, actualData);

    }

    @Then("close browser")
    public void close_browser() {
        //   Driver.getDriver().close();

    }

    @Given("Login in customer account")
    public void loginInCustomerAccount() {
        getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        loginPage.usernamebox.sendKeys();
        Driver.wait(2);


    }

    @Then("Go to my accounts")
    public void goToMyAccounts() {
        customerPage.my_Accounts.click();
        Driver.wait(2);

    }

    @And("Assert if there is second View Transaction")
    public void assertIfThereIsNdViewTransaction() {
        Driver.verifyElementDisplayed(accountsPage.secondAccount);
    }

    @Given("Login in customer account user name {string} and password {string}")
    public void loginInCustomerAccountUserNameAndPassword(String username, String password) {
        getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        loginPage.usernamebox.sendKeys(username);
        loginPage.passwordbox.sendKeys(password);
        loginPage.signInButton.click();
        Driver.wait(2);

    }

    @And("enter description")
    public void enterDescription() {
        transfer.description.sendKeys("something");

    }
}

