package com.kh.day10.exam2;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double Area = width * height;
        return Area;
    }

    @Override
    public void paint() {
        System.out.println("색칠하다 : 사각형");
    }
}
