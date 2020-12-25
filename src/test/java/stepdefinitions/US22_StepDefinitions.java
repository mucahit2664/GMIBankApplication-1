package stepdefinitions;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.State;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class US22_StepDefinitions {

    Response response;
    State states[];
    String fileName = "AllStateData.txt";

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
     //   response.prettyPrint();
    }

    @Given("user de-serialize the data")
    public void user_de_serialize_the_data() throws Exception {
      ObjectMapper objectMapper = new ObjectMapper();
        states = objectMapper.readValue(response.asString(),State[].class);

    }

    @Then("validate states from the data set")
    public void validate_states_from_the_data_set() throws Exception {
        WriteToTxt.writeAllStatesInFile(fileName,states);
        ReadTxt.readAndValidateStates(fileName,states);
    }

    @Then("validate states one by one")
    public void validate_states_one_by_one() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Arrays.toString(states).contains(states[3].getName()));
        softAssert.assertTrue(Arrays.toString(states).contains(states[35].getName()));
        softAssert.assertTrue(Arrays.toString(states).contains(states[80].getName()));
        softAssert.assertTrue(Arrays.toString(states).contains(states[150].getName()));
        softAssert.assertTrue(Arrays.toString(states).contains(states[300].getName()));
        softAssert.assertTrue(Arrays.toString(states).contains(states[states.length-1].getName()));
        softAssert.assertAll();
    }

}
