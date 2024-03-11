package com.kh.day11.q10;

public class Scout {

    private String name;        // 이름
    private int boxesSold;   // 판매한 과자 상자 수

    public Scout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int cnt) {
        boxesSold += cnt;
    }

    @Override
    public String toString() {
        return "Scout{" +
                "이름 : " + name +
                ", 판매 상자 수 : " + boxesSold + '}';
    }
}
