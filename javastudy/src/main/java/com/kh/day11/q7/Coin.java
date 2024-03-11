package com.kh.day11.q7;

import java.util.Random;

public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    Random random = new Random();
    private int face;

    public Coin() {
        super();
        face = random.nextInt(2);
    }

    public int flip() {
        face = random.nextInt(2);
        return face;
    }

    public int getFace() {
        return face;
    }

    @Override
    public String toString() {
        return (face == HEADS) ? "앞면" :"뒷면";
    }
}
