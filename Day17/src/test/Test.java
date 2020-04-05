package test;

public class Test {
    public static void main(String[] args) {
   /*     String a = "abcd";
        String b=a;
  //      a="abc";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(a);
        System.out.println(b);*/
   //method("aaa");
   //method("bbb");
        Integer a =10;
        int b = 10;
        System.out.println(a.equals(b));
    }
    public static <T> void method(T t){
        System.out.println("泛型");
    }
    public static void method(String a){
        System.out.println("非泛型");
    }
}
