package com.kh.day20;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setCal(new Calculator());
        double value = p.getCal().add(10,20);

        System.out.println(value);

        value = p.cal.add(10, 20);
        System.out.println(value);

        p.car.run();

        int lifeSpan = p.car.tire.lifeSpan;
        p.car.tire.wearDown();

        Calculator cal = new Calculator();
        Person p2 = new Person(cal);
        p2.smile();
        p2.eat();

        cal.add(1, 2);
    }
}
