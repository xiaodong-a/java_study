package com.study.homework.homework2;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(){
    }
    public Manager(String name,String id,double salary,double bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }
    @Override
    public void work() {
        System.out.printf("薪水%5.1f,奖金%5.1f,工号%s的经理%s要做经理的工作\n",getSalary(),bonus,getId(),getName());
    }
}
