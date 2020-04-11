package HomeWork;

import java.util.HashMap;

//	String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
//	请编程统计每个字符出现的次数
public class HomeWork02 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (hashmap.containsKey(c)){
                hashmap.put(c,hashmap.get(c)+1);
            }else{
                hashmap.put(c,1);
            }
        }
        System.out.println(hashmap);
    }
}
