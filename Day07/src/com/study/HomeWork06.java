package com.study;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入行数：");
        int m =in.nextInt();
        System.out.println("输入列数：");
        int n =in.nextInt();
        printAt(m,n);
    }
    public static void printAt(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
