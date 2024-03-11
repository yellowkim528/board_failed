package com.kh.day13.q9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CartDriver {
    public static void main(String[] args) {
        ShoppingCart scart = new ShoppingCart();  // ShoppingCart 객체
        Scanner scanner = new Scanner(System.in);
        String itemName;        // 구매하는 상품의 이름
        int itemPrice;          // 구매하는 상품의 가격
        int itemQuantity;       // 구매하는 상품의 수량


        boolean flag = false;
        while (!flag) {
            System.out.println("장바구니에 추가하시겠습니까?(y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                flag = true;
                continue;
            }
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("상품의 이름을 입력하세요");
                itemName = scanner.nextLine();
                System.out.println("상품의 가격은 얼마입니까?");
                itemPrice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("몇개를 담으시겠습니까?");
                itemQuantity = scanner.nextInt();
                scanner.nextLine();
                Item item = new Item(itemName, itemPrice, itemQuantity);
                scart.addToCart(item);
                System.out.println("상품이 추가되었습니다.");
            }
        }
        System.out.println(scart);
    }


}
