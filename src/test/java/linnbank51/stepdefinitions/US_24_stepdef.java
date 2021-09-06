package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static linnbank51.JsonModels.StateJson.createState;


public class US_24_stepdef {

    Response response;
    Response responseAll;
    JsonPath jsonPath;
    int createdStateId;

    @Given("user goes to create state endpoint {string} and create new state")
    public void userGoesToCreateStateEndpointAndCreateNewState(String endpoint) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(createState)
                .post(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

        jsonPath=response.jsonPath();
        createdStateId=jsonPath.getInt("id");
        System.out.println("==========================");
        System.out.println(createdStateId);
    }

    @Then("user read all  all states from end point {string}")
    public void userReadAllAllStatesFromEndPoint(String endpoint) {
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

    @Then("user validate created states")
    public void userValidateCreatedStates() {
        responseAll = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_state_endpoint"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();

        jsonPath=response.jsonPath();
        String stringStateIds = jsonPath.getString("id");

        String stringCreatedStateId= String.valueOf(createdStateId);
        Assert.assertTrue("not contain" , stringStateIds.contains(stringCreatedStateId));
        System.out.println("Validation is successful");
    }
}
