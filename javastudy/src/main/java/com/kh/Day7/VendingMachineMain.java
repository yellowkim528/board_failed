package com.kh.Day7;

import java.util.Scanner;
/*
    음료 자판기
    메뉴 : "콜라","사이다","커피"
    가격 : 1000, 800, 1500

    실행결과
    투입액[0 - 종료] : 2000
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3
    커피를 선택했습니다.
    거스름돈 : 500

    투입액[0 - 종료] : 500
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3
    잔액이 부족합니다. 커피 : 1500원 입니다.

    case1) 잔액으로 구매상품이 있을경우 : 메뉴선택
    투입액[0-종료]
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3

    case2) 잔액으로 구매상품이 없는 경우 : 추가투입 or 종료
    투입액[0-종료] : 500

 */

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.message();
        vm.run();

    }
}
