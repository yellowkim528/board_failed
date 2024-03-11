package com.kh.day10.exam2;

public class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        double Area = (base*height)/2;
        return Area;
    }

    @Override
    public void paint() {
        System.out.println("색칠하다 : 삼각형");
    }
}
