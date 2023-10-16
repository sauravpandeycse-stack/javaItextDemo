package org.example;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.IOException;

public class EmbeddedPdfFonts {
    public static final String font1 = "fonts\\aAbrushow.ttf";
    public static final String font2 = "fonts\\ReallyFree-ALwl7.ttf";
    public static void main(String[] args) throws IOException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        Document document = new Document(pdfDocument);

        PdfFont pdfFont1 = PdfFontFactory.createFont(font1);
        PdfFont pdfFont2 = PdfFontFactory.createFont(font2);


        Text text1 = new Text("Text one with "+font1+ " font").setFont(pdfFont1);
        Text text2 = new Text("Text two with "+font2+ " font").setFont(pdfFont2);

        Paragraph paragraph = new Paragraph().add(text1).add(text2);

        document.add(paragraph);
        document.close();
    }
}
