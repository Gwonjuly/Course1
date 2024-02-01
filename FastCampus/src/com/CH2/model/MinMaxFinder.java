package com.CH2.model;

public class MinMaxFinder {
    private MinMaxFinder(){}
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            min=arr[i]<min ? arr[i]:min;
        }
        return min;
    }

    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            max=arr[i]>max ? arr[i]:max;
        }
        return max;
    }
}
