package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
//	注意：要求验证生日日期必须早于当前日期
public class HomeWork02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("输入第一个生日(yyyy年MM月dd日)");
        Date bith1= input(sdf);
        System.out.println("输入第二个生日(yyyy年MM月dd日)");
        Date bith2= input(sdf);
        if (bith1.getTime()==bith2.getTime()){
            System.out.println("同一天生日");
        }else{
            System.out.printf("第一个人出生日期%s第二个\n",bith1.getTime()>bith2.getTime()? "晚于":"早于");
        }
    }

    public static boolean compare(Date date){
        return date.getTime()>new Date().getTime() ? false:true;
    }
    public static Date input(SimpleDateFormat sdf) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Date  date = sdf.parse(s);
        while (!compare(date)){
            System.out.println("生日日期必须早于当前日期\n请重新输入");
            s=in.next();
            date=sdf.parse(s);
        }
        return  date;
    }
}
