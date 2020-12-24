package stepdefinitions;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pojos.Country;
import utilities.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US21_API_StepDefinitions {
    Response response;
    Country[] countries;

    @Given("user provides the api end point to set the response using {string}")
    public void user_provides_the_api_end_point_to_set_the_response_using(String api_endpoint) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().get(api_endpoint).then().contentType(ContentType.JSON).extract().response();
        // response.prettyPrint();
    }

    List<String> allNamesOfCountries = new ArrayList<>();

    @Given("user is desirializing all data json to Java")
    public void user_is_desirializing_all_data_json_to_Java() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        countries = objectMapper.readValue(response.asString(), Country[].class);
        for (int i = 0; i < countries.length; i++) {
            allNamesOfCountries.add(countries[i].getName());
        }

     /*  for (int i=0;i<countries.length;i++ ){
        if (countries[i]!=null)
            System.out.println(i+ "id: "+ countries[i].getId()+" " +
                    " state: "+ countries[i].getStates()+"  name: "+ countries[i].getName());

      */
        System.out.println(allNamesOfCountries);
    }


    @Given("user validates countries number")
    public void user_validates_countries_number() {
        System.out.println(allNamesOfCountries + "\n" + "Sum of the countries: " + allNamesOfCountries.size());
        Assert.assertEquals(815, allNamesOfCountries.size());
    }

    @Given("user validates {string}")
    public void user_validates(String string) {

        //expectedcountries.add("DOMINIC");
        //expectedcountries.add("Sudan");
        System.out.println(allNamesOfCountries);
        //List<String>countryListforRead=ReadTxt.returnCountryName("allCountrydene.txt");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(allNamesOfCountries.contains(string), "dont match");
        softAssert.assertAll();
        // Assert.assertTrue("dont match",allNamesOfCountries.contains(string));

    }
  /*  @Given("user validates all data")
    public void user_validates_all_data() {
        System.out.println(allNamesOfCountries);
        WriteToTxt.saveAllCountry("allCountrydeneme1.txt",countries);
        List<String>countryListforRead=ReadTxt.returnAllCountry("allCountrydeneme1.txt");
        System.out.println(countryListforRead);
        Assert.assertEquals("not verify",allNamesOfCountries,countryListforRead);

        }
*/    @Given("user validates all data")
    public void user_validates_all_data() {
    WriteToTxt.saveAllCountry("allCountrydeneme1.txt",countries);
    List<String>expectedcountries = new ArrayList<>();
    expectedcountries.add("Poland");
    expectedcountries.add("GERMANY");
    expectedcountries.add("USA");

    List<String>allcountries =ReadTxt.returnAllCountry("allCountrydeneme1.txt");
    Assert.assertTrue("All do not match",allcountries.containsAll(expectedcountries));
      System.out.println("All validation has been successful");
    }
}

