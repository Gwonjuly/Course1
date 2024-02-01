package com.CH1.part4;

public class Employee /*extends Object*/{//Employee(생략된 모든)의 상위 클래스는 object(최상위 클래스)
    private  String name;//private일 경우, 하위 클래스가 접근을 못함
    private  int age;
    private  String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee(){
        super();//상위 클래스의 생성자 호출(object)-> new Object();
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
