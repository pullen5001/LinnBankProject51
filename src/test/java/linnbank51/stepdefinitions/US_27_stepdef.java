package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_27_stepdef {

    Response response;
    Response responseNew;
    JsonPath jsonPath;

    @Given("user should be reads all states data from {string}")
    public void userShouldBeReadsAllStatesDataFrom(String endpoint) {
        response = given().headers("Authorization",
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
        response.prettyPrint();

    }

    @And("user should be delete a state with using {string} and its extension {string} and verify")
    public void userShouldBeDeleteAStateWithUsingAndItsExtensionAndVerify(String endpoint, String id) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();

        responseNew = given().headers("Authorization",
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

        jsonPath=responseNew.jsonPath();
        String stateId = jsonPath.getString("id");

        Assert.assertFalse("State is not deleted",stateId.contains("id"));
        System.out.println("State is deleted");

    }


    @Given("user should be reads all country data from {string}")
    public void userShouldBeReadsAllCountryDataFrom(String endpoint_country) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(endpoint_country)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    @And("user should be delete a country with using {string} and its extension {string} and verify")
    public void userShouldBeDeleteACountryWithUsingAndItsExtensionAndVerify(String endpoint_country, String id) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .delete(endpoint_country)
                .then()
                .extract()
                .response();

        responseNew = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(endpoint_country)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        jsonPath=responseNew.jsonPath();
        String countryid = jsonPath.getString("id");

        Assert.assertFalse("Country is not deleted",countryid.contains("id"));
        System.out.println("Country is deleted");
    }
}
