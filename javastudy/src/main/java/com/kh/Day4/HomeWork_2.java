package com.kh.Day4;

import java.util.Scanner;

/*
    >> 영화관 좌석 예매 시스템 구현하기 <<
 */
public class HomeWork_2 {
    public static void main(String[] args) {
        //예매 안내 메세지
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("        좌석 예매 시스템        ");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

        //좌석 초기화
        String[][] seats = new String[6][10];   //배열생성
        int cnt = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = ++cnt + "";  //int -> String 형변환
            }//for end
        }//for end
        //좌석 배열 출력
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.printf("%3s", seats[i][j]);
            }//for end
            System.out.println(); //한줄 여백
        }//for end
        //좌석 예매
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("<<번호를 입력해 주세요(1~60)(0:종료)>>\n : ");
            String mySeat = scanner.nextInt() + "";

            //0입력시 종료
            if (mySeat.equals("0")) {
                break;
            }//if end

            //좌석번호 입력시 번호대신 X출력
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j].equals(mySeat)) {
                            seats[i][j] = "XX";
                    }//if end
                } //for end
            } //for end
            System.out.println();   //한줄 여백
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.printf("%3s", seats[i][j]);
                }//for end
                System.out.println();   //한줄 여백
            } //for end
            System.out.println("<<" + mySeat + "번 좌석 예매가 완료되었습니다>>");
        }//while end


    }
}
