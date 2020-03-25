package com.study;

class Teacher{
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getContent() {
        return content;
    }

    public  void eat(){
        System.out.printf("年龄为%d的%s老师正在吃饭\n",this.age,this.name);
    }

    public  void teach(){
        System.out.printf("年龄为%d的%s老师正在亢奋的讲着%s的知识\n",this.age,this.name,this.content);
    }
}
public class TeacherTest {
    public static void main(String[] args) {
        Teacher th1 = new Teacher("刘立", 23, "java基础中面向对象");
        th1.eat();
        th1.teach();
    }
}
