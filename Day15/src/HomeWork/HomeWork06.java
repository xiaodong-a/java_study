package HomeWork;

import java.util.Scanner;

//程序从控制台一次性接收一个学员信息，要求程序必须能正确处理以下几种格式的数据：
//		“张三,20,男”
//	编程：
//	定义学员类，可以存储上述数据(姓名String，年龄int，性别char)
//	定义测试类，创建一个学员对象，从控制台接收一名学员信息，并能正确解析，并将数据存储到学员对象中，最后打印这个学员对象的所有属性的值。
class Student{
    private String name;
    private int age;
    private char gender;

    public Student() {}

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public char getGender() {return gender;}
    public void setGender(char gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
public class HomeWork06 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner in = new Scanner(System.in);

        System.out.println("输入一名学员(姓名，年龄，性别)");
        String[] infor = in.next().split(",");

        student.setName(infor[0]);
        student.setAge(Integer.parseInt(infor[1]));
        student.setGender(infor[2].charAt(0));

        System.out.println(student);
    }
}
