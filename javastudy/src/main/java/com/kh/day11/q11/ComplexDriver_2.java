package com.kh.day11.q11;

public class ComplexDriver_2 {
    public static void main(String[] args) {
//        1.	2 + 3i를 나타내는 복소수 객체 x를 생성한다.
        Complex_2 x = new Complex_2(2, 3);
//        2.	-3 + 7i를 나타내는 복소수 객체 y를 생성한다.
        Complex_2 y = new Complex_2(-3, 7);

//        3.	z = x – y
        Complex_2 z = new Complex_2();
        z= z.substract(x,y);

//        4.	x, y, z를 출력한다
        x.print();
        y.print();
        z.print();
    }
}
