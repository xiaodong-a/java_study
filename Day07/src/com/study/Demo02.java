package com.study;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入第一个整数:");
        int num1=in.nextInt();
        System.out.println("输入第二个整数");
        int num2=in.nextInt();
        System.out.printf("getSum(%d,%d)返回%d",num1,num2,getSum(num1,num2));
    }
    public static  int getSum(int a,int b){
        return a+b;
    }
}
