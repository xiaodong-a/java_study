package com.study.homework.homework7;

import javax.sound.midi.Soundbank;

public class PingPangPlayer extends Player {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getName()+"学习如何发球");
    }

    @Override
    public void eat(String food) {
        System.out.println("乒乓球运动员"+getName()+"吃"+food);
    }
}
