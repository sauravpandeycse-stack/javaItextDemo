package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
//        path where to generate pdf
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

//        paragraph text
        String paragraphText = "iText: iText is a widely used Java library for creating and manipulating PDF documents. It provides various methods to generate PDF files from HTML content, XML, or database data. iText is known for its flexibility and extensive features for PDF generation";
        Paragraph paragraph1 = new Paragraph(paragraphText);
        /* To adjust paragraph text font size */
//        Paragraph paragraph1 = new Paragraph(paragraphText).setFontSize(10);

//        image path to be used in pdf
        String imageSrc = "images\\tree.jpg";
        ImageData imageData = ImageDataFactory.create(imageSrc);
        Image image1 = new Image(imageData);
        image1.scaleToFit(200, 200);

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

//        adding page to pdf
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);

//        add paragraph to pdf
        document.add(paragraph1);

//        add image to paragraph
        document.add(image1);

        document.close();
    }
}