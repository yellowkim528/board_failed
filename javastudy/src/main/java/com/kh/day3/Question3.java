package com.kh.day3;

import java.util.Random;
import java.util.Scanner;

/*
    1~10까지의 임의의 정수 맞추기
    제약 조건 : 3번의 기회가 주어짐.
 */
public class Question3 {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("    <<숫자 맞추기 게임>>");
        System.out.println("===========================");
        System.out.println("1~10 사이의 숫자를 입력하세요!");
        System.out.println("    기회는 단 3번입니다!");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num2 = random.nextInt(10) + 1;
        int i = 0;
        while (i < 3) {
            int num1 = scanner.nextInt();
            if (num1 == num2) {
                System.out.println("정답입니다! 축하합니다!!");
                break;
            } else if (num1 != num2) {
                System.out.println("땡!!");
                i++;
                System.out.println("남은 기회는 "+(3-i)+"번 입니다.");
            }
            if (i==3) {
                System.out.println("당신은 패배했습니다.");
            }
        }
        System.out.println("GAME OVER");

    }
}
