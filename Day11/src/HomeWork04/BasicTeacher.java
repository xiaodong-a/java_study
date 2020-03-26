package HomeWork04;

public class BasicTeacher extends Teacher{
    public BasicTeacher() {
    }

    public BasicTeacher(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void teach(){
        System.out.println("基础班老师讲JavaSE");
    }
}
