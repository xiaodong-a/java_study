package com.study;

import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个大于零的小数：");
        double i =in.nextDouble();
        System.out.println(round(i));
    }

    public  static int round(double m){
        return (int) (m+0.5);
    }
}
