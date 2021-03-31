package com.shubh.practice.interview;

import com.shubh.utility.Employee;
import com.shubh.utility.FetchEmployeeDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting {

    public static void main(String[] args) {

        List<Employee> employeeList = FetchEmployeeDetails.getEmployeeList();
        System.out.println("Sorting Person List by name --- using Collections.sort");
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        System.out.println(employeeList);

        System.out.println("Sorting Person List by id --- using Collections.sort");
        Collections.sort(employeeList, Comparator.comparing(Employee::getId));
        System.out.println(employeeList);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(4, employeeList.get(0));
        employeeMap.put(2, employeeList.get(1));
        employeeMap.put(3, employeeList.get(2));
        employeeMap.put(1, employeeList.get(3));

        System.out.println("Sorting Person Map having employee as Value on employeeId--- using General sorting");
        List<Map.Entry<Integer, Employee>> toSort = new ArrayList<>();
        for (Map.Entry<Integer, Employee> integerEmployeeEntry : employeeMap.entrySet()) {
            toSort.add(integerEmployeeEntry);
        }
        toSort.sort(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId)));
        for (Map.Entry<Integer, Employee> integerEmployeeEntry : toSort) {
            System.out.println(integerEmployeeEntry);
        }

        System.out.println("Sorting Person Map having employee as Value on employeeSalary--- using streams");
        //Above one is equivalent to
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary))).forEach(System.out::println);

        List<Map.Entry<Integer, Employee>> empList = new ArrayList<>(employeeMap.entrySet());

        Collections.sort(empList, (o1, o2) -> o1.getValue().getId().compareTo(o2.getValue().getId()));
        Collections.sort(empList, Comparator.comparing(o -> o.getValue().getId()));
        System.out.println(employeeMap);

        System.out.println("-----------------");
        //Compairing bykey
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey());
        System.out.println(employeeMap);
    }
}
