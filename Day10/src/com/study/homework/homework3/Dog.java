package com.study.homework.homework3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃肉");
    }

    public void lookHome(){
        System.out.println(getName()+"看家");
    }

}
