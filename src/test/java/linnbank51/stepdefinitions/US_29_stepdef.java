package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static linnbank51.utilities.DatabaseUtility.*;

public class US_29_stepdef {

    List<Object> customerList;
   List<Object> stateList;
    List<Object> adminList;
////    List<Object> managerList;
    List<Object> countryList;

    public static void main(String[] args) {
        createConnection();
        String queryCustomerData = "Select * from jhi_persistent_audit_event";
        System.out.println(getColumnNames(queryCustomerData));
        System.out.println("======================");
        System.out.println(getColumnData(queryCustomerData,"principal"));
        closeConnection();

    }


    @Given("database connection with db using {string} , {string} and {string}")
    public void databaseConnectionWithDbUsingAnd(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @And("database gmibank user reads the Customers data using {string} and {string}")
    public void databaseGmibankUserReadsTheCustomersDataUsingAnd(String query, String columnName) {
        customerList= getColumnData(query,columnName);
        System.out.println(customerList);
    }

    @Then("database gmibank validate customers data")
    public void databaseGmibankValidateCustomersData() {
        Assert.assertTrue(customerList.contains("473-22-1798"));
        System.out.println("========================");
        System.out.println("Validation Successful");
        System.out.println("========================");
    }


    @And("database gmibank user reads the admin data using {string} and {string}")
    public void databaseGmibankUserReadsTheAdminDataUsingAnd(String query1, String columnAdmin) {
        adminList = getColumnData(query1, columnAdmin);
        System.out.println(adminList);
        System.out.println("========================");
    }

    @Then("database gmibank validate admin data")
    public void databaseGmibankValidateAdminData() {
        Assert.assertTrue(adminList.contains("team53admin"));
        System.out.println("========================");
        System.out.println("Validation Successful");
        System.out.println("========================");
    }

    @And("database gmibank user reads the country data using {string} and {string}")
    public void databaseGmibankUserReadsTheCountryDataUsingAnd(String queryCountry, String columnCountryName) {
        countryList = getColumnData(queryCountry, columnCountryName);
        System.out.println(countryList);
        System.out.println("========================");
    }

    @Then("database gmibank validate country data")
    public void databaseGmibankValidateCountryData() {
        Assert.assertTrue(countryList.contains("DOMINIC"));
        System.out.println("========================");
        System.out.println("Validation Successful");
        System.out.println("========================");
    }

    @And("database gmibank user reads the state data using {string} and {string}")
    public void databaseGmibankUserReadsTheStateDataUsingAnd(String queryState, String columnState) {
        stateList = getColumnData(queryState, columnState);
        System.out.println(stateList);
    }

    @Then("database gmibank validate state data")
    public void databaseGmibankValidateStateData() {
        Assert.assertTrue(stateList.contains("California"));
        System.out.println("========================");
        System.out.println("Validation Successful");
        System.out.println("========================");
    }
}
