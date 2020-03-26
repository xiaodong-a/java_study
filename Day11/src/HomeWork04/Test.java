package HomeWork04;

public class Test {
    public static void main(String[] args) {
        BasicStudent basicstu = new BasicStudent(20,"小a");
        basicstu.study();
        basicstu.eat();
        System.out.println();

        WorkStudent workstu = new WorkStudent(21,"小b");
        workstu.study();
        workstu.eat();
        workstu.studyEnglish();
        System.out.println();

        BasicTeacher basicth = new BasicTeacher(30,"大A",20000);
        basicth.eat();
        basicth.teach();
        System.out.println();

        WorkTeacher workth = new WorkTeacher(31,"大B",30000);
        workth.eat();
        workth.teach();
        workth.studyEnglish();
    }
}
