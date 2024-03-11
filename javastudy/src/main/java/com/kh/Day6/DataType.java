package com.kh.Day6;

import org.xml.sax.ext.Locator2;

public class DataType {
    public static void main(String[] args) {

        byte x = -128;  // -128 ~ 127

        char c = 65;     // 0~65535

        System.out.println((short)c);

        for (int i = 50000; i < 55000; i++) {
            System.out.println((char) i);
        }

        short s = -32768;   // 2byte : -32768 ~ 32767
        int i = -2_147_483_648; //  4byte : -2_147_483_648 ~ 2_147_483_647
        long l = -9_223_372_036_854_775_808L;  //  8byte  -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        long l2 = 1;

        // switch문에 정수는 올수 있지만 long 타입은 제외.

//        switch (L2) {
//        }



    }

}
