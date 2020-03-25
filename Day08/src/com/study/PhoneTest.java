package com.study;

class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void call(String name){
        System.out.printf("给%s打电话\n",name);
    }

    public void sendMessage(String name){
        System.out.printf("给%s发短信\n",name);
    }
}
public class PhoneTest{
    public static void main(String[] args) {
        Phone phone1= new Phone();
        phone1.setPrice(1999);
        phone1.setColor("白色");
        phone1.setBrand("小米");
        Phone phone2= new Phone("华为",1699,"蓝色");
        System.out.printf("手机1的品牌是：%s,价格是:%5.1f,颜色是%s\n",phone1.getBrand(),phone1.getPrice(),phone1.getColor());
        System.out.printf("手机2的品牌是：%s,价格是:%5.1f,颜色是%s\n",phone2.getBrand(),phone2.getPrice(),phone2.getColor());
        phone1.call("张三");
        phone2.sendMessage("张三");

    }
}