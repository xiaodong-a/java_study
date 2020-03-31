package Test04;

public class Lei {
    private  int age=10;
    static class Inner{
        public int number=10;
        public void method(){
     //       System.out.println(age);非静态不能访问
        }
    }
}
