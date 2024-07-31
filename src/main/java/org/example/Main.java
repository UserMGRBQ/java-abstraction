package org.example;

import org.example.models.entities.Employee;
import org.example.models.services.StaticService;

public class Main {
    public static void main(String[] args) {

        Employee emp = Employee.builder().build();
        StaticService.doSomething(emp);
    }
}