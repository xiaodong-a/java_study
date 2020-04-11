package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

//随机10个不重复的1-100的整数存入集合, 分别使用ArrayList和HashSet集合实现.观察以下问题, 思考Set集合是否可以完成?
//  将元素的奇数放左边 ,偶数放右边.最后总结Set对比List集合的缺点在何处?
public class HomeWork08 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hset = new HashSet<>();
        ArrayList<Integer> alist = new ArrayList<>();
        while (alist.size()<10){
            Integer num = r.nextInt(100)+1;
            if (!alist.contains(num)){
                if (num%2==0){
                    alist.add(num);
                }else{
              //      alist.add(num);
             //       for(int i=alist.size()-1;i>0;i--){
              //          alist.set(i,alist.get(i-1));
              //      }
              //      alist.set(0,num);
                    alist.add(0,num);
                }
            }
        }
        System.out.println(alist);
    }
}
