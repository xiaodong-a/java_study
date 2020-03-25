package com.study;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.printf("输入第%d个整数:",i+1);
            arr[i]=in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和为："+sum);
    }
}
