package com.shubh.practice.lambda;

import com.shubh.utility.Employee;
import com.shubh.utility.FetchEmployeeDetails;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByTest {

    public static void main(String[] args) {

        List<Employee> employeeList = FetchEmployeeDetails.getEmployeeList();
        employeeList.clear();

        employeeList.add(new Employee(111, "Raj", 32, "F", "HR", 2011, 25000.0));
        employeeList.add(new Employee(188, "Akash", 25, "M", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(113, "Raj", 29, "M", "Infra", 2012, 18000.0));


        Map<String, List<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(collect);
    }
}
