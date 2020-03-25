package com.study.homework.homework7;

public class PingPangCoach extends Coach{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"教如何发球");
    }

    @Override
    public void eat(String food) {
        System.out.println("乒乓球教练"+getName()+"吃"+food);
    }
}
