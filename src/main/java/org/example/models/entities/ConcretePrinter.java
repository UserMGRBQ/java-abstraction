package org.example.models.entities;

import lombok.experimental.SuperBuilder;
import org.example.models.interfaces.Printer;

@SuperBuilder
public class ConcretePrinter extends Device implements Printer {

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public void print(String doc) {

    }
}
