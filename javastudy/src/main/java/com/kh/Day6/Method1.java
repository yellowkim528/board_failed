package com.kh.Day6;
/*
    실행 클래스 : 실행 메소드가 있는 클래스
    실행 메소드 : main 메소드

    라이브러리 클래스 : 실행 메소드가 없는 클래스

    메소드 :
        - 실행문을 의미있게 묶는 단위.
        - 선언부(제어자 + 반환타입(void,기본형,참조형) + 메소드이름 + 매개변수) + 본문
        - 메소드 마지막에 return문이 존재한다 (반환타입이 void면 생략가능)

    void : 메소드를 호출한곳에 반환할값이 없음을 뜻함.
 */
public class Method1 {

    public static void modifyValue(int value) {
        value = 100;
        System.out.println("modifyValue : " + value);   //100
    }


    public static void main(String[] args) {

        int value = 50;
        System.out.println("호출전 : " + value);   //50

        modifyValue(value);
        System.out.println("호출후 : " + value);   //50
    }
}