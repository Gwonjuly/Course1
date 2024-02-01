package kr.Excel.Example;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.HashMap;

public class BookInfoToPDF {
    public static void main(String[] args) {
        HashMap<String,String> bookInfo=new HashMap<>();
        bookInfo.put("title","한글자바");
        bookInfo.put("author","홍길동");
        bookInfo.put("publisher","한글 출판사");
        bookInfo.put("year",String.valueOf(Year.now().getValue()));
        bookInfo.put("price","25000원");
        bookInfo.put("pages","400");

        try{
            PdfWriter writer=new PdfWriter(new FileOutputStream("BookInfo.pdf"));
            PdfDocument pdf=new PdfDocument(writer);
            Document document=new Document(pdf);

            PdfFont font= PdfFontFactory.createFont("malgun.ttf", PdfEncodings.IDENTITY_H,true);
            document.setFont(font);
            for(String s: bookInfo.keySet()){
                Paragraph paragraph=new Paragraph(s +":"+bookInfo.get(s));
                document.add(paragraph);
            }
            document.close();
            System.out.println("파일 생성 완료");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
