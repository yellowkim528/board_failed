package com.kh.day10.exam3;

public class B implements A {

    @Override
    public void method1() {
        System.out.println("B.method1");
    }

    @Override
    public void method2() {
        A.super.method2();
        System.out.println("B.method2");
    }
}
