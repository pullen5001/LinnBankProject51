package linnbank51.stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import linnbank51.pojos.Customer;
import linnbank51.pojos.Registrants;
import linnbank51.utilities.ConfigurationReader;
import org.junit.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;
public class US_20_stepdef {
    Response response;
    List<Map<String, Object>> listOfCustomers;
    Response responseAll;
    ObjectMapper objectMapper;


    @Given("customer endpoint {string}")
    public void customerEndpoint(String arg1) {

        response = given().headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).when()
                .get(ConfigurationReader.getProperty("api_customer_endpoint"))
                .then()
                .contentType(ContentType.JSON).extract().response();
        response.prettyPrint();
  /*      response = given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when()
                .get(ConfigurationReader.getProperty("api_customer_endpoint"));
   */
    }
    @Then("user should read all customer data that is created")
    public void user_should_read_all_customer_data_that_is_created() throws IOException {
        objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        System.out.println(customer[2].getFirstName());
        listOfCustomers=response.as(ArrayList.class);
//        System.out.println(listOfCustomers);
//        System.out.println(customer[10].getEmail());
//        System.out.println(customer[5].getCreateDate());
//        System.out.println(customer[7].getSsn());
        System.out.println("==================== All ssn Numbers =========================");
        //all customers ssn numbers
        for(int i=0; i < customer.length; i++){
            System.out.println(customer[i].getSsn());
        }
       //all customers firstname start with M
        System.out.println("====================start with M =========================");
        for(int i=0; i < customer.length; i++){
            if(customer[i].getFirstName().startsWith("M")){
                System.out.println(customer[i].getFirstName());
            }
        }
        //all customers ssn start with 1
        System.out.println("================ All Ssn start with 1 =============================");
        for (int i = 0; i< customer.length; i++){
            if (customer[i].getSsn().startsWith("1")){
                System.out.println(customer[i].getSsn());
            }
        }
        System.out.println("=================== All customers cities ==========================");
        for (int i=0; i< customer.length; i++){
            System.out.println(customer[i].getCity());
        }
        System.out.println("=============== All emails contains K ==============================");
        for (int i=0; i<customer.length; i++){
            if (customer[i].getEmail().contains("k")){
               System.out.println(customer[i].getEmail());
            }
        }
        System.out.println("================ All users name =============================");
        for (int i=0; i<customer.length; i++){
            if(customer[i].getUser() !=null){
                System.out.println(customer[i].getUser().getFirstName());
            }
        }
        System.out.println("================== All countries name ===========================");
        for (int i=0; i<customer.length; i++){
            if (customer[i].getCountry() !=null){
                System.out.println(customer[i].getCountry().getName());
            }
        }
    }


    @Then("user gets seventh customer ssn {string} and validate")
    public void userGetsSeventhCustomerSsnAndValidate(String expectedSsn) throws IOException {
        objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualSsn = customer[7].getSsn();
        Assert.assertEquals(expectedSsn,actualSsn);
    }

    @And("one user gets seventh customer {string}:{string} and validate")
    public void oneUserGetsSeventhCustomerAndValidate(String arg0, String expectedFName) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualFName = customer[9].getFirstName();
        Assert.assertEquals(expectedFName,actualFName);
    }

    @And("two user gets seventh customer {string}:{string} and validate")
    public void twoUserGetsSeventhCustomerAndValidate(String arg0, String expectedLName) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualLName = customer[8].getLastName();
        Assert.assertEquals(expectedLName,actualLName);
    }

    @And("three user gets seventh customer {string}:{string}, and validate")
    public void threeUserGetsSeventhCustomerAndValidate(String arg0, String expectedAddress) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualAddress = customer[8].getAddress();
        Assert.assertEquals(expectedAddress,actualAddress);
    }

    @And("four user gets seventh customer {string}:{string} and validate")
    public void fourUserGetsSeventhCustomerAndValidate(String arg0, String expectedmPNumber) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualmPNumber = customer[8].getMobilePhoneNumber();
        Assert.assertEquals(expectedmPNumber,actualmPNumber);
    }

    @And("five user gets seventh customer {string}:{string} and validate")
    public void sevenUserGetsSeventhCustomerAndValidate(String arg0, String expectedEmail) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualEmail = customer[8].getEmail();
        Assert.assertEquals(expectedEmail,actualEmail);
    }

    @And("six user gets seventh customer {string}:{string} and validate")
    public void eightUserGetsSeventhCustomerAndValidate(String arg0, String expectedCreateDate) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualCreateDate = customer[8].getCreateDate();
        Assert.assertEquals(expectedCreateDate,actualCreateDate);
    }

    @And("seven user gets seventh customer {string}:{string} and validate")
    public void tenUserGetsSeventhCustomerAndValidate(String arg0, String expectedZipCode) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        String actualZipCode = customer[8].getZipCode();
        Assert.assertEquals(expectedZipCode,actualZipCode);
    }


}

