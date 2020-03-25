package com.study.homework.homework7;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getName()+"学习如何运球和投篮");
    }

    @Override
    public void eat(String food) {
        System.out.println("篮球运动员"+getName()+"吃"+food);
    }
}
