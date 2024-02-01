package kr.Excel.Example;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelExmaple {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream(new File("학습 플래너.xlsx"));//파일 읽어오기
            Workbook workbook= WorkbookFactory.create(file);//Workbook: 가상 엑셀 메모리, WorkbookFactory: Workbook 만들기
            Sheet sheet=workbook.getSheetAt(0);//워크북의 index 0번 시트 가져오기
            for(Row row:sheet){
                for(Cell cell:row){
                    System.out.print(cell.toString()+"\t");
                }
                System.out.println();
            }
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
