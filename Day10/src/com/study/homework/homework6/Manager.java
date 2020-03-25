package com.study.homework.homework6;

public class Manager {
    private String name;
    private String id;
    private double salary;
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public  void work(){
        System.out.printf("工号为%s基本工资为%5.0f奖金为%5.0f的项目经理正在努力的做着管理工作," +
                "分配任务,检查员工提交上来的代码.....\n",id,salary,bonus);
    }
}
