package com.kh.Day7;

import java.util.Locale;
import java.util.Scanner;

public class CharText {
    public static void main(String[] args) {
        String word = "program";
        char ch = 'A';

        //word 문자열 길이
        System.out.println(word.length());

        //word의 특정 위치의 문자 추출
        char ch2 = word.charAt(5);
        System.out.println(ch2); //a

        //word중 특정 문자의 위치
        int idx = word.indexOf('l');
        int lidx = word.lastIndexOf('r');
        System.out.println(idx);
        System.out.println(lidx);

        //word 대문자변환
        System.out.println(word.toUpperCase());

        //실수 -> 문자열
        String s2 = String.valueOf(1.2);
        System.out.println(s2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");

        //입력한 문자열을 char 타입으로 변환
        String str = scanner.nextLine();
        char ch3 = str.charAt(0);
//        char ch3 = scanner.nextLine().charAt(0);  //메소드 체인
        System.out.println(ch3);

    }
}
