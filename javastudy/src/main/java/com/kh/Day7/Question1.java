package com.kh.Day7;


/*
    단어 맞추기 게임
    단어는 'program'로 설정되어있다.
    사용자는 남은 시도 횟수 안에 정답 단어를 맞추면 게임에서 이기게 되고 그렇지 않으면 진다.
    단어를 맞출 수 횟수는 단어의 문자수 + 3
    ex) program

    현재단어 : _______
    남은 시도 횟수 : 10
    글자를 입력하세요 : p
    현재 단어 : p______
    남은 시도 횟수 : 9
    글자를 입력하세요 : z
    현재 단어 : p______
    남은 시도 횟수 : 8
    글자를 입력하세요 : r
    현재 단어 : pr__r__
    남은 시도 횟수 : 7
    글자를 입력하세요 :
    ....
    현재 단어 : progra_
    남은 시도 횟수 : 1
    글자를 입력하세요 : m
    축하합니다! 단어를 맞췄습니다 : program

 */
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println(" !단어 맞추기 게임! (종료:0)");
        System.out.println("==========================");

        String word = "program";
        String underBar = "";
        for (int i = 0; i < word.length(); i++) {
            underBar += "_";
        }
        System.out.println("현재단어 : " + underBar);
        int cnt = word.length() + 3;
        System.out.println("남은 시도 횟수 : " + cnt);

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.print("글자를 입력하세요 : ");
            char ch = scanner.nextLine().charAt(0);
            //종료버튼
            if (ch == '0') {
                stop = true;
                continue;
            }


            // 문자가 존재하는지 확인
            if (word.indexOf(ch) != -1) {
                // 맞췄을때
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == ch) {
                        underBar = underBar.substring(0, i) + ch + underBar.substring(i + 1);
                    }
                }
                cnt--;
            } else {
                // 틀렸을때
                cnt--;
                System.out.println("틀렸습니다!");
            }
            char wordChar = word.charAt(word.indexOf(ch));


            System.out.println("현재단어 " + underBar);
            System.out.println("남은 시도 횟수 + " + cnt);


            //모든 글자를 맞췄을때
            if (word.equals(underBar)) {
                System.out.println("축하합니다. 정답을 맞추셨습니다!");
                stop = true;
                continue;
            }
        }
        System.out.println("게임을 종료합니다!");


    }
}
