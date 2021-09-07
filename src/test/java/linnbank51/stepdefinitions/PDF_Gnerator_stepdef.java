package linnbank51.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import linnbank51.pojos.Country;
import linnbank51.pojos.Customer;

import java.util.ArrayList;
import java.util.List;

import static linnbank51.utilities.DatabaseUtility.*;
import static linnbank51.utilities.PDFGenerator.*;

public class PDF_Gnerator_stepdef {

    public static void main(String[] args) {
       // pdfGenerator("Deneme","Gmibank.pdf");
       // pdfGeneratorRowsAndCells("Deneme2", "GmiBank2.pdf");
        List<Customer> list = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ali");
        customer.setSsn("1234");
        Country country = new Country();
        country.setName("USA");
        customer.setCountry(country);
        customer.setState("Virginia");
        customer.setZipCode("16280");

        list.add(customer);



    }


    @Given("pdf_ders_bank user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_bankUserCreatesAConnectionWithDbUsingAnd(String url, String user, String password) {

        createConnection(url,user,password);
    }

    @And("pdf_ders_bank user provides the query {string}")
    public void pdf_ders_bankUserProvidesTheQuery(String query) {
        List <Customer> customerNewList = new ArrayList<>();

        List<List<Object>> lists = getQueryResultList(query);

        for (int i=0; i<=10; i++){
            Customer customer = new Customer();
            customer.setFirstName(lists.get(i).get(1).toString());
            customer.setLastName(lists.get(i).get(2).toString());
            customer.setMiddleInitial(lists.get(i).get(3).toString());
            customer.setEmail(lists.get(i).get(4).toString());
            customer.setMobilePhoneNumber(lists.get(i).get(5).toString());

            customerNewList.add(customer);
        }
        pdfGeneratorRowsAndCellsWithListFirst5("Last Deneme1", customerNewList, "Son Deneme4.pdf");


    }
}
