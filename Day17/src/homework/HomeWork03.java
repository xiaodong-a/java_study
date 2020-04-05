package homework;

import java.util.*;

// 键盘录入若干的数字存入集合中, 直到录入 -1 结束,完成以下需求
//    (1)求集合中最大值
//	(2)求集合中元素和
//	(3)将集合中偶数元素变成的二倍
//	(4)删除集合所有奇数的元素
//	(注意,单独解决每一个需求)
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> db = new ArrayList<>();
        while(true){
            System.out.println("输入数字（-1）停止");
            Double num = in.nextDouble();
            if (num==-1){
                break;
            }
            db.add(num);
        }
        System.out.println(db);


        if(db.size()!=0){ // 必有一个值
            Iterator<Double> it = db.iterator();
             double max = it.next();
            while (it.hasNext()){
                Double next=it.next();
                if (next>max)
                    max=next;
            }
            System.out.println("最大值："+max);
        }


        if(db.size()!=0){
            Iterator<Double> it = db.iterator();
            Double sum=0d;
            while (it.hasNext()){
                Double next=it.next();
                sum+=next;
            }
            System.out.println("元素和："+sum);
        }

        if(db.size()!=0){
            for (int i = 0; i < db.size(); i++) {
                if (db.get(i)%2==0)
                    db.set(i,db.get(i)*2);
            }
            System.out.println(db);
        }

        if(db.size()!=0){
            for (int i = 0; i < db.size(); i++) {
                if (db.get(i)%2==1) {
                    db.remove(i);
                    i--;
                }
            }
            System.out.println(db);
        }

    }
}
