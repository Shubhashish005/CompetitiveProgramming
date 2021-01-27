package com.shubh.practice.immutability.immutable;

import com.shubh.practice.immutability.Employee;

import java.util.List;
import java.util.Map;

public class ClientImmutablityTest {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Raj");
        ImmutableClass immutableClass = new ImmutableClass(employee.getId(), employee.getName(), employee, Map.of(1, employee), List.of(employee));
        System.out.println(immutableClass);
        Employee employee1 = immutableClass.getEmployee();
        employee1.setName("Akash");
        System.out.println("------------------");
        System.out.println(immutableClass);
    }
}
