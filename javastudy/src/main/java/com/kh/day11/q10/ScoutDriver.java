package com.kh.day11.q10;

import java.util.Scanner;

public class ScoutDriver {
    public static void main(String[] args) {
        Scout[] gscout = new Scout[3];              // 걸스카우트 단원들의 배열
        Scanner scanner = new Scanner(System.in);

        //걸스카우트 3명 생성
        for (int i = 0; i < gscout.length; i++) {
            System.out.println("걸스카우트" + (i + 1) + "의 이름을 입력하세요");
            String gscoutname = scanner.nextLine();
            gscout[i] = new Scout(gscoutname);
        }

        //과자판매기간 : 단위(주)
        System.out.print("판매기간(주)를 입력하세요 : ");
        int saleweeks = scanner.nextInt();
        scanner.nextLine(); // "\n" 엔터키 읽어들임. 없애주는 작업

        //주별 걸스카웃의 판매수량
        for (int i = 0; i < saleweeks; i++) {
            for (int j = 0; j < gscout.length; j++) {
                System.out.print(gscout[j].getName() + "의" + (i + 1) + "번째주 판매상자수를 입력하세요 : ");
                int saleperweek = scanner.nextInt();
                scanner.nextLine(); // "\n" 엔터키 읽어들임. 없애주는 작업
                gscout[j].updateSales(saleperweek);
            }
        }

        //걸스카웃의 이름과 총 판매상자수 출력
        for (Scout scout : gscout) {
//            System.out.println();
            System.out.println(scout.toString());
        }


    }
}
