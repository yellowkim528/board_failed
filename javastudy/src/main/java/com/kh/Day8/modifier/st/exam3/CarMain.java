package com.kh.Day8.modifier.st.exam3;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("검정");
        Car car2 = new Car("빨강");
        Car car3 = new Car("흰색");


        System.out.println("총생산량 : " + Car.getTotalCnt());

        System.out.println("car 속도 : " + car.getSpeed());
        System.out.println("car2 속도 : " + car2.getSpeed());
        System.out.println("car3 속도 : " + car3.getSpeed());

        car.speedUp();
        car2.speedUp();
        car3.speedUp();

        System.out.println("car 속도 : " + car.getSpeed());
        System.out.println("car2 속도 : " + car2.getSpeed());
        System.out.println("car3 속도 : " + car3.getSpeed());

        car2.speedUp();
        System.out.println("car 속도 : " + car.getSpeed());
        System.out.println("car2 속도 : " + car2.getSpeed());
        System.out.println("car3 속도 : " + car3.getSpeed());


        System.out.println(Car.getMaxSpeed());
        System.out.println(Car.getModel());
    }
}
