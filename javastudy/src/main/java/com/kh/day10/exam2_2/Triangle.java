package com.kh.day10.exam2_2;

public class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public void paint() {
        System.out.println("삼각형 도형을 칠하다");
    }
}
