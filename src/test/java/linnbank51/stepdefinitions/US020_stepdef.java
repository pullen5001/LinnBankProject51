package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnbank51.utilities.ConfigurationReader;
import linnbank51.utilities.Driver;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class US020_stepdef {

    @Given("user should go {string}")
    public void user_should_go(String string) {


    }
    @Then("user should read all customer data that is created")
    public void user_should_read_all_customer_data_that_is_created() {
        Response response ;
        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).when()
                .get(ConfigurationReader.getProperty("api_customer_endpoint"))
                .then()
                .contentType(ContentType.JSON).extract().response();
        response.prettyPrint();
    }
    @Then("user validate all customer information")
    public void user_validate_all_customer_information() {

    }
}
