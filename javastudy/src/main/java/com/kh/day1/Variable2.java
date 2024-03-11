package com.kh.day1;

// 지역 변수의 생명주기 : 변수가 선언된 블럭내에서 유효
public class Variable2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("y = " + y);

        {
            int z = 30;
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
            }
        }

        int z = 10;
        System.out.println("z = " + z);
    }
}
