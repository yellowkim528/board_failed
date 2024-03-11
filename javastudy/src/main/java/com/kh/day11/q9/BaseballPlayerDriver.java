package com.kh.day11.q9;

import java.util.Scanner;

public class BaseballPlayerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseballPlayer[] bp = new BaseballPlayer[9];


        for (int i=0; i<bp.length; i++) {
            System.out.println("선수의 이름,위치,안타수,4구수를 입력하세요");
            System.out.println("선수 이름 : ");
            String bpname = scanner.nextLine();
            System.out.println("위치 : ");
            String bpposition = scanner.nextLine();
            System.out.println("안타수 : ");
            int nohits = scanner.nextInt();
            scanner.nextLine();     //"\n" 엔터키 읽기 위함
            System.out.println("4구수 : ");
            int nowalks = scanner.nextInt();
            scanner.nextLine();

            //선수 생성
            bp[i] = new BaseballPlayer(bpname);
            bp[i].setPosition(bpposition);
            bp[i].setNumHits(nohits);
            bp[i].setNumWalks(nowalks);
        }

        int sumHits = 0, sumWalks = 0;
        for (int i = 0; i < bp.length; i++) {
            sumHits += bp[i].getNumHits();
            sumWalks += bp[i].getNumWalks();
        }

        System.out.println("sumHits = " + sumHits);
        System.out.println("sumWalks = " + sumWalks);

    }

}
