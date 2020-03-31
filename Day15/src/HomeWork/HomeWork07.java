package HomeWork;

import java.util.Scanner;

//键盘录入一行数字字符串, 每个数字之间,用","隔开, 请求出这些数字的平均值
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("录入一行数字字符串, 每个数字之间,用\",\"隔开");

        String[] input = in.next().split(",");

        double  sum=0;
        int count=0;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("")){
                sum+=Double.parseDouble(input[i]);
                count++;
            }
        }

        if (count!=0) {
            System.out.println("数字平均值为：" + sum / count);
        }else{
            System.out.println("无数字");
        }
    }

}
