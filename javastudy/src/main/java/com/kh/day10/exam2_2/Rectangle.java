package com.kh.day10.exam2_2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    double calculateArea() {
        return width * length;
    }

    @Override
    public void paint() {
        System.out.println("사각형 도형을 칠하다");
    }
}
