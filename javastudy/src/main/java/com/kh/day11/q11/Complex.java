package com.kh.day11.q11;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void print() {
        System.out.println("(" + realPart + ", " + imaginaryPart + "i)");
    }

    public Complex subtract(Complex z) {
        double newRealPart = this.realPart - z.realPart;
        double newImaginaryPart = this.imaginaryPart - z.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public double getRealPart() {
        return realPart;

    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
