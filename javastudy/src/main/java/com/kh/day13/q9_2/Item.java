package com.kh.day13.q9_2;

public class Item {
    private String itemName;    // 구매하는 상품의 이름
    private int itemPrice;      // 구매하는 상품의 가격
    private int itemQuantity;   // 구매하는 상품의 수량

    public Item(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        String str = "";
        str += "상품명 : " + itemName + "\n";
        str += "가격 : " + itemPrice + "\n";
        str += "수량 : " + itemQuantity + "\n";
        return str;
    }
}
