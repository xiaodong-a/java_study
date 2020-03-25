package com.study.test;

public class Zi extends FU{
    public Zi(){
        this(2);
        System.out.println("子类1");
    }
    public Zi(int n){
        super(n);
    }
}
