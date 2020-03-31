package HomeWork;
//定义学生类,属性name和age
//	要求打印学生, 打印学生对象的属性
class Student{
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HomeWork08 {
    public static void main(String[] args) {
        Student  stu = new Student("小王",18);
        System.out.println(stu);
    }
}
