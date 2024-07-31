package org.example;

import org.example.models.entities.Circle;
import org.example.models.entities.Rectangle;
import org.example.models.entities.Shape;
import org.example.models.enums.Color;

public class Main {
    public static void main(String[] args) {

        Shape s1 = Circle.builder()
                .color(Color.BLACK)
                .radius(20.0)
                .build();

        Shape s2 = Rectangle.builder()
                .color(Color.BLACK)
                .width(20.0)
                .height(10.0)
                .build();

        System.out.println("Circle area " + String.format("%.2f",s1.area()));
        System.out.println("Rectangle area " + String.format("%.2f",s2.area()));
    }
}