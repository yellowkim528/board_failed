package com.kh.day9.excercise10.q8;

public class Main {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.m);   //2
        System.out.println(ab.n);   //4
        ab.method1();   //  B 클래스 instance method1
        ab.method2();   //  A 클래스 static method2
    }
}
