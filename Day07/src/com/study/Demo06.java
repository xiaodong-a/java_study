package com.study;

import java.util.Random;

public class Demo06 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("利用随机数产生一个10大小的数组,元素范围0~99");
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100);
        }
        printArray(arr);
        System.out.println("数组的最大值为:"+getArrayMax(arr));
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  int getArrayMax(int[] arr){
        int max=arr[0];                       //好多都没考虑传空数组的情况，这个实际中一定要考虑
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
