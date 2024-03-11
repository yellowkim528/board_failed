package com.kh.Day5;
/*
    표현식(4) : 값(리터럴), 변수, 식, 메소드
    지역 변수 : 메소드 내에 선언된 변수
    매개 변수(parameter) : 메소드 호출수 입력받는 값으로 초기화되는 변수로
                          메소드 본문에서 지역변수로 사용된다.


    인수(argument) : 메소드 호출할때 전달하는 값
 */
public class Method2 {
    public static void main(String[] args) {
        method1();                                    // 반환타입(x), 매개변수(x)

        int result = method2();                       // 반환타입(O), 매개변수(x)
        System.out.println("result = " + result);

        method3(5);                                // 반환타입(x), 매개변수(O)
        System.out.println();

        int result4 = method4(10, 20);          // 반환타입(O), 매개변수(O)
        System.out.println("result4 = " + result4);
    }


    // 반환타입(x), 매개변수(x)
    public static void method1(){
        System.out.println("method1()");
    }

    // 반환타입(O), 매개변수(x)
    public static int method2() {
        int x = 10;
        int y = 20;
        return x + y;
    }

    // 반환타입(x), 매개변수(O)
    public static void method3(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }

    }

    // 반환타입(O), 매개변수(O)
    public static int method4(int x, int y) {
        return x + y;
    }
}
