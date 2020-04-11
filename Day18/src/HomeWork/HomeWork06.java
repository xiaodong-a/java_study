package HomeWork;

import java.util.HashSet;
import java.util.Objects;

//请按以下要求顺序编码：
//	定义学生类Student，属性：姓名、性别、年龄
//	定义测试类，及main()方法
//	定义一个存储Student类型的HashSet集合
//	创建以下三个Student对象
//		张三,男,20
//		李四,女,21
//		张三,男,20
//	将上述三个对象存储到Set集合中
//	使用增强for遍历集合，获取每个Student对象，并打印属性值；
//	请实现集合中不能存储姓名年龄相同的元素
class Student{
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }
}
public class HomeWork06 {
    public static void main(String[] args) {
        HashSet<Student> hset = new HashSet<>();
        hset.add(new Student("张三","男",20));
        hset.add(new Student("李四","女",21));
        hset.add(new Student("张三","男",20));
        for (Student student : hset) {
            System.out.println(student);
        }
    }
}
