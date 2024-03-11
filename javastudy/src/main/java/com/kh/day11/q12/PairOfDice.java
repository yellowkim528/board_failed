package com.kh.day11.q12;

import com.kh.day11.q5.Die;

import java.util.Random;

public class PairOfDice {
    private Die	die1;       //  Die 객체 변수 1
    private Die die2;       //	Die 객체 변수 2
    private int	value1;	    //	첫번째 주사위 숫자
    private int	value2;	    //	두번째 주사위 숫자
    private int	total;	    //	주사위 숫자들의 합

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();

    }

    public int roll() {
        value1 = die1.roll();
        value2 = die2.roll();
        total = value1 + value2;
        return total;
    }

    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    public int getTotal() {
        return total;
    }
}
