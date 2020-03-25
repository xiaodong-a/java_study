package com.study.homework.homework6;

public class Test {
    public static void main(String[] args) {
        Manager ma1= new Manager("小王","123",15000,6000);
        ma1.work();
        Coder  cd=new Coder();
        cd.setId("135");
        cd.setName("小李");
        cd.setSalary(10000);
        cd.work();
    }
}
