package com.CH2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[6];
        int i=0;
        while(i<6)
        {
            int num=random.nextInt(45)+1; //1~45, nextInt(45);는 0~44
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(arr[j]==num){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate)
                arr[i++]=num;
        }
        for(int n:arr)
            System.out.print(n +" ");
    }
}
