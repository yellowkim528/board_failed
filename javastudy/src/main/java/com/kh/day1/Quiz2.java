package com.kh.day1;

import java.util.Scanner;

/*
    콘솔로부터 정수를 2개 받아 큰값 출력
 */
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 차례로 입력하세요");
        System.out.println("---------------------");
        System.out.print("값1 : ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("값2 : ");
        int b = Integer.valueOf(scanner.nextLine());

        if (a > b) {
            System.out.println("최대값 : " + a);
        } else {
            System.out.println("최대값 : " + b);
        }
    }
}
