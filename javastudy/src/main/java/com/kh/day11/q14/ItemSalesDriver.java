package com.kh.day11.q14;

import com.kh.day11.q13.ItemSales;

public class ItemSalesDriver {
    public static void main(String[] args) {
        ItemSales lunchBoxSeller = new ItemSales(1000, 10, 0.3);
        lunchBoxSeller.registerSale(1);
        System.out.println("도시락 판매 수량 " + lunchBoxSeller.getNumberSold());
        lunchBoxSeller.displaySales();

        lunchBoxSeller.registerSale(9);
        System.out.println("도시락 판매 수량 " + lunchBoxSeller.getNumberSold());
        lunchBoxSeller.displaySales();

        lunchBoxSeller.registerSale(10);
        System.out.println("도시락 판매 수량 " + lunchBoxSeller.getNumberSold());
        lunchBoxSeller.displaySales();

        lunchBoxSeller.registerSale(50);
        System.out.println("도시락 판매 수량 " + lunchBoxSeller.getNumberSold());
        lunchBoxSeller.displaySales();

    }
}
