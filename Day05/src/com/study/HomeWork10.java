package com.study;

import java.util.Random;

//基于第9题, 生成两个数组, 将数组的交集部分打印到控制台上.
public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random r = new Random();
        getArray(arr1);
        getArray(arr2);
        int[]  arr3=new int[10];
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (arr1[i]==arr2[i1]){
                    arr3[count]=arr1[i];
                    count++;
                    break;
                }
            }
        }
        System.out.println("数组一：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("数组二：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        if (count==0){
            System.out.println("无交集");
        }else{
            System.out.println("交集为:");
            for (int i = 0; i < count; i++) {
                System.out.print(arr3[i]+" ");
            }
        }
    }

    public static void getArray(int[] arr){
        Random r = new Random();
        int count=0;
        while (count!=arr.length){
            arr[count]=r.nextInt(100)+1;
            boolean flag=true;
            for (int i=0;i<count;i++){
                if(arr[count]==arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
    }
}
