package linnbank51.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnbank51.pojos.Country;
import linnbank51.pojos.Customer;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_21_stepdef {
    Response response;
    ObjectMapper objectMapper;
    @Given("country endpoint {string}")
    public void countryEndpoint(String api_url) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON).extract().response();
        response.prettyPrint();
    }

    @Given("user should read all country data that is created")
    public void userShouldReadAllCountryDataThatIsCreated() throws IOException {
       objectMapper=new ObjectMapper();
        Country[] countries= objectMapper.readValue(response.asString(), Country[].class);

        for (int i=0; i<countries.length; i++){
            if (countries[i] !=null){
                System.out.println(countries[i].getId() + " " + countries[i].getName());
            }
        }

    }

    @Given("user gets fifth country id {int} and validate")
    public void userGetsFifthCountryIdAndValidate(int expectedId) throws IOException {
        objectMapper=new ObjectMapper();
        Country[] countries = objectMapper.readValue(response.asString(), Country[].class);
        int actualId = countries[4].getId();
        Assert.assertEquals(expectedId,actualId);

    }

    @And("one user gets fifth country {string}:{string} and validate")
    public void oneUserGetsFifthCountryAndValidate(String arg0, String expectedName) throws IOException {
        objectMapper=new ObjectMapper();
       Country[] countries = objectMapper.readValue(response.asString(), Country[].class);
        String actualName = countries[4].getName();
        Assert.assertEquals(expectedName,actualName);
    }

}
