package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.Country;
import utilities.ConfigurationReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

public class US25_StepDefinitions {

    Response responseGet;
    Response responsePost;
    Country[] countries;
    static List<Integer> createdIds = new ArrayList<>();

    @Given("get all countries")
    public void get_all_countries() {
        responseGet = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("country_api_endpoint"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseGet.prettyPrint();
    }

    @When("verify status code {int}")
    public void verify_status_code(Integer code) {
        responsePost.then().
                assertThat().
                statusCode(code);
    }

    @Given("create country using {string} and {string}")
    public void create_country_using( String countryName, String states) {
        String body = "{ \"name\": \"" + countryName + "\", \"states\":" + states + "}";
        responsePost = given()
                   .contentType(ContentType.JSON)
                   .auth().oauth2(ConfigurationReader.getProperty("token"))
                   .when()
                   .body(body)
                   .post(ConfigurationReader.getProperty("country_api_endpoint"))
                   .then()
                   .extract()
                   .response();
        JsonPath jsonPath= responsePost.jsonPath();
        Integer id = jsonPath.getInt("id");
        createdIds.add(id);
        responsePost.prettyPrint();
    }

    @Then("validate all created countries")
    public void validate_all_created_countries() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        countries = objectMapper.readValue(responseGet.asString(), Country[].class);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(createdIds.size(), 3);

        // first way assertion
//        createdIds.forEach(expectedId -> {
//            boolean isCreated =  Arrays
//                    .stream(countries)
//                    .anyMatch(country-> country.getId() == expectedId);
//            softAssert.assertTrue(isCreated);
//        });

        // second way assertion
        List<Integer> allIds = new ArrayList<>();
        for (Country country : countries) {
            Integer id = country.getId();
            allIds.add(id);
        }
        softAssert.assertTrue(allIds.containsAll(createdIds));
        softAssert.assertAll();
    }
}