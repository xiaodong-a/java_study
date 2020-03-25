package com.study.homework.homework1;

public class Teacher extends Person{
    public Teacher(){
    }
    public Teacher(int age,String name){
        super(age,name);
    }
    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getName()+"老师喝牛肉汤");
    }

    public void teach(){
        System.out.println(super.getAge()+"岁的"+super.getName()+"老师要讲课");
    }
}
