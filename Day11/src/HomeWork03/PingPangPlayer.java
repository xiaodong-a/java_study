package HomeWork03;

import javax.sound.midi.Soundbank;

public class PingPangPlayer extends Player implements English{
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

    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
