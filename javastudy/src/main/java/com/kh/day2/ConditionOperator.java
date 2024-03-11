package com.kh.day2;

public class ConditionOperator {
    public static void main(String[] args) {
        int num = 5;
        //case1) 가독성이 좋음
        if (num % 3 == 0) {
            System.out.println("3의배수");
        } else if (num % 2 == 0) {
            System.out.println("2의배수");
        } else {
            System.out.println("기타");
        }

        //case2) 길이가 짧음
        int x = 1 + 1;  //식 - 값

        String result = num % 3 == 0 ? "3의배수" : num % 2 == 0 ? "2의배수" : "기타";   // 참 : 거짓 (?,: 가 연산자이다)
        System.out.println(result);
    }
}
