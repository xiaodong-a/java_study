package HomeWork;

import java.util.Scanner;

// 请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
//	判断此文件名是否以“.java”结尾，并打印结果
//	获取此文件中.符号的索引位置，并打印结果
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个java文件：");
        String file = in.next();

        //判断是否以.java结尾
        if (file.endsWith(".java")) {
            System.out.println("以.java结尾");
        } else {
            System.out.println("不以.java结尾");
        }

        //输出所有.出现的索引
        if (file.contains(".")){
            System.out.println(file+"中.出现的索引位置为:");
            for (int i =0;i<file.length();i++){
                 if (file.charAt(i)=='.') System.out.println(i);
            }
        }else{
            System.out.println(file+"中无符号.");
        }
    }
}
