package HomeWork;

import java.util.Scanner;

//键盘录入5个字符串存入数组中.
//	将数组中的元素都变成大写并反转,然后拼接成一个字符串输出到控制台上
public class HomeWork06 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] str = new String[5];
        System.out.println("输入5个字符串");

    //获取输入
        for (int i = 0; i < str.length; i++) {
            System.out.println("输入第" + (i + 1) + "个字符串");
            str[i]=in.next();
        }

     //大写反转字符串并拼接
        StringBuilder  output = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            output.append(new StringBuilder(str[i].toUpperCase()).reverse());
        }
     //转成字符串
        String  os = output.toString();
        System.out.println(os);
    }
}
