package linnbank51.utilities;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import linnbank51.pojos.User;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PDFGenerator_passwords {

    public static void pdfGeneratorRowsAndCellsWithList(String header, List<User> list, String fileName) {

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
        List<String> headers = new ArrayList<String>();
        headers.add("First Name");
        headers.add("Last Name");
        headers.add("Role");

        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                                   " + pdf_title));

            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float[] colWidth = {2, 2, 2};
            table.setWidths(colWidth);

            for (int i = 0; i < headers.size(); i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for (int i = 0; i < list.size(); i++) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(list.get(i).getRole());

            }
            document.add(table);

            document.close();

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        String header = "Users Information";
        String fileName = "src\\test\\resources\\test_data\\UsersInfo2.pdf";


        User user1 = new User();
        user1.setFirstName("Johnmanager");
        user1.setLastName("Brown");
        user1.setRole("Manager");

        User user2 = new User();
        user2.setFirstName("Johnadmin");
        user2.setLastName("Brown");
        user2.setRole("Admin");

        User user3 = new User();
        user3.setFirstName("Aya");
        user3.setLastName("Happy");
        user3.setRole("Customer");

        User user4 = new User();
        user4.setFirstName("Johnemployee");
        user4.setLastName("Brown");
        user4.setRole("Employee");


        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);

        //pdfGeneratorRowsAndCellsWithList(String header, List <> list, String fileName)
        pdfGeneratorRowsAndCellsWithList(header, listOfUsers, fileName);

    }
}