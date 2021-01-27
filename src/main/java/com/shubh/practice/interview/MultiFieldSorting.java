package com.shubh.practice.interview;

import com.shubh.utility.Employee;
import com.shubh.utility.FetchEmployeeDetails;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiFieldSorting {

    public static void main(String[] args) {

        List<Employee> employeeList = FetchEmployeeDetails.getEmployeeList();

        System.out.println(" Before Sorting");

        System.out.println(employeeList);

        System.out.println(" Sorting w.r.t. Id & name");
        Collections.sort(employeeList, Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getId));
        System.out.println(employeeList);
    }
}
