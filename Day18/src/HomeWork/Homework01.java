package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1.请按以下要求顺序编码：
// 定义一个：键Integer，值String类型的HashMap集合
// 存储以下数据：
//	1，"张三"
//	2，"李四"
//	1，"王五"
// (1)打印集合大小；
// (2)使用“键找值”的方式遍历集合，打印键和值；
// (3)使用“键值对”的方式遍历集合，打印键和值；
// (4)获取键为1的值，并打印
// (5)获取键为10的值，并打印
// (6)判断集合中是否有键：10
// (7)删除键为1的键值对，删除完毕打印集合
public class Homework01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"张三");
        hashmap.put(2,"李四");
        hashmap.put(1,"王五");
        System.out.println(hashmap.size());
        Set<Integer> set = hashmap.keySet();
        for (Integer integer : set) {
            System.out.println(integer+":"+hashmap.get(integer));
        }
        Set<Map.Entry<Integer,String>> entries = hashmap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        hashmap.get(1);
        hashmap.get(10);
        hashmap.containsKey(10);
        hashmap.remove(1);
        System.out.println(hashmap);

    }
}
