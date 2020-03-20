package com.study;

import java.util.Scanner;
public class VariableDemo04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("输入大于99的整数：");
        //输入整数
        int number = in.nextInt();
        //计算数字的长度,方便后面用不同方式求数字的个十百位
        int ll = (number+"").length();
        //第一种方法，取余；个位
        //第二种方法，转成字符串取代码单元；十位
        //第三种方法，转成字符串取代码点，然后把代码点转成字符；百位
        //数字编码的代码点和代码单元个数相同，不用考虑两个代码单元编码一个字符的情况
        System.out.println(number+"的个位是："+number%10+",十位是："+Integer.toString(number).charAt(ll-2)
                +",百位是："+Character.toString(String.valueOf(number).codePointAt(ll-3)));
    }
}
