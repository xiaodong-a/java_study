package HomeWork;

import java.util.Scanner;

//	键盘录入5个字符串存入数组中.
//	将数组中包含数字的元素打印到控制台上
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("输入5个字符串");

        //获取输入
        for (int i = 0; i < str.length; i++) {
            System.out.println("输入第" + (i + 1) + "个字符串");
            str[i]=in.next();
        }

        //输入和判断分开，因为不一定所有的输入都是这样循环输入
        System.out.println("其中包含数字的元素为：");
        for (int i = 0; i < str.length; i++) {
            for (int j=0;j<str[i].length();j++){
                if ('0'<=str[i].charAt(j)&&str[i].charAt(j)<='9'){
                    System.out.println(str[i]);
                    break;
                }
            }
        }
    }
}
