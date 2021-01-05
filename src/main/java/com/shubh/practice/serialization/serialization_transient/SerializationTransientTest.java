package com.shubh.practice.serialization.serialization_transient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTransientTest {

    public static void main(String[] args) {

        String filename = "/Users/shukumar3/git/CompetitiveProgramming/src/main/java/com/shubh/practice/serialization/serializedFile/employee.ser";
        serializeEmployee(filename);
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deSerializeEmployee(filename);
    }

    private static void serializeEmployee(String filename) {
        Employee employee = new Employee(2, "Raj", 12, "Raj@gmail.com", "raj@123");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
            oos.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deSerializeEmployee(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))) {
            Object object = ois.readObject();
            Employee employee = (Employee) object;
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
