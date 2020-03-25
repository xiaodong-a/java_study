package com.study.homework.homework3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃鱼");
    }

    public void catchMouse(){
        System.out.println(getName()+"抓老鼠");
    }
}
