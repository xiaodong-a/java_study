package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//键盘录入若干的字符串存入集合中,直到录入"over"结束, 请完成以下需求
//	(1)将集合中所有元素变成大写
//	(2)将集合以"张"开头的元素打印出来
//	(3)将元素所有"A"变成"B",最后展示数据元素
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        while (true) {
            System.out.println("输入字符串，输入over结束");
            String num = in.next();
            if (num.equals("over")) {
                break;
            }
            str.add(num);
        }
        System.out.println("录入的字符串集合为");
        System.out.println(str);

        for (int i = 0; i < str.size(); i++) {
            str.set(i, str.get(i).toUpperCase());
        }
        System.out.println("集合中所有元素大写");
        System.out.println(str);

        System.out.println("输出”张“开头的元素");
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).charAt(0) == '张') {
                System.out.println(str.get(i));
            }
        }

        System.out.println("将元素所有\"A\"变成\"B\",最后展示数据元素");
        for (int i = 0; i < str.size(); i++) {
            str.set(i, str.get(i).replace('A', 'B'));
        }
        System.out.println(str);
    }
}
