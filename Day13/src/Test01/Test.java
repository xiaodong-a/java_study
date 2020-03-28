package Test01;

public class Test implements A,B{
    public static void method(){
        System.out.println("实现类中的静态方法");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method();
        A.method();
        B.method();
    }
}
