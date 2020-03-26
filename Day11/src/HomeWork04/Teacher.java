package HomeWork04;

public abstract class Teacher extends Person{
    private double salary;
    public Teacher() {
    }

    public Teacher(int age, String name, double salary) {
        super(age, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getName()+"老师喝牛肉汤");
    }

    public abstract void teach();
}
