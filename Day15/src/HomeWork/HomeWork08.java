package HomeWork;
//请在横线处补充代码,使得编码编译正确,运行代码可以在控制台上打印"helloworld"
interface A{
    void method();
}
public class HomeWork08 {
    public static void main(String[] args) {
        fun().method();
    }

    public static A fun(){
        return new A() {
            @Override
            public void method() {
                System.out.println("helloworld");
            }
        };
    }
}
