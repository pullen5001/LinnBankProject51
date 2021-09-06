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
import linnbank51.utilities.ReadToTxt;
import linnbank51.utilities.WriteToTxt;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_23_stepdef {

    Response response;
    ObjectMapper objectMapper;
    JsonPath jsonPath;
    Registrants[] registrants;
    String fileName = "C:\\Users\\gulsl\\IdeaProjects\\LinnBankProject51\\src\\test\\resources\\test_data\\RegistrantInfo1.txt";
    List<Registrants> actualRegistrantsInfoList;

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

      //  response.prettyPrint();
    }

    @Then("user should read all registrant data")
    public void userShouldReadAllRegistrantData() throws IOException {
       objectMapper = new ObjectMapper();
       registrants=objectMapper.readValue(response.asString(), Registrants[].class);
        WriteToTxt.saveDataInFileAllCustomersInfo2(fileName,registrants);

        actualRegistrantsInfoList = ReadToTxt.returnCustomer2(fileName);

    }

    @Given("user gets all registrant ssn and validate {string}")
    public void userGetsAllRegistrantSsnAndValidate(Registrants expectedSsn) throws IOException {
        Assert.assertFalse("The SSN Does Not Match!!", actualRegistrantsInfoList.contains(expectedSsn));

    }

    @And("user gets all registrant first name and validate {string}")
    public void userGetsAllRegistrantFirstNameAndValidate(Registrants expectedName) {
        Assert.assertTrue("The SSN Does Not Match!!", actualRegistrantsInfoList.contains(expectedName));
    }

    @And("user gets all registrant last name and validate {string}")
    public void userGetsAllRegistrantLastNameAndValidate(String arg0) {
    }

    @And("user gets all registrant address and validate {string}")
    public void userGetsAllRegistrantAddressAndValidate(String arg0) {
    }

    @And("user gets all registrant mobile Phone Number and validate {string}")
    public void userGetsAllRegistrantMobilePhoneNumberAndValidate(String arg0) {
    }

    @And("user gets all registrant user Id and validate {int}")
    public void userGetsAllRegistrantUserIdAndValidate(int arg0) {
    }

    @And("user gets all registrant user name and validate {string}")
    public void userGetsAllRegistrantUserNameAndValidate(String arg0) {
    }

    @And("user gets all registrant email and validate {string}")
    public void userGetsAllRegistrantEmailAndValidate(String arg0) {
    }
}
