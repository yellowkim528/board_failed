package com.kh.Day8.modifier.st.exam2;

public class Person {
    String name;
    int age;
    static Car car;

    void smile() {
        System.out.println("웃다");
    }
    void eat() {
        System.out.println("먹다");
    }

    void setCar(Car car) {
        this.car = car;
    }

    void drive() {
        car.run();
    }

}
