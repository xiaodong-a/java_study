package HomeWork;

import java.util.HashSet;

//请按以下要求顺序编码：
//	定义一个可以存储“整数”的LinkedHashSet对象
//	存储以下整数
//		20,30,50,10,30,20
//	打印集合大小。为什么跟存入的数量不一致？
//	使用增强for遍历集合，打印大于25的元素
public class HomeWork07 {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(20);
        hset.add(30);
        hset.add(50);
        hset.add(10);
        hset.add(30);
        hset.add(20);
        System.out.println(hset.size());
        for (Integer integer : hset) {
            if (integer>25) System.out.println(integer);
        }
    }
}
