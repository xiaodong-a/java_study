package com.study;

import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("利用随机数产生一个10大小的数组,元素范围0~9");
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10);
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
