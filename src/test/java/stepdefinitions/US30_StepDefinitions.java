package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.UserWithRoles;
import utilities.DatabaseUtility;
import utilities.PDFUtil;

import java.util.ArrayList;
import java.util.List;

public class US30_StepDefinitions {

    List<UserWithRoles> users = new ArrayList<>();

    @Given("user sets database connection")
    public void userSetsDatabaseConnection() {
        DatabaseUtility.createConnection();
    }

    @And("user reads first name last name and role from database")
    public void userReadsFirstNameLastNameAndRoleFromDatabase() {
        List<List<Object>> usersOfDb = DatabaseUtility.
                getQueryResultList("select u.first_name, u.last_name, a.authority_name " +
                        "from jhi_user u, jhi_user_authority a " +
                        "where u.id = a.user_id");

        for (List<Object> objects : usersOfDb) {
            UserWithRoles user = new UserWithRoles();
            user.setFirstName(objects.get(0).toString());
            user.setLastName(objects.get(1).toString());
            user.setRole(objects.get(2).toString());
            users.add(user);
        }
    }

    @And("user writes the read data to pdf file")
    public void userWritesTheReadDataToPdfFile() {
        PDFUtil.writeToPDF(users);
    }

    @Then("verify the users in PDF file with DB")
    public void verifyTheUsersInPDFFileWithDB() {
        String usersInPdf = PDFUtil.readPDF();
        String firstName = "";
        for (UserWithRoles user : users) {
            firstName = user.getFirstName().trim();
            Assert.assertTrue(usersInPdf.contains(firstName));
        }

    }
}
