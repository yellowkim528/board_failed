package com.kh.Day4;

public class ArrayTest1 {
    public static void main(String[] args) {
//        int kor = 90;
//        int eng = 80;
//        int math = 70;
//
//        int sum = kor + eng + math;
//        double avg = (double)sum / 3;
//
//        System.out.println("총계 = " + sum);
//        System.out.println("평균 = " + avg);


        int[] subjects;         //정수형 배열 선언
        subjects = new int[3];  //정수형 배열 생성

//        System.out.println(subjects.length);    //배열의 크기(길이)
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = 80;   //국어
        }

//        subjects[0] = 95;   //국어
//        subjects[1] = 85;   //영어
//        subjects[2] = 76;   //수학
//
////        int sum = subjects[0] + subjects[1] + subjects[2];
        int sum = 0;
        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i];
        }
        double avg = (double)sum / subjects.length;
//        System.out.println("총계 : " + sum);
//        System.out.println("평균 : " + avg);
    }
}
