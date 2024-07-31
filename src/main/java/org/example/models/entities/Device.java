package org.example.models.entities;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Device {
    String serialNumber;

    public abstract void processDoc(String doc);
}
