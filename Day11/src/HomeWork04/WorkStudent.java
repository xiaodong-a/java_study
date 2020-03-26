package HomeWork04;

public class WorkStudent extends Student implements English {
    public WorkStudent() {
    }

    public WorkStudent(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("就业班学生学习JavaEE, Hadoop, Hive, Scala, Flink, Spark等");
    }

    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
