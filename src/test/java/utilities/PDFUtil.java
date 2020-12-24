package utilities;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import pojos.UserWithRoles;

import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Stream;

public class PDFUtil {

    public static void writeToPDF(List<UserWithRoles> users) {
        Document document = new Document();
       try {
           BaseFont bf = BaseFont.createFont("ARIAL.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

           PdfWriter.getInstance(document, new FileOutputStream("UsersWithRole.pdf"));
           document.open();

           PdfPTable table = new PdfPTable(3);

          // Path path = Paths.get(ClassLoader.getSystemResource("gmi_logo.png").toURI());
           Image img = Image.getInstance("gmi-logo.png");

           document.add(img);
           Paragraph p = new Paragraph("\nGMIBANK USERS LIST");
           p.setAlignment(Element.ALIGN_CENTER);
           Font font = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
           p.setFont(font);
           document.add(p);
           document.add(new Phrase("\n"));
           addTableHeader(table);
           for(UserWithRoles user : users){
               table.addCell(new Paragraph(user.getFirstName(), new Font(bf,11)));
               table.addCell(new Paragraph(user.getLastName(), new Font(bf,11)));
               table.addCell(new Paragraph(user.getRole(), new Font(bf,11)));
           }
           float [] colWidth = {4,4,2};
           table.setWidths(colWidth);

           document.add(table);
       }catch (Exception e){
           e.printStackTrace();
       }
        document.close();
    }

    private static void addTableHeader(PdfPTable table) {

        Stream.of("First Name", "Last Name", "Role")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
    }

    public static String readPDF() {
        String pageContent="";
        try {
            //Create PdfReader instance.
            PdfReader pdfReader = new PdfReader("UsersWithRole.pdf");

            //Get the number of pages in pdf.
            int pages = pdfReader.getNumberOfPages();

            //Iterate the pdf through pages.
            for(int i=1; i<=pages; i++) {
                //Extract the page content using PdfTextExtractor.
                pageContent += PdfTextExtractor.getTextFromPage(pdfReader, i);

            }

            //Close the PdfReader.
            pdfReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageContent;
    }



}
