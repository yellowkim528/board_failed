package com.kh.Day4;

import java.util.Random;
import java.util.Scanner;

/*
    로또 생성기 (1~45) 중 6개
 */
public class Question3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println(" ★☆★로또번호 생성기★☆★");
        System.out.println("=========================");
        System.out.print("시작:1, 종료:0\n : ");

        boolean stop = false;
        while (!stop) {
            int start = scanner.nextInt();

            // 종료버튼
            if (start == 0) {
                stop = true;
                continue;
            }

            int [] lotto = new int [6];

            // 로또번호 생성
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = random.nextInt(46) + 1;
                if (i == 0) continue;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }

            // 로또번호 출력
            System.out.println();
            for (int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");
            }

            System.out.println("\n\n<<번호가 출력되었습니다!>>");
            System.out.print("<<다시뽑기:1, 종료:0>> \n : ");
        }
        System.out.println("<<프로그램 종료>>");


    }

}
