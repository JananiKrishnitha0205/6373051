package com.example.hibernate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setRole("Developer");

        EmployeeDao dao = new EmployeeDao();
        Integer id = dao.addEmployee(employee);
        System.out.println("Employee saved with ID: " + id);
    }
}