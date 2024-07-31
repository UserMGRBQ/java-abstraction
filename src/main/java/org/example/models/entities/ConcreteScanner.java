package org.example.models.entities;

import lombok.experimental.SuperBuilder;
import org.example.models.interfaces.Scanner;

@SuperBuilder
public class ConcreteScanner extends Device implements Scanner {

    @Override
    public void processDoc(String doc) {

    }

    @Override
    public String scan() {
        return "";
    }
}
