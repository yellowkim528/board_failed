package com.kh.day10.exam2;
/*
문제2)
'도형'을 표현하는 자바 프로그램을 작성해주세요.
도형에는 '사각형', '원', '삼각형'이 있습니다.
각 도형은 자신의 면적을 계산하고 출력할 수 있어야 합니다.

1.'도형'을 추상화하여 클래스를 만들어주세요.
    이 클래스는 '면적을 계산한다'라는 추상 메소드를 가져야 합니다.
2.'사각형', '원', '삼각형' 세 가지 도형을 '도형' 클래스를 상속받아 구현해주세요.
    각 도형은 자신의 면적을 계산하는 메소드를 구현해야 합니다.
3.'도형판'이라는 클래스를 만들고, 이 클래스에는 도형들을 보관하는 배열이 있어야 합니다.
    '도형판' 클래스는 도형들을 추가하거나, 도형들의 면적을 계산하게 하는 메소드를 가지고 있어야 합니다.
4.각 도형은 '색칠한다'라는 행동을 할 수 있도록 인터페이스를 만들어주세요.
    각 도형 클래스는 '색칠한다' 인터페이스를 구현해야 합니다.

 */

public class Main {
    public static void main(String[] args) {
        ShapePanel shapePanel = new ShapePanel(3);

        shapePanel.addShape(new Circle(10));
        shapePanel.addShape(new Rectangle(10,10));
        shapePanel.addShape(new Triangle(10,10));

        shapePanel.runCalculateArea();
    }
}
