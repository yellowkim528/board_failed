package com.kh.Day7;

import java.util.Scanner;

public class VendingMachine {
    //속성
    int balance;    //잔액
    String[] drinks = {"콜라", "사이다", "커피"};    //메뉴
    int[] prices = {1000, 800, 1500};           //가격

    //행위
    void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("현재잔액 : " + balance);
            System.out.print("투입액[0:종료] : ");
            int money = scanner.nextInt();
            balance += money;
            if (balance == 0) {
                return;
            }
            // 잔액이 최소 가격 메뉴보다 큰 경우 다음으로 진행
            if (balance >= minPrice(prices)) {
                break;
            }
        }

        int menu = -1;
        do {
            System.out.println("메뉴 : 1.콜라(1000) 2.사이다(800) 3.커피(1500)");
            System.out.print("선택 >> ");
            menu = scanner.nextInt();
            if (menu >= 1 && menu <= 3) {
                break;
            }
        } while (true);

        String selectedDrink = drinks[menu - 1];
        int priceOfDrink = prices[menu - 1];

        System.out.println(selectedDrink + "를 선택했습니다.");
        balance -= priceOfDrink;
        System.out.println("거스름돈 : " + balance);
        balance = 0;
    }
    
    

    //최소가격을 찾는 메소드
    private int minPrice(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return min;
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
