package com.shubh.designPattern.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {

    private static List<Student> studentList;

    public List<Student> getStudentList() {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Raj"));
        studentList.add(new Student(2, "Ravi"));
        studentList.add(new Student(3, "Akash"));

        return studentList;
    }

    @Override
    protected List<Student> clone() throws CloneNotSupportedException {
        List<Student> temporaryList = new ArrayList<>();
        temporaryList.addAll(studentList);
        return temporaryList;
    }
}
