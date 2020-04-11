package HomeWork;

import java.util.HashSet;
import java.util.Random;

//双色球规则，双色球每注投注号码由6个1―33的号码和1个1―16的号码组成。其中6个1-33的数字要求不能重复。请随机生成一注双色球号码
public class HomeWork04 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer>  hset = new HashSet<>();
        while (hset.size()<6){
            hset.add(r.nextInt(33)+1);
        }
        int num = r.nextInt(16)+1;
        System.out.println(hset);
        System.out.println(num);
    }
}
