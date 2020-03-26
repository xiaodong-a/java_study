package HomeWork04;

public class WorkTeacher extends Teacher implements English{
    public WorkTeacher() {
    }

    public WorkTeacher(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void teach(){
        System.out.println("就业班老师讲JavaEE, Hadoop, Hive, Scala, Flink, Spark等");
    }

    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
