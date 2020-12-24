package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;
import pojos.State;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_27_StepDefinitions {
    State[] states;
    Response response;
    String Token = ConfigurationReader.getProperty("token");
    int stateid;

    @Given("user sets the end point to response {string}")
    public void user_sets_end_point_to_response(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + Token,
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
//        response.prettyPrint();
    }


    @Given("user deserializes all states data to Java")
    public void user_deserializes_all_states_data_to_Java() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        states = objectMapper.readValue(response.asString(), State[].class);

//        System.out.println("Enonce"+states[2].getId());
//        System.out.println("Enonce"+states[3].getId());
    }

    @Then("Delete states with {string}")
    public void delete_states_with_and_verify_status_code_as(String index, String statusCode) {

        stateid=states[Integer.parseInt(index)].getId();
        System.out.println("Silmeden Once"+stateid);
//        stateid=Integer.parseInt(id);

        given()
                .headers(
                        "Authorization",
                        "Bearer " + Token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .delete("https://www.gmibank.com/api/tp-states/"+stateid);
//                response.then().assertThat().statusCode(Integer.parseInt(statusCode))
//        System.out.println("SildiktenSonra"+states[stateid].getId());

        ;
    }

    @Then("Verify the state has been deleted")
    public void verify_the_state_has_been_deleted() throws IOException {

        response = given().headers(
                "Authorization",
                "Bearer " + Token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-states/")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

//        response.prettyPrint();

        ObjectMapper objectMapper = new ObjectMapper();
        states = objectMapper.readValue(response.asString(), State[].class);

        List<Integer> statesId=new ArrayList<>();
        for(State n:states){
            statesId.add(n.getId());
        }
        Assert.assertFalse(statesId.contains(stateid));


    }


}
