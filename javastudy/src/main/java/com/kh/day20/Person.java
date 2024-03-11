package com.kh.day20;

public class Person {
    private String name;
    private int age;
    Calculator cal;
    Car car;

    Person(){

    }
    Person(Calculator cal){
        this.cal=cal;
    }
    public void smile(){}
    public void eat(){}

    public void setCal(Calculator cal){
        this.cal = cal;
    }
    public Calculator getCal(){
        return cal;
    }

}
