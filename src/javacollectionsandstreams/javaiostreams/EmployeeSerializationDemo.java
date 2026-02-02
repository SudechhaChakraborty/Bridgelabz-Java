package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.*;

// Main class name
public class EmployeeSerializationDemo {

    // Employee class
    static class Employee implements Serializable {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", "IT", 60000));
        employees.add(new Employee(2, "Riya", "HR", 50000));

        // -------- Serialization --------
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.dat"))) {

            oos.writeObject(employees);
            System.out.println("Employee data serialized successfully!");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // -------- Deserialization --------
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employees.dat"))) {

            List<Employee> empList =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee e : empList) {
                System.out.println(
                        "ID: " + e.id +
                                ", Name: " + e.name +
                                ", Dept: " + e.department +
                                ", Salary: " + e.salary
                );
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
        }
    }
}