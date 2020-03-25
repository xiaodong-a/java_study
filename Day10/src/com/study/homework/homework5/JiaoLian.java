package com.study.homework.homework5;

public class JiaoLian extends RenYuan{
    public JiaoLian(){
    }
    public JiaoLian(String id,String name,String gender,int age){
        super(id,name,gender,age);
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }
}
