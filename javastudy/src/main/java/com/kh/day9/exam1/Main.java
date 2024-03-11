package com.kh.day9.exam1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
        Student student = new Student();
        student.eat();
        student.study();

        HighStudent highStudent = new HighStudent();
        highStudent.eat();
        highStudent.study();
        highStudent.examEntrance();


        int x = 3;
        double y = (double) x;   // 자동형변환(upcasting) : 하위타입이 상위타입에 대입

        Person person2 = (Person) new Student();
        person2.eat();

        Student student2 = (Student) person2;   // 강제형변환(downcasting) :

        HighStudent highStudent2 = (HighStudent) student2;  // casting exception error 발생
        highStudent2.examEntrance();



    }

}
