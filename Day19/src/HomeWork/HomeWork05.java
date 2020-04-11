package HomeWork;

import java.util.Scanner;

//请按以下步骤要求编写代码：
//	定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
//	定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
//	定义一个Student类，属性：姓名、性别、年龄。
//	在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
//	在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
//	编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。
class Student{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws SexException {
        if (sex.equals("男")||sex.equals("女")){
            this.sex = name;
        }else{
            throw new SexException("性别异常");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age>15 && age<50) {
            this.age = age;
        }else{
            throw new AgeException("年龄异常");
        }
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, String sex, int age) throws AgeException, SexException {
        this.name = name;
        this.sex = sex;
        if (age>15 && age<50) {
            this.age = age;
        }else{
            throw new AgeException("年龄异常");
        }
        if (sex.equals("男")||sex.equals("女")){
            this.sex = name;
        }else{
            throw new SexException("性别异常");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
class SexException extends  Exception{
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }

    public SexException(String message, Throwable cause) {
        super(message, cause);
    }

    public SexException(Throwable cause) {
        super(cause);
    }

    public SexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class AgeException extends Exception{
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeException(Throwable cause) {
        super(cause);
    }

    public AgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
public class HomeWork05 {
    public static void main(String[] args) throws SexException {
        Student stu = new Student();
     //   Scanner in = new Scanner(System.in);
      //  String str = in.next();
            stu.setSex("1");
            System.out.println(stu);
    }
}
