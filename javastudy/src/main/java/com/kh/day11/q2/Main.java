package com.kh.day11.q2;

public class Main {
    public static void main(String[] args) {
        CD cd = new CD("RE:WIND", "ISD", 15000);

        //객체 상태를 문자열로 표현
        System.out.println(cd.toString());

        //음반 수정
        cd.setTitle("KIDDING");
        cd.setArtist("이세계아이돌");
        cd.setCost(10000);

        //수정된 음반 정보 가져오기
        System.out.println("Title : " + cd.getTitle());
        System.out.println("Artist : " + cd.getArtist());
        System.out.println("Cost : " + cd.getCost());

        //현 객체상태 표현
        System.out.println(cd.toString());


    }
}
