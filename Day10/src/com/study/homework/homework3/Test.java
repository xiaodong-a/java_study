package com.study.homework.homework3;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("tom", 4);
        cat.eat();
        cat.run();
        cat.catchMouse();

        Dog dog = new Dog("jerry", 5);
        dog.eat();
        dog.run();
        dog.lookHome();
    }
}
