package com.kh.day3;

import java.util.Scanner;

/*
    사용자로부터 숫자를 입력받아 '*'를 정사각형 모양으로 출력하는 프로그램을 구현하시오
    0을 입력하면 프로그램 종료
    number : 3
    ***
    ***
    ***
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println(" ★정사각형 만들기★  (종료 : 0)");
        System.out.println("===============================");
        while (true) {
            System.out.print("number : ");
            int k = scanner.nextInt();
            if (k == 0) {
                break;
            }
            for (int i = 1; i <=k; i++) {
                for (int j = 1; j <=k; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
