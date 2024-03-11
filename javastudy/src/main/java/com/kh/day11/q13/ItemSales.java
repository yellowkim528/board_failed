package com.kh.day11.q13;

public class ItemSales {
    private int numberSold, bulkMin;
    private double discounts, sales, bulkDiscount, itemCost;

    public ItemSales(double itemCost, int bulkMin, double bulkDiscount) {
        this.itemCost = itemCost;
        this.bulkMin = bulkMin;
        this.bulkDiscount = bulkDiscount;
        this.numberSold = 0;
        this.sales = 0;
        this.discounts = 0;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public double getSales() {
        return sales;
    }

    public double getDiscounts() {
        return discounts;
    }

    public double getItemCost() {
        return itemCost;
    }

    public int getBulkMin() {
        return bulkMin;
    }

    public double getBulkDiscount() {
        return bulkDiscount;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    public void setBulkMin(int bulkMin) {
        this.bulkMin = bulkMin;
    }

    public void setBulkDiscount(double bulkDiscount) {
        this.bulkDiscount = bulkDiscount;
    }

    public void displaySales() {
        System.out.println("누적 판매 수량 : " + this.numberSold);
        System.out.println("누적 판매 금액 : " + this.sales);
        System.out.println("누적 판매 할인금액 : " + this.discounts);
    }

    public void registerSale(int n) {
        double basicCost = n * this.itemCost;

        double discountGiven = 0;

        numberSold += n;

        if (n >= bulkMin) {
            discountGiven = basicCost * bulkDiscount;
        }

        sales += (basicCost - discountGiven);
        discounts += discountGiven;


    }
}
