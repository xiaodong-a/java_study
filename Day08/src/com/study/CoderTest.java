package com.study;

class Coder{
    private String name;
    private int id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.printf("工号为：%d，基本工资为%s的程序员%s正在努力的写着代码\n",this.id,this.salary,this.name);
    }
}
public class CoderTest {
    public static void main(String[] args) {
        Coder  coder1=new Coder();
        coder1.setId(222);
        coder1.setName("张三");
        coder1.setSalary(10000);
        System.out.print("set方法: ");
        coder1.work();
        Coder coder2=new Coder("王五",333,15000);
        System.out.print("构造方法:");
        coder2.work();
    }
}
