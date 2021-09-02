package linnbank51.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnbank51.pojos.Country;
import linnbank51.pojos.States;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_22_stepdef {
    Response response;
    ObjectMapper objectMapper;
    @Given("state endpoint {string}")
    public void stateEndpoint(String api_url) {
        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON).extract().response();
        response.prettyPrint();
    }

    @Given("user should read all states data that is created")
    public void userShouldReadAllStatesDataThatIsCreated() throws IOException {
       objectMapper=new ObjectMapper();
        States[] states = objectMapper.readValue(response.asString(), States[].class);

       for (int i=0; i<states.length; i++){
           if (states[i] !=null){
               System.out.println(states[i].getName()+" "+states[i].getId());
           }
       }
    }

    @Given("user gets second state id {int} and validate")
    public void userGetsSecondStateIdAndValidate(int expectedId) throws IOException {
        objectMapper=new ObjectMapper();
        States[] states = objectMapper.readValue(response.asString(), States[].class);
        int actualId = states[1].getId();
        Assert.assertEquals(expectedId,actualId);
    }

    @And("one user gets second state {string}:{string} and validate")
    public void oneUserGetsSecondStateAndValidate(String arg0, String expectedSName) throws IOException {
        objectMapper=new ObjectMapper();
        States[] states = objectMapper.readValue(response.asString(), States[].class);
        String actualSName = states[1].getName();
        Assert.assertEquals(expectedSName,actualSName);
    }
}
