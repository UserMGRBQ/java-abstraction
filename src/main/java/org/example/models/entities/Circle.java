package org.example.models.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Circle extends AbstractShape {

    private Double radius;

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}