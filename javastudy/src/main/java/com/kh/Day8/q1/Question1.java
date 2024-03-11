package com.kh.Day8.q1;
/*
    클래스 메소드 구현 문제
    문제 1)
    요구사항 
    1. 클래스이름은 Calculator 클래스메소드 add를 구현하기
    2. add메소는 두개의 정수를 매개변수로 받아 두 수를 더한 결과를 반환해야한다.
    3. add 메소드를 호출하여 두수의 합을 출력해보기
    
    문제 2)
    요구사항
    1. 클래스 이름은 Circle로 하고 클래스변수 PI를 선언하기
    2. PI의 값은 3.14159로 초기화하기
    3. 반지름(radius)을 인스턴스 변수로 가지는 Circle 클래스에서 원의 넓이를 계산하는 클래스 메소드 calculateArea를 구현하기
    4. calculateArea 메소드는 반지름을 매개변수로 받아 원의 넓이를 계산하여 반환해야한다.
    5. calculateArea 메소드를 호출하여 반지름 5인 원의 넓이를 출력하기
    
    문제 3)
    요구사항
    1. 클래스 이름은 MathUtil로 하고, 정적 블록을 사용하여 팩토리얼을 계산하는 메소드인 factoial을 구현하기
    2. factorial메소드는 정수를 매개변수로 받아 해당 정수의 팩토리얼을 계산하여 반환해야한다.
    3. factorial메소드를 호출하여 5의 팩토리얼을 출력해보기


 */
public class Question1 {



    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));

        System.out.println(Circle.calculateArea(5));

        int result = MathUtil.getResult();
        System.out.println("result = " + result);
    }
}
