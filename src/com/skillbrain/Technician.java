package com.skillbrain;

public class Technician extends Employee{

    Technician(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;

    }

    @Override
    public double calculateSalary() {
        return 2 * reference;
    }

    @Override
    public String getName() {
        return "Tehnicianul se numeste " + firstName + " " + lastName;
    }
}
