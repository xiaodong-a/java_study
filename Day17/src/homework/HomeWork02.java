package homework;

import java.util.ArrayList;
import java.util.Collection;

//2.题目
//	请定义一个Collection类型的集合，存储以下分数信息：
//		88.5,39.2,77.1,56.8,89,99,59.5
//	请编程实现以下功能：
// 使用增强for遍历所有元素，并打印
// 使用增强for遍历所有元素，打印不及格的分数；
// 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
// 使用增强for遍历所有元素，求出最高分，并打印；
//	(注意：以上所有功能写在一个main()方法中，但请单独实现)
public class HomeWork02 {
    public static void main(String[] args) {
        Collection<Double> cl = new ArrayList<>();
        cl.add(88.5);
        cl.add(39.2);
        cl.add(77.1);
        cl.add(56.8);
        cl.add(89d);
        cl.add(99d);
        cl.add(59.5);

        for (Double aDouble : cl) {
            System.out.println(aDouble);
        }

        for (Double aDouble : cl) {
            if (aDouble<60d)
                System.out.println(aDouble);
        }

        int count=0;
        double sum=0;
        for (Double aDouble : cl) {
            if (aDouble<60d)
                count++;
            sum+=aDouble;
        }
        System.out.println("不及格人数"+count);
        System.out.println("平均分"+sum/cl.size());

        double max=-1d;
        for (Double aDouble : cl) {
            if (aDouble>max)
                max=aDouble;
        }
        System.out.println("最高分"+max);

    }
}
