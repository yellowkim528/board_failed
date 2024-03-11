package com.kh.day11.q12;

import java.util.Scanner;

public class PigPlayer {
    private int total;               // 게임에서 얻은 총 점수
    private int round;               //	현 회차에서 얻은 점수
    private int limit;               //	한 회차에서 얻을 수 있는 최대 점수
    public static final int ASK = -1;      //	회차 종료를 위한 메시지


    public PigPlayer(int limit) {
        this.limit = limit;
    }

    //	roll: 주사위 쌍을 던지고 결과를 다룬다
    public void roll(PairOfDice pairOfDice, int goal) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        int cnt = 0;
        while (!stop) {
            cnt++;
            // 주사위 2개 굴리기
            pairOfDice.roll();
            // 주사위 2개의 눈의 수 읽어오기
            int die1 = pairOfDice.getDie1().getFaceValue();
            int die2 = pairOfDice.getDie2().getFaceValue();

            System.out.println("주사위눈 : (" + die1 + ", " + die2 + ")");

            if (die1 == 1 || die2 == 1) {
                System.out.println("현 회차에서 얻은 점수가 초기화됩니다.");
                round = 0;
                if (die1 == 1 && die2 == 1) {
                    System.out.println("총 점수가 초기화됩니다.");
                    total = 0;
                }
                return;
            }
            // 한 회차 누적합 합
            round += die1 + die2;
            System.out.println(cnt + "_회차 누적합 " + round);
            System.out.println();

            // 목표 점수에 다다르면 종료
            if ((total + round) >= goal) {
                stop = true;
            } else {
                // human인 경우
                if (limit == ASK) {
                    System.out.println("계속 던지시겠습니까?(y/n)");
                    String again = scanner.nextLine();
                    if (again.equalsIgnoreCase("Y")) {
                        continue;
                    } else {
                        stop = true;
                    }
                    // computer인 경우
                } else {
                    if (round >= limit) {
                        stop = true;
                    }
                }
            }
            total += round;
            round = 0;
            System.out.println("누적합 : " + getTotal());
        }
    }

    //	getPoints: 선수가 얻은 총점을 반환한다
    public int getTotal() {
        return total;
    }
}