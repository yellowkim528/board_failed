package com.kh.day3;

import java.util.Random;

/*
    1~10 사이의 임의의 정수 3개를 출력하고
    이중 최대값과 최소값을 출력하는 프로그램을 구현하시오.
 */
public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int num3 = random.nextInt(10) + 1;

        // 최대값 구하기
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }

        // 최소값 구하기
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}
