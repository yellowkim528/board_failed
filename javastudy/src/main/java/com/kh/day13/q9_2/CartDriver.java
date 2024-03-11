package com.kh.day13.q9_2;

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
            System.out.println("상품정보를 입력하세요");
            System.out.print("상품명 : ");
            itemName = scanner.nextLine();
            System.out.print("가격 : ");
            itemPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량 : ");
            itemQuantity = scanner.nextInt();
            scanner.nextLine();
            scart.addToCart(new Item(itemName, itemPrice, itemQuantity));
            System.out.println("상품이 추가되었습니다.");
            System.out.println("상품을 계속 추가하시겠습니까?(예/아니오)");
            String answer = scanner.nextLine();
            if (!answer.equals("예")) {
                flag = true;
                break;
            }
        }
        System.out.println(scart);
    }
}
