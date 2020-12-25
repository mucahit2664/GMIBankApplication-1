package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Customer;
import utilities.ConfigurationReader;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class US20_stepdefinitions {
    Response response;
    Customer[] allCustomerData;

    @Given("user gets all data for customers using api end point {string}")
    public void user_gets_all_data_for_customers_using_api_end_point(String url)  {
        response = given().
                accept(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(url);
        // response.prettyPrint();

    }

    @Given("user deserializes customers data as json to java pojo")
    public void user_deserializes_customers_data_as_json_to_java_pojo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        allCustomerData = objectMapper.readValue(response.asString(), Customer[].class);

    }



    @Then("user validates the data for customers")
    public void user_validates_the_data_for_customers() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("CustomerData.txt"));
        List<String> expectedData = bufferedReader.lines().collect(Collectors.toList());
        for (int i = 0; i <allCustomerData.length ; i++) {

            Assert.assertEquals(expectedData.get(i).split("#")[0],allCustomerData[i].getId().toString());

        }


    }


    @And("create dataset")
    public void createDataset() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CustomerData.txt"));
        for (Customer a : allCustomerData
        ) {
            bufferedWriter.append(a.getId() + "#" +
                    a.getFirstName() + "#" +
                    a.getLastName() + "#" +
                    a.getCountry());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();//memory bosaltiyor
        bufferedWriter.close();//isimiz bitince kapatmamiz gerek
    }
}
