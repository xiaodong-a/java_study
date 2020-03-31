package test01;
//静态代码区中声明变量会如何
//好像不能声明静态变量。
public class Test {
    static {
        System.out.println("静态");
  //      static int a=1;
    }
    public void show(){
 //       a=a+1;
  //      System.out.println(a);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
}
