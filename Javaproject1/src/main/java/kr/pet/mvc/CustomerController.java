package kr.pet.mvc;

import java.util.ArrayList;
import java.util.List;
/*
고객 컨트롤러는 항상 진료기록 관리 컨트롤러와 항상 연동이 되어 있어야 함
 */
public class CustomerController { //고객 관리 컨트롤러
    private List<Customer> customers;
    private MedicalRecordController recordController; //진료 기록을 관리하는 컨트롤러


    public CustomerController(MedicalRecordController medicalRecordController){
         this.customers=new ArrayList<>();
         this.recordController=medicalRecordController;
         //만약 고객 기록을 삭제하면 해당되는 진료기록도 연동되어 삭제되어야 하기때문에 생성자 호출 시 15행 추가
    }
    //고객을 등록하는 메서드
    public void addCustomers(Customer customer){
        customers.add(customer);
    }
    //고개을 삭제하는  메서드(해당하는 진료기록도 같이 삭제되어야 함)
    public void removeCustomer(String phoneNumber){
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getPhoneNumber().equals(phoneNumber)){
                customers.remove(i);
                recordController.removeMedicalRecord(phoneNumber);
                break;
            }
        }
    }
    //고객 등록 여부 확인 메서드
    public Customer findCustomer(String phoneNumber){
        for(Customer customer:customers){
            if(customer.getPhoneNumber().equals(phoneNumber)){
                return customer;
            }
        }
        return null;
    }

    //기존 고객 전화번호 중복 여부 체크
    public boolean isDuplicated(String phoneNumber){
        for(Customer customer:customers){
            if(customer.getPhoneNumber().equals(phoneNumber))
                return true;
        }
        return false;
    }
}
