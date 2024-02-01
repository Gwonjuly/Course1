package com.CH1.part3;

import com.CH1.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){ //main 입력 시 자동으로 생성
        //Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동해야 되는 경우를 생각해보자
        Scanner scan = new Scanner(System.in); //System.in = 키보드와 연결

        System.out.println("자동차 SN:");
        int CarSN= scan.nextInt(); //정수형 입력 받기
        scan.nextLine(); //엔터를 입력 받아서 버퍼 지우기

        System.out.println("자동차 이름:");
        String CarName= scan.nextLine();//String 형 입력 받기

        System.out.println("자동차 가격:");
        int CarPrice= scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 소유자:");
        String CarOwner= scan.nextLine();

        System.out.println("자동차 년식:");
        int CarYear= scan.nextInt();
        scan.nextLine();

        System.out.println("자동차 타입:");
        String CarType= scan.nextLine();

        //자동차 데이터를 이동하기 위한 바구니(CarDTO, CarVO) 모델을  설계
        CarDTO car = new CarDTO(); //클래스 생성자
        car.CarSN=CarSN; //클래스에 데이터 이동
        car.CarName=CarName;
        car.CarPrice=CarPrice;
        car.CarOwner=CarOwner;
        car.CarYear=CarYear;
        car.CarType=CarType;
        carInfoPrint(car); //Call By Reference
    }
    //자동차의 정보를 받아서 출력하는 메서드
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.CarSN + "\t" + car.CarName +"\t" + car.CarPrice +"\t" + car.CarOwner+"\t" +car.CarYear +"\t" +car.CarType);
    }
}
