package com.shubh.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(4, "Raj"));
        employees.add(new Employee(2, "Akash"));
        employees.add(new Employee(3, "Zeeshan"));
        employees.add(new Employee(1, "Naveen"));

        System.out.println("Sorting by name --- ");
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println(employees);

        System.out.println("Sorting by id --- ");
        Collections.sort(employees, Comparator.comparing(Employee::getId));
        System.out.println(employees);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(4, new Employee(4, "Raj"));
        employeeMap.put(2, new Employee(2, "Akash"));
        employeeMap.put(3, new Employee(3, "Zeeshan"));
        employeeMap.put(1, new Employee(1, "Naveen"));

        List<Map.Entry<Integer, Employee>> empList = new ArrayList<>(employeeMap.entrySet());

        Collections.sort(empList, Comparator.comparing(o -> o.getValue().getId()));
        System.out.println(employeeMap);
    }
}
