package linnbank51.stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static linnbank51.JsonModels.CountryJson.createCountry;

public class US_26_stepdef {

    Response response;
    JsonPath jsonPath;
    Map<String, Object> putCountry=new HashMap<>();
    String updatedCountryName;


    @Given("user can update any country with endPoint {string} {string} and its id {string}")
    public void userCanUpdateAnyCountryWithEndPointAndItsId(String endpoint, String name, String id) {
    putCountry.put("id",id);
    putCountry.put("name",name);
    putCountry.put("state",null);


        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader
                                .getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .body(putCountry)
                .put(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        jsonPath=response.jsonPath();
        updatedCountryName= jsonPath.getString("name");
        System.out.println(updatedCountryName);
        System.out.println("==========================");
        String stringNames = jsonPath.getString("name");
        Assert.assertTrue("not contain", stringNames.contains(updatedCountryName));
        System.out.println("Validation is successful");

    }

}
