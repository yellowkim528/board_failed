package com.kh.Day4;

import java.util.Scanner;

/*
    과목수를 콘솔로부터 입력받고 총계와 평균을 구하는 프로그램을 구현하시오.
    과목수 : 3
    과목1 : 90
    과목2 : 80
    과목3 : 70
    총계  : xxx
    평균  : xxx.xx
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("과목수 : ");
        int subjectsLength = scanner.nextInt();
        int[] subjects = new int[subjectsLength];

        // 과목점수 입력
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("과목" + (i+1) + " : ");
            subjects[i] = scanner.nextInt();
        }
        
        // 총점
        int sum = 0;
        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i];
        }
        System.out.println("총계  : " + sum);
        
        //평균
        double avg = (double) sum / subjects.length;
        System.out.println("평균  : " + avg);

    }
}
