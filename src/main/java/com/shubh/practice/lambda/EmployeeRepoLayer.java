package com.shubh.practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeRepoLayer {

    private static List<Employee> employeeList;

    public static final class Employee {

        private int id;
        private String name;
        private Double salary;

        public Employee(int id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public Double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    private static List<Employee> getEmployeeDetails(){
        employeeList = new ArrayList<>();

        employeeList.add(new Employee(2, "Raj", 20000.0));
        employeeList.add(new Employee(1, "Rahul", 10000.0));
        employeeList.add(new Employee(3, "Akash", 30000.0));
        employeeList.add(new Employee(4, "Sonam", 5000.0));
        return employeeList;
    }

    public static void main(String[] args) {
        List<Employee> employeeDetails = getEmployeeDetails();
        Collections.sort(employeeDetails, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println(employeeDetails);

        System.out.println("------------");

        employeeDetails.stream().sorted().forEach(System.out::println);

        employeeDetails.stream().sorted((o1, o2) -> (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);

        employeeDetails.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
