package com.skillbrain;

import java.util.ArrayList;

public class Staff {

    ArrayList<Employee> employeeList;

    Staff() {

        employeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void showSalaries() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + ", care castiga " + employee.calculateSalary() + " lei. ");
        }
    }

    public double averageSalary() {
        int employeeNumber = 0;
        double allSalary = 0;
        while (employeeNumber < employeeList.size()) {
            allSalary += employeeList.get(employeeNumber).calculateSalary();
            employeeNumber++;
        }
        return allSalary / employeeList.size();
    }
}
