package HomeWork;

import java.util.Scanner;

//程序从控制台接收一个java文件的文件名，例如：test.java，TEST.java，tEst.JAVA，请编程实现以下功能：
//	获取，并打印文件名的第一个字符；
//	获取，并打印文件的后缀名(包括.符号)，例如：.java
//	无论原文件名什么样，最终将其转换为：Test.java的形式，打印转换后的文件名。
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个文件名：");
        String file = in.next();

        //不判断空输入了，或全空格输入了

        String file2=file.trim();
        System.out.println("文件名第一个字符");
        System.out.println(file2.charAt(0));

        int index = file2.lastIndexOf('.');
        System.out.println("文件后缀名");
        System.out.println(file2.substring(index));

        System.out.println("转化后的文件名");
        System.out.println(file2.substring(0,1).toUpperCase()+file2.substring(1).toLowerCase());
    }
}
