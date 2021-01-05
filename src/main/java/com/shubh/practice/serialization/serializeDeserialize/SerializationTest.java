package com.shubh.practice.serialization.serializeDeserialize;

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
        //serializeObject(filename);
        deSerializeObject(filename);
    }

    private static void serializeObject(String filename) {

        Address address = new Address(1111, "address Line1", "address Line2", "Mumbai", 590999);
        Employee employee = new Employee(1001, "KK", 30, "kishan.javatrainer@gmail.com", "pass@123", address);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
            objectOutputStream.writeObject(employee);
            System.out.println("Object is serialized...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deSerializeObject(String filename) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filename)))) {
            Object object = objectInputStream.readObject();
            Employee employee = (Employee) object;
            System.out.println("Object is deserailized...");
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
