package com.kh.book;

public class Excercise4_3 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {

            if (i % 2 == 1) {
                continue;
            }
            if (i > 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
