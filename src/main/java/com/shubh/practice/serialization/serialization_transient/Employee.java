package com.shubh.practice.serialization.serialization_transient;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private int age;
    private String email;
    private transient String password;

    public Employee(int id, String name, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
