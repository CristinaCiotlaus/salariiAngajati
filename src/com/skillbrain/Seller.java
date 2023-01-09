package com.skillbrain;

public class Seller extends Employee{
    private double fixPart = 0.2 * 150;

    @Override
    public double calculateSalary() {
        return fixPart + reference;
    }

    @Override
    public String getName() {
        return "Vanzatorul se numeste: " + firstName + " " + lastName;}

        Seller(String firstName, String lastName, int age, String employmentDate, int reference) {
            super(firstName, lastName, age, employmentDate);
            this.reference = reference;
        }
    }
