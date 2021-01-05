package com.shubh.practice.serialization.serializeDesserializeParentChild;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public static void main(String[] args) {

        String filename = "/Users/shukumar3/git/CompetitiveProgramming/src/main/java/com/shubh/practice/serialization/serializedFile/employee.ser";
        serializeObject(filename);
        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deSerializeObject(filename);
    }

    private static void serializeObject(String filename) {
        Employee employee = new Employee(100, "Raj", 23, "raj@gmail.com", "raj@123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
            oos.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deSerializeObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))) {
            Object object = ois.readObject();
            Employee employee = (Employee) object;
            System.out.println("Id: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Password: " + employee.getPassword());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
