package com.kh.Day4;

import java.util.Scanner;

public class Dim2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //배열 콘솔 입력
        int num1;
        int num2;
        //1번
        System.out.print("num1 : ");
        num1 = scanner.nextInt();
        //2번
        System.out.print("num2 : ");
        num2 = scanner.nextInt();

        int[][] arr= new int[num1][num2];

//        System.out.println(arr);
//        System.out.println(arr.length);     //2 -> 1차원배열 길이(크기)
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[0].length);  //3 -> 2차원배열 크기
//        System.out.println(arr[1].length);  //3 -> 2차원배열 크기
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);

        System.out.println();   //여백
        
        //배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
