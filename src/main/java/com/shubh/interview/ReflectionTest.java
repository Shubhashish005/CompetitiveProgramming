package com.shubh.interview;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student {

    private Integer id;
    private String name;
    private Instant date;

    public Student(Integer id, String name, Instant date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

public class ReflectionTest {

    private static Integer registrationNumber = 0;

    public static List<Student> setRegistrationNumber(List<Student> students) {

        Random random = new Random();
        for (Student student : students) {
            student.setId(++registrationNumber);
        }

        return students;
    }

    public static void main(String[] args) throws Exception {

        /*Student student = Student.class.newInstance();
        Field[] declaredFields = Student.class.getDeclaredFields();
        for (Field field: declaredFields){
            field.setAccessible(true);
            System.out.println(field.get(student));
        }*/

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(null, "Raj", Instant.now().minus(5, ChronoUnit.DAYS)));
        studentList.add(new Student(null, "Akash", Instant.now().minus(10, ChronoUnit.DAYS)));
        studentList.add(new Student(null, "Raj", Instant.now().minus(9, ChronoUnit.DAYS)));

        Collections.sort(studentList, Comparator.comparing(Student::getName));

        Collections.sort(studentList, (o1, o2) -> {
            if (!o1.getName().equals(o2.getName()))
                return o1.getName().compareTo(o2.getName());

            else
                return o1.getDate().compareTo(o2.getDate());
        });


        List<Student> studentList1 = setRegistrationNumber(studentList);
        System.out.println(studentList1);

    }
}
