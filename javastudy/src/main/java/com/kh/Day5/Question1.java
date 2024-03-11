package com.kh.Day5;

import java.util.Scanner;

/*
    ATM기 입출금 구현하기
    제약조건 : 1. 마이너스 통장이 아니다.
              2. 구좌에 최대 10만원만 입금 가능하다.
              3. 1000원 미만으로 입출금 불가.
              4. 메인메소드 만을 사용하여 구현

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
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //통장잔액
        int sum = 0;
        System.out.println("--------★☆어서오세요☆★--------");

        boolean stop = false;

        while (!stop) {
            System.out.println("-------------------------------");
            System.out.println("메뉴 : 1.입금 2.출금 3.잔액 0.종료");
            System.out.println("-------------------------------");
            System.out.print("선택 : ");

            //메뉴 이동
            int select = scanner.nextInt();
            boolean door1 = false;
            boolean door2 = false;
            switch (select) {
                case 0:
                    System.out.println("이용해주셔서 감사합니다. 안녕히 가세요.");
                    stop = true;
                    continue;
                case 1:
                    while (!door1) {
                        System.out.print("입금액[이전메뉴:0] : ");
                        int num1 = scanner.nextInt();
                        if (num1 == 0) {
                            door1 = true;
                            continue;
                        }
                        if (num1 < 0) {
                            System.out.println("음의 값은 입력할 수 없습니다.");
                            System.out.println();
                            continue;
                        }
                        if (sum + num1 > 100_000) {
                            System.out.println("최대 입금한도를 초과합니다(10만원). 잔액 : " + sum);
                            System.out.println();
                            continue;
                        }
                        if (num1 % 1000 != 0) {
                            System.out.println("입금할 수 없는 금액입니다.(최소단위 : 1000원)");
                            System.out.println();
                            continue;
                        }
                        sum += num1;
                        System.out.println(num1 + "원이 입금되었습니다. 잔액 : " + sum);
                        System.out.println();
                        door1 = true;
                        continue;
                    }
                    break;
                case 2:
                    while (!door2) {
                        System.out.print("출금액[이전메뉴:0] : ");
                        int num2 = scanner.nextInt();
                        if (num2 == 0) {
                            door2 = true;
                            continue;
                        }
                        if (num2 < 0) {
                            System.out.println("음의 값은 입력할 수 없습니다.");
                            continue;
                        }
                        if (sum < num2) {
                            System.out.println("잔액이 부족합니다. 잔액 : " + sum);
                            System.out.println();
                            continue;
                        }
                        if (num2 % 1000 != 0) {
                            System.out.println("입금할 수 없는 금액입니다.(최소단위 : 1000)");
                            System.out.println();
                            continue;
                        }
                        sum -= num2;
                        System.out.println(num2 + "원이 출금되었습니다. 잔액 : " + sum);
                        System.out.println();
                        door2 = true;
                        continue;
                    }
                    break;
                case 3:
                    System.out.println("잔액 : " + sum);
                    System.out.println();
                    break;
                default:
                    System.out.println("잘못 누르셨습니다. 0~3의 숫자를 눌러주세요.");
                    System.out.println();
            }
        }
    }
}
