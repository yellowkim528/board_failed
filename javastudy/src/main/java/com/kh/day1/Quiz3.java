package com.kh.day1;

import java.util.Scanner;

/*
     콘솔로부터 3개의 정수를 입력받아 가장 큰값을 출력하기
 */
public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 차례로 입력하세요");
        System.out.println("-----------------------");
        System.out.print("값1 : ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("값2 : ");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.print("값3 : ");
        int c = Integer.valueOf(scanner.nextLine());

        if (a > b && a > c) {
            System.out.println("최대값 : " + a);
        } else if (b > a && b > c) {
            System.out.println("최대값 : " + b);
        } else if (c > a && c > b) {
            System.out.println("최대값 : " + c);
        } else if (a == b) {
            System.out.println("값1=값2");
        } else if (b == c) {
            System.out.println("값2=값3");
        } else if (a == c) {
            System.out.println("값1=값3");
        } else {
            System.out.println("오류 발생");
        }

    }
}
