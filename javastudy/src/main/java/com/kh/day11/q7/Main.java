package com.kh.day11.q7;

public class Main {
    public static void main(String[] args) {
        Coin c1 = new Coin();
        System.out.println(c1.getFace());

        c1.flip();
        System.out.println(c1.toString());
    }
}
