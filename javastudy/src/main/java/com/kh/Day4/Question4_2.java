package com.kh.Day4;

import java.util.Random;
import java.util.Scanner;

/*
    아래를 참조하여 2차원 비정방행렬로 초기화하여 반장, 총무 뽑기
    송명성 박준혁
    김동환 최은석 이나영
    윤경란 최정민 윤다영 김대군
    김동회 정소라 조승민 김재현

    두구두구두~
    반장 : 홍길동
    총무 : 홍길동2

 */
public class Question4_2 {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] students = {
                {"송명성", "박준혁"},
                {"김동환", "최은석", "이나영"},
                {"윤경란", "최정민", "윤다영", "김대군"},
                {"김동회", "정소라", "조승민", "김재현"}
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }
        String classPresident = " ";    //반장
        String treasure = " ";          //총무
        int rowNum, colNum;
        int rowNum2, colNum2;


        //반장
        rowNum = random.nextInt(students.length); // 0~3
        colNum = random.nextInt(students[rowNum].length);
        classPresident = students[rowNum][colNum];


        
        while (true) {
            //총무
            rowNum2 = random.nextInt(students.length); // 0~3
            colNum2 = random.nextInt(students[rowNum].length);
            
            //반장,총무 위치가 같지않을 경우
            if (rowNum == rowNum2 && colNum == colNum2) {
                continue;
            }
            treasure = students[rowNum2][colNum2];
            break;
        }

        System.out.println("반장 : " + classPresident + "(" + rowNum + "," + colNum + ")");
        System.out.println("총무 : " + treasure + "(" + rowNum2 + "," + colNum2 + ")");
    }
}
