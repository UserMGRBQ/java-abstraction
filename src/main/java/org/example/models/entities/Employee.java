package org.example.models.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Employee implements Comparable<Employee> {

    private String name;

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
