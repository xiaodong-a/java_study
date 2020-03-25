package com.study;

public class HomeWork01 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]);
    }
    
}
