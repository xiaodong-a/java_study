package HomeWork01_3_5;

import Test01.A;

public class Tes {
    public static void main(String[] args){
        fun(new Impi());//请用子类的形式调用
        fun(new Animal() {
            @Override
            public void show() {
                System.out.println("匿名内部类的形式调用");
            }
        });//请用匿名内部类的形式调用
    }
    public static void fun(Animal a ){
        a.show();
    }
}
