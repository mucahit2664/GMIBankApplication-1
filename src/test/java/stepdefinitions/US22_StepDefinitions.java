package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US22_StepDefinitions {

    Response response;


    @Given("user sets end point to response {string}")
    public void user_sets_end_point_to_response(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }
    @Given("user generate states")
    public void user_generate_states() {

    }

    @Given("user save the states in correspondent file")
    public void user_save_the_states_in_correspondent_file() {

    }

    @Then("validate all states from the data set")
    public void validate_all_states_from_the_data_set() {

    }

    @Then("validate states one by one from data set")
    public void validate_states_one_by_one_from_data_set() {

    }


}
