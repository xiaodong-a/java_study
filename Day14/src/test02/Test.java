package test02;

public class Test {
    public static void main(String[] args) {
        int[] a = {1,12,23,23,121};
       // String s ="["; 地址不同
        String s = new String("[");
        String s2 = "[";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s2));
        s+=a[0];
        s2+=a[0];
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s2));
    }
}
