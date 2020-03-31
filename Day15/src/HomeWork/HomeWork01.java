package HomeWork;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//	请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
//	注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
public class HomeWork01 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        long t1=0;
        long t2=0;

        while (t1<=t2) {
            System.out.println("输入生日(yyyy-MM-dd)");
            String birth = in.next();
            t1 = date.getTime();
            t2 = sdf.parse(birth).getTime();
            if (t1<=t2){
                System.out.println("生日必须早于当前日期！");
            }
        }
        System.out.printf("来到世界%d天\n",(t1-t2)/(1000*24*60*60));
    }
}
