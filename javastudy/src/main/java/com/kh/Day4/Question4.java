package com.kh.Day4;

import java.util.Random;
import java.util.Scanner;

/*
    아래를 참조하여 2차원 비정방행렬로 초기화하여 반장, 총무 뽑기
    송명성 박준혁
    김동환 최은석 이나영
    윤경란 최정민 윤다영 김대군
    김동회 정소라 조승민 김재현

    두구두구두~
    반장 : 홍길동
    부반장 : 홍길동2

 */
public class Question4 {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] students = {
                {"송명성", "박준혁"},
                {"김동환", "최은석", "이나영"},
                {"윤경란", "최정민", "윤다영", "김대군"},
                {"김동회", "정소라", "조승민", "김재현"}
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }
        boolean stop = false;
        while (!stop) {
            int num1 = random.nextInt(4);
            int num2 = random.nextInt(4);
            int num3 = random.nextInt(4);
            int num4 = random.nextInt(4);
            if (num1 == 0 && (num2 >= 2)) {
                continue;
            }
            if (num1 == 1 && (num2 >= 3)) {
                continue;
            }
            if (num3 == 0 && (num4 >= 2)) {
                continue;
            }
            if (num3 == 1 && (num4 >= 3)) {
                continue;
            }
            String banJang = students[num1][num2];
            String buBanJang = students[num3][num4];
            Scanner scanner = new Scanner(System.in);

            if (num1 == num3 && num2 == num4) {
                continue;
            }
            System.out.println("반장 : " + banJang);
            System.out.println("부반장 : " + buBanJang);
            stop = true;
        }


    }
}
