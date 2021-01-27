package com.shubh.utility;

import java.util.ArrayList;
import java.util.List;

public class FetchEmployeeDetails {


    public static List<Employee> getEmployeeList() {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(111, "Raj", 32, "F", "HR", 2011, 25000.0));
        empList.add(new Employee(188, "Akash", 25, "M", "Sales", 2015, 13500.0));
        empList.add(new Employee(113, "James", 29, "M", "Infra", 2012, 18000.0));
        empList.add(new Employee(144, "John", 28, "M", "Development", 2014, 32500.0));
        empList.add(new Employee(167, "Robert", 27, "F", "HR", 2013, 22700.0));
        empList.add(new Employee(134, "Steven", 43, "M", "Security", 2016, 10500.0));
        empList.add(new Employee(177, "William", 35, "M", "Finance", 2010, 27000.0));
        empList.add(new Employee(145, "David", 31, "M", "Development", 2015, 34500.0));
        empList.add(new Employee(199, "Richard", 24, "F", "Sales", 2016, 11500.0));
        empList.add(new Employee(234, "Joseph", 38, "M", "Security", 2015, 11000.5));
        empList.add(new Employee(211, "Thomas", 27, "F", "Infra", 2014, 15700.0));
        empList.add(new Employee(222, "Charles", 25, "M", "Development", 2016, 28200.0));
        empList.add(new Employee(457, "Christopher", 27, "F", "Finance", 2013, 21300.0));
        empList.add(new Employee(244, "John", 24, "M", "Sales", 2017, 10700.5));
        empList.add(new Employee(345, "Donald", 23, "M", "Infra", 2018, 12700.0));
        empList.add(new Employee(266, "Steven", 26, "F", "Development", 2015, 28900.0));
        empList.add(new Employee(100, "Akash", 31, "M", "Development", 2012, 35700.0));

        return empList;

    }
}
