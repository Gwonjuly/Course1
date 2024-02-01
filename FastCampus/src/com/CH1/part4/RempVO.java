package com.CH1.part4;

public class RempVO extends Employee{
    public RempVO(){
        super();//생략 가능
    }
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        //초기화(자식이 부모의 기억공간에 초기화를 하는  경우
        /*this.name=name;
        this.age=age;
        this.phone=phone;
        this.empDate=empDate;
        this.dept=dept;
        this.marriage=marriage;*/

        //자식이 부모한테 데이터를 전달, 부모가 데이터를 받아 직접 초기화 진행
        super(name, age, phone, empDate, dept, marriage);//부모의 생성자에 매개변수를 같이 넘김
    }
}
