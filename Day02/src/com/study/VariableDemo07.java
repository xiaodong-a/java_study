package com.study;

import java.util.Scanner;
public class VariableDemo07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("输入一个整数：");
        int number = in.nextInt();
        String result = number%2 == 0? "偶数":"奇数";
        System.out.println(number+"是"+result);
    }
}
