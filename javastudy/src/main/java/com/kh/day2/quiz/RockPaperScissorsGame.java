package com.kh.day2.quiz;

import java.util.Random;
import java.util.Scanner;

/*
    가위,바위,보 게임을 구현하기
    -----------------------------
    메뉴 : 1.가위 2.바위 3.보 4.종료
    -----------------------------
    참여자 : 3
    컴퓨터 : 바위
    참여자 : 보
    참여자 승!!
    -----------------------------
    메뉴 : 1.가위 2.바위 3.보 4.종료
    -----------------------------
    참여자 : 4
    게임종료합니다 !!
 */
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("-------------------------------");
        System.out.println(" 메뉴 : 1.가위 2.바위 3.보 4.종료 ");
        System.out.println("-------------------------------");
        System.out.println("플레이어 : ");
        int myHand = scanner.nextInt();



        do {

            int num = random.nextInt(3) + 1;

            if (myHand == 3 && num == 1) {
                System.out.println("플레이어 : 보");
                System.out.println("컴퓨터 : 가위");
                System.out.println("컴퓨터가 승리했습니다"); method(); menu();
            } else if (myHand == 3 && num == 2) {
                System.out.println("플레이어 : 보");
                System.out.println("컴퓨터 : 바위");
                System.out.println("플레이어가 승리했습니다"); method(); menu();
            } else if (myHand == 2 && num == 1) {
                System.out.println("플레이어 : 바위");
                System.out.println("컴퓨터 : 가위");
                System.out.println("플레이어가 승리했습니다"); method(); menu();
            } else if (myHand == 2 && num == 3) {
                System.out.println("플레이어 : 바위");
                System.out.println("컴퓨터 : 보");
                System.out.println("컴퓨터가 승리했습니다"); method(); menu();
            } else if (myHand == 1 && num == 2) {
                System.out.println("플레이어 : 가위");
                System.out.println("컴퓨터 : 바위");
                System.out.println("컴퓨터가 승리했습니다"); method(); menu();
            } else if (myHand == 1 && num == 3) {
                System.out.println("플레이어 : 가위");
                System.out.println("컴퓨터 : 보");
                System.out.println("플레이어가 승리했습니다"); method(); menu();
            } else if (myHand == 3 && num == 3) {
                System.out.println("플레이어 : 보");
                System.out.println("컴퓨터 : 보");
                System.out.println("무승부입니다"); method(); menu();
            } else if (myHand == 2 && num == 2) {
                System.out.println("플레이어 : 바위");
                System.out.println("컴퓨터 : 바위");
                System.out.println("무승부입니다"); method(); menu();
            } else if (myHand == 1 && num == 1) {
                System.out.println("플레이어 : 가위");
                System.out.println("컴퓨터 : 가위");
                System.out.println("무승부입니다"); method(); menu();
            }
        } while (myHand<4);
        System.out.println("게임종료");


//        if (myHand == 4) {
//            System.out.println("게임종료");
//        }


//        System.out.print("플레이어 : ");
//        switch (num) {
//            case 1:
//                System.out.println("가위");
//                continue;
//            case 2:
//                System.out.println("바위");
//                continue;
//            case 3:
//                System.out.println("보");
//                continue;
//        }
//        System.out.print("컴퓨터 : ");
//        switch (myHand) {
//            case 1:
//                System.out.println("가위");
//                continue;
//            case 2:
//                System.out.println("바위");
//                continue;
//            case 3:
//                System.out.println("보");
//                continue;
//        }


    }

    public static void method() {
        System.out.println("-------------------------------");
        System.out.println(" 메뉴 : 1.가위 2.바위 3.보 4.종료 ");
        System.out.println("-------------------------------");
        System.out.println("플레이어 : ");
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int myHand = scanner.nextInt();
    }
}
