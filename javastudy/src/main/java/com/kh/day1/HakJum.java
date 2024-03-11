package com.kh.day1;

/*
    문제) 점수에 따른 수우미양가 평가
    90점 이상 - 수
    80점 이상 90점 미만 - 우
    70점 이상 80점 미만 - 미
    60점 이상 70점 미만 - 양
    60점 미만 - 가
 */
public class HakJum {
    public static void main(String[] args) {
        int score = 50;

        boolean exp1 = score >= 90;             //수
        boolean exp2 = score >= 80 && score<90; //우
        boolean exp3 = score >= 70 && score<80; //미
        boolean exp4 = score >= 60 && score<70; //양


        if (exp1) {                     //수
            System.out.println("수");
        } else if (exp2) {              //우
            System.out.println("우");
        } else if (exp3) {              //미
            System.out.println("미");
        } else if (exp4) {              //양
            System.out.println("양");
        } else {                        //가
            System.out.println("가");
        }


    }
}
