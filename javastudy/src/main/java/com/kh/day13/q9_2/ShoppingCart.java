package com.kh.day13.q9_2;

public class ShoppingCart {
    private Item[] cart;        // Item 객체들의 배열
    private int capacity;       // 장바구니의 최대 크기
    private int itemCount;      // 장바구니에 있는 Item 객체들의 총수
    private int totalPrice;     // 장바구니에 있는  상품들의 총 가격

    public ShoppingCart() {
        capacity = 5;
        cart = new Item[capacity];
    }

    //장바구니에 한 Item 객체를 추가한다.
    public void addToCart(Item item) {
        if (itemCount < capacity) {
            cart[itemCount++] = item;
            System.out.println("장바구니에 해당 상품을 담았습니다.");
            totalPrice += item.getItemPrice();
            return;
        } else {
            System.out.println("장바구니가 가득찼습니다.");
        }
    }
    // 장바구니의 상태를 문자열로 반환한다.
    @Override
    public String toString() {
        String str = "";
        str += "장바구니목록 : " + "\n";
        for (int i = 0; i < capacity; i++) {
            if (cart[i]==null) break;
            str += cart[i] + "\n";
        }
        str += "-----------------------------------------------" + "\n";
        str += "담은 상품 수 : " + itemCount + "\n";
        str += "결제액 : " + totalPrice + "\n";
        return str;
    }
    // 장바구니에 있는 상품의 총액을 반환한다,
    public int getTotalPrice() {
        return totalPrice;
    }

}
