package com.study;

// xdwang ;The first day of learning java
class Person{
    static String name;
    static int age;
    static char gender;
    static String occupation;
    static String address;
}

public class Day01 {
    public void helloWorld() {
        System.out.println("Hello World!");
    }

    public void demo01() {
        System.out.println(11);
        System.out.println(22);
        System.out.println(5.21);
        System.out.println(13.14);
        System.out.println('A');
        System.out.println('B');
        System.out.println(true);
        System.out.println(false);
        System.out.println("欢迎来到黑马程序员");
    }

    public void demo02() {
        System.out.println("好好学习~\n天天向上~\n键盘敲烂，月薪过万~~");
    }

    public void demo03() {
        int    nline = 4;
        String str = "";
        for (;nline>0;nline--) {
            str += "*" ;
            System.out.println(str);
        }
    }

    public void demo04() {
        System.out.println("{@}\n/|\\\n|");
    }

    public void demo05() {
        int    nline = 4;
        for(int n=1;n<2*nline;n++) {
            System.out.println(demo05Space(abs(n-nline)+1)+demo05Asterisk(2*(nline-abs(n-nline))-1));
        }
    }

    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public String demo05Asterisk(int n) {
        char str[] = new char[n];
        for (int i=0;i<n;i++){
            str[i] = ' ';
        }
        str[0]='*';
        str[n-1]='*';
        return (new String(str));
    }

    public String demo05Space(int n) {
        char str[] = new char[n];
        for (int i = 0; i < n; i++) {
            str[i] = ' ';
        }
        return (new String(str));
    }

    public void demo06() {
        Person wangyang = new Person();
        wangyang.name = "王洋";
        wangyang.age  = 22 ;
        wangyang.gender = '男';
        wangyang.occupation = "学生";
        wangyang.address = "北京市昌平区北七家镇宏福科技园修正大厦";
        printInfor(wangyang);
    }

    public void printInfor(Person p){
        System.out.println("姓名： "+p.name);
        System.out.println("年龄： "+p.age);
        System.out.println("性别： "+p.gender);
        System.out.println("职业： "+p.occupation);
        System.out.println("地址： "+p.address);
    }

    public void variableDemo01(){
        byte   b = 10;
        short  i = 20;
        int    s = 30;
        long   l = 40L;
        float  f = 50.5F;
        double d = 60.6;
        boolean bb = true;
        char   c = 'w';
        System.out.println("byte   :  "+b);
        System.out.println("int    :  "+i);
        System.out.println("short  :  "+s);
        System.out.println("long   :  "+l);
        System.out.println("float  :  "+f);
        System.out.println("double :  "+d);
        System.out.println("boolean:  "+bb);
        System.out.println("char   :  "+c);
    }

    public void variableDemo02() {
        Person yunya = new Person();
        yunya.name = "云崖";
        yunya.age = 22;
        yunya.gender = '男';
        yunya.occupation = "学生";
        yunya.address = "北京市昌平区北七家镇宏福科技园修正大厦";
        printInfor(yunya);
    }

    public void showZuoye(int n){
        switch (n) {
            case  1:
                helloWorld();break;
            case  2:
                demo01();break;
            case  3:
                demo02();break;
            case  4:
                demo03();break;
            case  5:
                demo04();break;
            case  6:
                demo05();break;
            case  7:
                demo06();break;
            case  8:
                variableDemo01();break;
            case  9:
                variableDemo02();break;
            default:
                System.out.println("没有匹配的作业");
        }
    }
    public static void main(String[] arg){
        Day01 day01 = new Day01();
        for(int nn = 1; nn<10;nn++){
            System.out.println("--------------------------------------------");
            System.out.println("第"+nn+"题");
            day01.showZuoye(nn);
            System.out.println("--------------------------------------------");
        }
    }
}