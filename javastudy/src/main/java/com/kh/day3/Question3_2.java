package com.kh.day3;

import java.util.Random;
import java.util.Scanner;

/*
    1~10까지의 임의의 정수 맞추기
    제약 조건 : 3번의 기회가 주어짐.
 */
public class Question3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int answer = random.nextInt(10) + 1;

        System.out.println("1~10 사이의 숫자를 맞춰보세요!");
        boolean stop = false;
        int cnt = 0; //틀린횟수 카운트
        while (!stop) {
            System.out.print("숫자 : ");
            int num = scanner.nextInt();
            if (num == answer) {
                System.out.println("빙고!");
                stop = true;
            } else {
                cnt++;
                if (answer > num) {
                    System.out.println("UP!!");
                } else {
                    System.out.println("DOWN!!");
                }
                System.out.println("틀렸습니다!!!");
                if (cnt == 3) {
                    stop = true;
                    System.out.println("꽝! 정답은 " + answer + "입니다!");
                }
            }
        }
    }
}
