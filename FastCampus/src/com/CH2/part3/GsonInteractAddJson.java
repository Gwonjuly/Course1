package com.CH2.part3;

import com.CH2.model3.Address;
import com.CH2.model3.Person;
import com.google.gson.Gson;

public class GsonInteractAddJson {
    public static void main(String[] args) {
        System.out.println("----------------Gson to Json----------------------------------");
        Address address=new Address("원주","강원도");
        Person person=new Person("권주리",26,"wnfl0925@naver.com", address);
        Gson gson=new Gson();
        String json=gson.toJson(person);
        System.out.println(json);
        System.out.println("----------------Json to Gson----------------------------------");
        Person person1=gson.fromJson(json,Person.class);
        System.out.println(person1);
    }
}
