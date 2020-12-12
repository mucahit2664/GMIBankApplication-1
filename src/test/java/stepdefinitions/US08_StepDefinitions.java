package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US08_PasswordPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.GmiBankLoginMethods;

public class US08_StepDefinitions {
    US08_PasswordPage passwordPage = new US08_PasswordPage();

    @Given("user logs in with user credentials")
    public void userLogsInWithUserCredentials() {
       try {
           GmiBankLoginMethods.Sign_In_to_System(ConfigurationReader.getProperty("user_name"),
                   ConfigurationReader.getProperty("user_password"));
       }catch (Exception e){

       }

    }

    @Then("user navigates to password page")
    public void userNavigatesToPasswordPage() {
        passwordPage.accountMenu.click();
        passwordPage.passwordLink.click();
    }

    @When("user enters current password in current textbox")
    public void userEntersCurrentPasswordInCurrentTextbox() {
        passwordPage.currentPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user enters new password in new password textbox")
    public void userEntersNewPasswordInNewPasswordTextbox() {
        passwordPage.newPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user enters old password in new password confirmation textbox")
    public void userEntersOldPasswordInNewPasswordConfirmationTextbox() {
        passwordPage.confirmPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @Then("verify the message is like {string}")
    public void verifyTheMessageIsLike(String expectedMessage) {
        Assert.assertEquals(expectedMessage, passwordPage.toastMessage.getText());
    }

    @When("user enters {string} in new  password textbox")
    public void user_enters_in_new_password_textbox(String string) {
        passwordPage.newPasswordTextBox.sendKeys(string);
    }

    String defaultGrayBar = "background-color: rgb(221, 221, 221);";
    int defaultGrayBarCount = 5;


    @Then("verify the changing of the level chart")
    public void verify_the_changing_of_the_level_chart() {
        for (WebElement we : passwordPage.strengthBarList) {
            if(!we.getAttribute("style").equals(defaultGrayBar)){
                defaultGrayBarCount--;
            }
        }
        System.out.println(firsGrayCount+" "+defaultGrayBarCount);
       Assert.assertTrue(defaultGrayBarCount<firsGrayCount);
        defaultGrayBarCount=5;
        firsGrayCount=0;
    }

    int firsGrayCount=0;

    @Then("user adds {string} for stronger password")
    public void user_adds_for_stronger_password(String string) {
        for (WebElement we : passwordPage.strengthBarList) {
            if(we.getAttribute("style").equals(defaultGrayBar)){
                firsGrayCount++;
            }
        }
        passwordPage.newPasswordTextBox.sendKeys(string);

    }

    @And("user enters new password in new password confirmation textbox")
    public void userEntersNewPasswordInNewPasswordConfirmationTextbox() {
        passwordPage.confirmPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user clicks save button on password page")
    public void userClicksSaveButtonOnPasswordPage() {
        passwordPage.saveButton.click();
        Driver.wait(3);
    }

    @Then("verify the message is not like {string}")
    public void verifyTheMessageIsNotLike(String expectedMessage) {
        Assert.assertNotEquals(expectedMessage, passwordPage.toastMessage.getText());
    }
}
