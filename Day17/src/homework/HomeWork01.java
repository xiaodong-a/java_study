package homework;

import java.lang.reflect.Array;
import java.util.*;

//1.请定义一个Collection类型的集合，存储以下字符串：
//		“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，
//		”Java架构师之路”
//	请编程实现以下功能：
// 使用迭代器遍历所有元素，并打印
// 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
// 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
// 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
//	(注意：以上功能写在一个main()方法中，但请单独实现)
public class HomeWork01 {
    public static void main(String[] args) {
         Collection<String>cl = new ArrayList<>();
         cl.add("JavaEE企业级开发指南");
         cl.add("Oracle高级编程");
         cl.add("MySQL从入门到精通");
         cl.add("Java架构师之路");

        Iterator it = cl.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator<String> it2 = cl.iterator();
        while (it2.hasNext()){
            String s = it2.next();
            if(s.length()<10)
                System.out.println(s);
        }

        Iterator<String> it3 = cl.iterator();
        while (it3.hasNext()){
            String s = it3.next();
            if(s.contains("Java"))
                System.out.println(s);
        }

        Iterator<String> it4 = cl.iterator();
        while (it4.hasNext()){
            String s = it4.next();
            if(s.contains("Oracle"))
                it4.remove();
        }
        System.out.println(cl);
    }
}
