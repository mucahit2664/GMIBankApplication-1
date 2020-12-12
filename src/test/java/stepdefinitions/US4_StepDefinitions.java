package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US4_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
    }
    @Given("user clicks on the username textbox and text {string}")
    public void user_clicks_on_the_username_textbox_and_text(String string) {

        loginPage.usernamebox.sendKeys(string);
    }
    @Given("user clicks on the password textbox and text {string}")
    public void user_clicks_on_the_password_textbox_and_text(String string) {

        loginPage.passwordbox.sendKeys(string);
    }
    @Given("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {

        loginPage.signInButton.click();
    }
    @Then("user verify to login")
    public void user_verify_to_login() {
        Driver.wait(3);
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("GMIBANK"));
    }
    @And("user clicks on userIcon")
    public void userClicksOnUsername() {
        loginPage.userIcon.click();
    }
    @And("user clicks on sign out button")
    public void userClicksOnSignOutButton() {

        loginPage.signOutButton.click();
    }
    @Given("user clicks on the cancel button")
    public void user_clicks_on_the_cancel_button_button() {

        loginPage.cancelButton.click();
    }
    @Then("user verify to homepage")
    public void user_verify_to_homepage() {
        Driver.wait(3);
        String title= Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("GMIBANK"));
    }
}



