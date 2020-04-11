package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student a = new Student("a");
        set.add(a);
        System.out.println(set);
        Student b = new Student("b");
        set.add(b);
        System.out.println(set);
        Iterator<Student> it = set.iterator();
        System.out.println(it.next());
    }
}
