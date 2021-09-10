package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnbank51.pojos.Customer;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static linnbank51.utilities.DatabaseUtility.*;
import static linnbank51.utilities.PDFGenerator.*;
import static linnbank51.utilities.PDFGenerator.pdfGeneratorRowsAndCellsWithListFirst5;

public class US_30_stepdef {
    public static void main(String[] args) {

    }

    @Given("database connection for pdf generator with db using {string} , {string} and {string}")
    public void databaseConnectionForPdfGeneratorWithDbUsingAnd(String url, String user, String password) {
        createConnection(url,user,password);

    }


    @And("pdf user provides the query {string}")
    public void pdfUserProvidesTheQuery(String query) {

        List<Customer> customerList = new ArrayList<>();

        List<List<Object>> lists = getQueryResultList(query);

        for (int i=0; i<=10; i++){
            Customer customer = new Customer();
            customer.setFirstName(lists.get(i).get(1).toString());
            customer.setLastName(lists.get(i).get(2).toString());
            customer.setEmail(lists.get(i).get(3).toString());
            customer.setCity(lists.get(i).get(4).toString());
            customer.setSsn(lists.get(i).get(5).toString());

            customerList.add(customer);
        }

        pdfGeneratorRowsAndCellsWithListFirst5("Users' Info1", customerList, "User2.pdf");
    }


}
