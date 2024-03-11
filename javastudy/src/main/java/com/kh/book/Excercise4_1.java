package com.kh.book;

/*
    학점 부여하기 A,B,C,F
 */
public class Excercise4_1 {
    public static void main(String[] args) {
        int score = 72;
        int result = score / 10;
        switch (result) {
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            default:
                System.out.println("F학점");
        }

    }
}
