package com.shubh.practice.serialization.serializeDesserializeParentChild;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private static final long serialVersionUID = 3271458368289563055L;
    private String email;
    private String password;

    public Employee() {
    }

    public Employee(int id, String name, int age, String email, String password) {
        super(id, name, age);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(getId());
            objectOutputStream.writeObject(getName());
            objectOutputStream.writeInt(getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            setId(objectInputStream.readInt());
            setName((String) objectInputStream.readObject());
            setAge(objectInputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
