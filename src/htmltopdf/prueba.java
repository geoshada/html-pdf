/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmltopdf;

import com.itextpdf.text.DocumentException;
import static htmltopdf.PdfUtileria.HtmlToPdf;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author geoskull
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, DocumentException {
        HtmlToPdf("hola.pdf", "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<style>\n"
                + "body {\n"
                + "    background-color: linen;\n"
                + "}\n"
                + "h1 {\n"
                + "    color: maroon;\n"
                + "    margin-left: 40px;\n"
                + "} \n"
                + "</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "\n"
                + "<h1>Soy Geobyte</h1>\n"
                + "<p>He creado un pdf.</p>\n"
                + "\n"
                + "</body>\n"
                + "</html>");
    }

}
