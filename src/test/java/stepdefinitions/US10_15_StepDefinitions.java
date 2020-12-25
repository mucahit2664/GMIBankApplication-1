package stepdefinitions;

import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US10_15_StepDefinitions {
    pages.EditCustomerPage editCustomerPage = new pages.EditCustomerPage();

    @Given("user goes to website")
    public void user_goes_to_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }

    @Given("user goes to signin page")
    public void user_goes_to_signin_page() {
        editCustomerPage.login_in.click();
        editCustomerPage.sign_In.click();
    }

    @Given("user enter username and password")
    public void user_enter_username_and_password() {
        Driver.wait(3);
        editCustomerPage.username.sendKeys("employeeTeam13");
        editCustomerPage.password.sendKeys("gmibankteam13");
    }

    @Then("user performs login")
    public void user_performs_login() {
       Driver.wait(2);
        editCustomerPage.signinbutton.submit();
    }

    @Given("user goes to manageCustomers page")
    public void user_goes_to_manageCustomers_page() {
    editCustomerPage.MyOperations.click();
    editCustomerPage.ManageCustomers.click();
    }

    @Given("user clicks edit button")
    public void user_clicks_edit_button() {
        Driver.wait(2);
        editCustomerPage.EditButton.click();

    }

    @Given("user clicks address textbox")
    public void user_clicks_address_textbox() {
        editCustomerPage.AddressTextbox.click();
    }

    @Given("user writes {string} as an address")
    public void user_writes_as_an_address(String string) {
        editCustomerPage.AddressTextbox.sendKeys(string);

    }

    @Given("user click save button")
    public void user_click_save_button() {
    editCustomerPage.SaveButton.submit();
    }

    @Then("user asserts the registration")
    public void user_asserts_the_registration() {
        Driver.wait(3);
    String msj = editCustomerPage.dogrulamaMesaji.getText();
    System.out.println(msj);
       Assert.assertTrue(msj.contains("translation-not-found"));
      // Driver.waitForVisibility(By.id("tp-customer-heading"),2000);
        Driver.wait(10);

    }

    @Given("user clicks city textbox")
    public void user_clicks_city_textbox() {
       // Driver.wait(3);
       editCustomerPage.CityTextbox.click();
    }

    @Given("user writes {string} as an city")
    public void user_writes_as_an_city(String string) {
        //Driver.wait(3);
        editCustomerPage.CityTextbox.clear();
    }

    @Then("user asserts the registration city")
    public void user_asserts_the_registration_city() {
        Driver.wait(3);
        String msj2= editCustomerPage.hataMesaji.getText();
        System.out.println(msj2);
        Assert.assertEquals(msj2,"This field is required.");
       // Driver.waitForVisibility(By.id("tp-customer-heading"),2000);
        Driver.wait(20);

    }

    @Given("user selects {string} as an country from dropdown")
    public void user_selects_as_an_country_from_dropdown(String string) {
        Driver.wait(3);
        Select select=new Select(editCustomerPage.CountryDropdown);
        select.selectByVisibleText(string);

    }

    @Then("user asserts the registration country")
    public void user_asserts_the_registration_country() {
        Driver.wait(3);
        String msj3= editCustomerPage.dogrulamaMesaji.getText();
        System.out.println(msj3);
      Assert.assertTrue(msj3.contains("translation-not-found"));
       // Driver.waitForVisibility(By.id("tp-customer-heading"),2000);
        Driver.wait(20);
    }

    @Then("user asserts the registration empty country")
    public void user_asserts_the_registration_empty_country() {
        Driver.wait(3);
        String msj4=editCustomerPage.hataMesaji.getText();
        Assert.assertEquals(msj4,editCustomerPage.dogrulamaMesaji.getText());
      //  Driver.waitForVisibility(By.id("tp-customer-heading"),20);
        Driver.wait(10);
    }
    @Given("user writes {string} as a state")
    public void user_writes_as_a_state(String string) {
      editCustomerPage.StateTextbox.clear();

    }

    @Then("user asserts the registration empty state")
    public void user_asserts_the_registration_empty_state() {
        Driver.wait(3);
        System.out.println(editCustomerPage.dogrulamaMesaji.getText());
        Assert.assertEquals("This field is required.",editCustomerPage.dogrulamaMesaji.getText());
       // Driver.waitForVisibility(By.id("tp-customer-heading"),20);
        Driver.wait(10);
    }
    @Then("user clicks signout")
    public void user_clicks_signout() {
        editCustomerPage.signOutbefore.click();
        editCustomerPage.signOut.click();
    }
    /////////////////////////////////////////////US_15///////////////////////////////////////////////////////////
    @Given("customer goes to website")
    public void customer_goes_to_website() {
    Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }

    @Given("customer goes to signin page")
    public void customer_goes_to_signin_page() {
    editCustomerPage.login_in.click();
    editCustomerPage.sign_In.click();
    }

    @Given("customer enter username and password")
    public void customer_enter_username_and_password() {
    editCustomerPage.username.sendKeys(ConfigurationReader.getProperty("customerleyla"));
    editCustomerPage.password.sendKeys(ConfigurationReader.getProperty("passwordleyla"));
    }

    @Then("customer performs login")
    public void customer_performs_login() {
        editCustomerPage.signinbutton.click();

    }

    @Given("customer goes to My Accounts page")
    public void customer_goes_to_My_Accounts_page() {
        editCustomerPage.MyOperations.click();
        editCustomerPage.MyAccounts.click();

    }

    @Then("customer asserts the account type")
    public void customer_asserts_the_account_type() {
       //List<WebElement> tum_satirlar= Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        Driver.wait(3);
        WebElement baslik = editCustomerPage.basliklar.get(0);
        System.out.println(baslik.getText());
      /*List<WebElement>basliklar=editCustomerPage.basliklar;
        for (WebElement w:basliklar){
            System.out.println(w.getText());
        }*/
        Driver.wait(3);
        Assert.assertTrue(baslik.getText().contains("Account Type"));

    }

    @Then("customer clicks signout")
    public void customer_clicks_signout() {
        editCustomerPage.signOutbefore.click();
        editCustomerPage.signOut.click();
    }

    @Then("customer asserts the balances")
    public void customer_asserts_the_balances() {
        Driver.wait(3);
        WebElement baslik = editCustomerPage.basliklar.get(1);
        System.out.println(baslik.getText());
        Assert.assertTrue(baslik.getText().contains("Account Balance"));
    }
    @Given("customer clicks view transaction button")
    public void customer_clicks_view_transaction_button() {
     editCustomerPage.viewButton.click();
     Driver.wait(5);
    }

    @Then("customer asserts the view transaction")
    public void customer_asserts_the_view_transaction() {
        List<WebElement>tumsatirlar = editCustomerPage.tum_satirlar;
        for (WebElement w:tumsatirlar) {
            System.out.println(w.getText());
        }
        System.out.println(tumsatirlar.size());
       Assert.assertEquals(tumsatirlar.size(),5);

    }

    @Then("customer asserts the id of account")
    public void customer_asserts_the_id_of_account() {
        String hucre = editCustomerPage.hucre.getText();
        System.out.println(hucre);
        Assert.assertEquals(hucre,"35482");
    }
}