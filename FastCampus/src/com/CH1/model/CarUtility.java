package com.CH1.model;

public class CarUtility {
    public void carPrint(CarDTO car){
        System.out.println(car.CarSN + "\t" + car.CarName +"\t" + car.CarPrice +"\t" + car.CarOwner+"\t" +car.CarYear +"\t" +car.CarType);
    }
}
