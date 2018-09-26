/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmltopdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



/**
 *
 * @author geoskull
 */
public class PdfUtileria {
    private static String contenido;
    private static String archivo;
    /**
     * Metodo que recibe una cadena de tipo html y regresa un archivo pdf
     * @param ruta
     * @param cont
     * @return 
     */
    public static void HtmlToPdf(String ruta,String cont) throws IOException, DocumentException{
        contenido=cont;
        archivo=ruta;
        File file=new File(ruta);
        createPdf();
    } 
    /**
     * Crea un PDF con el html ingresado
     * @param file
     * @throws IOException
     * @throws DocumentException
     */
    private static void createPdf() throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(archivo));
        document.open();
        ElementList list = XMLWorkerHelper.parseToElementList(contenido, null);
        for (Element element : list) {
            document.add(element);
        }
        document.close();
    }
}
