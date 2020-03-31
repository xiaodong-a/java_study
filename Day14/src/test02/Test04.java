package test02;

public class Test04 {
    public static void main(String[] args) {
        int[] i = {1,2,3};
        System.out.println(i);
        System.out.println(System.identityHashCode(i));
        i[0]=3;
        System.out.println(i);
        System.out.println(System.identityHashCode(i));
    }
}
