package com.kh.day3;

/*
    x,y의 값 교환해보기.(재할당없이)
    x=10, y=20

    x=20, y=10
 */
public class Question4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int ch = x;
        x = y;
        y = ch;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
