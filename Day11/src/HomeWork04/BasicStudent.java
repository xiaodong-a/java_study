package HomeWork04;

public class BasicStudent extends Student{
    public BasicStudent() {
    }

    public BasicStudent(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("基础班学生学习JavaSE");
    }
}
