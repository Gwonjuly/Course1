package com.CH2.part1;

import com.CH2.model.Person;
import com.google.gson.Gson;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person=new Person("권주리",26);
        Gson gson=new Gson();
        String json=gson.toJson(person);
        System.out.println(json);
    }
}
