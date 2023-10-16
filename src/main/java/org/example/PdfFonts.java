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

public class PdfFonts {
    /* There are two type of Fonts
    * 1. Type 1 : there are 14 different fonts which every pdf viewer have
    * 2. Embedded Fonts : In this we attach font with pdf, hence whoever open pdf it will be opened in that embedded pdf
    * */

    public static void main(String[] args) throws IOException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        Document document = new Document(pdfDocument);

        PdfFont pdfFont1 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        PdfFont pdfFont2 = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);

        Text text1 = new Text("Text one with TIMES_ROMAN font").setFont(pdfFont1);
        Text text2 = new Text("Text two with TIMES_BOLD font").setFont(pdfFont2);

        Paragraph paragraph = new Paragraph().add(text1).add(text2);

        document.add(paragraph);
        document.close();

    }
}
