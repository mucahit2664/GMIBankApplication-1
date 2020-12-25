package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.FatihDatabaseUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US29_DataBaseStepDefinitions {
    SoftAssert softAssert=new SoftAssert();
    List<Map<String,String>>list=new ArrayList<>();
    List<Map<String,String>>listCountries=new ArrayList<>();
    List<Map<String,String>>listStateOfUSA=new ArrayList<>();

    @Given("user connects with DataBase")
    public void user_connects_with_DataBase() {
        FatihDatabaseUtility.createConnection();
    }


    @Given("users read can all users' info about from database")
    public void users_read_can_all_users_info_about_from_database() throws SQLException {
        List<Map<String,String>> list= FatihDatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.jhi_user");
        System.out.println(list);
        list.stream().map(t->t.get("login")).forEach(System.out::println);
    }

    @Then("users validate all user data")
    public void users_validate_all_user_data() {
        softAssert.assertEquals(list.contains("ilkinsan"),list.contains("ilkinsan"));
        softAssert.assertAll();
    }

    @Given("users read all countries infos from database")
    public void users_read_all_countries_infos_from_database() throws SQLException {
        List<Map<String,String>> listCountries= FatihDatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.tp_country");
        System.out.println(listCountries);

    }

    @Then("users validate all countries infos")
    public void users_validate_all_countries_infos() {
        softAssert.assertEquals(listCountries.contains("Poland"),listCountries.contains("Poland"));
        softAssert.assertAll();
    }

    @Given("users read all states of related to USA from database")
    public void users_read_all_states_of_related_to_USA_from_database() throws SQLException {
        listStateOfUSA= FatihDatabaseUtility.getQueryAsAListOfMaps("SELECT * FROM public.tp_state");
        System.out.println(listStateOfUSA);
        softAssert.assertAll();
    }

    @Then("users validate all states of related to USA")
    public void users_validate_all_states_of_related_to_USA() {
        softAssert.assertEquals(listStateOfUSA.contains("Oklahoma"),listStateOfUSA.contains("Oklahoma"));
        softAssert.assertAll();
    }




}
