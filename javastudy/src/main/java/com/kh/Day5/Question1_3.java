package com.kh.Day5;

import java.util.Scanner;

/*
    ATM기 입출금 구현하기
    제약조건 : 1. 마이너스 통장이 아니다.
              2. 구좌에 최대 10만원만 입금 가능하다.
              3. 1000원 미만으로 입출금 불가.
              4. 입금, 출금 기능을 별도의 메소드로 분리하여 구현하시오.

    -------------------------------
    메뉴 : 1.입금 2.출금 3.잔액 0.종료
    -------------------------------
    선택 : 1
    입금액 : 10000
    10000원이 입금되었습니다. 잔액 : 10000
    -------------------------------
    메뉴 : 1.입금 2.출금 3.잔액 0.종료
    -------------------------------
    선택 : 3
    잔액 : 10000
    -------------------------------
    메뉴 : 1.입금 2.출금 3.잔액 0.종료
    -------------------------------
    선택 : 2
    출금액 : 5000
    5000원이 출금되었습니다. 잔액 : 5000
    -------------------------------
    메뉴 : 1.입금 2.출금 3.잔액 0.종료
    -------------------------------
    선택 : 2
    출금액 : 10000
    잔액이 부족합니다.  잔액 : 5000
    -------------------------------
    메뉴 : 1.입금 2.출금 3.잔액 0.종료
    -------------------------------
    선택 : 0
    ATM 종료!
 */
public class Question1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        boolean stop = false;
        while (!stop) {
            System.out.println("-------------------------------");
            System.out.println("메뉴 : 1.입금 2.출금 3.잔액 0.종료");
            System.out.println("-------------------------------");
            System.out.print("메뉴 >> ");
            int menu = scanner.nextInt();
            boolean stop_depositAmount = false, stop_withdrawAmount = false;
            switch (menu) {
                case 1: // 입금
                    balance = deposit(scanner, balance);
                    break;
                case 2: // 출금
                    balance = widthaw(scanner, balance);
                    break;
                case 3: // 잔액
                    System.out.println("잔 액 : " + balance);
                    break;
                case 0: // 종료
                    stop = true;
                    continue;
                default:
                    System.out.println("(0~3) 선택 바랍니다.");
            }
        }
        System.out.println("프로그램 종료!!");
    }
    
    //입금
    public static int deposit(Scanner scanner, int balance) {
        boolean stop_depositAmount = false;
        while (!stop_depositAmount) {
            System.out.print("입금액[0-상위메뉴이동] : ");
            int depositAmount = scanner.nextInt();
            //상위 메뉴 이동
            if (depositAmount == 0) {
                stop_depositAmount = true;
                continue;
            }
            // 체크
            // 1. 음수체크
            if (depositAmount < 0) {
                System.out.println("양수로 입력바랍니다.");
                continue;
            }
            // 2. 구좌에 최대 10만원만 입금 가능하다.
            if (balance + depositAmount > 100_000) {
                System.out.println("구좌에 최대 10만원까지 입금 가능합니다. 잔액 : " + balance);
                continue;
            }
            // 3. 1000원 미만으로 입출금 불가.
            if (depositAmount % 1000 != 0) {
                System.out.println("1000원 단위로 입금 가능합니다.");
                continue;
            }
            //입금 처리
            balance += depositAmount;
            System.out.println(depositAmount + "원이 입금되었습니다. 잔액 : " + balance);
            stop_depositAmount = true;
        }
        return balance;
    }

    //출금
    public static int widthaw(Scanner scanner, int balance) {
        boolean stop_withdrawAmount = false;
        while (!stop_withdrawAmount) {
            System.out.print("출금액(0:상위메뉴이동) : ");
            int withdrawAmount = scanner.nextInt();

            //상위 메뉴 이동
            if (withdrawAmount == 0) {
                stop_withdrawAmount = true;
                continue;
            }

            //체크
            //1) 음수체크
            if (withdrawAmount < 0) {
                System.out.println("양수로 입력바랍니다.");
                continue;
            }
            //2) 잔액체크 : 출금액이 더 많으면 출금 불가.
            if (withdrawAmount > balance) {
                System.out.println("잔액이 부족합니다. 잔액 : " + balance);
                continue;
            }
            //3) 1000원 미만으로 입출금 불가
            if (withdrawAmount % 1000 != 0) {
                System.out.println("1000원 단위로 출금 가능합니다.");
                continue;
            }
            //출금 처리
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원이 출금되었습니다. 잔액 : " + balance);
            stop_withdrawAmount = true;
        }
        return balance;
    }
}
