package HomeWork;

import java.util.Scanner;

//请定义main()方法，在main()中按以下顺序要求编写代码：
//	分别从控制台接收两个整数
//	计算“第一个数 / 第二个数”的结果，并打印；
//	为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入第一个数");
        int num1= in.nextInt();
        System.out.println("输入第二个数");
        int num2= in.nextInt();

        try {
            System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("第二个数不能为零");
        }
    }
}
