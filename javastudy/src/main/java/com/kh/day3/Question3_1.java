package com.kh.day3;

import java.util.Random;
import java.util.Scanner;

/*
    1~10까지의 임의의 정수 맞추기
    제약 조건 : 3번의 기회가 주어짐.
 */
public class Question3_1 {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("    <<숫자 맞추기 게임>>");
        System.out.println("===========================");


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        int com1, com2, com3;
        int strikeCount = 0;
        int ballCount = 0;

        while (true) {
            while (true) {
                com1 = random.nextInt(9) + 1;
                com2 = random.nextInt(9) + 1;
                com3 = random.nextInt(9) + 1;
                if (!(com1 == com2 || com2 == com3 || com1 == com3)) {
                    break;
                }
            }
            while (true) {
                System.out.println("  ★3개의 정수를 입력하세요★");
                System.out.print("스페이스바로 구분하시고 \n마지막에 Enter를 눌러주세요.\n : ");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();

                //스트라이크 세기
                if (num1 == com1) {
                    strikeCount += 1;
                }
                if (num2 == com2) {
                    strikeCount += 1;
                }
                if (num3 == com3) {
                    strikeCount += 1;
                }

                //볼 세기
                if (num1 == com2 || num1 == com3) {
                    ballCount += 1;
                }
                if (num2 == com1 || num2 == com3) {
                    ballCount += 1;
                }
                if (num3 == com1 || num3 == com2) {
                    ballCount += 1;
                }

                if (strikeCount == 3) {
                    System.out.println("3스트라이크!!!!!");
                    System.out.println("정답입니다!!!!");
                    break;
                } else {
                    if (strikeCount == 0 && ballCount == 0) {
                        System.out.println("하나도 못맞췄습니다!! 깔깔");
                    } else {
                        System.out.println(strikeCount + "스트라이크  " + ballCount + "볼");
                    }
                    strikeCount = 0;
                    ballCount = 0;
                }
            }

            System.out.println("한판 더 하시겠습니까(0:종료,1:재시작)");
            int restart = scanner.nextInt();
            if (restart == 0) {
                System.out.println("다음에 또봐요!");
                System.exit(0);
            } else if (restart == 1) {
                strikeCount = 0;
                ballCount = 0;
                System.out.println("한판 더 시작합니다!");
            }
        }
    }
}
