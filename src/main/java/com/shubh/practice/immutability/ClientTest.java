package com.shubh.practice.immutability;

import com.shubh.utility.FetchEmployeeDetails;

import java.util.Arrays;
import java.util.Comparator;

public class ClientTest {

    public static void main(String[] args) {

        FetchEmployeeDetails.getEmployeeList();
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(3, "Nagraj");
        employees[1] = new Employee(1, "Ravi");
        employees[2] = new Employee(4, "Akash");
        employees[3] = new Employee(2, "Wasim");

        //Using Comparable
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        //Using Comparator
        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println(Arrays.toString(employees));


        int i = Runtime.getRuntime().availableProcessors();
        System.out.println("i " + i);
    }
}
