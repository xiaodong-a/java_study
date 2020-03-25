package com.study;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] arr={5,15,2000,10000,100,4000};
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
;            }
        }
        System.out.println("数组最小值："+min);
    }
}
