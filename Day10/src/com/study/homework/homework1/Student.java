package com.study.homework.homework1;

public class Student extends Person {
    public Student(){
    }
    public Student(int age,String name){
        super(age,name);
    }
    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getName()+"学生吃牛肉");
    }

    public void study(){
        System.out.println(super.getAge()+"岁的"+super.getName()+"学生要学习");
    }
}
