package com.kh.Day7;

import java.util.Random;
import java.util.Scanner;

public class Question1_3 {
    public static void main(String[] args) {
        String[] words = {
                "program", "freedom","believe","thought","company",
                "love","student","teacher","chair","culture"
        };
        Random random = new Random();
        int idx = random.nextInt(words.length); //0~9
        String word = words[idx];

        char[] guesstedWord = makeUnderLine(word.length());
        int attempts = word.length() + 3;
        //System.out.println(guesstedWord);
        Scanner scanner = new Scanner(System.in);

        while (attempts>0) {
            System.out.println("현재단어 : " + String.valueOf(guesstedWord));
            System.out.println("남은 시도회수 " + attempts);
            String str = "";
            while (true) {
                System.out.print("글자를 입력하세요[1글자(a~z)] : ");
                str = scanner.nextLine();
                // 소문자변환
                str = str.toLowerCase();
                // 1글자 체크 + 영문s자 체크
                if (str.length() == 1 && str.matches(("[a-zA-Z]"))) {
                    break;
                }
            }

            char ch = str.charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    guesstedWord[i]=ch;

                    if (word.equals(String.valueOf(guesstedWord))) {
                        System.out.println("축하합니다! 단어를 맞췄습니다. : " + word);
                        return; //메소드 종료하고 호출한 곳으로 제어 이동
                    }
                }
            }
            attempts--;
        }
        System.out.println("단어를 맞추지 못했습니다. 정답은 " + word + " 였습니다.");
    }

    public static char[] makeUnderLine(int len) {
        char[] underLine = new char[len];
        for (int i = 0; i < len; i++) {
            underLine[i] = '_';
        }
        return underLine;
    }

}
