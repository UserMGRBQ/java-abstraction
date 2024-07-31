package org.example.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.example.models.enums.Color;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public abstract class Shape {

    private Color color;

    public abstract Double area();
}