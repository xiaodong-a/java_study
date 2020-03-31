package test02;

public class Test02 {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = "abc";
        String c = "abc";
        String d = new String("ab");
        String e = new String ("c");
        String f=d+e;
        String g="a"+"bc";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(f.hashCode());
        System.out.println(g.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(f));
        System.out.println(System.identityHashCode(g));
        /*
        500977346
        20132171
        20132171
        186370029
        20132171
        */
    }
}
