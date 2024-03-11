package com.kh.Day4;

public class NonDim {
    public static void main(String[] args) {
        //비정방 배열 만들기
        int[][] arr = new int[4][];
        
        arr[0] = new int[1];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
