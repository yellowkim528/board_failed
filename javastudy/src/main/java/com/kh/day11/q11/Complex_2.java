package com.kh.day11.q11;

public class Complex_2 {
    private double realPart;    // 실수부의 값
    private double imaginaryPart;   // 허수부의 값

    public Complex_2() {    //기본 생성자는 알아서 0으로 초기화시킴
    }

    public Complex_2(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void print() {
        System.out.println("(" + realPart + "," + imaginaryPart + ")");
    }

    public Complex_2 substract(Complex_2 complex1, Complex_2 complex2) {
        Complex_2 result = null;

        double realPart = complex1.getRealPart() - complex2.getRealPart();
        double imaginaryPart = complex1.getImaginaryPart() - complex2.getImaginaryPart();
        result = new Complex_2(realPart,imaginaryPart);
        return result;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
