package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class ListDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

        List list1 = new List();
        list1.add("JAVA");
        list1.add("PYTHON");
        list1.add("KOTILN");
        list1.add("PHP");

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

//        adding page to pdf
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(list1);
        document.close();
    }
}
