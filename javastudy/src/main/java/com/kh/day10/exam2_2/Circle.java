package com.kh.day10.exam2_2;

public class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void paint() {
        System.out.println("원 도형을 칠하다");
    }
}
