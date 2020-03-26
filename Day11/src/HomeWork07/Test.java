package HomeWork07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final int NUM = 5;
        Student[] arr = new Student[NUM];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Student();
            System.out.println("输入第" + (i+1) + "位学生的名字");
            arr[i].setName(in.next());
            System.out.println("输入第" + (i+1) + "位学生的语文成绩(int型)");
            arr[i].setChinese(in.nextInt());
            System.out.println("输入第" + (i+1)+ "位学生的数学成绩(int型)");
            arr[i].setMath(in.nextInt());
            System.out.println("输入第" + (i+1) + "位学生的英语成绩(int型)");
            arr[i].setEnglish(in.nextInt());
        }

        System.out.println("需求一");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("姓名为%s的同学，语文成绩为%d分，数学成绩为%d分，英语成绩为%d分.\n",
                    arr[i].getName(),arr[i].getChinese(),arr[i].getMath(),arr[i].getEnglish());
        }
        System.out.println("需求二");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("姓名为%s的同学, 总分为: %d分.\n",
                    arr[i].getName(),arr[i].getChinese()+arr[i].getMath()+arr[i].getEnglish());
        }
        System.out.println("需求三");  //不考虑同分，取第一个最高分
        int indmax=0;
        int[] sum=new int[NUM];
        for (int i = 0; i < arr.length; i++) {
            sum[i]=arr[i].getChinese()+arr[i].getMath()+arr[i].getEnglish();
            if (sum[i]>sum[indmax]){
                indmax=i;
            }
        }
        System.out.printf("分数最高的学生是%s, 总分为%d分, 其中语文成绩为%d分, 数学成绩为%d分, 英语成绩为%d分..\n",
                arr[indmax].getName(),sum[indmax],arr[indmax].getChinese(),arr[indmax].getMath(),arr[indmax].getEnglish());
    }
}
