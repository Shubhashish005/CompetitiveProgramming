package com.shubh.designPattern.prototypeDesignPattern;

import java.util.List;

public class ClientTest {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getStudentList();
        studentList.forEach(System.out::println);

        System.out.println("Cloned list modification");
        try {
            List<Student> cloneList = studentDAO.clone();
            cloneList.add(new Student(4, "Shubh"));
            cloneList.forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
