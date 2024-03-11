package com.kh.day3;

/*
    1~10까지 짝수를 합산하는 프로그램을 구현하시오
    for, while, do~while
 */
public class Question1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();

        method1_1();


    }

    public static void method1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

    public static void method1_1() {
        int sum = 0;
        for (int i = 2; i <= 10; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void method2() {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

    public static void method3() {
        int sum = 0;
        int i = 1;
        do {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        } while (i <= 10);
        System.out.println(sum);
    }
}
