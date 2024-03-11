package com.kh.day11.q4;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("광휘의 검", 700, 1);

        System.out.println(item.toString());

        System.out.println("상품의 이름 : " + item.getName());
        System.out.println("상품의 가격 : " + item.getPrice());
        System.out.println("상품의 수량 : " + item.getQuantity());

        item.setName("롱소드");
        item.setPrice(350);
        item.setQuantity(2);

        System.out.println(item.toString());
    }
}
