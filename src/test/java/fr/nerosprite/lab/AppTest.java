package fr.nerosprite.lab;

import static fr.nerosprite.lab.FirstPdf.*;
import static org.junit.Assert.assertTrue;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Unit test for FirstPdf
 */
public class AppTest 
{


    @Test
    public void shouldAnswerWithTrue() throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("PDFTestForJunit"));
        document.open();
        addMetaData(document);
    }
}
