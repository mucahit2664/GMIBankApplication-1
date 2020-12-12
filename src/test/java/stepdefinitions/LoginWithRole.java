package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.GmiBankLoginMethods;

public class LoginWithRole {
    @Given("login as a customer")
    public void login_as_a_customer() {
        GmiBankLoginMethods.Sign_In_to_System(ConfigurationReader.getProperty("Customer_username"),
                ConfigurationReader.getProperty("Customer_password"));
    }

    @Given("login as an employee")
    public void login_as_an_employee() {
        GmiBankLoginMethods.Sign_In_to_System(ConfigurationReader.getProperty("Employee_username"),
                ConfigurationReader.getProperty("Employee_password"));
    }

    @Given("login as a manager")
    public void login_as_a_manager() {
        GmiBankLoginMethods.Sign_In_to_System(ConfigurationReader.getProperty("Manager_username"),
                ConfigurationReader.getProperty("Manager_password"));
    }

    @Given("login as an admin")
    public void login_as_an_admin() {
        GmiBankLoginMethods.Sign_In_to_System(ConfigurationReader.getProperty("Admin_username"),
                ConfigurationReader.getProperty("Admin_password"));
    }
}
