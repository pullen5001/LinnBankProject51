package linnbank51.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import linnbank51.pojos.Customer;
import linnbank51.pojos.Registrants;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_23_stepdef {

    Response response;
    ObjectMapper objectMapper;
    JsonPath jsonPath;
    List<Map<String, Object>> allRegistrants;
    Registrants[] registrants;

    @Given("registrants endpoint {string}")
    public void usEndpoint(String api_url) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

       response.prettyPrint();
    }
    @Then("user should read all registrant data")
    public void userShouldReadAllRegistrantData() throws IOException {
        objectMapper = new ObjectMapper();
        registrants=objectMapper.readValue(response.asString(), Registrants[].class);
        for (int i=0; i<registrants.length; i++){
            if(registrants[i] !=null){
         //       System.out.println(registrants[i].getFirstName() + " " + registrants[i].getLastName() + " " + registrants[i].getId());
            }
        }
    }

    @And("user gets fifth registrant ssn {string} and validate")
    public void userGetsFifthRegistrantSsnAndValidate(String expectedSsn) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Registrants[] registrants=objectMapper.readValue(response.asString(), Registrants[].class);
       System.out.println(registrants[1].getSsn());
        String actualSsn=registrants[1].getSsn();
        Assert.assertEquals(expectedSsn, actualSsn);


    }

    @And("one user gets fifth registrant {string}:{string} and validate")
    public void oneUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("two user gets fifth registrant {string}:{string} and validate")
    public void twoUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("three user gets fifth registrant {string}:{string} and validate")
    public void threeUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("four user gets fifth registrant {string}:{string} and validate")
    public void fourUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("five user gets fifth registrant {string}:{int} and validate")
    public void fiveUserGetsFifthRegistrantAndValidate(String arg0, int arg1) {
    }

    @And("six user gets fifth registrant {string}:{string} and validate")
    public void sixUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("seven user gets fifth registrant {string}:{string} and validate")
    public void sevenUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }

    @And("eight user gets fifth registrant {string}:{string} and validate")
    public void eightUserGetsFifthRegistrantAndValidate(String arg0, String arg1) {
    }


}
