package com.CH1.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        /*RempVO vo=new RempVO();//1. Employee() 생성 2. RempVO() 생성 즉, vo는 Employee 및 RempVO을 담고 있음
        vo.name="권주리";
        vo.age=26;
        vo.phone="9372-6068";
        vo.empDate="2024-01-10";
        vo.dept="sw1팀";
        vo.marriage=false;*/
        RempVO vo=new RempVO("권주리", 26, "010-9372-6068","2024-01-01","sw1팀",false);

        //System.out.println(vo.name +"\t" +vo.age);//귀찮아서 2개만 출력함
        System.out.println(vo.toString());
    }
}
