package com.study;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("调用三次printHelloWorld");
        for(int i=0;i<3;i++){
            printHelloWorld();
        }
        System.out.println("传参输出HelloWorld");
        printHelloWorld2(3);
    }
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void printHelloWorld2(int n){
        for(int i=0;i<n;i++) {
            System.out.println("Hello World");
        }
    }
}
