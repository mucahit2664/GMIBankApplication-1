package utilities;

import pages.GmiLoginPage;

public class GmiBankLoginMethods {

       public static void Sign_In_to_System(String username, String password) {
           GmiLoginPage gmiLoginPage = new GmiLoginPage();
           Driver.getDriver().get(ConfigurationReader.getProperty("website"));
           Driver.wait(2);
           gmiLoginPage.login_in_kelkafa.click();
           Driver.wait(2);
           gmiLoginPage.sign_In.click();
           Driver.wait(2);

           gmiLoginPage.user_name.sendKeys(username);
           gmiLoginPage.password.sendKeys(password);
           gmiLoginPage.submit_button.click();
       }

    public static void loginWithRole(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        GmiLoginPage gmiLoginPage = new GmiLoginPage();
        if(role.toLowerCase().equals("customer")){
            gmiLoginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("Customer_username"));
//            gmiLoginPage.passwordBox.sendKeys();
//            gmiLoginPage.signInButton.click();
        }
        else if(role.toLowerCase().equals("employee")){
            gmiLoginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("Employee_username"));
//            gmiLoginPage.passwordBox.sendKeys();
//            gmiLoginPage.signInButton.click();
        }
        else if(role.toLowerCase().equals("manager")){
            gmiLoginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("Manager_username"));
//            gmiLoginPage.passwordBox.sendKeys();
//            gmiLoginPage.signInButton.click();
        }
        else if(role.toLowerCase().equals("admin")){
            gmiLoginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("Admin_username"));
//            gmiLoginPage.passwordBox.sendKeys();
//            gmiLoginPage.signInButton.click();
        }

            gmiLoginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("Admin_password"));
            gmiLoginPage.signInButton.click();
    }

}
