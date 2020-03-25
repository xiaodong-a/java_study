package com.study.homework.homework2;

public class Test {
    public static void main(String[] args) {
        Manager mger=new Manager("张三","123221",20000,5000);
        mger.eat();
        mger.sleep();
        mger.work();
        Coder code=new Coder("李四","224323",10000);
        code.eat();
        code.sleep();
        code.work();
    }
}
