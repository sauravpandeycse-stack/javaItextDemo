package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.GrooveBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class Tables {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c:\\Users\\sauravpandey\\desktop\\testFile.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

//        adding border to table
        Border border = new GrooveBorder(3);

//      this array size represent number of columns and values represent their size or width
        float columnWitdh[] = {100f, 50f, 200f};
        Table table = new Table(columnWitdh);
//        To create cell and add it in table
        Cell cell1 = new Cell();
        cell1.add("Name").setBold().setFontColor(Color.GREEN).setBackgroundColor(Color.YELLOW).setBorder(border);
        table.addCell(cell1);
//      Do above steps in single line
        table.addCell(new Cell().add("Age").setBold().setFontColor(Color.GREEN).setBackgroundColor(Color.YELLOW).setBorder(border));
        table.addCell(new Cell().add("Address").setBold().setFontColor(Color.GREEN).setBackgroundColor(Color.YELLOW));

        /*
        * Like in columnWidth we have defined there will be 3 cloumns
        * when we add cells in table it will be in set of 3 and after 3 it automatically moves to next row
        */
        table.addCell(new Cell().add("Saurav"));
        table.addCell(new Cell().add("24"));
        table.addCell(new Cell().add("Uttarakhand, India"));

        table.addCell(new Cell().add("Sam"));
        table.addCell(new Cell().add("25"));
        table.addCell(new Cell().add("Wales, England"));

        table.addCell(new Cell().add("Steve"));
        table.addCell(new Cell().add("30"));
        table.addCell(new Cell().add("Washington, America"));

//        this will collapse empty column
        table.addCell(new Cell().add("Tom"));
        table.addCell(new Cell().add("Hydrabad, India"));

        document.add(table);

        document.close();
    }
}
