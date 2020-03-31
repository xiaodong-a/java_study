package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，程序将其转换为：xxxx年xx月xx日的格式输出到控制台。
public class HomeWork04 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入一个日期(yyyy-MM-dd)");
        String s1 = in.next();
        Date date = sdf1.parse(s1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String s2 = sdf2.format(date);
        System.out.println(s2);
    }
}
