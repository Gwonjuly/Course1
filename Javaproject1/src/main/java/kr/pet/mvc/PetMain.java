package kr.pet.mvc;

import java.util.List;
import java.util.Scanner;

public class PetMain {
    public static void main(String[] args) {
        MedicalRecordController recordController=new MedicalRecordController();
        CustomerController customerController=new CustomerController(recordController);
        ConsoleView view=new ConsoleView();
        while (true){
            System.out.println("===애완 동물 진료 관리  시스템===");
            System.out.println("1. 신규 고객 정보 입력");
            System.out.println("2. 진료 기록 저장");
            System.out.println("3. 진료 기록 조회");
            System.out.println("4. 진료 기록 삭제");
            System.out.println("5. 고객 정보 삭제");
            System.out.println("6. 종료");
            System.out.println("원하는 기능의 번호를 입력하세요.");
            Scanner scanner=new Scanner(System.in);
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    Customer customerNew= view.getCustomer();
                    String phoneNumber=customerNew.getPhoneNumber();
                    if(customerController.isDuplicated(phoneNumber)){
                        System.out.println("이미 등록된 전화번호입니다.");
                        continue;//break로 해보기
                    }
                    else{
                        customerController.addCustomers(customerNew);
                        System.out.println("고객 정보가 추가되었습니다.");
                        break;
                    }
                case 2:
                    phoneNumber=view.getPhoneNumber();//실행 후 case 2 먼저 해보기
                    if(customerController.findCustomer(phoneNumber)==null){
                        System.out.println("해당 전화번호의 고객이 없습니다.");
                        break;
                    }
                    else{
                        Customer customer=customerController.findCustomer(phoneNumber);
                        MedicalRecord recordNew= view.getMedicalRecord();
                        recordNew.setPhoneNumber(phoneNumber);
                        recordController.addMedicalRecord(recordNew);
                        customer.addMedicalRecords(recordNew);
                        System.out.println("진료 기록이 저장되었습니다.");
                        break;
                    }
                case 3:
                    phoneNumber= view.getPhoneNumber();
                    List<MedicalRecord> record=recordController.findMedicalRecords(phoneNumber);
                    if(record.isEmpty()){
                        System.out.println("해당 전화번호의 진료 기록이 없습니다.");
                        break;
                    }
                    else{
                        Customer customer2=customerController.findCustomer(phoneNumber);
                        view.printMedicalRecord(customer2);
                        break;
                    }
                case 4:
                    phoneNumber= view.getPhoneNumber();
                    if(customerController.findCustomer(phoneNumber)==null){
                        System.out.println("삭제할 기록이 없습니다.");
                        break;
                    }
                    else{
                        recordController.removeMedicalRecord(phoneNumber);
                        System.out.println("진료 기록이 삭제되었습니다.");
                        break;
                    }
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선태입니다.");
                    break;
            }
        }
    }
}
