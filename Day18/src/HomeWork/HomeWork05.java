package HomeWork;

import java.util.HashSet;
import java.util.Iterator;

//请编写main()方法，按以下要求顺序,定义一个Set集合，并存储以下数据：
//	刘备，关羽，张飞，刘备，张飞
//	打印集合大小
//	使用迭代器遍历集合，并打印每个元素
//	使用增强for遍历集合，并打印每个元素
public class HomeWork05 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("刘备");
        hset.add("关羽");
        hset.add("张飞");
        hset.add("刘备");
        hset.add("张飞");

        System.out.println(hset.size());
        Iterator<String> itr = hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String s : hset) {
            System.out.println(s);
        }
    }
}
