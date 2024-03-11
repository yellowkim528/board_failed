package com.kh.day10.exam2;



public class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        double Area = radius*radius*3.14;
        return Area;
    }

    @Override
    public void paint() {
        System.out.println("색칠하다 : 원");

    }
}
