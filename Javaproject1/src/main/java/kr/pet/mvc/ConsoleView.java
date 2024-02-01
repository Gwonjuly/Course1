package kr.pet.mvc;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner=new Scanner(System.in);

    //전화번호 입력 창
    public String getPhoneNumber(){
        System.out.println("전화번호를 입력하세요.");
        return scanner.nextLine();
    }

    //신규 고객 정보 입력 창
    public Customer getCustomer(){
        System.out.println("신규 고객 정보를 입력하세요.");
        System.out.print("전화 번호: ");
        String phoneNumber= scanner.nextLine();
        System.out.print("소유주 이름: ");
        String ownerName=scanner.nextLine();
        System.out.print("동물 이름 ");
        String petName=scanner.nextLine();
        System.out.print("주소: ");
        String address=scanner.nextLine();
        System.out.print("종류: ");
        String species=scanner.nextLine();
        System.out.print("출생년도(yyyy): ");
        String birthYear=scanner.nextLine();
        return new Customer(phoneNumber, ownerName, petName,address,species,birthYear);
    }

    //진료 기록 입력 창
    public MedicalRecord getMedicalRecord(){
        System.out.print("진료일을 입력하세요: ");
        String date=scanner.nextLine();
        System.out.println("진료내용을 입력하세요.:");
        String content=scanner.nextLine();
        return new MedicalRecord(null,date,content);
    }
    //진료 기록 출력 창
    public void printMedicalRecord(Customer customer){
        List<MedicalRecord> records=customer.getMedicalRecords();
        System.out.println("["+customer.getPetName()+"]의 진료기록");
        for(MedicalRecord medicalRecord:records){
            System.out.println("- 진료일   :"+medicalRecord.getDate());
            System.out.println("  진료내용  :" +medicalRecord.getContent());
            System.out.println("  소유주   :" +customer.getOwnerName());
            System.out.println("  동물 이름 : " +customer.getPetName());
            System.out.println("  주소     : "+customer.getAddress());
            System.out.println("  종류     :"+customer.getSpecies());
            System.out.println("  출생년도  :"+customer.getBirthYear());
        }
    }

    public void printMessage(String str){
        System.out.println(str);
    }
}
