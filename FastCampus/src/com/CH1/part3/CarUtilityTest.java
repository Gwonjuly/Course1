package com.CH1.part3;

import com.CH1.model.CarDTO;

import com.CH1.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        //Q. 자동차 정보를 출력하는 동작을 갖고 있는 Utility 클래스 만들기
        int sn=1233;
        String name="bmw";
        int price=123455;
        String owner="주리";
        int year=2024;
        String type="auto";

        CarDTO car=new CarDTO();
        car.CarSN=sn;
        car.CarName=name;
        car.CarPrice=price;
        car.CarOwner=owner;
        car.CarYear=year;
        car.CarType=type;

        CarUtility carUtility=new CarUtility();
        carUtility.carPrint(car);
    }
    //매개변수로 자동차의 정보를 입력받아서 출력하는 메소드
    /*public static void carPrint(CarDTO car){
        System.out.println(car.CarSN + "\t" + car.CarName +"\t" + car.CarPrice +"\t" + car.CarOwner+"\t" +car.CarYear +"\t" +car.CarType);
    }*/
}
