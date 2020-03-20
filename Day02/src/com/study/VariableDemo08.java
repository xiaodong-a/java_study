package com.study;

import java.util.Scanner;
public class VariableDemo08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("输入张浩的Java成绩（整数）：");
        int zh_java = in.nextInt();
        System.out.print("输入张浩的SQL成绩（整数）：");
        int zh_sql = in.nextInt();
        System.out.print("输入张浩的Web成绩（整数）：");
        int zh_web = in.nextInt();
        int diff=zh_java-zh_sql;
        System.out.println("Java课程和SQL课程分数之差是："+diff+"\n三门课的平均分(取整)是："+(zh_java+zh_web+zh_sql)/3);
    }
}
