package kr.pet.mvc;

import java.util.ArrayList;
import java.util.List;

//진료 기록을 관리하는 컨트롤러
public class MedicalRecordController {
    private List<MedicalRecord> records=new ArrayList<>();
    //진료 기록을 등록하는 메서드
    public void addMedicalRecord(MedicalRecord medicalRecord){
        records.add(medicalRecord);
    }
    //진료 기록을 삭제하는 메서드
    public void removeMedicalRecord(String phoneNumber){
        for(int i=0;i<records.size();i++){
            if(records.get(i).getPhoneNumber().equals(phoneNumber)){
                records.remove(i);
                break;//Q. 이거 records안에 동일한 번호로 여러 진료가 있으면 딱 하나의 기록만 삭제되는거 아님? -> 하나만 사라짐
            }
        }
    }
    //전화번호에 해당하는 모든 진료기록을 검색하여 새로운 List<MedicalRecord>를 만들어주는 메서드
   public List<MedicalRecord> findMedicalRecords(String phoneNumber){
        List<MedicalRecord> result=new ArrayList<>();
        for(MedicalRecord m:records){
            if(m.getPhoneNumber().equals(phoneNumber)){
                result.add(m);
            }
        }
        return result;//많은 레코드 중에서 번호 일치하는 즉, 본인의 진료 기록만 저장한 리스트: result
   }
}
