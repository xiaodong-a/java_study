package HomeWork;

import java.util.Scanner;

//键盘录入5个字符串存入数组中.
//	将数组中,字符串长度<3 的字符串挑出来存入新数组中,最后将新数组中的元素打印到控制台
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("输入5个字符串");

        //获取输入
        for (int i = 0; i < str.length; i++) {
            System.out.println("输入第"+(i+1)+"个字符串");
            str[i]=in.next();
        }
        //输入和判断分开
        String[]  out = new String[5];
        int count=0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()<3){
                out[count]=str[i];
                count++;
            }
        }

        //输出小于3的元素
        System.out.println("数组中,字符串长度<3 的字符串为：");
        for (int i = 0; i < count; i++) {
            System.out.println(out[i]);
        }

    }
}
