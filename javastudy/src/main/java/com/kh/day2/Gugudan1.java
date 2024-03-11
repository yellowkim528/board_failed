package com.kh.day2;

import java.util.Scanner;

/*
    구구단 2단 출력하기
    결과 :
    2 * 1 = 2
    2 * 2 = 4
    ...
    2 * 9 = 18
 */
public class Gugudan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====구구단 출력 프로그램=====");
        System.out.print("출력할 단수를 입력하세요 : ");
        int dansu = scanner.nextInt();
        System.out.println("구구단 " + dansu + "단 출력하기");
        System.out.println("결과 : ");
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + (dansu * i));
        }
    }
}
