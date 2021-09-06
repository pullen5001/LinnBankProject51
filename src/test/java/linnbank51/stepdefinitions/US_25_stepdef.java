package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static linnbank51.JsonModels.CountryJson.createCountry;

public class US_25_stepdef {
    
    Response response;
    Response responseAll;
    JsonPath jsonPath;
    int createdCountryId;

    @Given("user goes to create country endpoint {string} and create new country")
    public void userGoesToCreateCountryEndpointAndCreateNewCountry(String endpoint) {

        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(createCountry)
                .post(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

        jsonPath=response.jsonPath();
        createdCountryId=jsonPath.getInt("id");
        System.out.println("==========================");
        System.out.println(createdCountryId);
        
    }

    @Then("user read all  all countries from end point {string}")
    public void userReadAllAllCountriesFromEndPoint(String endpoint) {
        responseAll = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();
    }

    @Then("user validate created country")
    public void userValidateCreatedCountry() {
        responseAll = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_country_endpoint"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();

        jsonPath=response.jsonPath();
        String stringIds = jsonPath.getString("id");

        String stringCreatedCountryId= String.valueOf(createdCountryId);
        Assert.assertTrue("not contain" , stringIds.contains(stringCreatedCountryId));
        System.out.println("Validation is successful");
    }


}
