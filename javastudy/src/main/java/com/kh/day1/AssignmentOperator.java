package com.kh.day1;

//대입연산자 : =, +=, -=, *=, /=, %=
public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 10;

        x = x + 10;
        System.out.println("x = " + x);

        x += 10; // x = x+10
        System.out.println("x = " + x);

        x -= 10; // x = x-10
        System.out.println("x = " + x);

        x *= 10; // x = x*10
        System.out.println("x = " + x);

        x /= 10; // x = x/10
        System.out.println("x = " + x);

        x %= 10; // x = x%10
        System.out.println("x = " + x);

    }
}
