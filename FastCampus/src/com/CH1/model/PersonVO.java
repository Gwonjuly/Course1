package com.CH1.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    //생략된 생성자 메서드 존재: 기본 생성자(default Constructor)
    public PersonVO(){
        //객체를 생성하는 코드는 내부에서 만들어진다.
        this.name="권주리";
        this.age=26;
        this.phone="010-9372-6068";
    }

    public PersonVO(String name, int age, String phone){//생성자 메서드의 오버로딩
        this.name=name;
        this.age= age;
        this.phone=phone;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }
}
