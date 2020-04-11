package HomeWork;

import java.util.ArrayList;
import java.util.HashSet;

//3.ArrayList有以下元素: "a","f","b","c","a","d"，请用任意方式完成集合元素去重。去除集合中重复的元素。
public class HomeWork03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");

        HashSet<String> hset = new HashSet<>(list);
        System.out.println(hset);
    }
}
