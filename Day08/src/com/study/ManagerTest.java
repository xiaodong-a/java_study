package com.study;

class Manager{
    private String name;
    private  int id;
    private  int salary;
    private  int bonus;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.printf("奖金为%d的项目经理%s正在努力的做着管理工作,分配任务,检查员工提交上来的代码\n",this.bonus,this.name);
    }
}
public class ManagerTest {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setName("张三");
        manager1.setId(123);
        manager1.setSalary(15000);
        manager1.setBonus(6000);
        manager1.work();
        Manager manager2 =new Manager("王五",666,20000,1000);
        manager2.work();
    }
}