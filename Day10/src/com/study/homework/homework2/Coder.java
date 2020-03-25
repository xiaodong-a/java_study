package com.study.homework.homework2;

public class Coder extends Employee{
    public Coder(){
    }
    public Coder(String name,String id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work() {
        System.out.printf("薪水%5.1f,无奖金,工号%s的程序员%s要做写代码\n",getSalary(),getId(),getName());
    }
}
