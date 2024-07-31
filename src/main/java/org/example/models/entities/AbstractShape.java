package org.example.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.example.models.enums.Color;
import org.example.models.interfaces.Shape;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public abstract class AbstractShape implements Shape {
    private Color color;
}