package com.kh.Day8.exam3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.smile();

        Student student = new Student();
        student.eat();
        student.smile();
        student.study();

        HighStudent highStudent = new HighStudent();
        highStudent.eat();
        highStudent.smile();
        highStudent.study();
        highStudent.examEntrance();

        Student student2 = (Student)highStudent;
        HighStudent highStudent2 = (HighStudent)student2;

        HighStudent highStudent3 = (HighStudent)student;
        highStudent3.examEntrance(); //컴파일시에는 오류가 없으나 런타임시에 캐스팅 예외 발생

    }
}
