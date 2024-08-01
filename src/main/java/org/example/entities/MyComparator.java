package org.example.entities;

import lombok.Builder;

import java.util.Comparator;

@Builder
public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
