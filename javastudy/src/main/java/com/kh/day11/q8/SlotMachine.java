package com.kh.day11.q8;

import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        boolean flag = true;
        int cnt = 0;
        while (flag) {
            number1 = random.nextInt(100);
            number2 = random.nextInt(100);
            number3 = random.nextInt(100);
            if (number1 == number2 && number2 == number3) {
                System.out.println("1 등에 당첨되었습니다 !!!");
                cnt++;
                flag = false;
            } else if (number1 == number2 || number2 == number3) {
                System.out.println("2 등에 당첨되었습니다 !!!");
                cnt++;
                flag = false;
            } else {
                System.out.println("꽝 입니다!!!");
                cnt++;
            }
        }
        System.out.println("시도횟수 : " + cnt);


    }
}
