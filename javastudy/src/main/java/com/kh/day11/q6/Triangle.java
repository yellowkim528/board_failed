package com.kh.day11.q6;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean is_right() {
        boolean isRight = false;
        double a = this.side1;
        double b = this.side2;
        double c = this.side3;
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            isRight = true;
        }
        return isRight;
    }

    public boolean is_isosceles() {
        boolean isIsosceles = false;
        double a = this.side1;
        double b = this.side2;
        double c = this.side3;
        if (a == b || b == c || a == c) {
            isIsosceles = true;
        }
        return isIsosceles;
    }

}
