package com.CH2.part1;

import com.CH2.model.Person;
import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json="{\"name\":\"권주리\",\"age\":26}";//JSON->Person
        Gson gson=new Gson();
        Person p=gson.fromJson(json, Person.class);
        System.out.println(p.toString());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
