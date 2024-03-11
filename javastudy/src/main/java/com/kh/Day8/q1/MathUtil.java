package com.kh.Day8.q1;

public class MathUtil {
    private static int result;

    static {
        int x = 5;
        result = factorial(5);
//        System.out.println("result = " + result);
    }

    private static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    static int getResult() {
        return result;
    }


}


//    static int factorial(int a) {
//        int fac = 1;
//        for (int i = 1; i <= a; i++) {
//            fac *= i;
//        }
//        return fac;
//    }
//}
