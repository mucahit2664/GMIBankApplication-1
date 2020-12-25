package stepdefinitions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Applicant;
import utilities.ConfigurationReader;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static io.restassured.RestAssured.given;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US23_ApplicantApi_Steps {
    Response response;
    Applicant[] applicants;
    BufferedReader bufferedReader;

    @Given("user provides api endpoint to set response using {string}")
    public void user_provides_api_endpoint_to_set_response_using(String string) {
        response = given()
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .accept(ContentType.JSON)
                .when()
                .get(string)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

    @Given("user deserializes all applicant data to Java")
    public void user_deserializes_all_applicant_data_to_Java() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        applicants = objectMapper.readValue(response.asString(), Applicant[].class);
    }

    @And("user write all applicant to the {string} file")
    public void user_write_all_applicant_to_the_file(String string) throws IOException {
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(string));
        for (Applicant element : applicants) {
            fileWriter.append(
                                element.getId()+"~"+
                                element.getSsn()+"~"+
                                element.getUserId()+"~"+
                                element.getUserName()+"~"+
                                element.getEmail()+"~"+
                                element.getFirstName()+"~"+
                                element.getLastName()+"~"+
                                element.getMobilePhoneNumber()+"~"+
                                element.getAddress()+"~"+
                                element.getCreateDate()
                             );
            fileWriter.newLine();
        }
        fileWriter.flush();
        fileWriter.close();

    }

    @And("user validate all applicant via {string} file")
    public void user_validate_all_applicant_via_applicants_txt_file(String fileName) throws IOException {
        bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> expectedValueList =bufferedReader.lines().collect(Collectors.toList());


        IntStream.range(0, expectedValueList.size())
                 .forEach(i-> Assert.assertEquals(expectedValueList.get(i),applicants[i].toString()));

        /* -------------------------------SECOND METHOD - ITEM BY ITEM------------------------------------------
        IntStream.range(0, 100).forEach(
                i-> {
                Assert.assertEquals(expectedValueList.get(i).split("~")[0], Integer.toString(applicants[i].getId()));
                Assert.assertEquals(expectedValueList.get(i).split("~")[1], applicants[i].getSsn());
                Assert.assertEquals(expectedValueList.get(i).split("~")[2], Integer.toString(applicants[i].getUserId()));
                Assert.assertEquals(expectedValueList.get(i).split("~")[3], applicants[i].getUserName());
                Assert.assertEquals(expectedValueList.get(i).split("~")[4], applicants[i].getEmail());
                Assert.assertEquals(expectedValueList.get(i).split("~")[5], applicants[i].getFirstName());
                Assert.assertEquals(expectedValueList.get(i).split("~")[6], applicants[i].getLastName());
                Assert.assertEquals(expectedValueList.get(i).split("~")[7], applicants[i].getMobilePhoneNumber());
                Assert.assertEquals(expectedValueList.get(i).split("~")[8], applicants[i].getAddress());
                Assert.assertEquals(expectedValueList.get(i).split("~")[9], applicants[i].getCreateDate());
                }
        );
        */
    }


    @Then("user validate applicant one by one which is selected randomly in {string} file")
    public void userValidateApplicantOneByOneWhichIsSelectedRandomly(String fileName) throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader(fileName));
        List<Integer> idList = Arrays.stream(applicants).map(i-> i.getId()).collect(Collectors.toList());
        int randomId = idList.get(new Random().nextInt(idList.size()));

        String expectedValues = bufferedReader.lines()
                                .filter(i-> Integer.parseInt(i.split("~")[0])==randomId)
                                .findFirst().get();

        String actualValues = Arrays.stream(applicants)
                                .filter(i-> i.getId()==randomId)
                                .findFirst().get().toString();

        Assert.assertEquals(expectedValues,actualValues);

    }
}