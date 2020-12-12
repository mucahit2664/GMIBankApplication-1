package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US11ElementPage;
import utilities.ConfigurationReader;
import utilities.DateUtil;
import utilities.Driver;
import utilities.GmiBankLoginMethods;

public class US11_StepDefinitions {
    US11ElementPage us11ElementPage = new US11ElementPage();

    @Given("user login as an {string}")
    public void user_login_as_an(String role)  {
        GmiBankLoginMethods.loginWithRole(role);
    }
//
//    @Given("user clicks My Operation segment")
//    public void user_clicks_My_Operation_segment() {
//        us11ElementPage.myOperationSegment.click();
//    }
//    @Given("user click Manage Customer segment")
//    public void user_click_Manage_Customer_segment() {
//        us11ElementPage.manageCustomer.click();
//        Driver.waitForVisibility(us11ElementPage.createCustomerButton,3);
//    }
//
//    @Given("user clicks Create a new customer button")
//    public void user_clicks_Create_a_new_customer_button() {
//        us11ElementPage.createCustomerButton.click();
//        Driver.waitForClickablility(us11ElementPage.customerCreationPageText,3);
//        Assert.assertTrue(us11ElementPage.customerCreationPageText.isDisplayed());
//    }
//
//    @Given("user provide valid ssn {string}")
//    public void user_provide_valid_ssn(String ssn) {
//        us11ElementPage.ssnBox.sendKeys(ssn);
//    }
//
//    @Given("user clicks search button")
//    public void user_clicks_search_button() {
//        us11ElementPage.searchButton.click();
//    }
//
//    @Then("user verify customer info retrieved")
//    public void user_verify_customer_info_retrieved() {
//        Driver.wait(2);
//        Assert.assertFalse(us11ElementPage.firstNameBox.getAttribute(ConfigurationReader.getProperty("attribute_type")).isEmpty());
//        Assert.assertFalse(us11ElementPage.lastNameBox.getAttribute(ConfigurationReader.getProperty("attribute_type")).isEmpty());
//        //  Assert.assertFalse(us11ElementPage.phoneNumberBox.getAttribute(ConfigurationReader.getProperty("attribute_type")).isEmpty());
//    }
//
//    @Given("user provide middle initials {string}")
//    public void user_provide_middle_initials(String middleInitial) {
//        Driver.wait(5);
//        us11ElementPage.middleInitialBox.sendKeys(middleInitial);
//    }
//
//    @Given("user provide phone number  {string}")
//    public void user_provide_phone_number(String phoneNumber) {
//        us11ElementPage.phoneNumberBox.sendKeys(phoneNumber);
//    }
//
//    @Given("user provide zip code {string}")
//    public void user_provide_zip_code(String zipCode) {
//        us11ElementPage.zipCodeBox.sendKeys(zipCode);
//    }
//
//    @Given("user provide city {string}")
//    public void user_provide_city(String city) {
//        us11ElementPage.cityBox.sendKeys(city);
//    }
//
//    @Given("user select the date at the time of customer creation")
//    public void user_select_the_date_at_the_time_of_customer_creation() {
//        us11ElementPage.createDateBox.sendKeys(DateUtil.getTimeNow());
//    }
//
//    @Then("user validate the date is same with actual date")
//    public void user_validate_the_date_is_same_with_actual_time() {
//        Driver.wait(3);
//        Assert.assertFalse(us11ElementPage.createDateBox.getAttribute(ConfigurationReader.getProperty("attribute_type")).isEmpty());
//    }
//
//    @Given("user select the date earlier then customer creation")
//    public void user_select_the_date_earlier_then_customer_creation() {
//        us11ElementPage.createDateBox.sendKeys(DateUtil.goToPast("day",3));
//    }
//
//    @Then("user validate error message {string}")
//    public void user_validate_error_message(String errorMessage) {
//        Assert.assertEquals(DateUtil.getTimeNow(),DateUtil.goToPast("day",3),errorMessage);
//    }
//
//    @Given("user should provide data expected format {string}")
//    public void user_should_provide_data_expected_format(String string) {
//        us11ElementPage.createDateBox.sendKeys(DateUtil.getTimeNow());
//    }
//
//    @Then("user validate date format as expected")
//    public void user_validate_date_format_as_expected() {
//        // Driver.wait(5);
//        Assert.assertEquals(DateUtil.getTimeNow(),us11ElementPage.createDateBox.getAttribute(ConfigurationReader.getProperty("attribute_type")));
//    }
//
//    @Given("user select User from user box")
//    public void user_select_User_from_user_box() {
//        Select select = new Select(us11ElementPage.userBox);
//        Driver.selectRandomTextFromDropdown(select);
//
//    }
//
//    @Then("verify user is selected")
//    public void verify_user_is_selected() {
//        Assert.assertFalse(us11ElementPage.userBox.getText().isEmpty());
//    }
//
//    @Given("user unselect any user from user box")
//    public void user_unselect_any_user_from_user_box() {
//        Assert.assertTrue(us11ElementPage.userBox.getAttribute(ConfigurationReader.getProperty("attribute_type")).isEmpty());
//    }
//
//    @Given("user clicks save button")
//    public void user_clicks_save_button() {
//        us11ElementPage.saveButton.click();
//    }
//
//    @Then("user see error message")
//    public void user_see_error_message() {
//        Driver.wait(10);
//
//    }
//
//    @Given("user select the account from Account box")
//    public void user_select_the_account_from_Account_box() {
//        Select select = new Select(us11ElementPage.accountBox);
//        Driver.selectRandomTextFromDropdown(select);
//    }
//
//    @Then("verify account is selected")
//    public void verify_account_is_selected() {
//        Assert.assertFalse(us11ElementPage.accountBox.getText().isEmpty());
//    }
//
//    @Given("user select country from Country box")
//    public void user_select_country_from_Country_box() {
//        Select select = new Select(us11ElementPage.countryBox);
//        Driver.selectRandomTextFromDropdown(select);
//    }
//
//    @Given("user provide state to State box")
//    public void user_provide_state_to_State_box() {
//        us11ElementPage.stateBox.sendKeys(ConfigurationReader.getProperty("state"));
//    }
//
//    @Given("user select zelle Enrolled as an option")
//    public void user_select_zelle_Enrolled_as_an_option() {
//        us11ElementPage.zelleEnrolledCheckBox.click();
//        Assert.assertTrue(us11ElementPage.zelleEnrolledCheckBox.isSelected());
//    }
//
//    @Then("validate success message {string}")
//    public void validate_success_message(String string) {
//        //Assert.assertTrue();
//    }








}
