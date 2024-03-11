package com.kh.day3;

import java.util.Scanner;

/*
    도형의 넓이 구하기
    --------------------------
    메뉴 : 1.사각형 2.원 3.종료
    --------------------------
    구하고자 하는 도형 : 1
    가로 : 20
    세로 : 30
    넓이 : 600
    --------------------------
    메뉴 : 1.사각형 2.원 3.종료
    --------------------------
    구하고자 하는 도형 : 2
    반지름 : 5
    넓이 :
    --------------------------
    메뉴 : 1.사각형 2.원 3.종료
    --------------------------
    구하고자 하는 도형 : 3

    프로그램 종료.

 */
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("---------------------------");
            System.out.println(" 메뉴 : 1.사각형 2.원 3.종료");
            System.out.println("---------------------------");
            System.out.print("구하고자 하는 도형 : ");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.print("가로 : ");
                double sq1 = scanner.nextDouble();
                System.out.print("세로 : ");
                double sq2 = scanner.nextDouble();
                double result1 = sq1 * sq2;
                System.out.printf("넓이 : %.2f\n\n", result1);
            } else if (num == 2) {
                System.out.print("반지름 : ");
                double c1 = scanner.nextDouble();
                double result2 = c1 * c1 * (Math.PI);
                System.out.printf("넓이 : %.2f\n\n", result2);
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                stop = true;
            } else {
                System.out.println("잘못 입력하셨습니다.\n");
            }
        }
    }
}
