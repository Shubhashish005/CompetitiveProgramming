package com.shubh.practice.utility.immutable;

import com.shubh.practice.utility.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final Employee employee;
    private final Map<Integer, Employee> employeeMap;
    private final List<Employee> employeeList;

    public ImmutableClass(int id, String name, Employee employee, Map<Integer, Employee> employeeMap, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employee = employee;
        this.employeeMap = Collections.unmodifiableMap(employeeMap);
        this.employeeList = Collections.unmodifiableList(employeeList);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        Employee emp = null;
        try {
            emp = this.employee.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                ", employeeMap=" + employeeMap +
                ", employeeList=" + employeeList +
                '}';
    }
}
