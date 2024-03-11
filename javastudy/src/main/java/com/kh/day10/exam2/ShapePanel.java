package com.kh.day10.exam2;

import com.kh.day10.exam1.Animal;

public class ShapePanel {
    Shape[] shapes;
    int index;
    ShapePanel(int size) {
        shapes = new Shape[size];
    }

    void addShape(Shape shape) {
        shapes[index++] = shape;
    }

    void runCalculateArea() {
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
