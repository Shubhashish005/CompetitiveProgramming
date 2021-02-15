package com.shubh.practice.serialization.serializeDeserialize;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -8033181317852642985L;
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;

    private Address address;

    public Employee(int id, String name, int age, String email, String password, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
