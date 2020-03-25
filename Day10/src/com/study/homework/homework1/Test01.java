package com.study.homework.homework1;

public class Test01 {
    public static void main(String[] args) {
        Student  stu = new Student(23,"王晓东");
        stu.eat();
        stu.study();
        Teacher   th = new Teacher(18,"梅军建");
        th.eat();
        th.teach();
    }
}
