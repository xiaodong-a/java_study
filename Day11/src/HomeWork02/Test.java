package HomeWork02;

public class Test {
    public static void main(String[] args) {
        JavaTeacher  javath=new JavaTeacher("小王","男",23);
        System.out.println(javath.getName());
        System.out.println(javath.getGender());
        System.out.println(javath.getAge());
        UiTeacher   uith =new UiTeacher("小李","女",22);
        System.out.println(uith.getName());
        System.out.println(uith.getGender());
        System.out.println(uith.getAge());
        uith.plot();
    }
}
