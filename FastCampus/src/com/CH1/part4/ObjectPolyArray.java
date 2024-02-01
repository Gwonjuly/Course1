package com.CH1.part4;

import com.CH1.poly.*;

public class ObjectPolyArray {//extends Object 생락
    public static void main(String[] args) {
        Object[] obj=new Object[2];
        obj[0] = new A();
        ((A)obj[0]).printGo();
        obj[1]= new B();
        ((B)obj[1]).printGo();
        for (int i=0;i< obj.length;i++){
            if(obj[i] instanceof A)
                ((A)obj[0]).printGo();
            else
                ((B)obj[1]).printGo();
        }
        display(obj);
    }
    public static void display(Object[] obj){
        for (int i=0;i< obj.length;i++){
            if(obj[i] instanceof A)
                ((A)obj[0]).printGo();
            else
                ((B)obj[1]).printGo();
        }
    }
}
