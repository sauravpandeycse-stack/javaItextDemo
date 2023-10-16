package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";
        String paragraphText = "iText: iText is a widely used Java library for creating and manipulating PDF documents. It provides various methods to generate PDF files from HTML content, XML, or database data. iText is known for its flexibility and extensive features for PDF generation";
        Paragraph paragraph1 = new Paragraph(paragraphText);
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.add(paragraph1);
        document.close();
    }
}