package com.shubh.interview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

    private Long id;
    private String name;
    private String deptName;

    public Employee(Long id, String name, String deptName) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

public class Interview {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1L, "Raj", "IT"));
        employeeList.add(new Employee(2L, "Akash", "MECH"));
        employeeList.add(new Employee(3L, "Ravi", "MECH"));
        employeeList.add(new Employee(4L, "Neha", "CIVIL"));

        // Map<String,Integer> - IT - 1, MECH - 2
        Map<String, Integer> count = new HashMap<>();
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName));


    }
}
