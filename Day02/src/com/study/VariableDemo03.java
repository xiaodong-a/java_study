package com.study;

public class VariableDemo03 {
    public static void main(String[] args){
        //定义double类型的长方形，长和宽
        double length=20.2;
        double width =10.25;
        int perimeter = (int) (2*(length+width));
        int area      = (int) (length*width);
        System.out.println("长方形的长为:"+length+", 宽为:"+width);
        System.out.println("长方形的面积为:"+area+", 周长为:"+perimeter);
    }
}