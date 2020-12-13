package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US14ElementPage;
import utilities.DateUtil;
import utilities.Driver;


public class US14_StepDefinitions {
    US14ElementPage us14ElementPage = new US14ElementPage();
    @Given("user clicks Manage Account segment")
    public void user_clicks_Manage_Account_segment() {
     us14ElementPage.manageAccountSegment.click();
        Driver.wait(3);
        Assert.assertTrue(us14ElementPage.createAccountButton.isDisplayed());
    }

    @Given("user clicks Create a new Account button")
    public void user_clicks_Create_a_new_Account_button() {
        us14ElementPage.createAccountButton.click();
    }

    @Given("user type the date at the time of the account creation")
    public void user_type_the_date_at_the_time_of_the_account_creation() {
        us14ElementPage.createDateBox.sendKeys(DateUtil.getTimeNow());
        Driver.wait(2);
        Assert.assertFalse(us14ElementPage.createDateBox.getAttribute("value").isEmpty());
    }

    @Then("verify the date is same with actual date")
    public void verify_the_date_is_same_with_actual_date() {
        Assert.assertTrue(DateUtil.getTimeNow().contains(DateUtil.todaysDate2()));
    }

    @Given("user type the date earlier then account creation time {string}")
    public void user_type_the_date_earlier_then_account_creation_time(String pastDate) {
        us14ElementPage.createDateBox.sendKeys(pastDate);
    }

    @Then("system not allow to type earlier date for aacount creation")
    public void system_not_allow_to_type_earlier_date_for_aacount_creation() {
        Assert.assertTrue(us14ElementPage.createDateBox.getAttribute("value").isEmpty());
    }


}
