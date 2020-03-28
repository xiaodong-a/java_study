package Test03;

public class Test {
    int a=1;
    public void method(Test test){
        System.out.println(test.a);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method(test);
    }
}
