package com.study.homework.homework5;

public class YunDong extends RenYuan{
    private String clas;
    public YunDong(){
    }
    public YunDong(String id,String name,String gender,int age,String clas){
        super(id,name,gender,age);
        this.clas=clas;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}
