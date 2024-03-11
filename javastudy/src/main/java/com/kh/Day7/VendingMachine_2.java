package com.kh.Day7;

import java.util.Scanner;

public class VendingMachine_2 {
    //속성
    int balance;    //잔액
    String[] drinks = {"콜라", "사이다", "커피"};    //메뉴
    int[] prices = {1000, 800, 1500};           //가격

    //행위
    void run() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("현재 잔액 : " + balance + "원");
            System.out.print("투입액[0-종료] : ");
            int money = scanner.nextInt();
            //0 입력시 자판기 종료
            if (money == 0) {
                stop = true;
                continue;
            }
            balance += money;

            // 투입금액이 800원 이상일때 작동
            while (balance >= 800) {
                System.out.println("메뉴 : 1.콜라 2.사이다 3.커피 (추가투입 : 0)");
                System.out.print("선택 >> ");
                int menu = scanner.nextInt();
                // 추가투입 버튼
                if (menu == 0) {
                    break;
                }
                // 잘못된 입력시 안내멘트
                if (menu < 0 || menu > 3) {
                    System.out.println("잘못 입력하셨습니다. (0~3)선택가능");
                    continue;
                }

                String selectedDrink = drinks[menu - 1];   //선택한 음료
                int priceOfDrink = prices[menu - 1];    //선택한 음료 가격

                //음료 선택시
                if (balance >= prices[menu - 1]) {
                    System.out.println(drinks[menu - 1] + "를 선택했습니다.");
                    System.out.println("거스름돈 : " + (balance - priceOfDrink) + "원");
                    balance -= priceOfDrink;
                } else {    //잔액 부족시
                    System.out.println("잔액이 부족합니다. " + selectedDrink + "는 " + priceOfDrink + "원 입니다.");
                }
            }

        }
        //잔액이 남아있을시 반환
        if (balance > 0) {
            System.out.println("거스름돈이 반환됩니다 : " + balance + "원");
        }
        System.out.println("이용해주셔서 감사합니다");
        scanner.close();

    }

    //자판기 시작시 멘트
    void message() {
        System.out.println("-----------------------");
        System.out.println("     음료    자판기");
        System.out.println("-----------------------");
        System.out.println("    메           뉴");
        System.out.println("-----------------------");
        System.out.println(" 콜  라    :    1,000원");
        System.out.println(" 사이다    :      800원");
        System.out.println(" 커  피    :    1,500원");
        System.out.println("-----------------------");
    }

}
