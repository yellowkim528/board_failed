package com.kh.day9.exam7;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        System.out.println(p1);
        System.out.println(p1.toString());


        Person p2 = new Person("홍길동", 20);

        System.out.println(p1.equals(p2));


    }
}
