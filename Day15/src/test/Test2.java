package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("录入一行数字字符串, 每个数字之间,用\",\"隔开");

        String[] input = in.next().split(",");
        System.out.println(input[2]); //"空的  1,2,,3"
        System.out.println(Double.parseDouble(input[0]));
        System.out.println(Double.parseDouble(input[2]));
    }
}
