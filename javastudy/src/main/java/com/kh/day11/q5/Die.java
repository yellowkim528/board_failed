package com.kh.day11.q5;

import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        super();
        faceValue = roll();
    }
    //주사위 굴리기
    public int roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }
    //현재면 반환
    public int getFaceValue() {
        return faceValue;
    }
}
