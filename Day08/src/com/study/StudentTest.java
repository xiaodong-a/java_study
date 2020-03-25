package com.study;

class Student{
    private String name;
    private int age;
    private String content;

    public Student() {
    }

    public Student(String name, int age, String content) {
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
        System.out.printf("年龄为%d的%s同学正在吃饭\n",this.age,this.name);
    }
//的听着面向对象的知识
    public  void study(){
        System.out.printf("年龄为%d的%s同学正在专心致志的听着%s的知识\n",this.age,this.name,this.content);
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student  stu =new Student("小奇",23,"面向对象");
        stu.eat();
        stu.study();
    }
}
