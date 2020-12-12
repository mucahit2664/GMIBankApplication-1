package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US5_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user clicks on the username textbox and text invalid username")
    public void user_clicks_on_the_username_textbox_and_text_invalid_username() {
        loginPage.usernamebox.sendKeys("TugbaValid.");
    }

    @Given("user clicks on the password textbox and text valid password")
    public void user_clicks_on_the_password_textbox_and_text_valid_password() {
        loginPage.passwordbox.sendKeys("TugbaValid123.");
    }

    @Given("user click on the signin button")
    public void user_click_on_the_signin_button() {
        loginPage.signInButton.click();
    }

    @Then("user verify the error message")
    public void user_verify_the_error_message() {

        String errorMessage = "Failed to sign in! Please check your credentials and try again.";
        System.out.println(errorMessage);
        Driver.wait(5);
        Assert.assertEquals(errorMessage, loginPage.errorMessage.getText());
    }

    @Given("user clicks on the username textbox and text valid username")
    public void user_clicks_on_the_username_textbox_and_text_valid_username() {
        loginPage.usernamebox.sendKeys("TugbaValid");
    }

    @Given("user clicks on the password textbox and text invalid password")
    public void user_clicks_on_the_password_textbox_and_text_invalid_password() {
        loginPage.passwordbox.sendKeys("TugbaValid123");

    }

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signInButton.click();

    }

    @Given("user click on the username textbox and text invalid username")
    public void user_click_on_the_username_textbox_and_text_invalid_username() {
        loginPage.usernamebox.sendKeys("TugbaValidd");

    }

    @Given("user click on the password textbox and text invalid password")
    public void user_click_on_the_password_textbox_and_text_invalid_password() {
        loginPage.passwordbox.sendKeys("TugbaValid123");

    }

    @Given("user clicks the sign in button")
    public void user_clicks_the_sign_in_button() {
        loginPage.signInButton.click();

    }

    @Given("user clicks on username textbox and text valid username")
    public void user_clicks_on_username_textbox_and_text_invalid_username() {
        loginPage.usernamebox.sendKeys("TugbaValid");

    }

    @Given("user clicks on password textbox and text invalid password")
    public void user_clicks_on_password_textbox_and_text_invalid_password() {
        loginPage.passwordbox.sendKeys("TugbaValid123");

    }

    @Given("user clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        loginPage.signInButton.click();

    }

    @Then("user clicks on this text \"Did you forget your password?")
    public void user_clicks_on_this_text_Did_you_forget_your_password() {
        loginPage.forgetPassword.click();
    }

    @Then("user verify the new page")
    public void user_verify_the_new_page() {
        Driver.wait(5);
        String verifymessage = "Reset your password";
        Assert.assertEquals(verifymessage, loginPage.newPageVerify.getText());

    }

    @Then("user enter the email address you used to register in the email text box")
    public void user_enter_the_email_address_you_used_to_register_in_the_email_text_box() {
        loginPage.emailTextBox.sendKeys("tugbavalid@gmail.com");

    }

    @Then("user clicks the Reset password button")
    public void user_clicks_the_Reset_password_button() {
        loginPage.resetButton.click();

    }

    @Then("user verify the success message")
    public void user_verify_the_success_message() {
        Driver.waitForVisibility((loginPage.verifyMessage),5);

    }

    @Given("user should click on username textbox and text invalid username")
    public void user_should_click_on_username_textbox_and_text_invalid_username() {
        loginPage.usernamebox.sendKeys("TugbaVali");

    }

    @Given("user click password textbox and text invalid password")
    public void user_click_password_textbox_and_text_invalid_password() {
        loginPage.passwordbox.sendKeys("TugbaValid123..");

    }

    @Given("user clicks on the Sign in button")
    public void user_clicks_on_the_Sign_in_button() {
        loginPage.signInButton.click();

    }

    @Then("user verify Error message")
    public void user_verify_Error_message() {
        Driver.wait(5);
        String errorMessage = "Failed to sign in! Please check your credentials and try again.";
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage, loginPage.errorMessage.getText());


    }

    @Then("user clicks on this text {string}")
    public void user_clicks_on_this_text(String string) {
        loginPage.registerNewAccount.click();

    }

    @Then("user verify the Registration page")
    public void user_verify_the_Registration_page() {
        Assert.assertTrue(loginPage.registrationPage.isDisplayed());

    }



}
