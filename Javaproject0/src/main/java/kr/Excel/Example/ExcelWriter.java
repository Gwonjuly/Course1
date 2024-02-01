package kr.Excel.Example;

import Entity.MemverVO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelWriter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//키보드로 입력 받기
        List<MemverVO> list=new ArrayList<>();

        while (true){
            System.out.print("이름 입력:");
            String name=scanner.nextLine();
            if(name.equals("quit"))
                break;
            System.out.print("나이 입력:");
            int age=scanner.nextInt();
            scanner.nextLine();//개행문자 제거: int형으로 입력 받은 후 개행 문자 제거 필요

            System.out.print("생년월일 입력:");
            String birth=scanner.nextLine();

            System.out.print("번호 입력:");
            String phone=scanner.nextLine();

            System.out.print("주소 입력:");
            String address=scanner.nextLine();

            System.out.print("결횬 여부(true/false):");
            boolean isMarried=scanner.nextBoolean();
            scanner.nextLine();//개행 문자 제거
            list.add(new MemverVO(name,age,birth,phone,address,isMarried));
        }
        scanner.close();
        try{
            XSSFWorkbook workbook=new XSSFWorkbook();//가상 엑셀 메모리 만들기
            Sheet sheet=workbook.createSheet("회원 정보");//회원정보라는 시트 만들기

            Row header=sheet.createRow(1);//1행에 header title 만들기
            header.createCell(1).setCellValue("이름");//1행의 1열에 이름 넣기
            header.createCell(2).setCellValue("나이");//1행의 2열에 나이  넣기
            header.createCell(3).setCellValue("생년월일");
            header.createCell(4).setCellValue("전화번호");
            header.createCell(5).setCellValue("주소");
            header.createCell(6).setCellValue("결혼여부");

            for(int i=0;i< list.size();i++){
                MemverVO vo= list.get(i);
                Row row=sheet.createRow(i+2);
                row.createCell(1).setCellValue(vo.getName());
                row.createCell(2).setCellValue(vo.getAge());
                row.createCell(3).setCellValue(vo.getBirthdate());
                row.createCell(4).setCellValue(vo.getPhone());
                row.createCell(5).setCellValue(vo.getAddress());
                Cell married=row.createCell(6);
                married.setCellValue(vo.isMarried()==true?"Y":"N");
            }
            String filename="members.xlsx";
            FileOutputStream outputStream=new FileOutputStream(new File(filename));
            workbook.write(outputStream);
            System.out.println("파일이 저장됨");
        }catch (IOException e){
            System.out.println("파일 저장 중 에러 발생");
            e.printStackTrace();
        }
    }
}
