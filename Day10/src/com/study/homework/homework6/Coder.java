package com.study.homework.homework6;

public class Coder {
    private String name;
    private String id;
    private double salary;

    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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
    public void work(){
        System.out.printf("工号为%s基本工资为%5.0f的程序员"+
                "正在努力的写着代码......\n",id,salary);
    }
}
