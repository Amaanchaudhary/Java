package com.example.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Amaan", 24, 4000);
        System.out.println(emp.displayEmployeeDetails());
        emp.setName("Raju");
        System.out.println(emp.getName());
    }
}
