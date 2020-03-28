package Test02;

public class Test implements B ,A{
    public void method(){
        System.out.println("111");
        A.super.method();
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.method();
    }
}
