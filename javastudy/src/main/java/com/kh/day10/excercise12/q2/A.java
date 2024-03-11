package com.kh.day10.excercise12.q2;

abstract public class A {
    abstract void abc();
}

class B extends A{
    @Override
    public void abc() {
        System.out.println("안녕하세요");
    }

}

