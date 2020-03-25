package com.study;

import java.util.GregorianCalendar;

class GirlFriend{
    private String name;
    private double height;
    private double weight;

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public GirlFriend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void wash(){
        System.out.printf("%s帮我洗衣服\n",this.name);
    }
    public void cook(){
        System.out.printf("%s帮我做饭\n",this.name);
    }
    public void show(){
        System.out.printf("我女朋友叫%s,身高%3.1f厘米,体重%3.1f斤\n",this.name,this.height,this.weight);
    }
}
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend  gf=new GirlFriend("rxy",160,88);
        gf.show();
        gf.wash();
        gf.cook();
    }
}
