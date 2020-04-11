package Test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        String h = "bacagaffdvad" ;
        System.out.println(Integer.toBinaryString(h.hashCode()));
        System.out.println(Integer.toBinaryString(h.hashCode()>>>16));
        int hh;
        System.out.println(Integer.toBinaryString((hh = h.hashCode()) ^ (hh >>> 16)));

        System.out.println(h.hashCode());
        System.out.println(h.hashCode()>>>16);
        System.out.println((hh = h.hashCode()) ^ (hh >>> 16));
        HashSet ll=new HashSet();
        ll.iterator();
    }
}
