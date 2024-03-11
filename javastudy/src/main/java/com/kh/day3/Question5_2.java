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
public class Question5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("---------------------------");
            System.out.println(" 메뉴 : 1.사각형 2.원 3.종료");
            System.out.println("---------------------------");
            System.out.print("구하고자 하는 도형 : ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("가로 : ");
                    double horizontal = scanner.nextDouble();
                    System.out.print("세로 : ");
                    double vertical = scanner.nextDouble();
                    double wide = horizontal * vertical;
                    System.out.println("넓이 : " + wide);
                    break;
                case 2:
                    System.out.print("반지름 : ");
                    double radius = scanner.nextInt();
                    double wideOfCircle = radius * radius * Math.PI;
                    System.out.println("넓이 : " + wideOfCircle);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    stop = true;
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
            }
        }
    }
}
