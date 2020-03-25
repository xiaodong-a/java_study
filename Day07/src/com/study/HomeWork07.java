package com.study;

import java.util.Scanner;

//乘法表
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个整数[1-9]：");
        int m =in.nextInt();
        printTable(m);
    }

    public  static  void printTable(int n){
        System.out.println("乘法表");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d*%d=%2d  ",j,i,j*i); //注意后面有两位数，格式可能对不齐
            }
            System.out.println();
        }
    }
}
