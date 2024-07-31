package org.example.models.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Rectangle extends Shape {

    private Double width;
    private Double height;

    @Override
    public Double area() {
        return width * height;
    }
}
