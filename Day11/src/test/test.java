package test;

public class test {
    public static void main(String[] args) {
        Person.age=23;
        Person person =new Person();
        System.out.println(person.age);
        person.methood();
    }
}
