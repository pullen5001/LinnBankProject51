package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.List;

import static linnbank51.utilities.DatabaseUtility.*;

public class Database_stepdef {
    public static void main(String[] args) {

        createConnection();
        String queryCustomerData = "Select * from \"public\".tp_customer";
        System.out.println( getColumnNames(queryCustomerData));
        System.out.println("===========================");
        System.out.println(getColumnData(queryCustomerData,"first_name"));
        System.out.println("===========================");
        System.out.println(getCellValue(queryCustomerData,8,5));
        closeConnection();


    }
    List<Object> objectList;

    @Given("database ders bank user creates a connection with db using {string} , {string} and {string}")
    public void databaseDersBankUserCreatesAConnectionWithDbUsingAnd(String url, String user, String password) {
        createConnection(url,user,password);
    }

    @And("database ders bank user reads the Customers data using {string} and {string}")
    public void databaseDersBankUserReadsTheCustomersDataUsingAnd(String query, String ssn) {
        objectList = getColumnData(query,ssn);
        System.out.println(objectList);
    }

    @Then("database ders bank validate customers data")
    public void databaseDersBankValidateCustomersData() {

        Assert.assertTrue(objectList.contains("126-34-7860"));
        System.out.println("===========================");
        System.out.println("Validation is succesfull");
    }

}