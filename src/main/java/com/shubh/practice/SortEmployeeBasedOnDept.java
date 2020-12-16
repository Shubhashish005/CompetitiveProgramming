package com.shubh.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployeeBasedOnDept {

    private static final class Employee {

        int id;
        String name;
        int age;
        String gender;
        String department;
        int yearOfJoining;
        double salary;

        public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getGender() {
            return gender;
        }
        public String getDepartment() {
            return department;
        }
        public int getYearOfJoining() {
            return yearOfJoining;
        }
        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", department='" + department + '\'' +
                    ", yearOfJoining=" + yearOfJoining +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(111, "A", 32, "F", "HR", 2011, 25000.0));
        empList.add(new Employee(122, "B", 25, "M", "Sales", 2015, 13500.0));
        empList.add(new Employee(133, "C", 29, "M", "Infra", 2012, 18000.0));
        empList.add(new Employee(144, "D", 28, "M", "Development", 2014, 32500.0));
        empList.add(new Employee(155, "E", 27, "F", "HR", 2013, 22700.0));
        empList.add(new Employee(166, "F", 43, "M", "Security", 2016, 10500.0));
        empList.add(new Employee(177, "G", 35, "M", "Finance", 2010, 27000.0));
        empList.add(new Employee(188, "H", 31, "M", "Development", 2015, 34500.0));
        empList.add(new Employee(199, "I", 24, "F", "Sales", 2016, 11500.0));
        empList.add(new Employee(200, "J", 38, "M", "Security", 2015, 11000.5));
        empList.add(new Employee(211, "K", 27, "F", "Infra", 2014, 15700.0));
        empList.add(new Employee(222, "L", 25, "M", "Development", 2016, 28200.0));
        empList.add(new Employee(233, "M", 27, "F", "Finance", 2013, 21300.0));
        empList.add(new Employee(244, "N", 24, "M", "Sales", 2017, 10700.5));
        empList.add(new Employee(255, "O", 23, "M", "Infra", 2018, 12700.0));
        empList.add(new Employee(266, "P", 26, "F", "Development", 2015, 28900.0));
        empList.add(new Employee(277, "Q", 31, "M", "Development", 2012, 35700.0));

        Map<String, List<Employee>> collect = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(collect);

    }


}
