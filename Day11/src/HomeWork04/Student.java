package HomeWork04;

public abstract class Student extends Person {
    public Student(){
    }
    public Student(int age,String name){
        super(age,name);
    }
    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getName()+"学生吃牛肉");
    }

    public abstract void study();
}
