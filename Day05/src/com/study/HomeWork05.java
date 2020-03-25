package com.study;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        String[] arr2={"一","二","三","四","五","六"};
        System.out.println("输入六位评委的评分");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("输入第%s个评委的分数(整数):",arr2[i]);
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int sum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
            sum+=arr[i];
        }
        double score=(double)(sum-max-min)/(arr.length-2);
        System.out.println("选手的最终得分："+score);
    }
}
