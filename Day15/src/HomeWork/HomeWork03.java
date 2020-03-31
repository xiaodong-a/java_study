package HomeWork;

import java.text.SimpleDateFormat;
import java.util.Date;
//请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
public class HomeWork03 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s = sdf.format(date);
        System.out.println(s);
    }
}
