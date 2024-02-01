package com.CH1.model;

public class CarDAO {//DB
    //C.R.U.D = Create(Insert)
    public void carInsert(CarDTO car){
        //DB 연결, insert SQL
        System.out.println("자동차 정보가 DB에 저장되었습니다.");
    }
    public void carSelect(){
        //DB 연결 후, select SQL을 이용하여 데이터 가져오기
        System.out.println("자동차 정보가 출력되었습니다.");
    }
}
