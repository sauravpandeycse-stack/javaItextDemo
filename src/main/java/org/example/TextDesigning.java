package org.example;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvasConstants;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TextDesigning {
    public static void main(String[] args) throws IOException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

        PdfWriter pdfWriter =  new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        Text text1 = new Text("Normal text").setFont(font);
//        to bold text
        Text text2 = new Text("\nBold text").setFont(font).setBold();
        Text text3 = new Text("\nItalic text").setFont(font).setItalic();
        Text text4 = new Text("\nUnderline text").setFont(font).setUnderline();
        Text text5 = new Text("\nBold+Italic text").setFont(font).setBold().setItalic();
        Text text6 = new Text("\nNormal+Colored text").setFont(font).setFontColor(Color.GREEN);
        Text text7 = new Text("\nBold+Stroke colored text").setFont(font).setBold().setStrokeColor(Color.BLUE);

        Paragraph paragraph = new Paragraph()
                .add(text1)
                .add(text2)
                .add(text3)
                .add(text4)
                .add(text5)
                .add(text6)
                .add(text7);
        document.add(paragraph);

        //  if want to add same style to multiple text
        Style style = new Style();
        style.setFontColor(Color.ORANGE)
                .setFontSize(18f)
                .setItalic();

        Paragraph paragraph2 = new Paragraph();
        paragraph2.add("Another text to beautify..").addStyle(style);
        document.add(paragraph2);

        document.close();

    }
}
