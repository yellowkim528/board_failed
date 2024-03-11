package com.kh.day11.q11;

public class ComplexDriver {
    public static void main(String[] args) {
        Complex x = new Complex(2,3);
        Complex y = new Complex(-3,7);


        Complex z = x.subtract(y);

        x.print();
        y.print();
        z.print();

    }

}
