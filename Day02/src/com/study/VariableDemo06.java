package com.study;

import java.util.Scanner;
public class VariableDemo06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("输入父亲身高（cm)：");
        float father_h = in.nextFloat();
        System.out.print("输入母亲身高（cm)：");
        float mother_h = in.nextFloat();
        float son_h = (father_h+mother_h)*1.08F/2;
        float dau_h = (father_h*0.923F+mother_h)/2;
        System.out.println("儿子身高："+son_h+"cm，女儿身高："+dau_h+"cm");
    }
}
