package test02;

public class Test03 {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "123";
        System.out.println(System.identityHashCode(s));
        s="123";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s));
    }
}
