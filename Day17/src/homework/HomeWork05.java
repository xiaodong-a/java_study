package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.zip.CheckedOutputStream;

//随机生成10个不重复的数组放入集合, 实现奇数放左边,偶数放右边
public class HomeWork05 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> ls = new LinkedList<>();
        int count=0;
        while(count<10){
            int num = random.nextInt(100);    //0-99间的随机整数
            if (!ls.contains(num)){
                count++;
                if (num%2==1){
                    ls.addFirst(num);
                }else{
                    ls.addLast(num);
                }
            }
        }
        System.out.println(ls);
    }
}
