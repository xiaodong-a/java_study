package com.study;

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int num=in.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        System.out.println("最小索引值:"+index);
    }
}