package kr.pet.mvc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String phoneNumber;
    private String ownerName;
    private String petName;
    private String address;
    private String species;
    private String birthYear;
    private List<MedicalRecord> medicalRecords;//진료 기록을 저장하는 리스트

    public Customer(){}

    public Customer(String phoneNumber, String ownerName, String petName, String address, String species, String birthYear) {
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.petName = petName;
        this.address = address;
        this.species = species;
        this.birthYear = birthYear;
        this.medicalRecords=new ArrayList<>();//고객이 하나 만들어 질 때, 빈 리스트로 초기화 *생성자에는 포함안됨
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }
    /*
    진료 기록 하나가 넘어오는거라서 기본 함수에서 수정함
    인자가 리스트가 아닌 객체 변수로
     */
    /*public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }*/
    public void addMedicalRecords(MedicalRecord record) { //고객 별로 진료기록을 저장
            medicalRecords.add(record);
    }
}
