package com.kh.day9.excercise10.q8;

class A {
    int m = 2;
    static int n = 4;

    void method1() {
        System.out.println("A 클래스 instance method1");
    }

    static void method2() {
        System.out.println("A 클래스 static method2");
    }
}

class B extends A {
    int m = 6;
    static int n = 8;

    void method1() {
        System.out.println("B 클래스 instance method1");
    }

    static void method2() {
        System.out.println("B 클래스 static method2");
    }
}

