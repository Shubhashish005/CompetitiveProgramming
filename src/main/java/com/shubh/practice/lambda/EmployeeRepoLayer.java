package com.shubh.practice.lambda;

import com.shubh.utility.Employee;
import com.shubh.utility.FetchEmployeeDetails;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeRepoLayer {

    public static void main(String[] args) {
        List<Employee> employeeDetails = FetchEmployeeDetails.getEmployeeList();
        Collections.sort(employeeDetails, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(employeeDetails);

        System.out.println("------------");

        employeeDetails.stream().sorted().forEach(System.out::println);

        employeeDetails.stream().sorted((o1, o2) -> (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);

        employeeDetails.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
