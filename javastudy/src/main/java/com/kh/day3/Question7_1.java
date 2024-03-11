package com.kh.day3;

import java.util.Scanner;

/*
    사용자로부터 숫자를 입력받아 '*'를 계단모양으로
    출력하는 프로그램을 구현하시오
*/

public class Question7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===============================");
            System.out.println("   ★별계단 만들기★   (종료:0)");
            System.out.println("===============================");
            System.out.print("number : ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
